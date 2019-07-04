
package banco;


public class BancoSaque {
    public float saque;
    public float valor;
    
   
    
    public BancoSaque(float valor,float saque){
        
        this.setValor(valor);
        this.saque=0;
    }
    
    //METODO PERSONALIZADO
    
    
    
    
    public float getSaque(){
        return this.saque;
    }
    public void setSaque(float saque){
        this.saque=saque;
        
        }
                
    public float getValor (){
        return this.valor;
       
    }
    public void setValor (float valor){
        this.valor = valor;
    }
    
   public void status(){
       System.out.println("A opcão foi Saque:" +this.saque);
       System.out.println("Menu Escolhido foi:" +this.valor);
       System.out.println("");
   }
}
