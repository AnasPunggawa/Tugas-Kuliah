int hasilSensorLDR; // Variable untuk sensor LDR

void setup() {
  Serial.begin(9600); // Serial Monitor
  pinMode(6,OUTPUT); // Set pin 6 sebagai Output
}

void loop() {
  hasilSensorLDR=analogRead(0); // Hasil LDR = Hasil input pada pin A0
  if (hasilSensorLDR<200) // Jika hasil LDR kurang dari 10 (Kurang Cahaya)
{
    digitalWrite(6,HIGH); // Aktifkan Relay atau LED
}
  else digitalWrite(6,LOW); // Jika tidak, Matikan Relay/LED
  Serial.println(hasilSensorLDR); // Print hasil LDR ke Serial Monitor
  delay(500); // Delay setengah detik
}
