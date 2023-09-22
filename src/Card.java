public class Card 
{
   private final String face; // face of card ("Ace", "Deuce", ...)
   private final String suit; // suit of card ("Hearts", "Diamonds", ...)
   private final int valor; 

   // two-argument constructor initializes card's face and suit
   public Card(String face, String suit, int valor)
   {
      this.face = face;
      this.suit = suit; 
      this.valor = valor;
   } 

   // return String representation of Card
   public String toString() 
   { 
      return face + " de " + suit + " ,valor: " + valor;
   } 
   public int getvalor()
   {
       return valor;
   }
} // end class Card
