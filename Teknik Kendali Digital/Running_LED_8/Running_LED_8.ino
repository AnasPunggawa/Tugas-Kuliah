// Lampu LED Berjalan Menggunakan Arduino UNO
// Menyalakan LED dengan Aktif HIGH
 
int ledPin1 = 0;
int ledPin2 = 1;
int ledPin3 = 2;
int ledPin4 = 3;
int ledPin5 = 4;
int ledPin6 = 5;
int ledPin7 = 6;
int ledPin8 = 7;
// type data yang berfungsi sebagai penyimpan bilangan bulat
 
void setup() 
{
pinMode(ledPin1, OUTPUT);
pinMode(ledPin2, OUTPUT);
pinMode(ledPin3, OUTPUT);
pinMode(ledPin4, OUTPUT);
pinMode(ledPin5, OUTPUT);
pinMode(ledPin6, OUTPUT);
pinMode(ledPin7, OUTPUT);
pinMode(ledPin8, OUTPUT);
// menjadikan PIN 0, 1, 2, 3, dan 4 sebagai OUTPUT
}
 
void loop()
// Menyalakan LED sacara bergilir 
{
digitalWrite(ledPin1, HIGH);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, HIGH);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, HIGH);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, HIGH);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, HIGH);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, HIGH);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, HIGH);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, HIGH);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, HIGH);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, HIGH);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, HIGH);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, HIGH);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, HIGH);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, HIGH);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, LOW);
digitalWrite(ledPin2, HIGH);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100);
digitalWrite(ledPin1, HIGH);
digitalWrite(ledPin2, LOW);
digitalWrite(ledPin3, LOW);
digitalWrite(ledPin4, LOW);
digitalWrite(ledPin5, LOW);
digitalWrite(ledPin6, LOW);
digitalWrite(ledPin7, LOW);
digitalWrite(ledPin8, LOW);
delay(100); 
}