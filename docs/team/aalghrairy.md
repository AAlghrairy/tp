### Project: Coach2K22

#### Overview:
Our product helps busy sports coaches organise their overwhelming lists of contacts and messy weekly
schedules. It also provides them with a platform to visualise defensive and offensive plays as the game unfolds.

#### Summary of Contributions:

* **Code contributed**: [RepoSense link](
https://nus-cs2103-ay2122s2.github.io/tp-dashboard/?search=aalghrairy&breakdown=true)
* **Enhancements Implemented:**
  * Implemented `note-del` command to delete notes from list for each contact
  * Implemented GUI of TaskCard and TaskListPanel
  * Enhanced Note feature to include three different lists of notes for each contact
    * _Expanded `note-add` command to_`strength-add`, `weakness-add`, and `misc-add`
    * _Expanded `note-del` command to_`strength-del`, `weakness-del`, and `misc-del`
  * Improved GUI of PersonCard to better display the three note lists
  * Implemented `clear-t` command to clear all tasks or tasks for a given date
  * Implemented `load-court` command to load background image for strategy tab
    * Required many instances of defensive programming due to reliance on external directories and files
  * Implemented `sort-strength` and `sort-weakness` commands to sort the address book by total strengths/weaknesses in descending order respectively
* **Contributions to the UG:**
  * Added feature definitions for the following functions (and included in command summary):
    * (`strength-add`, `weakness-add`, `misc-add`, `strength-del`, `weakness-del`, `misc-del`, `clear-t`, `load-court`, `sort-strength`, `sort-weakness`)
  * Add detailed installation instructions, including labelled GUI example, operating system, and system requirements. 
* **Contributions to the DG:**
  * Added the Product Scope and Glossary sections
  * Implemented the Model Component, including the UML Diagram
  * Added the following implementation descriptions of functions, as well as their respective UML Diagrams
    * Clear Tasks
    * Load Court
    * Add and Delete Strength/Weakness/Misc
    * Sort by Strength/Weakness
  * Added the following use cases:
    * Add a strength, weakness, and miscellaneous note to a person
    * Delete a strength, weakness, and miscellaneous note from a person
    * Sort address book by strengths/weaknesses in descending order
    * Clear all tasks from the task list
    * Clear all tasks for a specified date from task list
    * Load new background image for strategy tab
* **Contributions to team-based tasks**:
  * Replaced references to `AddressBook` with `Coach2K22` in Developer Guide
  * Maintained some issues to be implemented by all team members
  * Maintained issue tracking for some individual tasks of respective team members
    * Including ensuring milestones, assignees, and labels were properly selected
  * Modified the Index.md file
* **Review/mentoring contributions**:
  * [#26](https://github.com/AY2122S2-CS2103T-W14-2/tp/pull/26)
  * [#38](https://github.com/AY2122S2-CS2103T-W14-2/tp/pull/38)
  * [#76](https://github.com/AY2122S2-CS2103T-W14-2/tp/pull/76)
  * [#97](https://github.com/AY2122S2-CS2103T-W14-2/tp/pull/97)
  * [#106](https://github.com/AY2122S2-CS2103T-W14-2/tp/pull/106)
  * [#109](https://github.com/AY2122S2-CS2103T-W14-2/tp/pull/109)
  * [#124](https://github.com/AY2122S2-CS2103T-W14-2/tp/pull/124)
  * [#140](https://github.com/AY2122S2-CS2103T-W14-2/tp/pull/140)
  * [#143](https://github.com/AY2122S2-CS2103T-W14-2/tp/pull/143)
* **Contributions beyond the project team:**
  * Evidence of helping others:
    * [#197](https://github.com/nus-cs2103-AY2122S2/forum/issues/197)
    * [#222](https://github.com/nus-cs2103-AY2122S2/forum/issues/222)
  * Evidence of technical leadership
    * _n/a_
