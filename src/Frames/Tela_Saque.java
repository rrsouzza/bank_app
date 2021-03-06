/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;
import Objetos.CadConta;
import Objetos.Conta;
import Objetos.ContaEspecial;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
/**
 *
 * @author Ricardo
 */
public class Tela_Saque extends javax.swing.JFrame {
    public Tela_Saque(CadConta cadContaObj) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cadContaObj = cadContaObj;
        this.Label_NumContaErro.setVisible(false);
        this.Label_ValorSaqueErro.setVisible(false);
        this.Label_SaldoRestante.setVisible(false);
        this.Label_SaqueRealizado.setVisible(false);
        this.Label_DividaPendente.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        Label_NumConta = new javax.swing.JLabel();
        Input_NumConta = new javax.swing.JTextField();
        Label_NumContaErro = new javax.swing.JLabel();
        Label_ValorSaque = new javax.swing.JLabel();
        Input_ValorSaque = new javax.swing.JTextField();
        Label_ValorSaqueErro = new javax.swing.JLabel();
        Button_Salvar = new javax.swing.JButton();
        Label_SaldoRestante = new javax.swing.JLabel();
        Button_RetornarMenuPrincipal = new javax.swing.JButton();
        Label_SaqueRealizado = new javax.swing.JLabel();
        Label_DividaPendente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Titulo.setBackground(new java.awt.Color(168, 168, 168));
        Label_Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Saque");
        Label_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_NumConta.setBackground(new java.awt.Color(168, 168, 168));
        Label_NumConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_NumConta.setText("N??mero da Conta");
        Label_NumConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_NumContaErro.setForeground(java.awt.Color.red);

        Label_ValorSaque.setBackground(new java.awt.Color(168, 168, 168));
        Label_ValorSaque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_ValorSaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_ValorSaque.setText("Valor do Saque");
        Label_ValorSaque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_ValorSaqueErro.setForeground(java.awt.Color.red);

        Button_Salvar.setText("Salvar");
        Button_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SalvarActionPerformed(evt);
            }
        });

        Button_RetornarMenuPrincipal.setText("Retornar ao menu principal");
        Button_RetornarMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RetornarMenuPrincipalActionPerformed(evt);
            }
        });

        Label_DividaPendente.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_SaldoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(Label_DividaPendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_Salvar)
                        .addGap(33, 33, 33)
                        .addComponent(Label_SaqueRealizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_Titulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_NumConta)
                                .addGap(18, 18, 18)
                                .addComponent(Input_NumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_NumContaErro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_ValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Input_ValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_ValorSaqueErro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addComponent(Button_RetornarMenuPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_NumContaErro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Label_NumConta)
                                .addComponent(Input_NumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Input_ValorSaque)
                            .addComponent(Label_ValorSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Label_ValorSaqueErro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Salvar)
                    .addComponent(Label_SaqueRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_SaldoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_DividaPendente, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_RetornarMenuPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void pausa(){
//        Timer t = new Timer(5000, new ActionListener(){            
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//            }
//        });
//        
//        t.setRepeats(false);
//        t.start();
//    }
    
    private void Button_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SalvarActionPerformed
        this.Label_NumContaErro.setVisible(false);
        this.Label_NumContaErro.setText("");
        this.Label_ValorSaqueErro.setVisible(false);
        this.Label_ValorSaqueErro.setText("");
        this.Label_SaldoRestante.setVisible(false);
        this.Label_SaldoRestante.setText("");
        this.Label_SaqueRealizado.setVisible(false);
        this.Label_SaqueRealizado.setForeground(Color.black);
        this.Label_SaqueRealizado.setText("");
        this.Label_DividaPendente.setVisible(false);        
        this.Label_DividaPendente.setText("");
        
        int numConta;
        double valorSaque;
        
        try{
            if (this.Input_NumConta.getText().isEmpty()){
                this.Label_NumContaErro.setText("Insira o n??mero da conta!");
                this.Label_NumContaErro.setVisible(true);
            }
            if (this.Input_ValorSaque.getText().isEmpty()){
                this.Label_ValorSaqueErro.setText("Insira o valor do saque!");
                this.Label_ValorSaqueErro.setVisible(true);
            }
            if (!this.Input_ValorSaque.getText().isEmpty()){
                if (Double.parseDouble(this.Input_ValorSaque.getText()) < 0){
                    this.Label_ValorSaqueErro.setText("Apenas valores positivos s??o aceitos!");
                    this.Label_ValorSaqueErro.setVisible(true);
                }
            }
            if ((!this.Input_NumConta.getText().isEmpty()) && (!this.Input_ValorSaque.getText().isEmpty())){
                numConta = Integer.parseInt(this.Input_NumConta.getText());
                valorSaque = Double.parseDouble(this.Input_ValorSaque.getText());
                ArrayList<Conta> listaLocal = cadContaObj.getArrayList();

                boolean verificacao = false;
                int posNumConta = 0;
                for (int i=0; i<listaLocal.size(); i++){
                    if (listaLocal.get(i).getNumeroConta() == numConta){
                        verificacao = true;
                        posNumConta = i;
                        break;
                    }
                }

                if (verificacao == true){
                    if (listaLocal.get(posNumConta).Saque(valorSaque) == 1){
                        if (listaLocal.get(posNumConta).getClass() == ContaEspecial.class){
                            ContaEspecial contaLocal = (ContaEspecial)listaLocal.get(posNumConta);
                            contaLocal.AtualizaBeneficios();
                            listaLocal.set(posNumConta, contaLocal);
                            
                            if (contaLocal.getDivida() > 0){
                                this.Label_DividaPendente.setText("Voc?? est?? devendo R$" +contaLocal.getDivida());
                                this.Label_DividaPendente.setVisible(true);
                            }
                        }
                        this.Label_SaqueRealizado.setText("Saque realizado com sucesso! Retire seu dinheiro abaixo.");
                        this.Label_SaqueRealizado.setVisible(true);
                        this.Label_SaldoRestante.setText("Seu saldo agora ?? de R$" +listaLocal.get(posNumConta).getSaldo());
                        this.Label_SaldoRestante.setVisible(true);
                        this.Input_NumConta.setText("");
                        this.Input_ValorSaque.setText("");
                        cadContaObj.setArrayList(listaLocal);
                    }else if (listaLocal.get(posNumConta).Saque(valorSaque) == 2) {
                        this.Label_SaqueRealizado.setText("Ocorreu um erro na execu????o do Saque()");
                        this.Label_SaqueRealizado.setVisible(true);
                        this.Input_NumConta.setText("");
                        this.Input_ValorSaque.setText("");
                    }else if (listaLocal.get(posNumConta).Saque(valorSaque) == 0){
                        this.Label_ValorSaqueErro.setText("Voc?? n??o possui saldo suficiente.");
                        this.Label_ValorSaqueErro.setVisible(true);
                        this.Label_SaldoRestante.setText("Seu saldo ?? de R$" +listaLocal.get(posNumConta).getSaldo());
                        this.Label_SaldoRestante.setVisible(true);
                        this.Input_ValorSaque.setText("");
                    }
                }else{
                    this.Label_NumContaErro.setText("N??mero da Conta n??o encontrado.");
                    this.Label_NumContaErro.setVisible(true);
                    this.Input_NumConta.setText("");
                }
            }
        }catch(NumberFormatException e){
            this.Label_SaqueRealizado.setText("Apenas n??meros s??o v??lidos");
            this.Label_SaqueRealizado.setForeground(Color.red);
            this.Label_SaqueRealizado.setVisible(true);
            this.Input_NumConta.setText("");
            this.Input_ValorSaque.setText("");
        }
    }//GEN-LAST:event_Button_SalvarActionPerformed

    private void Button_RetornarMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RetornarMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_Button_RetornarMenuPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_RetornarMenuPrincipal;
    private javax.swing.JButton Button_Salvar;
    private javax.swing.JTextField Input_NumConta;
    private javax.swing.JTextField Input_ValorSaque;
    private javax.swing.JLabel Label_DividaPendente;
    private javax.swing.JLabel Label_NumConta;
    private javax.swing.JLabel Label_NumContaErro;
    private javax.swing.JLabel Label_SaldoRestante;
    private javax.swing.JLabel Label_SaqueRealizado;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JLabel Label_ValorSaque;
    private javax.swing.JLabel Label_ValorSaqueErro;
    // End of variables declaration//GEN-END:variables
    private CadConta cadContaObj;
}
