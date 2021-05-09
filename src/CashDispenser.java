//Nama : Dhiya Fakhar Nafi
//Kelas : D4 TI-1A
//NIM : 201524002

public class CashDispenser {
	// jumlah awal tagihan di mesin ATM tunai
   private final static int INITIAL_COUNT = 500;
   private int count; // number of $20 bills remaining
   
   // Konstruktor CashDispenser menginisialisasi hitungan ke default
   public CashDispenser() {
      count = INITIAL_COUNT; // set count attribute to default
   }

   // mensimulasikan pengeluaran uang tunai dalam jumlah tertentu
   public void dispenseCash(int amount) {
      int billsRequired = amount / 20; // number of $20 bills required
      count -= billsRequired; // memperbaharui data nilai
   }

   //menunjukkan apakah mesin ATM tunai dapat mengeluarkan jumlah yang diinginkan
   public boolean isSufficientCashAvailable(int amount) {
      int billsRequired = amount / 20; // number of $20 bills required

      if (count >= billsRequired) {
         return true; // enough bills available
      }
      else {
         return false; // not enough bills available
      }
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