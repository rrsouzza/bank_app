/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;
import Objetos.CadConta;
import Objetos.Conta;
import java.io.IOException;
/**
 *
 * @author Ricardo
 */
public class Tela_Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Cadastro
     */
    public Tela_Cadastro(CadConta cadContaObj) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cadContaObj = cadContaObj;
        this.Label_NumContaErro.setVisible(false);
        this.Label_NomeClienteErro.setVisible(false);
        this.Label_CadastroSucesso.setVisible(false);
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
        Label_NumContaErro = new javax.swing.JLabel();
        Label_NomeCliente = new javax.swing.JLabel();
        Input_NomeCliente = new javax.swing.JTextField();
        Label_NomeClienteErro = new javax.swing.JLabel();
        Button_Salvar = new javax.swing.JButton();
        Button_RetornarMenuPrincipal = new javax.swing.JButton();
        Label_CadastroSucesso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Titulo.setBackground(new java.awt.Color(168, 168, 168));
        Label_Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Cadastro  de  Conta");
        Label_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_NumConta.setBackground(new java.awt.Color(168, 168, 168));
        Label_NumConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_NumConta.setText("Número da Conta");
        Label_NumConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label_NumContaErro.setForeground(java.awt.Color.red);

        Label_NomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_NomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_NomeCliente.setText("Nome do Cliente");

        Label_NomeClienteErro.setForeground(java.awt.Color.red);

        Button_Salvar.setText("Salvar");
        Button_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SalvarActionPerformed(evt);
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
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_CadastroSucesso, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_RetornarMenuPrincipal))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label_NumConta)
                                    .addGap(18, 18, 18)
                                    .addComponent(Input_NumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Label_NumContaErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Button_Salvar)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Label_NomeCliente)
                                            .addGap(27, 27, 27)
                                            .addComponent(Input_NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Label_NomeClienteErro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 10, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(Label_Titulo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label_NumConta)
                    .addComponent(Input_NumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_NumContaErro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_NomeCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Input_NomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_NomeClienteErro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Button_Salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button_RetornarMenuPrincipal)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Label_CadastroSucesso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SalvarActionPerformed
        this.Label_NumContaErro.setText("");
        this.Label_NumContaErro.setVisible(false);
        this.Label_NomeClienteErro.setText("");
        this.Label_NomeClienteErro.setVisible(false);
        this.Label_CadastroSucesso.setText("");
        this.Label_CadastroSucesso.setVisible(false);
        
        int numConta;
        
        try{
            if (this.Input_NumConta.getText().isEmpty()){
                this.Label_NumContaErro.setText("Insira o número da conta!");
                this.Label_NumContaErro.setVisible(true);
            }
            if (this.Input_NomeCliente.getText().isEmpty()){
                this.Label_NomeClienteErro.setText("Insira o nome do cliente!");
                this.Label_NomeClienteErro.setVisible(true);
            }
            if ((!this.Input_NumConta.getText().isEmpty()) && (!this.Input_NomeCliente.getText().isEmpty())){
                numConta = Integer.parseInt(this.Input_NumConta.getText());
                String nomeCliente = this.Input_NomeCliente.getText();

                boolean cadastro;            
                cadastro = cadContaObj.Cadastrar(new Conta(numConta, nomeCliente));
                if (cadastro == false){
                    this.Label_NumContaErro.setText("Esta conta já existe!");
                    this.Label_NumContaErro.setVisible(true);
                    this.Input_NumConta.setText("");
                }else if (cadastro == true){
                    this.Label_CadastroSucesso.setText("Conta registrada com sucesso!");
                    this.Label_CadastroSucesso.setVisible(true);
                    this.Input_NomeCliente.setText("");
                    this.Input_NumConta.setText("");
                }else{
                    this.Label_CadastroSucesso.setText("Ocorreu um erro na execução do programa.");
                    this.Label_CadastroSucesso.setVisible(true);
                }
            }
        }catch (NumberFormatException e){
            this.Label_NumContaErro.setText("Número da conta deve ter apenas números");
            this.Label_NumContaErro.setVisible(true);
            this.Input_NumConta.setText("");
        }catch (Error e){
            throw new Error(e);
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
    private javax.swing.JTextField Input_NomeCliente;
    private javax.swing.JTextField Input_NumConta;
    private javax.swing.JLabel Label_CadastroSucesso;
    private javax.swing.JLabel Label_NomeCliente;
    private javax.swing.JLabel Label_NomeClienteErro;
    private javax.swing.JLabel Label_NumConta;
    private javax.swing.JLabel Label_NumContaErro;
    private javax.swing.JLabel Label_Titulo;
    // End of variables declaration//GEN-END:variables
    private CadConta cadContaObj;
    private Conta contaObj;
}