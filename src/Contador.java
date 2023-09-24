public class Contador {
    private int contagem;
    private int i = 0;
    
    //contrutor do contador, ele verifica se algum player ja ganhou ou não
    public Contador(Player[] players , int numero){
        while(i < numero){
            if(players[i].retornapontos() > 21){
                this.contagem = 1;
                
            }
            else{
                this.contagem = 0;
                i++;
            }
        }
    }
    //retorna a contagem
    public int getcontagem(){
        return this.contagem;
    }


}