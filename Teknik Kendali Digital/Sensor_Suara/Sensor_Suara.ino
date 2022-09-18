const int pinSensor = A0;
const int pinRelay = 7;
const int led = 13;
 
int nilaiSensor = 0;
 
void setup (){
 
Serial.begin (9600);
pinMode (pinRelay, OUTPUT);
pinMode (led, OUTPUT);
digitalWrite(pinRelay, LOW);
 
}
 
void loop(){
 
nilaiSensor = analogRead(pinSensor);
Serial.print ("Sensor = ");
Serial.println(nilaiSensor);
 
if (nilaiSensor > 150) {
 
digitalWrite(pinRelay, HIGH);
Serial.print ("Sensor = ");
Serial.print (nilaiSensor);
Serial.println ("\t => SUARA TERDETEKSI");
digitalWrite(led, HIGH);
 
delay (500);
 
}
 
else if (nilaiSensor < 130){
 
//turn Relay off:
digitalWrite(pinRelay, LOW);
digitalWrite(led, LOW);
 
}
 
delay(2);
 
}
