#include <IRremote.h>
int RECV_PIN = A1;
int pinLED = 2;
IRrecv irrecv(RECV_PIN);
decode_results results;
void setup() {
  Serial.begin(9600);
  irrecv.enableIRIn();
  pinMode(pinLED, OUTPUT);
}
unsigned long data;
void loop() {
  if (irrecv.decode(&results)) {
    Serial.println(results.value);
    data = results.value;
    irrecv.resume();
    switch (data){
      case 16769055: // tombol 1 ganti kode
        digitalWrite(pinLED, LOW);
        break;
      case 4294967295: //tombol 2 ganti kode
        digitalWrite(pinLED, HIGH);
        break;
    }
  }
}
