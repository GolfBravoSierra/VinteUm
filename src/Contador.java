public class Contador {
    private int contagem;
    private int i = 0;

    public Contador(Player[] players , int numero){

        while(i < numero){
            //System.out.printf(players[i].retornanome());
            if(players[i].retornapontos() > 21){
                this.contagem = 1;
                System.out.printf("\n quem ganhou foi o player: ");
                System.out.println(players[i].retornanome());
                //System.out.println(this.contagem);
                
            }
            else{

                //System.out.println(this.contagem);
                this.contagem = 0;
                i++;
            }
        }
    }
    public int getcontagem(){
        return this.contagem;
    }


}