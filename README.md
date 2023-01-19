# A1 - Piraten Karpen

  * Author: < Khalid Farag >
  * Email: < faragk1@mcmaster.ca >

## Build and Execution

  * To clean your working directory:
    * `mvn clean`
  * To compile the project:
    * `mvn compile`
  * To run the project in development mode:
    * `mvn -q exec:java` (here, `-q` tells maven to be _quiet_)
  * To package the project as a turn-key artefact:
    * `mvn package`
  * To run the packaged delivery:
    * `java -jar target/piraten-karpen-jar-with-dependencies.jar` 

Remark: **We are assuming here you are using a _real_ shell (e.g., anything but PowerShell on Windows)**

## Feature Backlog

 * Status: 
   * Pending (P), Started (S), Blocked (B), Done (D)
 * Definition of Done (DoD):
   * < For confirming that the a feature is done and can be delivered for good, I must run some checks and see if it there's a bugs coming up. For F01, I will create a simulator to check how many times and a faces has appeared. F02, this I just have to check if the right amount of dices is rolled each time.  >

### Backlog 

| MVP? | Id  | Feature  | Status  |  Started  | Delivered |
| :-:  |:-:  |---       | :-:     | :-:       | :-:       |
| x   | F01 | Roll eight dices  |  D |  12/01/23 |
| x   | F02 | Keep track of points  |  D |  12/01/23 |
| x   | F03 | Keep track of amount of skulls rolled |  D |  12/01/23 |
| x   | F04 | end of game when three skulls are rolled | S | 10/12/23 |
| x   | F05 | Calculate the stdout after all the games has been played  |  D |  12/01/23 |
| x   | F06 | Keep track of wins |  D |  12/01/23 |
| x   | F07 | Player keeping random dice at their turn | S | 10/12/23 | 
| x   | F08 | Reroll the dice subtracting the skulls rolled  |  D |  12/01/23 |
| x   | F09 | Score points: Rolling Gold coins or diamonds| S | 11/12/23 | 
| x   | F10 | Keep rerolling if the points score isnt greater or equal to 6000| S | 11/12/23 | 
| x   | F12 | 42 games are played.  |  D  | 12/01/23 |
| x   | F13 | Set up the games for two players  |  D |  12/01/23 |
| x   | F14 | Associate the points to the specific player  |  D |  12/01/23 |
| x   | F15 | Player wins, if they have more points(greater than 6000)| S | 11/12/23 | 
| ... | ... | ... |

