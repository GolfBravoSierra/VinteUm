import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;


public class VinteUm
{
    public static void main(String[] args)
    {
         int MAX_PLAYERS;
         int Numero_Player = 0;
         Player[] players;
         Card[] mao = new Card[6];
         //lista com o nome de animais 
         String[] animais = {"Gato", "Galinha", "Pato", "Cavalo", "Vaca", "Porco", "Peixe-boi","Guaxinim","Elefante","Tucano","BemTiVi","Cachorro","Sabia","Arara"};

		int NumeroPlayer = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de jogadores: "));
        System.out.printf("%d",NumeroPlayer);
        players = new Player[NumeroPlayer];

        for(int i = 0; i <NumeroPlayer; i++)
        {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(animais.length);  
            String animalEscolhido = animais[numeroAleatorio]; 
            players[i] = new Player(animalEscolhido);    
             }
        // imprimindo o nome dos jogadores
        for(int i = 0; i <= NumeroPlayer; i++)
        {
            System.out.printf("\n nome do jogador %d:", i );
            System.out.printf(players[i].retornanome());
        }
        // criando o baralho
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        // distribuindo as cartas
        for(int i = 0; i < NumeroPlayer; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                mao[j]= deck.dealCard();

            }
            players[i].setmao(mao);
        }
        // imprimindo as cartas dos jogadores
        for(int i = 0; i < NumeroPlayer; i++)
        {
            System.out.printf("\n nome do jogador %d:", i++);
            System.out.printf(players[i].retornanome());
            System.out.printf("\n cartas do jogador %d:", i++);
            for(int j = 0; j < 2; j++)
            {
                System.out.printf("\n %s", players[i].retornamao()[j]);
            }
        }

    }
} // end class VinteUm

