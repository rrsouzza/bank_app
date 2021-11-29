/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Objetos.CadConta;
import Objetos.Conta;
import Objetos.ContaEspecial;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class Tela_Consultar extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Consultar
     */
    public Tela_Consultar(CadConta cadContaObj) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cadContaObj = cadContaObj;
        this.Label_Erro.setVisible(false);
        this.Label_ExibirNomeCliente.setVisible(false);
        this.Label_ExibirNumConta.setVisible(false);
        this.Label_ExibirSaldoConta.setVisible(false);
        this.Label_ExibirTipoConta.setVisible(false);
        this.Label_ExibirLimiteConta.setVisible(false);
        this.Label_ExibirTaxaConta.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        Label_NumConta = new javax.swing.JLabel();
        Input_NumConta = new javax.swing.JTextField();
        Label_Erro = new javax.swing.JLabel();
        Label_ExibirNomeCliente = new javax.swing.JLabel();
        Label_ExibirNumConta = new javax.swing.JLabel();
        Label_ExibirSaldoConta = new javax.swing.JLabel();
        Label_ExibirTipoConta = new javax.swing.JLabel();
        Label_ExibirLimiteConta = new javax.swing.JLabel();
        Button_Pesquisar = new javax.swing.JButton();
        Button_RetornarMenuPrincipal = new javax.swing.JButton();
        Label_ExibirTaxaConta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Titulo.setBackground(new java.awt.Color(168, 168, 168));
        Label_Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Consulta");
        Label_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_NumConta.setBackground(new java.awt.Color(168, 168, 168));
        Label_NumConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_NumConta.setText("Número da Conta");
        Label_NumConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_Erro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_Erro.setForeground(java.awt.Color.red);

        Button_Pesquisar.setText("Pesquisar");
        Button_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PesquisarActionPerformed(evt);
            }
        });

        Button_RetornarMenuPrincipal.setText("Voltar ao Menu Principal");
        Button_RetornarMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RetornarMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(Label_Titulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_ExibirSaldoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                        .addComponent(Button_RetornarMenuPrincipal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_ExibirNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Label_ExibirNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Label_NumConta)
                                                .addGap(18, 18, 18)
                                                .addComponent(Input_NumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Button_Pesquisar))
                                        .addGap(46, 257, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Erro, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_ExibirTipoConta, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(Label_ExibirLimiteConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label_ExibirTaxaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_NumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_NumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Erro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Label_ExibirNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Label_ExibirNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Label_ExibirSaldoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Label_ExibirTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label_ExibirLimiteConta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label_ExibirTaxaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_RetornarMenuPrincipal)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_Pesquisar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PesquisarActionPerformed
        this.Label_Erro.setText("");
        this.Label_Erro.setVisible(false);
        this.Label_ExibirNumConta.setText("");
        this.Label_ExibirNumConta.setVisible(false);
        this.Label_ExibirNomeCliente.setText("");
        this.Label_ExibirNomeCliente.setVisible(false);
        this.Label_ExibirSaldoConta.setText("");
        this.Label_ExibirSaldoConta.setVisible(false);
        this.Label_ExibirTipoConta.setText("");
        this.Label_ExibirTipoConta.setVisible(false);
        this.Label_ExibirLimiteConta.setText("");
        this.Label_ExibirLimiteConta.setVisible(false);
        this.Label_ExibirTaxaConta.setText("");
        this.Label_ExibirTaxaConta.setVisible(false);
        
        int numConta;
        
        try{
            if (this.Input_NumConta.getText().isEmpty()){
                this.Label_Erro.setText("Insira o número da conta para consulta!");
                this.Label_Erro.setVisible(true);
            } else {            
                numConta = Integer.parseInt(this.Input_NumConta.getText());
                ArrayList<Conta> listaLocal = cadContaObj.getArrayList();

                boolean encontrou = false;
                int i = 0;
                for (i=0; i<listaLocal.size(); i++){
                    if (listaLocal.get(i).getNumeroConta() == numConta){
                        this.Label_Erro.setText("");
                        this.Label_Erro.setVisible(false);

                        String numeroConta = Integer.toString(numConta);
                        String nomeCliente = listaLocal.get(i).getCliente();
                        String saldoConta = Double.toString(listaLocal.get(i).getSaldo());

                        this.Label_ExibirNumConta.setText("Número da Conta: " +numeroConta);
                        this.Label_ExibirNumConta.setVisible(true);
                        this.Label_ExibirNomeCliente.setText("Cliente: " +nomeCliente);
                        this.Label_ExibirNomeCliente.setVisible(true);
                        this.Label_ExibirSaldoConta.setText("Saldo da conta: " +saldoConta);
                        this.Label_ExibirSaldoConta.setVisible(true);
                        encontrou = true;
                        
                        if (listaLocal.get(i).getClass() == ContaEspecial.class){
                            ContaEspecial contaLocal = (ContaEspecial)listaLocal.get(i);
                            this.Label_ExibirTipoConta.setText("Essa é uma conta especial.");
                            this.Label_ExibirTipoConta.setVisible(true);
                            this.Label_ExibirLimiteConta.setText("O limite de empréstimo atual é: R$" +contaLocal.getLimite());
                            this.Label_ExibirLimiteConta.setVisible(true);
                            this.Label_ExibirTaxaConta.setText("A taxa atual de empréstimo é: " +contaLocal.getTaxa()+ "%");
                            this.Label_ExibirTaxaConta.setVisible(true);
                        }else{
                            this.Label_ExibirTipoConta.setText("Essa é uma conta normal.");
                            this.Label_ExibirTipoConta.setVisible(true);
                        }
                        break;
                    }
                }
                if (encontrou == false){
                    this.Label_ExibirNumConta.setText("");
                    this.Label_ExibirNomeCliente.setText("");
                    this.Label_ExibirSaldoConta.setText("");
                    this.Label_ExibirNumConta.setVisible(false);
                    this.Label_ExibirNomeCliente.setVisible(false);
                    this.Label_ExibirSaldoConta.setVisible(false);

                    this.Label_Erro.setText("Número da Conta não encontrado");
                    this.Label_Erro.setVisible(true);
                    this.Input_NumConta.setText("");
                }else if (i == listaLocal.size()){
                    this.Label_Erro.setText("Ocorreu algum erro no Consultar()");
                    this.Label_Erro.setVisible(true);
                }
            }
        }catch(NumberFormatException e){
            this.Label_Erro.setText("Apenas números são válidos");
            this.Input_NumConta.setText("");            
            this.Label_Erro.setVisible(true);
        }
    }//GEN-LAST:event_Button_PesquisarActionPerformed

    private void Button_RetornarMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RetornarMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_Button_RetornarMenuPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */    

    private CadConta cadContaObj;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Pesquisar;
    private javax.swing.JButton Button_RetornarMenuPrincipal;
    private javax.swing.JTextField Input_NumConta;
    private javax.swing.JLabel Label_Erro;
    private javax.swing.JLabel Label_ExibirLimiteConta;
    private javax.swing.JLabel Label_ExibirNomeCliente;
    private javax.swing.JLabel Label_ExibirNumConta;
    private javax.swing.JLabel Label_ExibirSaldoConta;
    private javax.swing.JLabel Label_ExibirTaxaConta;
    private javax.swing.JLabel Label_ExibirTipoConta;
    private javax.swing.JLabel Label_NumConta;
    private javax.swing.JLabel Label_Titulo;
    // End of variables declaration//GEN-END:variables
}
