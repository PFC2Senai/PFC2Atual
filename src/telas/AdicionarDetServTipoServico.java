package telas;

import atributos.DetServicoTipoServ;
import atributos.TipoServico;
import funcoes.Conexao;
import funcoes.DetServicoTipoDAO;
import funcoes.TipoServicoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josy
 */
public class AdicionarDetServTipoServico extends javax.swing.JFrame {

    private PreparedStatement pst;
    
    private int idServico;
    private DetalharServico telaDatalharServico;
    
    private int codTipoServico;
    private String tipoServico;
    
    /**
     * Creates new form AdicionarDetServTipoServico
     * @param idServ
     * @param telaDetalharServ
     */
    public AdicionarDetServTipoServico(int idServ, DetalharServico telaDetalharServ) {
        this.idServico = idServ;
        this.telaDatalharServico = telaDetalharServ;
        initComponents();
        populaComboBoxTipoServico();
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
        jBtnAdicionarTipo = new javax.swing.JButton();
        jBtbNovoTipoServico = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableTipodeServico = new javax.swing.JTable();
        jBtnRemoverTipo = new javax.swing.JButton();
        jBtnCadTipoServico = new javax.swing.JButton();
        jComboBoxTipoServico = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jBtnCancelarCadTipoServico = new javax.swing.JButton();
        txtTipoServico = new javax.swing.JTextField();
        jBtnSalvarDetServTipoServico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnAdicionarTipo.setText("Adicionar Tipo");
        jBtnAdicionarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarTipoActionPerformed(evt);
            }
        });

        jBtbNovoTipoServico.setText("Novo");
        jBtbNovoTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbNovoTipoServicoActionPerformed(evt);
            }
        });

        jTableTipodeServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo Serviço"
            }
        ));
        jTableTipodeServico.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTableTipodeServico);

        jBtnRemoverTipo.setText("Remover Tipo");
        jBtnRemoverTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverTipoActionPerformed(evt);
            }
        });

        jBtnCadTipoServico.setText("Salvar");
        jBtnCadTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadTipoServicoActionPerformed(evt);
            }
        });

        jComboBoxTipoServico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Tipo de Serviço" }));
        jComboBoxTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoServicoActionPerformed(evt);
            }
        });

        jLabel10.setText("Tipo:");

        jBtnCancelarCadTipoServico.setText("Cancelar");
        jBtnCancelarCadTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarCadTipoServicoActionPerformed(evt);
            }
        });

        jBtnSalvarDetServTipoServico.setText("Salvar");
        jBtnSalvarDetServTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarDetServTipoServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtbNovoTipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCadTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelarCadTipoServico))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnSalvarDetServTipoServico)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBtnAdicionarTipo)
                                .addComponent(jBtnRemoverTipo)))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnCadTipoServico)
                        .addComponent(jBtnCancelarCadTipoServico)
                        .addComponent(jBtbNovoTipoServico)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBtnAdicionarTipo)
                        .addGap(17, 17, 17)
                        .addComponent(jBtnRemoverTipo)))
                .addGap(18, 21, Short.MAX_VALUE)
                .addComponent(jBtnSalvarDetServTipoServico)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoServicoActionPerformed
        idTipoServicoComboBox();
        if (jComboBoxTipoServico.getSelectedItem() != null) {
            tipoServico = jComboBoxTipoServico.getSelectedItem().toString();
        }
    }//GEN-LAST:event_jComboBoxTipoServicoActionPerformed

    private void jBtbNovoTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbNovoTipoServicoActionPerformed

        txtTipoServico.setVisible(true);
        jComboBoxTipoServico.setVisible(false);
        jBtbNovoTipoServico.setVisible(false);
        jBtnCadTipoServico.setVisible(true);
        jBtnCancelarCadTipoServico.setVisible(true);
        txtTipoServico.setEnabled(true);
    }//GEN-LAST:event_jBtbNovoTipoServicoActionPerformed

    private void jBtnCadTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadTipoServicoActionPerformed

        TipoServico tServ = new TipoServico();

        tServ.setTipo(txtTipoServico.getText());

        codTipoServico = TipoServicoDAO.CadTipoServico(tServ);

        txtTipoServico.setVisible(false);
        jComboBoxTipoServico.setVisible(true);

        jBtnCadTipoServico.setVisible(false);
        jBtnCancelarCadTipoServico.setVisible(false);
        jBtbNovoTipoServico.setVisible(true);

        jComboBoxTipoServico.removeAllItems();
        populaComboBoxTipoServico();
        jComboBoxTipoServico.setSelectedItem(tServ.getTipo());
    }//GEN-LAST:event_jBtnCadTipoServicoActionPerformed

    private void jBtnCancelarCadTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarCadTipoServicoActionPerformed
        jBtnCadTipoServico.setVisible(false);
        jBtnCancelarCadTipoServico.setVisible(false);

        jBtbNovoTipoServico.setVisible(true);
        txtTipoServico.setVisible(false);
        jComboBoxTipoServico.setVisible(true);
    }//GEN-LAST:event_jBtnCancelarCadTipoServicoActionPerformed

    private void jBtnAdicionarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarTipoActionPerformed
        TabelaTipoServico();
    }//GEN-LAST:event_jBtnAdicionarTipoActionPerformed

    private void jBtnRemoverTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverTipoActionPerformed
        
        DefaultTableModel dtm = (DefaultTableModel) jTableTipodeServico.getModel();
        int linha = jTableTipodeServico.getSelectedRow();

        if(linha != -1) {
            dtm.removeRow(linha);
        }
    }//GEN-LAST:event_jBtnRemoverTipoActionPerformed

    private void jBtnSalvarDetServTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarDetServTipoServicoActionPerformed
        
        DetServicoTipoServ ServTipo = new DetServicoTipoServ();
        
        for(int j=0; j < jTableTipodeServico.getRowCount(); j++) {

            ServTipo.setCodServico(idServico);
            ServTipo.setCodTipo(Integer.parseInt(jTableTipodeServico.getValueAt(j, 0).toString()));

            DetServicoTipoDAO.CadDetServTipoServ(ServTipo);
        }
        
        telaDatalharServico.TabelaTipoServico();
    }//GEN-LAST:event_jBtnSalvarDetServTipoServicoActionPerformed

    public void TabelaTipoServico() {
        
        try { 
            
            DefaultTableModel dtm = (DefaultTableModel) jTableTipodeServico.getModel();
                   
                dtm.addRow(new Object[] {codTipoServico, tipoServico});
                
        } catch (Exception erro) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, erro);
        }          
    }
    
    private void populaComboBoxTipoServico() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabtipo_serv";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                jComboBoxTipoServico.addItem(rs.getString("Tipo_serv"));
            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void idTipoServicoComboBox() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabtipo_serv where Tipo_serv = '" + jComboBoxTipoServico.getSelectedItem()+ "';";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                codTipoServico = (rs.getInt("idtabTipo_serv"));
            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtbNovoTipoServico;
    private javax.swing.JButton jBtnAdicionarTipo;
    private javax.swing.JButton jBtnCadTipoServico;
    private javax.swing.JButton jBtnCancelarCadTipoServico;
    private javax.swing.JButton jBtnRemoverTipo;
    private javax.swing.JButton jBtnSalvarDetServTipoServico;
    private javax.swing.JComboBox jComboBoxTipoServico;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableTipodeServico;
    private javax.swing.JTextField txtTipoServico;
    // End of variables declaration//GEN-END:variables
}