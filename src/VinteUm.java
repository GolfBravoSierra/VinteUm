import java.util.Scanner;
public class VinteUm
{
    public static void main(String[] args)
    {
        Player[] players = new Player[4];
        Card[] mao = new Card[6];
        Card[] retorno = new Card[6];
        Card carta;
        int count = 0;
         // criando o baralho
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        System.out.printf("entre com o numero de jogadores:");
        Scanner input  = new Scanner(System.in);
        String numero1 = input.nextLine();
        int numero = Integer.parseInt(numero1);
        //System.out.println(numero);
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
                
            }
            players[i] = new Player(nome , mao);
        }
        Contador contagem = new Contador(players , numero); 
        count = contagem.getcontagem();

        while(count != 1){
            for (int i = 0; i < numero; i++)
            {
                    System.out.printf("\n pontos do player %d: %d", i+1, players[i].getpots());
                    System.out.printf("\n player %d deseja mais cartas? (1 p/ sim e 0 p/ nao):\n", i+1);
                    Scanner entrada  = new Scanner(System.in);
                    String resposta = entrada.nextLine();
                    int resposta1 = Integer.parseInt(resposta);
                    if(resposta1 == 1)
                    {
                        carta = deck.dealCard();
                        //System.out.printf("\n a carta eh: %s", carta.toString());
                        players[i].setmao(carta);
                        players[i].retornamao();
                    }
                    else
                    {
                        System.out.printf(" o player %d nao quer mais cartas", i+1);
                    }
                    //players[i].retornamao();
            }
            contagem = new Contador(players , numero); 
            count = contagem.getcontagem();
            System.out.println(count);

        }
    }
} // end class VinteUm