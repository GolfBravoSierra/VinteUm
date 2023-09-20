import java.util.Scanner;
public class VinteUm
{
    public static void main(String[] args)
    {
         Player[] players = new Player[4];
         Card[] mao = new Card[6];
         Card[] retorno = new Card[6];
         Card carta;

         // criando o baralho
         DeckOfCards deck = new DeckOfCards();
         deck.shuffle();

        System.out.printf("entre com o numero de jogadores:");
        Scanner input  = new Scanner(System.in);
        String numero1 = input.nextLine();
        int numero = Integer.parseInt(numero1);
        System.out.println(numero);
        players = new Player[numero];

        for(int i = 0; i < numero; i++)
        {
            System.out.printf("\n entre com o nome do jogador %d:", i + 1);
            String nome ;
            nome = input.nextLine();
            //System.out.println(nome);

            for(int j = 0; j < 2; j++)
            {
                mao[j]= deck.dealCard();
                System.out.printf("\n %s", mao[j].toString());
            }
            players[i] = new Player(nome , mao);
        }
        // imprimindo as cartas dos jogadores
       /*  System.out.printf("\n as cartas dos jogadores sao:");
        for(int i = 1; i <= numero; i++)
        {
            System.out.printf("\n nome do jogador %d:", i++);
            System.out.printf(players[1].retornanome());

            retorno[i] = players[i].retornamao();
            System.out.printf("\n cartas do jogador %d:", i++);
            for(int j = 0; j < 2; j++)//...............................mão sei porqeu não imprime
            {
                System.out.printf(retorno[j].toString());
            }
        }*/

        for (int i = 0; i < numero; i++)
        {
            System.out.printf("\n player %d deseja mais cartas? (s/n)", i+1);
            String resposta = input.nextLine();
            if(resposta == "s")
            {
            carta = deck.dealCard();
            players[i].setmao(carta);
            }
        }
    }
} // end class VinteUm
