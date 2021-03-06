package telas;

import atributos.PessoaContato;
import atributos.Telefone;
import funcoes.AuditoriaDAO;
import static funcoes.Conexao.getConnection;
import funcoes.ContatosDAO;
import funcoes.LimitarDigitos;
import funcoes.PessoaContatoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Josy
 */
public final class AlterarContato extends javax.swing.JFrame {

    Statement stmt;
    private int codCliente = 0;
    private int codPessoaContato = 0;
    private int codContato = 0;
    private DetalharCliente telaDetCliente = null;
    private int codFornecedor = 0;
    private DetalharFornecedor telaDetFornecedor = null;

    /**
     * Creates new form AlterarContato
     */
    public AlterarContato() {
        initComponents();
        txtContato.setDocument(new LimitarDigitos(45));
        txtEmail.setDocument(new LimitarDigitos(45));
        txtTel.setDocument(new LimitarDigitos(45));
        txtTelCel.setDocument(new LimitarDigitos(12));
    }

    public AlterarContato(DetalharCliente telaDetCli, int codCliente, int codPessoaCont, int codCont) {
        this.telaDetCliente = telaDetCli;
        this.codContato = codCont;
        this.codCliente = codCliente;
        this.codPessoaContato = codPessoaCont;

        initComponents();
        CarregaContatoCliente();
    }

    public AlterarContato(DetalharFornecedor telaDetForn, int codfornecedor, int codPessoaCont, int codCont) {
        this.telaDetFornecedor = telaDetForn;
        this.codContato = codCont;
        this.codFornecedor = codfornecedor;
        this.codPessoaContato = codPessoaCont;
        initComponents();
        CarregaContatosFornecedor();
        jLabelSetorContato.setVisible(false);
        jComboBoxSetorContato.setVisible(false);
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
        jLabelEmail1 = new javax.swing.JLabel();
        jLabelSetorContato = new javax.swing.JLabel();
        jComboBoxSetorContato = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALTERAR CONTATO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        jLabelContato.setText("Contato:");
        getContentPane().add(jLabelContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        getContentPane().add(txtContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 235, -1));

        jLabelTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telephone.png"))); // NOI18N
        jLabelTelefone.setText("Telefone:");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 120, -1));

        txtTelCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelCelKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 120, -1));

        jLabelCelular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/phone.png"))); // NOI18N
        jLabelCelular.setText("Celular:");
        getContentPane().add(jLabelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, 20));

        jLabelEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/email.png"))); // NOI18N
        jLabelEmail.setText("Email:");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 235, -1));

        jBtnAltContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jBtnAltContato.setText("Salvar");
        jBtnAltContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAltContatoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAltContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jBtbCancelContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtbCancelContato.setText("Cancelar");
        jBtbCancelContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbCancelContatoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtbCancelContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        jLabel1.setText("ALTERAR CONTATO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabelEmail1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelEmail1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 195, 235, 21));

        jLabelSetorContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/setor.png"))); // NOI18N
        jLabelSetorContato.setText("Setor:");
        getContentPane().add(jLabelSetorContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jComboBoxSetorContato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o setor", "Manutenção", "Compras", "Suprimentos", "Projetos", "Engenharia", "Compras/Suprimentos", "Projetos/Engenharia" }));
        getContentPane().add(jComboBoxSetorContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 235, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leiaute/img1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 100));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAltContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAltContatoActionPerformed

        if (VerificaCamposContatoCli() || VerificaCamposContatoForn()) {
            Telefone tel = new Telefone();

            PessoaContato p = new PessoaContato();

            tel.setTel(txtTel.getText());
            tel.setCel(txtTelCel.getText());
            p.setNomeContato(txtContato.getText());
            ContatosDAO.UpdateTel2(codContato, tel);

            ContatosDAO.UpdateEmail2(codContato, txtEmail.getText());

            if (codCliente != 0) {
                p.setSetorContato(jComboBoxSetorContato.getSelectedItem().toString());
                PessoaContatoDAO.UpdatePessoaContato(p, codPessoaContato);

                String descricaoAudit = "O contato: " + p.getNomeContato() + " da empresa de código: " + codCliente
                        + " teve dado(s) alterados(s).";
                AuditoriaDAO.CadDetAuditoria(descricaoAudit);
                telaDetCliente.TabelaContatos();
            }

            if (codFornecedor != 0) {
                PessoaContatoDAO.UpdatePessoaContFornecedor(p, codPessoaContato);
                String descricaoAudit = "O contato: " + p.getNomeContato() + " do fornecedor de código: " + codFornecedor
                        + " teve dado(s) alterados(s).";
                AuditoriaDAO.CadDetAuditoria(descricaoAudit);
                telaDetFornecedor.TabelaContatos();
            }
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
        }
    }//GEN-LAST:event_jBtnAltContatoActionPerformed

    private void jBtbCancelContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbCancelContatoActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair? Os dados não serão salvos.", "Confirmar Cancelamento", JOptionPane.YES_NO_OPTION) == 0) {
            verificaPagina();
            this.dispose();
        }
    }//GEN-LAST:event_jBtbCancelContatoActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        ValidaEmail();
    }//GEN-LAST:event_txtEmailFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        verificaPagina();
    }//GEN-LAST:event_formWindowClosed

    private void txtTelCelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelCelKeyTyped
        // TODO add your handling code here:

        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelCelKeyTyped

    private boolean VerificaCamposContatoCli() {

        boolean valida = true;

        if (txtContato.getText().trim().equals("")) {
            valida = false;
            return valida;
        }

        if (txtTelCel.getText().trim().equals("")) {
            valida = false;
            return valida;
        }

        if (txtTel.getText().trim().length() != 13) {
            valida = false;
            return valida;
        }

        if (ValidaEmail()) {
            valida = false;
            return valida;
        }

        if (jComboBoxSetorContato.getSelectedIndex() == 0) {
            valida = false;
            return valida;
        }

        return valida;
    }

    private boolean VerificaCamposContatoForn() {

        boolean valida = true;

        if (txtContato.getText().trim().equals("")) {
            valida = false;
            return valida;
        }

        if (txtTelCel.getText().trim().equals("")) {
            valida = false;
            return valida;
        }

        if (txtTel.getText().trim().length() != 13) {
            valida = false;
            return valida;
        }

        if (ValidaEmail()) {
            valida = false;
            return valida;
        }
        return valida;
    }

    private void verificaPagina() {

        if ((this.telaDetCliente != null)) {
            this.telaDetCliente.setEnabled(true);
            this.telaDetCliente.toFront();
            this.telaDetCliente.TabelaContatos();

        } else if (this.telaDetFornecedor != null) {
            this.telaDetFornecedor.setEnabled(true);
            this.telaDetFornecedor.toFront();
            this.telaDetFornecedor.TabelaContatos();
        }
    }

    public void CarregaContatoCliente() {

        try {
            String Sql = "SELECT * FROM vw_contatos WHERE id_contato = " + codContato + ";";

            stmt = getConnection().createStatement();

            ResultSet rs;
            rs = stmt.executeQuery(Sql);

            while (rs.next()) {
                txtContato.setText(String.valueOf(rs.getObject("contato")));
                txtTel.setText(String.valueOf(rs.getObject("telefone")));
                txtTelCel.setText(String.valueOf(rs.getObject("celular")));
                txtEmail.setText(String.valueOf(rs.getObject("email")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlterarContato.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception erro) {
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public void CarregaContatosFornecedor() {

        try {
            String Sql = "SELECT * FROM vw_contatofornecedor WHERE id_contato = " + codContato + ";";

            stmt = getConnection().createStatement();

            ResultSet rs;
            rs = stmt.executeQuery(Sql);

            while (rs.next()) {
                txtContato.setText(String.valueOf(rs.getObject("contato")));
                txtTel.setText(String.valueOf(rs.getObject("telefone")));
                txtTelCel.setText(String.valueOf(rs.getObject("celular")));
                txtEmail.setText(String.valueOf(rs.getObject("email")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlterarContato.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception erro) {
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public boolean ValidaEmail() {

        boolean valida = false;

        if ((txtEmail.getText().contains("@"))
                && (txtEmail.getText().contains("."))
                && (!txtEmail.getText().contains(" "))) {

            String usuario = new String(txtEmail.getText().substring(0,
                    txtEmail.getText().lastIndexOf('@')));

            String dominio = new String(txtEmail.getText().substring(txtEmail.getText().lastIndexOf('@') + 1, txtEmail.getText().length()));

            if ((usuario.length() >= 1) && (!usuario.contains("@"))
                    && (dominio.contains(".")) && (!dominio.contains("@")) && (dominio.indexOf(".")
                    >= 1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {

                jLabelEmail.setText("");

            } else {

                jLabelEmail.setText("E-mail Inválido");
                valida = true;
            }

        } else {

            jLabelEmail.setText("E-mail Inválido");
            valida = true;
        }
        return valida;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtbCancelContato;
    private javax.swing.JButton jBtnAltContato;
    private javax.swing.JComboBox jComboBoxSetorContato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelContato;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelSetorContato;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JTextField txtTelCel;
    // End of variables declaration//GEN-END:variables
}
