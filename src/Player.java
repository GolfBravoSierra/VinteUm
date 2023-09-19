public class Player {

    private Card[] mao;
    private String nome;
    private int pontos;

    public Player(String nome){
        this.mao = new Card[6];
        this.nome = nome;
        this.pontos = 0;
    }

    public void getnome(String nome){
        this.nome = nome;
    }

    public String retornanome(){
        return this.nome;
    }
    
    public void setmao(Card[] mao){
        this.mao = mao;
    }

    public Card[] retornamao(){
        return this.mao;
    }

    public void setpontos(int pontos){
        this.pontos = pontos;
    }

    public int retornapontos(){
        return this.pontos;
    }


    
}
