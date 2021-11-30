/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;
import Objetos.CadConta;
import Objetos.Conta;
import Objetos.ContaEspecial;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Ricardo
 */
public class Tela_Deposito extends javax.swing.JFrame {
    /**
     * Creates new form Tela_Deposito
     */
    public Tela_Deposito(CadConta cadContaObj) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cadContaObj = cadContaObj;
        this.Label_ConfirmacaoDeposito.setVisible(false);
        this.Label_SaldoFinal.setVisible(false);
        this.Label_NumContaErro.setVisible(false);
        this.Label_ValorDepositoErro.setVisible(false);
        this.Label_Decisao_2.setVisible(false);
        this.Label_Decisao_3.setVisible(false);
        this.RadioButton_SIM.setVisible(false);
        this.RadioButton_NAO.setVisible(false);
        this.Button_OK.setVisible(false);
        this.Label_DecisaoErro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioButton_Confirmacao = new javax.swing.ButtonGroup();
        Label_Titulo = new javax.swing.JLabel();
        Label_NumConta = new javax.swing.JLabel();
        Input_NumConta = new javax.swing.JTextField();
        Label_NumContaErro = new javax.swing.JLabel();
        Button_ConfirmarDeposito = new javax.swing.JButton();
        Label_ValorDeposito = new javax.swing.JLabel();
        Input_ValorDeposito = new javax.swing.JTextField();
        Label_ValorDepositoErro = new javax.swing.JLabel();
        Label_SaldoFinal = new javax.swing.JLabel();
        Label_ConfirmacaoDeposito = new javax.swing.JLabel();
        Button_RetornarMenuPrincipal = new javax.swing.JButton();
        Label_Decisao_1 = new javax.swing.JLabel();
        Label_Decisao_2 = new javax.swing.JLabel();
        Label_Decisao_3 = new javax.swing.JLabel();
        Label_DecisaoErro = new javax.swing.JLabel();
        Button_OK = new javax.swing.JButton();
        RadioButton_SIM = new javax.swing.JRadioButton();
        RadioButton_NAO = new javax.swing.JRadioButton();
        Transferencia_de_dados = new javax.swing.JLabel();
        Label_InformacaoDividas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Titulo.setBackground(new java.awt.Color(168, 168, 168));
        Label_Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Depósito em Dinheiro");
        Label_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_NumConta.setBackground(new java.awt.Color(168, 168, 168));
        Label_NumConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_NumConta.setText("Número da Conta");
        Label_NumConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_NumContaErro.setForeground(java.awt.Color.red);

        Button_ConfirmarDeposito.setText("Confirmar Depósito");
        Button_ConfirmarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ConfirmarDepositoActionPerformed(evt);
            }
        });

        Label_ValorDeposito.setBackground(new java.awt.Color(168, 168, 168));
        Label_ValorDeposito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_ValorDeposito.setText("Valor do Depósito");
        Label_ValorDeposito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_ValorDepositoErro.setForeground(java.awt.Color.red);

        Button_RetornarMenuPrincipal.setText("Retornar ao menu principal");
        Button_RetornarMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RetornarMenuPrincipalActionPerformed(evt);
            }
        });

        Label_Decisao_1.setForeground(java.awt.Color.red);

        Label_Decisao_2.setForeground(java.awt.Color.red);

        Label_DecisaoErro.setForeground(java.awt.Color.red);

        Button_OK.setText("OK");
        Button_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_OKActionPerformed(evt);
            }
        });

        RadioButton_Confirmacao.add(RadioButton_SIM);
        RadioButton_SIM.setText("SIM");

        RadioButton_Confirmacao.add(RadioButton_NAO);
        RadioButton_NAO.setText("NÃO");

        Label_InformacaoDividas.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_InformacaoDividas.setText("*Dívidas são quitadas a partir do saldo da conta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_NumConta)
                                            .addComponent(Label_ValorDeposito))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Input_NumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Input_ValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_ValorDepositoErro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Label_NumContaErro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(Label_SaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button_ConfirmarDeposito)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Label_ConfirmacaoDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 152, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_Decisao_3, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(Label_Decisao_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label_Decisao_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RadioButton_NAO)
                                            .addComponent(RadioButton_SIM))
                                        .addGap(18, 18, 18)
                                        .addComponent(Button_OK))
                                    .addComponent(Label_DecisaoErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_RetornarMenuPrincipal))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_InformacaoDividas, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Label_Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Transferencia_de_dados)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Transferencia_de_dados)
                    .addComponent(Label_InformacaoDividas, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_NumConta)
                        .addComponent(Input_NumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label_NumContaErro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Label_ValorDeposito)
                        .addComponent(Input_ValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label_ValorDepositoErro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_ConfirmacaoDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_ConfirmarDeposito))
                .addGap(26, 26, 26)
                .addComponent(Label_SaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_Decisao_1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(Label_DecisaoErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Label_Decisao_2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Label_Decisao_3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Button_OK)
                            .addGap(25, 25, 25))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(RadioButton_SIM)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RadioButton_NAO)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button_RetornarMenuPrincipal)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ConfirmarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ConfirmarDepositoActionPerformed
        this.Label_ConfirmacaoDeposito.setText("");
        this.Label_ConfirmacaoDeposito.setVisible(false);
        this.Label_SaldoFinal.setText("");
        this.Label_SaldoFinal.setVisible(false);
        this.Label_NumContaErro.setText("");
        this.Label_NumContaErro.setVisible(false);
        this.Label_ValorDepositoErro.setText("");
        this.Label_ValorDepositoErro.setVisible(false);
        this.Label_Decisao_2.setText("");
        this.Label_Decisao_2.setVisible(false);
        this.Label_Decisao_3.setText("");
        this.Label_Decisao_3.setVisible(false);
        this.RadioButton_SIM.setVisible(false);
        this.RadioButton_NAO.setVisible(false);
        this.Button_OK.setVisible(false);
        this.Label_DecisaoErro.setVisible(false);
        
        int numConta;
        double valorDeposito;
        
        try{
            if (this.Input_NumConta.getText().isEmpty()){
                this.Label_NumContaErro.setText("Insira o número da conta!");
                this.Label_NumContaErro.setVisible(true);
            } 
            if (this.Input_ValorDeposito.getText().isEmpty()){
                this.Label_ValorDepositoErro.setText("Insira o valor do depósito!");
                this.Label_ValorDepositoErro.setForeground(Color.red);
                this.Label_ValorDepositoErro.setVisible(true);
            }
            if (!this.Input_ValorDeposito.getText().isEmpty()){
                if (Double.parseDouble(this.Input_ValorDeposito.getText()) < 0){
                    this.Label_ValorDepositoErro.setText("Apenas valores positivos são aceitos!");
                    this.Label_ValorDepositoErro.setVisible(true);
                }
            }
            if ((!this.Input_NumConta.getText().isEmpty()) && (!this.Input_ValorDeposito.getText().isEmpty())){
                numConta = Integer.parseInt(this.Input_NumConta.getText());
                valorDeposito = Double.parseDouble(this.Input_ValorDeposito.getText());
                ArrayList<Conta> listaLocal = cadContaObj.getArrayList();

                boolean encontrou = false;
                int i = 0;
                for (i=0; i<listaLocal.size(); i++){
                    if (listaLocal.get(i).getNumeroConta() == numConta){
                        if (listaLocal.get(i).getClass() == ContaEspecial.class){
                            ContaEspecial contaLocal = (ContaEspecial)listaLocal.get(i);
                            if (contaLocal.getDivida() > 0){
                                this.Label_Decisao_1.setText("Você possui R$" +contaLocal.getDivida()+ " em dívidas.");
                                this.Label_Decisao_1.setVisible(true);
                                
                                if (contaLocal.getSaldo() > 0){
                                    this.Label_Decisao_2.setText("O saldo da sua conta é R$" +contaLocal.getSaldo());
                                    this.Label_Decisao_2.setVisible(true);
                                    this.Label_Decisao_3.setText("Gostaria de pagar a dívida?");
                                    this.Label_Decisao_3.setVisible(true);
                                    this.Transferencia_de_dados.setText(Integer.toString(i));
                                    this.Transferencia_de_dados.setVisible(false);
                                    this.RadioButton_SIM.setVisible(true);
                                    this.RadioButton_NAO.setVisible(true);
                                    this.Button_OK.setVisible(true);
                                }else{
                                    this.DepositoNormal(i, valorDeposito);
                                }
                            }else{
                                this.DepositoNormal(i, valorDeposito);
                            }
                        }else{
                            this.DepositoNormal(i, valorDeposito);
                        }
                        encontrou = true;
                        break;
                    }
                }
                if ((i == listaLocal.size()) && (encontrou == false)){
                    this.Label_NumContaErro.setText("Número da Conta não encontrado.");
                    this.Label_NumContaErro.setVisible(true);
                    this.Input_NumConta.setText("");
                }
            }
        }catch(NumberFormatException e){
            this.Label_NumContaErro.setText("Apenas números são válidos");
            this.Label_NumContaErro.setVisible(true);
            this.Input_NumConta.setText("");
            this.Input_ValorDeposito.setText("");
        }
    }//GEN-LAST:event_Button_ConfirmarDepositoActionPerformed

    private void PagarDivida(int posConta, double valorDeposito){
        this.Label_Decisao_1.setText("");
        this.Label_Decisao_1.setVisible(false);
        this.Label_Decisao_2.setText("");
        this.Label_Decisao_2.setVisible(false);
        this.Label_Decisao_3.setText("");
        this.Label_Decisao_3.setVisible(false);
        this.RadioButton_SIM.setVisible(false);
        this.RadioButton_NAO.setVisible(false);
        this.Button_OK.setVisible(false);
        
        ArrayList<Conta> listaLocal = cadContaObj.getArrayList();
        ContaEspecial contaLocal = (ContaEspecial)listaLocal.get(posConta);
        
        try{
            if (contaLocal.getSaldo() > contaLocal.getDivida()){
                contaLocal.setSaldo(contaLocal.getSaldo() - contaLocal.getDivida());
                contaLocal.setDivida(0);
                contaLocal.setSaldo(contaLocal.getSaldo() + valorDeposito);
                
                this.Label_ValorDepositoErro.setText("Parabéns! Você quitou sua dívida");
                this.Label_ValorDepositoErro.setForeground(Color.black);
                this.Label_ValorDepositoErro.setVisible(true);
                this.RadioButton_SIM.setVisible(false);
                this.RadioButton_NAO.setVisible(false);
                this.Button_OK.setVisible(false);
            }else if (contaLocal.getSaldo() == contaLocal.getDivida()){
                contaLocal.setDivida(0);
                contaLocal.setSaldo(0);
                contaLocal.setSaldo(contaLocal.getSaldo() + valorDeposito);
                
                this.Label_ValorDepositoErro.setText("Parabéns! Você quitou sua dívida");
                this.Label_ValorDepositoErro.setForeground(Color.black);
                this.Label_ValorDepositoErro.setVisible(true);
                this.RadioButton_SIM.setVisible(false);
                this.RadioButton_NAO.setVisible(false);
                this.Button_OK.setVisible(false);
            } else if (contaLocal.getSaldo() < contaLocal.getDivida()){
                if ((contaLocal.getSaldo() + valorDeposito) == contaLocal.getDivida()){
                    contaLocal.setDivida(0);
                    contaLocal.setSaldo(0);
                    
                    this.Label_ValorDepositoErro.setText("Parabéns! Você quitou sua dívida");
                    this.Label_ValorDepositoErro.setForeground(Color.black);
                    this.Label_ValorDepositoErro.setVisible(true);
                    this.RadioButton_SIM.setVisible(false);
                    this.RadioButton_NAO.setVisible(false);
                    this.Button_OK.setVisible(false);
                }else{
                    contaLocal.setDivida(contaLocal.getDivida() - contaLocal.getSaldo());
                    contaLocal.setSaldo(0);
                    contaLocal.setSaldo(contaLocal.getSaldo() + valorDeposito);

                    this.Label_Decisao_2.setText("Você ainda deve R$" +contaLocal.getDivida());
                    this.Label_Decisao_2.setVisible(true);
                }
            }else{
                throw new Error("Ocorreu um erro ao comparar o saldo com a dívida (PagarDivida())");
            }
            contaLocal.AtualizaBeneficios();
            listaLocal.set(posConta, contaLocal);
            
            this.Label_ConfirmacaoDeposito.setText("Depósito realizado com sucesso.");
            this.Label_ConfirmacaoDeposito.setVisible(true);
            this.Label_SaldoFinal.setText("Saldo da conta: R$" +contaLocal.getSaldo());
            this.Label_SaldoFinal.setVisible(true);
            this.Input_NumConta.setText("");
            this.Input_ValorDeposito.setText("");
        }catch(Exception e){
            throw new Error(e);
        } finally {
            cadContaObj.setArrayList(listaLocal);
        }
    }
    
    private void DepositoNormal(int posConta, double valorDeposito){
        this.Label_Decisao_1.setText("");
        this.Label_Decisao_1.setVisible(false);
        this.Label_Decisao_2.setText("");
        this.Label_Decisao_2.setVisible(false);
        this.Label_Decisao_3.setText("");
        this.Label_Decisao_3.setVisible(false);
        this.RadioButton_SIM.setVisible(false);
        this.RadioButton_NAO.setVisible(false);
        this.Button_OK.setVisible(false);
        
        ArrayList<Conta> listaLocal = cadContaObj.getArrayList();
        try{
            if (listaLocal.get(posConta).getClass() == ContaEspecial.class){
                ContaEspecial contaLocal = (ContaEspecial)listaLocal.get(posConta);
                contaLocal.Deposito(valorDeposito);
                contaLocal.AtualizaBeneficios();
                listaLocal.set(posConta, contaLocal);
            }else{
                Conta contaLocal = listaLocal.get(posConta);
                contaLocal.Deposito(valorDeposito);
                listaLocal.set(posConta, contaLocal);
            }

            this.Label_ConfirmacaoDeposito.setText("Depósito realizado com sucesso.");
            this.Label_ConfirmacaoDeposito.setVisible(true);
            this.Label_SaldoFinal.setText("Saldo da conta: R$" +listaLocal.get(posConta).getSaldo());
            this.Label_SaldoFinal.setVisible(true);
        }catch (Exception e){
            throw new Error(e);
        } finally{
            cadContaObj.setArrayList(listaLocal);
            this.Input_NumConta.setText("");
            this.Input_ValorDeposito.setText("");
        }
    }
    
    private void Button_RetornarMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RetornarMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_Button_RetornarMenuPrincipalActionPerformed

    private void Button_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_OKActionPerformed
        this.Label_ConfirmacaoDeposito.setText("");
        this.Label_ConfirmacaoDeposito.setVisible(false);
        this.Label_SaldoFinal.setText("");
        this.Label_SaldoFinal.setVisible(false);
        this.Label_NumContaErro.setText("");
        this.Label_NumContaErro.setVisible(false);
        this.Label_DecisaoErro.setText("");
        this.Label_DecisaoErro.setVisible(false);
        
        int numConta;
        int posConta = Integer.parseInt(this.Transferencia_de_dados.getText());
        double valorDeposito;
        ArrayList<Conta> listaLocal;
        
        try{
           if ((!this.Input_NumConta.getText().isEmpty()) && (!this.Input_ValorDeposito.getText().isEmpty())){
               numConta = Integer.parseInt(this.Input_NumConta.getText());
               valorDeposito = Double.parseDouble(this.Input_ValorDeposito.getText());
               listaLocal = cadContaObj.getArrayList();
           }else{
               throw new Error("Falha ao ler os campos em OKActionPerformed");
           }
        }catch (Exception e){
            throw e;
        }
        
        if ((this.RadioButton_SIM.isSelected()) || (this.RadioButton_NAO.isSelected())){
            if (this.RadioButton_SIM.isSelected()){
                this.PagarDivida(posConta, valorDeposito);
            } else if (this.RadioButton_NAO.isSelected()){
                this.DepositoNormal(posConta, valorDeposito);
            } else {
                throw new Error("Erro ao verificar a seleção dos botões em OKActionPerformed");
            }
            this.RadioButton_Confirmacao.clearSelection();
        }else{
            this.Label_DecisaoErro.setText("Escolha uma das opções abaixo!");
            this.Label_DecisaoErro.setVisible(true);
        }
    }//GEN-LAST:event_Button_OKActionPerformed

    /**
     * @param args the command line arguments
     */    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_ConfirmarDeposito;
    private javax.swing.JButton Button_OK;
    private javax.swing.JButton Button_RetornarMenuPrincipal;
    private javax.swing.JTextField Input_NumConta;
    private javax.swing.JTextField Input_ValorDeposito;
    private javax.swing.JLabel Label_ConfirmacaoDeposito;
    private javax.swing.JLabel Label_DecisaoErro;
    private javax.swing.JLabel Label_Decisao_1;
    private javax.swing.JLabel Label_Decisao_2;
    private javax.swing.JLabel Label_Decisao_3;
    private javax.swing.JLabel Label_InformacaoDividas;
    private javax.swing.JLabel Label_NumConta;
    private javax.swing.JLabel Label_NumContaErro;
    private javax.swing.JLabel Label_SaldoFinal;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JLabel Label_ValorDeposito;
    private javax.swing.JLabel Label_ValorDepositoErro;
    private javax.swing.ButtonGroup RadioButton_Confirmacao;
    private javax.swing.JRadioButton RadioButton_NAO;
    private javax.swing.JRadioButton RadioButton_SIM;
    private javax.swing.JLabel Transferencia_de_dados;
    // End of variables declaration//GEN-END:variables
    private CadConta cadContaObj;
}