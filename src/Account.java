//Nama : Dhiya Fakhar Nafi
//Kelas : D4 TI-1A
//NIM : 201524002

// Account.java
// Represents a bank account

public class Account {
   private int accountNumber; // nomor akun
   private int pin; // PIN untuk otentikasi
   private double availableBalance; // dana tersedia untuk penarikan
   private double totalBalance; // dana tersedia + setoran tertunda

   // Konstruktor Account menginisialisasi atribut
   public Account(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance) {
      accountNumber = theAccountNumber;			//inisialisasi atribut accountNumber
      pin = thePIN;								//inisialisasi atribut PIN
      availableBalance = theAvailableBalance;	//inisialisasi atribut Balance yang tersedia (Saldo)
      totalBalance = theTotalBalance;			//inisialisasi atribut Jumlah Saldo
   }

   // menentukan apakah PIN yang diinput pengguna cocok dengan PIN di database Bank
   public boolean validatePIN(int userPIN) {
      if (userPIN == pin) {						//Jika PIN yang dimasukkan benar (sesuai data), mengembalikan nilai true
         return true;
      }
      else {
         return false;							//Jika PIN yang dimasukkan salah, ia akan mengembalikan nilai false
      }
   } 

   public double getAvailableBalance() {		//Mengembalikan nilai Saldo
      return availableBalance;
   } 

   public double getTotalBalance() {			//Mengembalikan nilai saldo
      return totalBalance;
   } 

   //menambah sejumlah ke akun
   public void credit(double amount) {		
      totalBalance += amount; 
   }

   //mengambil sejumlah uang dari akun
   public void debit(double amount) {			
      availableBalance -= amount; // mengurangi saldo akun
      totalBalance -= amount; // mengurangi total saldo akun
   }

   // mengembalikan nomor akun
   public int getAccountNumber() {
      return accountNumber;  
   }
} 

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/