import java.util.Scanner;
public class VinteUm
{
    public static void main(String[] args)
    {
         int MAX_PLAYERS;
         int Numero_Player = 0;
         Player[] players;
         Card[] mao = new Card[6];

        System.out.printf("entre com o numero de jogadores:");
        Scanner input  = new Scanner(System.in);
        String numero1 = input.nextLine();
        int numero = Integer.parseInt(numero1);
        System.out.println(numero);
        players = new Player[numero];

        for(int i = 0; i < numero; i++)
        {
            System.out.printf("\n entre com o nome do jogador %d:", i);
            String nome ;
            nome = input.nextLine();
            players[i] = new Player(nome);
        }
        // imprimindo o nome dos jogadores
        for(int i = 0; i <= numero; i++)
        {
            System.out.printf("\n nome do jogador %d:", i++);
            System.out.printf(players[i].retornanome());
        }
        // criando o baralho
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        // distribuindo as cartas
        for(int i = 0; i < numero; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                mao[j]= deck.dealCard();

            }
            players[i].setmao(mao);
        }
        // imprimindo as cartas dos jogadores
        for(int i = 0; i < numero; i++)
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
