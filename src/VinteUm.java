import java.util.Scanner;
public class VinteUm
{
    public int MAX_PLAYERS;
    public int Numero_Player = 0;
    public Player[] players;
    public Card[] mao;
    public static void main(String[] args)
    {

        System.out.printf("entre com o numero de jogadores:");
        Scanner input  = new Scanner(System.in);
        String numero1 = input.nextLine();
        int numero = Integer.parseInt(numero1);
        System.out.println(numero);
        Player players[] = new Player[numero];

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
            System.out.printf("\n nome do jogador %d:", i);
            System.out.printf(players[i].retornanome());
        }
        // criando o baralho
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        // distribuindo as cartas
        for(int i = 0; i <= numero; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                mao = deck.dealCard();
                players[i].setmao[j] = mao;
            }
        }
        // imprimindo as cartas dos jogadores
        for(int i = 0; i <= numero; i++)
        {
            System.out.printf("\n nome do jogador %d:", i);
            System.out.printf(players[i].retornanome());
            System.out.printf("\n cartas do jogador %d:", i);
            for(int j = 0; j < 3; j++)
            {
                System.out.printf(players[i].retornamao[j]);
            }
        }

    }
} // end class VinteUm
