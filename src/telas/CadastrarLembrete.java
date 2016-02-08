package telas;

import atributos.Cliente;
import atributos.Lembrete;
import atributos.Usuario;
import funcoes.ClienteDAO;
import funcoes.Conexao;
import funcoes.FuncoesDiversas;
import static funcoes.FuncoesDiversas.FormataData;
import funcoes.LembreteDAO;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author S015365
 */
public class CadastrarLembrete extends javax.swing.JFrame {

    private PreparedStatement pst;
    private int codCliCombo;
    private int codCli;
    private DetalharCliente detalharCliente;
    private ExibeCliente telaExibeCliente;

    /**
     * Creates new form CadastrarLembrete
     */
    public CadastrarLembrete() {
        initComponents();
        jLabCodigo.setVisible(false);
        jLabEmpresa.setVisible(false);
        jLabNCodigo.setVisible(false);
        carregarComboClientes();
        combobox();
    }

    public CadastrarLembrete(int codCliente, ExibeCliente exibeCli) {
        this.codCli = codCliente;
        this.telaExibeCliente = exibeCli;
        initComponents();        
        uJComboBoxClientes.setVisible(false);
        DadosEmpresa();
    }

    public CadastrarLembrete(int codCliente, DetalharCliente detalharCliente) {
        initComponents();
        this.detalharCliente = detalharCliente;
        this.codCli = codCliente;
        uJComboBoxClientes.setVisible(false);
        DadosEmpresa();
    }

    private void DadosEmpresa() {

        ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        cliente = ClienteDAO.CarregaNomeCliente(codCli);

        for (Cliente cli : cliente) {

            jLabCodigo.setText(String.valueOf(cli.getId()));
            jLabEmpresa.setText(cli.getEmpresa());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabNCodigo = new javax.swing.JLabel();
        jLabCodigo = new javax.swing.JLabel();
        jLabNomeEmpresa = new javax.swing.JLabel();
        jLabEmpresa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDataLembrete = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoLembrete = new javax.swing.JTextArea();
        jBtnSalvarLembrete = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        txtHoraLembrete = new javax.swing.JFormattedTextField();
        uJComboBoxClientes = new componentes.UJComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LEMBRETE");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(223, 237, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Raavi", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lembrete.png"))); // NOI18N
        jLabel1.setText("Lembrete");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabNCodigo.setText("Código:");
        jPanel1.add(jLabNCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabCodigo.setText("codigo");
        jPanel1.add(jLabCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabNomeEmpresa.setText("Empresa:");
        jPanel1.add(jLabNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jLabEmpresa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabEmpresa.setText("Empresa");
        jPanel1.add(jLabEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 200, 20));

        jLabel2.setText("Data:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel1.add(txtDataLembrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 130, -1));

        jLabel3.setText("Hora:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel4.setText("Descrição:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtDescricaoLembrete.setColumns(20);
        txtDescricaoLembrete.setLineWrap(true);
        txtDescricaoLembrete.setRows(1);
        jScrollPane1.setViewportView(txtDescricaoLembrete);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 360, 120));

        jBtnSalvarLembrete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/disk.png"))); // NOI18N
        jBtnSalvarLembrete.setText("Salvar");
        jBtnSalvarLembrete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarLembreteActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSalvarLembrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/stop2.png"))); // NOI18N
        jBtnSair.setText("Cancelar");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        try {
            txtHoraLembrete.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtHoraLembrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 40, -1));

        uJComboBoxClientes.setEditable(true);
        uJComboBoxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uJComboBoxClientesActionPerformed(evt);
            }
        });
        jPanel1.add(uJComboBoxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 290, -1));

        jLabel5.setBackground(new java.awt.Color(223, 237, 253));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leiaute/img2.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalvarLembreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarLembreteActionPerformed
        if (VerificaCampos() == true) {
            if (codCliCombo != 0) {
                codCli = codCliCombo;
            }

            try {
                Lembrete lembrete = new Lembrete();
                lembrete.setCodUsuario(Usuario.idUsuario());
                lembrete.setDataLembrete(FormataData(txtDataLembrete.getDate()));
                lembrete.setHora(FuncoesDiversas.ConverterHora(txtHoraLembrete.getText()));
                lembrete.setDescricao(txtDescricaoLembrete.getText());
                lembrete.setCodCliente(codCli);
                LembreteDAO.CadLembrete(lembrete);
                this.dispose();
                verificaPagina();
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Campo data Inválido!");
            }
        }
    }//GEN-LAST:event_jBtnSalvarLembreteActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair? Os dados não serão salvos.", "Confirmar Cancelamento", JOptionPane.YES_NO_OPTION) == 0) {
            verificaPagina();
            this.dispose();
        }       
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        verificaPagina();
    }//GEN-LAST:event_formWindowClosed

    private void uJComboBoxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uJComboBoxClientesActionPerformed
        codCliCombo = 0;
        idClienteComboBox();
    }//GEN-LAST:event_uJComboBoxClientesActionPerformed

    private void verificaPagina() {

        if ((this.detalharCliente != null)) {
            this.detalharCliente.setEnabled(true);
            this.detalharCliente.toFront();
            this.detalharCliente.TabelaLembrete2(codCli);
        }else if ((this.telaExibeCliente != null)) {
            this.telaExibeCliente.setEnabled(true);
            this.telaExibeCliente.toFront();
        }
    }

    private boolean VerificaCampos() {

        boolean valida = true;

        if (txtDataLembrete.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }

        if (txtHoraLembrete.getText().trim().equals(":")) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }

        if (uJComboBoxClientes.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }

        if (txtDescricaoLembrete.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }

        return valida;
    }

//    private void limparCampos(){
//        txtDataLembrete = null;
//        txtDescricaoLembrete.setText("");
//        txtHoraLembrete.setText("");
//        jComboBoxEmpresas.setSelectedIndex(0);
//    }
    private void carregarComboClientes() {

        uJComboBoxClientes.clear();

        ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        cliente = ClienteDAO.ComboCliente();

        uJComboBoxClientes.addItem("Selecione o cliente");
        for (Cliente cli : cliente) {
            uJComboBoxClientes.addItem(cli.getEmpresa(), cli);
        }
    }

    private void idClienteComboBox() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabcliente where empresa = '" + uJComboBoxClientes.getSelectedItem() + "';";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                codCliCombo = (rs.getInt("idcliente"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void combobox() {

        //Combobox clientes
        uJComboBoxClientes.getEditor().getEditorComponent().addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (codCliCombo == 0 && uJComboBoxClientes.getSelectedIndex() != 0) {
                    JOptionPane.showMessageDialog(null, "Esse registro não encontra-se cadastrado na base de dados.");
                    uJComboBoxClientes.getEditor().getEditorComponent().requestFocus();
                }
            }
        });
        uJComboBoxClientes.setAutocompletar(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnSalvarLembrete;
    private javax.swing.JLabel jLabCodigo;
    private javax.swing.JLabel jLabEmpresa;
    private javax.swing.JLabel jLabNCodigo;
    private javax.swing.JLabel jLabNomeEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser txtDataLembrete;
    private javax.swing.JTextArea txtDescricaoLembrete;
    private javax.swing.JFormattedTextField txtHoraLembrete;
    private componentes.UJComboBox uJComboBoxClientes;
    // End of variables declaration//GEN-END:variables
}
