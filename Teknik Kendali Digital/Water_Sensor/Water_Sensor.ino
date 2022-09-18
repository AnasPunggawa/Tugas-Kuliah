int pinSensor = A0;
float panjangSensor = 4.0 ;
void setup() {
  Serial.begin(9600);
  Serial.println("Mengukur Ketinggian Air");
  delay(500);
}
void loop() {
  int nilai = analogRead(pinSensor);
  float tinggiAir = nilai * panjangSensor / 1023;
  Serial.print("Tinggi Air = ");
  Serial.print(tinggiAir);
  Serial.println(" cm");
  delay(1000);
}
