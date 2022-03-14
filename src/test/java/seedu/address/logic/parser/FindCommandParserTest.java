package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.FindCommand;
import seedu.address.model.name.PersonNameContainsKeywordsPredicate;
import seedu.address.model.tag.TagContainsKeywordsPredicate;

public class FindCommandParserTest {

    private FindCommandParser parser = new FindCommandParser();

    @Test
    public void parse_emptyArg_throwsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, FindCommand.MESSAGE_USAGE));
    }

    @Test
    public void parse_validArgs_returnsFindCommand() {
        List<String> nameList = Arrays.asList("Alex", "Bob");
        List<String> tagList = Arrays.asList("friends", "neighbours");
        // no leading and trailing whitespaces
        FindCommand expectedFindCommand =
                new FindCommand(new PersonNameContainsKeywordsPredicate(nameList),
                        new TagContainsKeywordsPredicate(tagList));
        assertParseSuccess(parser, " n/Alex n/Bob t/friends t/neighbours", expectedFindCommand);

        // multiple whitespaces between keywords
        assertParseSuccess(parser, " n/Alex     n/Bob   t/friends t/neighbours    ", expectedFindCommand);
    }

}
