package com.tutorial;

// keywoard untuk import package eksternal
import com.terminal.Console;



class Main{
    public static void main(String[] args) {
      //Membuat objek
      Player player1 = new Player("Hida");
      Player player2 = new Player("Nur");
      Player player3 = new Player("Apriaty");
      player1.cetak();
      player2.cetak();
      player3.cetak();

      Console.log("Hallo");
    }
}

    
