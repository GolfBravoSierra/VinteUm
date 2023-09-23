public class Player {

    private Card[] mao;
    private String nome;
    private int pontos;
    private Card retorno;
    private int i = 2;

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

    public int getpots(){
        return this.pontos;
    }


    public void getnome(String nome){
        this.nome = nome;
    }

    public String retornanome(){
        return this.nome;
    }
    
    public void setmao(Card carta){
        
        this.mao[i] = carta;
        //System.out.println(this.mao[i].toString());
        this.pontos = this.pontos + this.mao[i].getvalor();
        i++;
    }

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

    public void setpontos(int pontos){
        this.pontos = pontos;
    }

    public int retornapontos(){
        return this.pontos;
    }


    
}
