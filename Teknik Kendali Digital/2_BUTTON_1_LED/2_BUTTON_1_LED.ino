const int buttonPin1 = 2;     // the number of the pushbutton pin
const int buttonPin2 = 3;     // the number of the pushbutton pin
const int ledPin =  13;      // the number of the LED pin

// variables will change:
int buttonState = 0;         // variable for reading the pushbutton status

void setup() {
  // initialize the LED pin as an output:
  pinMode(ledPin, OUTPUT);
  // initialize the pushbutton pin as an input:
  pinMode(buttonPin1, INPUT);
  pinMode(buttonPin2, INPUT);
}

void loop(){
  // read the state of the pushbutton value:
  if (digitalRead(buttonPin1) == LOW) {
    digitalWrite(ledPin, LOW); //turn LED off
  } else if (digitalRead(buttonPin2) == LOW) {
    digitalWrite(ledPin, HIGH); //turn LED on
  }
}
