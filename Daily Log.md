#Daily Log

##01.18.17
*****
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

TODO:

[] Simplify Code Base/Methods
[] Work on Autonomous -> Lets make something Amazing
[] We need to figure out the 'triggers' for the xbox controller
[] Figure out the 'triggers' for the Joystick
[] Start on Tele-Op Control
  * Make Configurations for Controller and Joystick
  * Start on coding the 'arm'
    > (prototype the code for when we get the shooter complete and attached)

###### I'm going to upload all of the source code to Github for better version control but we'll still upload individual tarballs to the Drive