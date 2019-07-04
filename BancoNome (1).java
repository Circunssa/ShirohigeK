
package banco;
public class BancoNome {

    private String nome;
    public String endereco;
    public String pais;
    public String municipio;
    public String estado;
    protected String tipo;
    public int cpf;
    public int rg;
    public int telefone;
    private float saldo;
    private boolean status; 
    public float depositar;

    
    
    public BancoNome(String nome, String endereco, String pais, String municipio, String estado, int cpf, int rg, int telefone, String  tipo,float saldo,float depositar,boolean status) {
        
        this.status=false;
        this.saldo = 0;
        this.nome = nome;
        this.endereco = endereco;
        this.pais = pais;
        this.municipio = municipio;
        this.estado = estado;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.tipo = tipo;
        this.depositar = depositar;
       
    }
  //metodos personalizados
    public void abricont(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "CC"){
            this.setSaldo(10);
            
        }else if(tipo=="CP")  {
            
            this.setSaldo (0);
        }
        System.out.println("Agora pode usar a sua conta");
        
        
    }
    public void fecharconta(){
        if (this.getSaldo()>0){
            System.out.println("Ainda tem dinheiro ");
            
        }else if(this.getSaldo()<0){
            System.out.println("Esta devendo");
        }
        else{
            this.setStatus(false);
            System.out.println("Fechado.");
        }
        
    }
    public void depositar(float valor){
        if(this.getStatus()){
           this.setSaldo(this.getSaldo() + valor);
           System.out.println("Feito deposito"+this.getDepositar());
    }else{
            System.out.println("Infelizmente nao conseguimos fazer o deposito");
            }
    }
    public void sacar(float valor){
        if(this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo()- valor);
                System.out.println("Saldo realizado"+ getNome()+getSaldo());
                
            }else{
                
            System.out.println("Saldo insuficiente");
            }
           }
          }
    public void pagarMensalidade(){
        int valor;
        if(this.getTipo()== "CC"){
            valor = 12;
        }else if(this.getTipo()=="CP"){
            valor = 20;
            
        }
        if (this.getStatus()){ 
            this.setSaldo(this.getSaldo()- valor);
            
        } 
                
    }
     
  
    public String  getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.setNome(nome);
    }

    public String  getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.setEndereco(endereco);
    }

    public String  getPais() {
        return pais;
    }

    public void setPais(String Pais) {
        this.setPais (pais);
    }

    public String  getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.setMunicipio(municipio);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.setEstado(estado);
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.setCpf(cpf);
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.setRg(rg);
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.setTelefone(telefone);
    }
    
   protected String  getTipo() {
        return tipo;
    }

   protected void setTipo(String tipo) {
        this.setTipo(tipo);
    }
     public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.setSaldo(saldo);
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.setStatus(status);
    }
    public float getDepositar(){
        return this.depositar;
    }
    public void setDepositar(float depositar){
        this.setDepositar(depositar);
    }
   
   
     
    
    public void status(){
    System.out.println("Saque foi:");
    System.out.println("Agencia:" );
    System.out.println("Conta");
    System.out.println("Depositar");
    
    
    }
}
