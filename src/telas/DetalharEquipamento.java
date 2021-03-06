package telas;

import atributos.Equipamento;
import funcoes.Conexao;
import funcoes.EquipamentoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public final class DetalharEquipamento extends javax.swing.JFrame {

    Equipamento equi = new Equipamento();
    private PreparedStatement pst;    
    private int codFornecedor;
    private int codFabricante;
    private int codModelo;    
    Statement stmt ;
    private int codDetEquipamento;
    private int codEquipamento;
    private ExibeEquipamento telaExibeEquipamento;
    
    /**
     * Creates new form AlterarEquipamento
     */
    public DetalharEquipamento() {
    
        initComponents();
    }
    
    public DetalharEquipamento(int codDetProduto, ExibeEquipamento telaExibeEqui) {
        this.telaExibeEquipamento = telaExibeEqui;
        initComponents();
        this.codDetEquipamento = codDetProduto;
        populaComboBoxFornecedor();
        populaComboBoxFabricante();
        populaComboBoxModelo();
        CarregarDadosEquipamanto();
        ocultaCampos();
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
        jBtnCancelarAltEquipamento = new javax.swing.JButton();
        jBtnAlterarEquipamento = new javax.swing.JButton();
        jBtbEditarEquipamento = new javax.swing.JButton();
        txtFabricante = new javax.swing.JTextField();
        jComboBoxFabricante = new javax.swing.JComboBox();
        txtModelo = new javax.swing.JTextField();
        jComboBoxModelo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jComboBoxFornecedor = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtEquipamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBtnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnCancelarAltEquipamento.setText("Cancelar");
        jBtnCancelarAltEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarAltEquipamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelarAltEquipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jBtnAlterarEquipamento.setText("Salvar");
        jBtnAlterarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarEquipamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAlterarEquipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jBtbEditarEquipamento.setText("Editar Equipamento");
        jBtbEditarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbEditarEquipamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtbEditarEquipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, 23));

        txtFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFabricanteActionPerformed(evt);
            }
        });
        jPanel1.add(txtFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 220, -1));

        jComboBoxFabricante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o fabricante" }));
        jComboBoxFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFabricanteActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 240, -1));
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 220, -1));

        jComboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o modelo" }));
        jComboBoxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModeloActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 240, -1));

        jLabel10.setText("Modelo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel9.setText("Fabricante:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFornecedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 220, -1));

        jComboBoxFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o fornecedor" }));
        jComboBoxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 240, -1));

        jLabel8.setText("Fornecedor:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtEquipamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEquipamentoKeyTyped(evt);
            }
        });
        jPanel1.add(txtEquipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 240, -1));

        jLabel2.setText("Equipamento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Raavi", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/equipamento.png"))); // NOI18N
        jLabel1.setText("Equipamento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 23));

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/stop2.png"))); // NOI18N
        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leiaute/img1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtbEditarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbEditarEquipamentoActionPerformed

        jBtnAlterarEquipamento.setVisible(true);
        jBtnCancelarAltEquipamento.setVisible(true);
        jBtbEditarEquipamento.setVisible(false);
        txtEquipamento.setEnabled(true);
        
        jComboBoxFabricante.setVisible(true);
        jComboBoxFabricante.setSelectedItem(txtFabricante.getText());
        jComboBoxFornecedor.setVisible(true);
        jComboBoxFornecedor.setSelectedItem(txtFornecedor.getText());
        jComboBoxModelo.setVisible(true);
        jComboBoxModelo.setSelectedItem(txtModelo.getText());
        txtFornecedor.setVisible(false);
        txtFabricante.setVisible(false);
        txtFabricante.setVisible(false);
        txtModelo.setVisible(false);
    }//GEN-LAST:event_jBtbEditarEquipamentoActionPerformed

    private void jBtnCancelarAltEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarAltEquipamentoActionPerformed

        jComboBoxFabricante.setVisible(false);
        jComboBoxFornecedor.setVisible(false);
        jComboBoxModelo.setVisible(false);
        txtEquipamento.setEnabled(false);
        txtFornecedor.setVisible(true);
        txtFabricante.setVisible(true);
        txtFabricante.setVisible(true);
        txtModelo.setVisible(true);
        
        jBtnAlterarEquipamento.setVisible(false);
        jBtnCancelarAltEquipamento.setVisible(false);
        jBtbEditarEquipamento.setVisible(true);
    }//GEN-LAST:event_jBtnCancelarAltEquipamentoActionPerformed

    private void jBtnAlterarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarEquipamentoActionPerformed

        equi.setIdDetEquipamento(codDetEquipamento);
        equi.setIdEquipamento(codEquipamento);
        equi.setEquipamento(txtEquipamento.getText());
        equi.setCodModelo(codModelo);
        equi.setCodFabricante(codFabricante);
        equi.setCodFornecedor(codFornecedor);
        
        EquipamentoDAO.UpdateEquipamento(equi);
        CarregarDadosEquipamanto();
        jBtnAlterarEquipamento.setVisible(false);
        jBtnCancelarAltEquipamento.setVisible(false);
        jBtbEditarEquipamento.setVisible(false);
        txtEquipamento.setEnabled(false);
        
        jBtbEditarEquipamento.setVisible(true);
        
        jComboBoxFabricante.setVisible(false);
        jComboBoxFornecedor.setVisible(false);
        jComboBoxModelo.setVisible(false);
        txtEquipamento.setEnabled(false);
        txtFornecedor.setVisible(true);
        txtFabricante.setVisible(true);
        txtFabricante.setVisible(true);
        txtModelo.setVisible(true);
        this.telaExibeEquipamento.TabelaEquipamento("SELECT * FROM vw_equipamentos; ");
    }//GEN-LAST:event_jBtnAlterarEquipamentoActionPerformed

    private void jComboBoxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFornecedorActionPerformed
        idFornecedorComboBox();
    }//GEN-LAST:event_jComboBoxFornecedorActionPerformed

    private void jComboBoxFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFabricanteActionPerformed
        idFabricanteComboBox();
    }//GEN-LAST:event_jComboBoxFabricanteActionPerformed

    private void jComboBoxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModeloActionPerformed
        idModeloComboBox();
    }//GEN-LAST:event_jComboBoxModeloActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void txtFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFabricanteActionPerformed

    private void txtEquipamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipamentoKeyTyped
        // TODO add your handling code here:
        String carac = "ç,.!?@:;/^~´`#$%¨&*()-_='+{[]}";
        if (carac.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEquipamentoKeyTyped

    private void txtFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFornecedorKeyTyped
        // TODO add your handling code here:
        String carac = "ç,.!?@:;/^~´`#$%¨&*()-_='+{[]}";
        if (carac.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFornecedorKeyTyped

    private void limparCampos() {
        
        jComboBoxFabricante.setSelectedIndex(0);
        jComboBoxFornecedor.setSelectedIndex(0);
        jComboBoxModelo.setSelectedIndex(0);
    }
    
    private void ocultaCampos() {
        jComboBoxFabricante.setVisible(false);
        jComboBoxFornecedor.setVisible(false);
        jComboBoxModelo.setVisible(false);
        txtEquipamento.setEnabled(false);
        txtFabricante.setEnabled(false);
        txtFornecedor.setEnabled(false);
        txtModelo.setEnabled(false);
        jBtnAlterarEquipamento.setVisible(false);
        jBtnCancelarAltEquipamento.setVisible(false);
    }
    
    private void populaComboBoxFornecedor() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabfornecedor";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                jComboBoxFornecedor.addItem(rs.getString("fornecedor"));
            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void idFornecedorComboBox() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabfornecedor where fornecedor = '" + jComboBoxFornecedor.getSelectedItem()+ "';";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                codFornecedor = (rs.getInt("id_forn"));
            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   
    private void populaComboBoxFabricante() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabfabricante";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                jComboBoxFabricante.addItem(rs.getString("fabricante"));
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void idFabricanteComboBox() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabfabricante where fabricante = '" + jComboBoxFabricante.getSelectedItem()+ "';";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                codFabricante = (rs.getInt("idtabFabricante"));
            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void populaComboBoxModelo() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabmodelo";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                jComboBoxModelo.addItem(rs.getString("modelo"));
            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void idModeloComboBox() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabmodelo where modelo = '" + jComboBoxModelo.getSelectedItem()+ "';";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                codModelo = (rs.getInt("idtabModelo"));
            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void CarregarDadosEquipamanto() {           
        
        try {            
            String Sql = "SELECT * FROM vw_equipamentos WHERE idDetEquipamento = " + codDetEquipamento + ";";
            
            ResultSet rs;            
            stmt = Conexao.getConnection().createStatement();            
            rs = stmt.executeQuery(Sql); 
            
            while(rs.next()){
                
                txtEquipamento.setText(rs.getString("equipamento"));
                txtFornecedor.setText(rs.getString("fornecedor"));
                txtModelo.setText(rs.getString("modelo"));
                txtFabricante.setText(rs.getString("fabricante"));  
                codEquipamento = rs.getInt("tabequipamento_idEquipamento");
            }            
            rs.close();
            stmt.close();
            
        } catch (SQLException ex) {      
            Logger.getLogger(ExibeProdutosDetalhe.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao carregar os dados do Produto: ", ex);    
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtbEditarEquipamento;
    private javax.swing.JButton jBtnAlterarEquipamento;
    private javax.swing.JButton jBtnCancelarAltEquipamento;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JComboBox jComboBoxFabricante;
    private javax.swing.JComboBox jComboBoxFornecedor;
    private javax.swing.JComboBox jComboBoxModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEquipamento;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
