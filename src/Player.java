public class Player {

    private Card[] mao;
    private String nome;
    private int pontos;
    private Card retorno;
    private int i = 2;

    //contrutor de player, ele recebe o nome do jogador e as duas cartas iniciais e imprime na tela 
    public Player(String nome, Card[] mao){
        this.mao = new Card[6];
        this.nome = nome;
        this.pontos = 0;
        System.out.printf("\n o nome do jogador eh ");
        System.out.printf(this.nome);
        System.out.printf("\n as cartas do jogador sao: \n");
        for (int j = 0; j < 2; j++){
            this.mao[j] = mao[j];
            System.out.println(this.mao[j].toString());
            this.pontos = this.pontos + this.mao[j].getvalor();
        }
        
    }
    //retorno de pontos
    public int getpots(){
        return this.pontos;
    }

    //seta o nome do jogador 
    public void getnome(String nome){
        this.nome = nome;
    }

    //retorno do nome do jogador
    public String retornanome(){
        return this.nome;
    }
    
    //seta a mao do jogador
    public void setmao(Card carta){
        
        this.mao[i] = carta;
        this.pontos = this.pontos + this.mao[i].getvalor();
        i++;
    }

    //retorna a mao do jogador, ela não retorna para a main ela imprime ele mesma 
    public void retornamao(){
        for (int j = 0; j < 6; j++){
            this.mao[j] = mao[j];
            if (this.mao[j] != null){
                System.out.println(this.mao[j].toString());
                this.pontos = this.pontos + this.mao[j].getvalor();
            }
            else{
                System.out.printf("---------\n");
            }
        }
    }

    //seta os pontos do jogador
    public void setpontos(int pontos){
        this.pontos = pontos;
    }

    //retorna os pontos do jogador
    public int retornapontos(){
        return this.pontos;
    }


    
}
