
package banco;

public class Senha {
    public int senha;
    private int agencia;
    public int conta;
    public boolean configSenha;
    
    
    public Senha(int s,int a, int c){  //this construct
       
        this.senha = s;
        this.agencia = a;
        this.conta = c;
        
        
    }
    
    public int getSenha(){
        return this.senha;
      
        
    }
    public void setSenha(int s){
        this.senha = s;
    }
    public int getAgencia(){
    return this.agencia;
    }
    public void setAgencia(int a){
        this.agencia = a;
    }
    public int getConta(){
        return this.conta;
        
    }
    public void setConta(int c){
        this.conta = c;
    }
    public boolean configSenha(){
        return this.configSenha;
        
    }
    public void BooleanConfigSenha(){
        this.configSenha = true ;
    }
    
    public void BooleanConfigSenhaError(){
        this.configSenha = false ;
    }
    
    public void status(){
    System.out.println("Saque foi:" +this.senha);
    System.out.println("Agencia:" +this.agencia);
    System.out.println("Conta" +this.conta);
    System.out.println("");
    
    
      
    }  
}
