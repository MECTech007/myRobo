#Daily Log
##01.19.17
Placeholder Text
*****
##01.20.17 & 01.21.17
No Meeting Friday Jan. 20th, 2017  
FTC Comp. Saturday Jan. 21st, 2017  
*****
TODO:

* [ ] Simplify Code Base/Methods
* [ ] Work on Autonomous -> Lets make something Amazing
* [ ] We need to figure out the 'triggers' for the xbox controller
* [ ] Figure out the 'triggers' for the Joystick
* [ ] Start on Tele-Op Control
  * [ ] Make Configurations for Controller and Joystick
  * [ ] Start on coding the 'arm'
    * (prototype the code for when we get the shooter complete and attached)
*****
##01.18.17
Today I was able to get Autonomous working, we used the `tankDrive()` function.

A few notable additions are the following new methods to simplify the code base and break down each operation into more readable code.

```java
    private void drive(String task, double time) {

    private void drive(double time, double speed) {

    private void drive(double time, double leftSpeed, double rightSpeed) {

    private void move(double speed) {

    private void move(double leftSpeed, double rightSpeed) {

    private void sleep(double time) {
```

Tomorrow we are going to simplify it down further into one smooth code base.
*****
