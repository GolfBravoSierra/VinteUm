//Giovani Bellini dos Santos        22007263
//Victor de Melo Roston             22006737
//Lucca Vasconcelo Costa Oliveira   22003004
public class Contador {
    private int contagem;
    private int i = 0;
    
    //contrutor do contador, ele verifica se algum player ja ganhou ou não
    public Contador(Player[] players , int numero){
        for(i = 0; i < numero; i++){
            if(players[i].getpontos() == 21){
                this.contagem = 1;
            }
            else if (players[i].getpontos() > 21){
                this.contagem = 2;
            }
            else if (players[i].getpontos() < 21){
                this.contagem = 0;
            }
        }    
        
    }
    //retorna a contagem
    public int getcontagem(){
        return this.contagem;
    }
    public int getplayer() {
        return this.i;
    }


}