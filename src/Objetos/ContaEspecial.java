package Objetos;
public class ContaEspecial extends Conta{
    private double limite;
    private double taxa;
    private double divida;

    public ContaEspecial(){}
    public ContaEspecial(int numeroConta, String nomeCliente, double saldo){
        super(numeroConta, nomeCliente, saldo);
        this.divida = 0;
        this.AtualizaBeneficios();
    }
    public ContaEspecial(int numeroConta, String nomeCliente, double saldo, double limite, double taxa){
        super(numeroConta, nomeCliente, saldo);
        this.limite = limite;
        this.taxa = taxa;
        this.divida = 0;
    }
    public ContaEspecial(int numeroConta, String nomeCliente, double saldo, double limite, double taxa, double divida){
        super(numeroConta, nomeCliente, saldo);
        this.limite = limite;
        this.taxa = taxa;
        this.divida = divida;
    }
    
    public void AtualizaBeneficios(){
        if ((this.getSaldo() < 2000) || (this.getDivida() > 0)){
            this.limite = 0;
            this.taxa = 0;
        } else if ((this.getSaldo() >= 2000) && (this.getSaldo() < 4000)){
            this.limite = 10000;
            this.taxa = 25;
        }else if ((this.getSaldo() >= 4000) && (this.getSaldo() < 6000)){
            this.limite = 30000;
            this.taxa = 50;
        }else if (this.getSaldo() >= 6000){
            this.limite = 70000;
            this.taxa = 75;
        }
    }
    
    public int RealizarEmprestimo(double valorEmprestimo){
        if (this.getDivida() > 0){
            return 0;
        }else{
            try{
                this.AtualizaBeneficios();
                if ((this.limite > 0) && (this.taxa > 0)){
                    if (valorEmprestimo <= this.limite){
                        this.setSaldo(this.getSaldo() + valorEmprestimo);
                        this.setDivida(valorEmprestimo + (valorEmprestimo / 100 * this.getTaxa()));
                        this.AtualizaBeneficios();
                        return 1;   //Se o empréstimo for realizado com sucesso
                    }else{
                        return 2;   //Se valor do empréstimo for maior que o limite da conta
                    }
                }else{
                    return 3;   //Se limite e taxa forem igual a 0 (insuficientes)
                }
            }catch(Error e){
                throw new Error("Erro ao RealizarEmprestimo()");
            }
        }
    }

    @Override
    public String toString() {
        return getNumeroConta() +";"+ getCliente() +";"+ getSaldo() +";"+ getLimite() +";"+ getTaxa() +";"+ getDivida();
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
    public double getDivida() {
        return this.divida;
    }
    public void setDivida(double divida){
        this.divida = divida;
    }
}