// Arduino stepper motor control code

#include <Stepper.h> // Include the header file

// change this to the number of steps on your motor
#define STEPS 32

// create an instance of the stepper class using the steps and pins
Stepper stepper(STEPS, 8, 10, 9, 11);

int val = 0;

void setup() {
  Serial.begin(9600);
  stepper.setSpeed(800);
}

void loop() {

// if (Serial.available()>0)
// {
//  val = Serial.parseInt();
    stepper.step(1);
//    Serial.println(val); //for debugging
//  }
 

}
