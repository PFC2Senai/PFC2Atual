package telas;

import atributos.DetServicoProduto;
import funcoes.Conexao;
import funcoes.DetServicoProdutoDAO;
import funcoes.ProdutoDAO;
import funcoes.ServicoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josy
 */
public class AdicionaDetServProduto extends javax.swing.JFrame {

    private PreparedStatement pst;
    Statement stmt;
    private int codModelo;
    private int codProduto;
    private int codDetProduto;
    private int codFabricante;
    private double valorUnit;
    private double valor;
    private double totalPeca = 0;
    
    private String produto;
    private String modelo;
    private String fabricante;
    
    private int idServico;
    private DetalharServico telaDatalharServico;
    
    /**
     * Creates new form AlteraServicoProduto
     * @param idServ
     * @param telaDetalharServ
     */
    public AdicionaDetServProduto(int idServ, DetalharServico telaDetalharServ) {
        this.idServico = idServ;
        this.telaDatalharServico = telaDetalharServ;
        initComponents();
        populaComboBoxProduto();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        jComboBoxProduto = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jBtbIncluirPeca = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jComboBoxModelo = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePecas = new javax.swing.JTable();
        jBtnRemoverPeca = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jComboBoxFabricante = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalPecas = new javax.swing.JTextField();
        jBtnInserirPeca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a Peça" }));
        jComboBoxProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProdutoItemStateChanged(evt);
            }
        });
        jComboBoxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProdutoActionPerformed(evt);
            }
        });

        jLabel33.setText("Peça:");

        jBtbIncluirPeca.setText("Incluir Peça");
        jBtbIncluirPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbIncluirPecaActionPerformed(evt);
            }
        });

        jLabel34.setText("Quantidade:");

        jComboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Modelo" }));
        jComboBoxModelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxModeloItemStateChanged(evt);
            }
        });
        jComboBoxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModeloActionPerformed(evt);
            }
        });

        jLabel35.setText("Modelo:");

        jTablePecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Peca", "CódigoModelo", "cod fabricante", "Peça", "Modelo", "Fabricante", "Valor Unit.", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePecas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTablePecas);

        jBtnRemoverPeca.setText("Remover");
        jBtnRemoverPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverPecaActionPerformed(evt);
            }
        });

        jLabel36.setText("Fabricante:");

        jComboBoxFabricante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Fabricante" }));
        jComboBoxFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFabricanteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Alterar Peças");

        jLabel2.setText("Valor total de peças:");

        jBtnInserirPeca.setText("Salvar");
        jBtnInserirPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInserirPecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jBtbIncluirPeca)
                        .addGap(60, 60, 60)
                        .addComponent(jBtnRemoverPeca))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnInserirPeca)
                .addGap(43, 43, 43))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtbIncluirPeca)
                    .addComponent(jBtnRemoverPeca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jBtnInserirPeca)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProdutoItemStateChanged
        jComboBoxModelo.removeAllItems();
        jComboBoxFabricante.removeAllItems();
        codModelo = 0;
        modelo = null;
        codProduto = 0;
        codFabricante = 0;
        fabricante = null;
        valorUnit = 0;
        valor = 0;
        idProdutoComboBox();
        populaComboBoxModelo();
        produto = jComboBoxProduto.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBoxProdutoItemStateChanged

    private void jComboBoxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProdutoActionPerformed

    }//GEN-LAST:event_jComboBoxProdutoActionPerformed

    private void jBtbIncluirPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbIncluirPecaActionPerformed
        TabelaProduto();
    }//GEN-LAST:event_jBtbIncluirPecaActionPerformed

    private void jComboBoxModeloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxModeloItemStateChanged
        
        jComboBoxFabricante.removeAllItems();
        idModeloComboBox();
        populaComboBoxFabricante();
        if (jComboBoxModelo.getSelectedItem() != null) {
            modelo = jComboBoxModelo.getSelectedItem().toString();
        }
    }//GEN-LAST:event_jComboBoxModeloItemStateChanged

    private void jComboBoxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModeloActionPerformed

    }//GEN-LAST:event_jComboBoxModeloActionPerformed

    private void jBtnRemoverPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverPecaActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTablePecas.getModel();
        
        int linha = jTablePecas.getSelectedRow();

        double totalParcial = Double.parseDouble(jTablePecas.getValueAt(linha, 8).toString());
        
        totalPeca -= totalParcial;
        txtTotalPecas.setText(String.valueOf(totalPeca));
        
        
        if(linha != -1) {
            dtm.removeRow(linha);
        }
    }//GEN-LAST:event_jBtnRemoverPecaActionPerformed

    private void jComboBoxFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFabricanteActionPerformed
        idFabricanteComboBox();
        if (jComboBoxFabricante.getSelectedItem() != null) {
            fabricante = jComboBoxFabricante.getSelectedItem().toString();
        }
    }//GEN-LAST:event_jComboBoxFabricanteActionPerformed

    private void jBtnInserirPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInserirPecaActionPerformed
        
        DetServicoProduto dtServ = new DetServicoProduto();
        
        for(int j = 0; j < jTablePecas.getRowCount(); j++) {

            dtServ.setCodServico(idServico);
            dtServ.setCodDetProduto(Integer.parseInt(jTablePecas.getValueAt(j, 0).toString()));
            dtServ.setQuantidade(Integer.parseInt(jTablePecas.getValueAt(j, 7).toString()));
            DetServicoProdutoDAO.CadDetServProduto(dtServ);
        }
                      
        double totalGeral = telaDatalharServico.Total();
        double resultado = totalGeral + totalPeca;
        ServicoDAO.UpdateTotalServico(idServico, resultado);
        
        telaDatalharServico.TabelaProduto("SELECT * FROM vw_detservicoproduto where idservico = " + idServico +";");
        telaDatalharServico.CarregaServico();
        this.dispose();
    }//GEN-LAST:event_jBtnInserirPecaActionPerformed
    
    public void TabelaProduto() {
               
        CarregaValorUnit();  
        codDetProduto = ProdutoDAO.codDetProduto();
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        double total = valorUnit * quantidade;
        try { 
            
            DefaultTableModel dtm = (DefaultTableModel) jTablePecas.getModel();
                   
                dtm.addRow(new Object[] {codDetProduto, codModelo, 
                                         codFabricante, produto, 
                                         modelo, fabricante,                                         
                                         valorUnit,
                                         quantidade,
                                         total});
                totalPeca += total;
                txtTotalPecas.setEditable(false);
                txtTotalPecas.setText(String.valueOf(totalPeca));
                
                txtQuantidade.setText("");
                modelo = null;
                fabricante = null;         
                
        } catch (Exception erro) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, erro);
        }          
    }
    
    public void CarregaValorUnit() { 
        
        valor = ProdutoDAO.ExisteProduto(codProduto, codModelo, codFabricante);
        
        if (valor != 0) {            
            valorUnit = valor;
        }        
    }
    
    private void populaComboBoxModelo() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select modelo " +
                                    " from tabdetproduto inner join " +
                                    " tabproduto inner join " +
                                    " tabmodelo on tabmodelo_idtabModelo = idtabModelo and " +
                                    " tabproduto_id_prod = id_prod"
                                +   " where id_prod = " + codProduto + " group by modelo;";
        System.out.println(codProduto);
        
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
    
    private void populaComboBoxFabricante() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "SELECT * FROM vw_combofabricanteproduto "
                   + " WHERE id_prod = " + codProduto 
                   + " AND tabmodelo_idtabModelo = " + codModelo + " group by fabricante;";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                jComboBoxFabricante.addItem(rs.getString("fabricante"));
            }
            
        }catch(SQLException ex) {
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
    
    private void populaComboBoxProduto() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabproduto;";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                jComboBoxProduto.addItem(rs.getString("produto"));
            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void idProdutoComboBox() {
        
        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabproduto inner join tabdetproduto on tabproduto_id_prod = id_prod"
                    + " where produto = '" + jComboBoxProduto.getSelectedItem()+ "';";
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                codProduto = (rs.getInt("id_prod"));
            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtbIncluirPeca;
    private javax.swing.JButton jBtnInserirPeca;
    private javax.swing.JButton jBtnRemoverPeca;
    private javax.swing.JComboBox jComboBoxFabricante;
    private javax.swing.JComboBox jComboBoxModelo;
    private javax.swing.JComboBox jComboBoxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePecas;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotalPecas;
    // End of variables declaration//GEN-END:variables
}