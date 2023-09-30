
//Giovani Bellini dos Santos        22007263
//Victor de Melo Roston             22006737
//Lucca Vasconcelo Costa Oliveira   22003004
import java.util.Scanner;
public class VinteUm
{
    public static void main(String[] args)
    {
        //criando variaveis
        Player[] players = new Player[4];
        Card[] mao = new Card[6];
        Card carta;
        int count = 0;
        int rodadas = 0;

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
        

        // programa verifica se algum jogador ja ganhou ou estourou com um if dentro de um for para rodar por todos os jogadores
        for (int i = 0; i < numero; i++){
            // progrma verifica se a algum jogador ja com 21 pontos e da a vitorio para quem tiver 
            if (players[i].getpontos() == 21){
                System.out.println(players[i].getpontos());
                System.out.printf("o jogador %s ja ganhou, com %d pontos.", players[i].retornanome(), players[i].getpontos());
                return ;
            }
            // programa verifica se algum jogador ja estourou 
            else if( players[i].getpontos() > 21){
                System.out.println(players[i].getpontos());
                System.out.printf("o jogador %s estrou, com %d pontos. ", players[i].retornanome(), players[i].getpontos());
                return ;
            }

        }

        //whwli para compra de cartas do jogo 
        while(count != 1 && count != 2  &&  rodadas < 5){
            //for para cada jogador comprar cartas
            for (int i = 0; i < numero; i++)
            {
                    //progrmam inprime os pontos do jogador es carta depois pergunta se ele quer comprar mais cartas 
                    System.out.printf("\n pontos do player %d: %d", i+1, players[i].getpontos());
                    System.out.printf("\n player %d deseja mais cartas? (1 p/ sim e 0 p/ nao):\n", i+1);
                    Scanner entrada  = new Scanner(System.in);
                    String resposta = entrada.nextLine();
                    int resposta1 = Integer.parseInt(resposta);

                    //if para a compra de cartas  
                    if(resposta1 == 1)
                    {   
                        // programa da uma carta para o jogador e imprime a mao dele
                        carta = deck.dealCard();
                        players[i].setmao(carta);
                        players[i].retornamao();

                        // programa verifica se o jogador ja ganhou ou estourou com esse if 
                        if (players[i].getpontos() == 21){
                            System.out.printf("---JOGADOR %s GANHOU--- \n com %d pontos.", players[i].retornanome(), players[i].getpontos());
                            return ;
                        }
                        else if(players[i].getpontos() > 21){
                            System.out.printf("---JOGADOR %s ESTOU--- \n com %d pontos.", players[i].retornanome(), players[i].getpontos());
                            return ;
                        }
                    }
                    else
                    {
                        System.out.printf(" o player %d nao quer mais cartas", i+1);
                    }
                    
            }

            //contador de rodadas
            rodadas++;

            //contador usado para determinar se o while continua ou não 
            contagem = new Contador(players , numero); 
            count = contagem.getcontagem();
            System.out.println(count);

        }
        //for para imprimir os pontos finais dos jogadores
        for (int i = 0; i < numero; i++){
            System.out.printf("\n pontos do player %d: %d", i+1, players[i].getpontos());
        }
        //for para determinar o vencedor
        for (int i = 0; i < numero; i++){
            if (players[i].getpontos() > players[i+1].getpontos()){
                System.out.printf("\n o jogador %s ganhou com %d pontos", players[i].retornanome(), players[i].getpontos());
            }
            else if(players[i].getpontos() < players[i+1].getpontos()){
                System.out.printf("\n o jogador %s ganhou com %d pontos", players[i+1].retornanome(), players[i+1].getpontos());
            }

        }

    }
} // end class VinteUm