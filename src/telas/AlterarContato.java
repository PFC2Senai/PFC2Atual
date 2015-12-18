package telas;

import atributos.PessoaContato;
import atributos.Telefone;
import static funcoes.Conexao.getConnection;
import funcoes.ContatosDAO;
import funcoes.PessoaContatoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josy
 */
public final class AlterarContato extends javax.swing.JFrame {

    Statement stmt ;
    private final int codCliente;
    private final int codPessoaContato;
    private final int codContato;
    private final DetalharCliente telaDetCliente;
    
    /**
     * Creates new form AlterarContato
     * @param telaDetCli
     * @param codCliente
     * @param codCont
     * @param codPessoaCont
     */
    public AlterarContato(DetalharCliente telaDetCli, int codCliente, int codPessoaCont, int codCont) {
        this.telaDetCliente = telaDetCli;
        this.codContato = codCont;
        this.codCliente = codCliente;
        this.codPessoaContato = codPessoaCont;

        initComponents();
        CarregaContatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelContato = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        txtTel = new javax.swing.JFormattedTextField();
        txtTelCel = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jBtnAltContato = new javax.swing.JButton();
        jBtbCancelContato = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelContato.setText("Contato:");

        jLabelTelefone.setText("Telefone:");

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCelular.setText("Celular:");

        jLabelEmail.setText("Email:");

        jBtnAltContato.setText("Salvar");
        jBtnAltContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAltContatoActionPerformed(evt);
            }
        });

        jBtbCancelContato.setText("Cancelar");
        jBtbCancelContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbCancelContatoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Alterar Contato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelContato)
                        .addGap(18, 18, 18)
                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTelefone)
                        .addGap(14, 14, 14)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCelular)
                        .addGap(23, 23, 23)
                        .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addGap(32, 32, 32)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jBtnAltContato, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBtbCancelContato)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelContato))
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefone)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelCelular))
                    .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAltContato)
                    .addComponent(jBtbCancelContato))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAltContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAltContatoActionPerformed
        Telefone tel = new Telefone();

        PessoaContato p = new PessoaContato();

        tel.setTel(txtTel.getText());
        tel.setCel(txtTelCel.getText());
        p.setNomeContato(txtContato.getText());
        ContatosDAO.UpdateTel2(codContato, tel);
        PessoaContatoDAO.UpdatePessoaContato(p, codPessoaContato);
        ContatosDAO.UpdateEmail2(codContato, txtEmail.getText());
        
        telaDetCliente.TabelaContatos("SELECT * FROM vw_contatos WHERE idcliente = " + codCliente + ";");
        this.dispose();
    }//GEN-LAST:event_jBtnAltContatoActionPerformed

    private void jBtbCancelContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbCancelContatoActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtbCancelContatoActionPerformed

    public void CarregaContatos() {
        
        try { 
            String Sql = "SELECT * FROM vw_contatos WHERE id_contato = " + codContato + ";";
            
            stmt = getConnection().createStatement();  
               
            ResultSet rs;
            rs = stmt.executeQuery(Sql);            
            
                while(rs.next()){
                    txtContato.setText(String.valueOf(rs.getObject("contato")));
                    txtTel.setText(String.valueOf(rs.getObject("telefone")));
                    txtTelCel.setText(String.valueOf(rs.getObject("celular")));
                    txtEmail.setText(String.valueOf(rs.getObject("email")));                                                      
                }
                    
        } catch (SQLException ex) {
            Logger.getLogger(AlterarContato.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (Exception erro){
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, erro);
        }          
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtbCancelContato;
    private javax.swing.JButton jBtnAltContato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelContato;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JTextField txtTelCel;
    // End of variables declaration//GEN-END:variables
}
