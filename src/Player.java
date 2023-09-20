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
    }

    public void getnome(String nome){
        this.nome = nome;
    }

    public String retornanome(){
        return this.nome;
    }
    
    public void setmao(Card carta){
        
        this.mao[contaodor()] = carta;
    }

    public int contaodor(){
        i = i + 1;
        return i;
    }

    public Card retornamao(){
        for(int i = 0; i < 2; i++){
             retorno = this.mao[i];
        }
        return retorno;
    }

    public void setpontos(int pontos){
        this.pontos = pontos;
    }

    public int retornapontos(){
        return this.pontos;
    }


    
}
