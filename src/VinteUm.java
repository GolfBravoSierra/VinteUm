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

        //programa pergunta quantos jogadores vao jogar
        System.out.printf("entre com o numero de jogadores:");
        Scanner input  = new Scanner(System.in);
        String numero1 = input.nextLine();

        // programa inicializa o vetor jogador com o numero de jogadores
        int numero = Integer.parseInt(numero1);
        players = new Player[numero];

        //for para popular o vetro de jogadores
        for(int i = 0; i < numero; i++)
        {
            //programa pergunta o nome do jogador
            System.out.printf("\n entre com o nome do jogador %d:", i + 1);
            String nome ;
            nome = input.nextLine();

            // programa distribui as duas cartas iniciai para o jogador
            for(int j = 0; j < 2; j++)
            {
                mao[j]= deck.dealCard();
                
            }
            //programa chama o construtor de jogador
            players[i] = new Player(nome , mao);
        }
        // contador é usado para ver se algun jogador ja ganhou ou não ele retorna un caso ja tenha ganhado e zero caso não
        Contador contagem = new Contador(players , numero); 
        count = contagem.getcontagem();

        //whwli para compra de cartas do jogo 
        while(count != 1){
            //for para cada jogador comprar cartas
            for (int i = 0; i < numero; i++)
            {
                    //progrmam inprime os pontos do jogador es carta depois pergunta se ele quer comprar mais cartas 
                    System.out.printf("\n pontos do player %d: %d", i+1, players[i].getpots());
                    System.out.printf("\n player %d deseja mais cartas? (1 p/ sim e 0 p/ nao):\n", i+1);
                    Scanner entrada  = new Scanner(System.in);
                    String resposta = entrada.nextLine();
                    int resposta1 = Integer.parseInt(resposta);
                    //if para comprar cartas ou não
                    if(resposta1 == 1)
                    {
                        carta = deck.dealCard();
                        //System.out.printf("\n a carta eh: %s", carta.toString());
                        players[i].setmao(carta);
                        players[i].retornamao();
                        if (players[i].retornapontos() > 21){
                            System.out.printf("\n -------JOGADOR %d GANHOU", i+1);
                        }
                    }
                    else
                    {
                        System.out.printf(" o player %d nao quer mais cartas", i+1);
                    }
                    
            }
            //contador usado para determinar se o while continua ou não 
            contagem = new Contador(players , numero); 
            count = contagem.getcontagem();
            System.out.println(count);

        }
    }
} // end class VinteUm