package Objetos;
public class ContaEspecial extends Conta{
    private double limite;
    private double taxa;

    public ContaEspecial(){}
    public ContaEspecial(int numeroConta, String nomeCliente, double saldo){
        super(numeroConta, nomeCliente, saldo);
        this.AtualizaBeneficios();
    }
    public ContaEspecial(int numeroConta, String nomeCliente, double saldo, double limite, double taxa){
        super(numeroConta, nomeCliente, saldo);
        this.limite = limite;
        this.taxa = taxa;
    }
    
    public void AtualizaBeneficios(){
        if (this.getSaldo() <= 2000){
            this.limite = 0;
            this.taxa = 0;
        }else if ((this.getSaldo() > 2000) && (this.getSaldo() <= 4000)){
            this.limite = 10000;
            this.taxa = 5;
        }else if ((this.getSaldo() > 4000) && (this.getSaldo() <= 6000)){
            this.limite = 30000;
            this.taxa = 8.5;
        }else if (this.getSaldo() > 6000){
            this.limite = 70000;
            this.taxa = 14;
        }
    }
    
    public int RealizarEmprestimo(double valorEmprestimo){
        try{
            this.AtualizaBeneficios();
            if ((this.limite > 0) && (this.taxa > 0)){
                if (valorEmprestimo <= this.limite){
                    
                    this.setSaldo(this.getSaldo() - (valorEmprestimo + (valorEmprestimo / 100 * this.getTaxa())));
                    this.AtualizaBeneficios();
                    return 1;   //Se o empréstimo for realizado com sucesso
                }else{
                    return 2;   //Se valor do empréstimo for maior que o limite da conta
                }
            }else{
                return 3;   //Se limite e taxa forem igual a 0 (já foi realizado empréstimo)
            }
        }catch(Error e){
            throw new Error("Erro ao RealizarEmprestimo()");
        }
    }

    @Override
    public String toString() {
        return getNumeroConta() +";"+ getCliente() +";"+ getSaldo() +";"+ getLimite() +";"+ getTaxa();
    }
    
    public double getLimite() {
        return this.limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getTaxa() {
        return this.taxa;
    }
    public void setTaxa(double taxa){
        this.taxa = taxa;
    }
}