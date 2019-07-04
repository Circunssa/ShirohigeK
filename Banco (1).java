
package banco;

public class Banco {
    
    public static void main(String[] args) {
        Senha s1 = new Senha(2559, 100, 50);
        s1.status();
        
        BancoSaque bs1 =  new BancoSaque(100,200,300);
        bs1.status();
        
        BancoNome bn1  = new BancoNome("GIGI","Av pente de camaron",509,"São Pualo","Capital",55555555,666666,5978231);
        bn1.status();
      
        
    }
    
}
