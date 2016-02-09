package telas;

import atributos.DetServicoProduto;
import atributos.Produto;
import funcoes.Conexao;
import funcoes.DetServicoProdutoDAO;
import funcoes.LimitarDigitos;
import funcoes.ProdutoDAO;
import funcoes.ServicoDAO;
import funcoes.TabelaZebrada;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

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
     */
    public AdicionaDetServProduto() {
        initComponents();
        txtQuantidade.setDocument(new LimitarDigitos(5));
    }

    public AdicionaDetServProduto(int idServ, DetalharServico telaDetalharServ) {
        this.idServico = idServ;
        this.telaDatalharServico = telaDetalharServ;
        initComponents();
        txtQuantidade.setDocument(new LimitarDigitos(5));
        carregarComboPeca();
        ocultaTabela();
        
        uJComboBoxPeca.getEditor().getEditorComponent().addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (codProduto == 0 && uJComboBoxPeca.getSelectedIndex() != 0) {
                    JOptionPane.showMessageDialog(null, "Esse registro não encontra-se cadastrado na base de dados.");
                    uJComboBoxPeca.getEditor().getEditorComponent().requestFocus();
                }
            }
        });
        uJComboBoxPeca.setAutocompletar(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jComboBoxFabricante = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtValorUnit = new javax.swing.JTextField();
        jBtbIncluirPeca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePecas = new javax.swing.JTable();
        jBtnRemoverPeca = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTotalPecas = new javax.swing.JTextField();
        jBtnInserirPeca = new javax.swing.JButton();
        uJComboBoxPeca = new componentes.UJComboBox();
        jBtnCancelar = new javax.swing.JButton();
        txtModelo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADCIONARAR PEÇA");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        jLabel1.setText("ADICIONAR PEÇA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leiaute/img3.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -8, 850, 120));

        jPanel1.setBackground(new java.awt.Color(254, 254, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setText("Modelo:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel33.setText("Peça:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel36.setText("Fab.:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jComboBoxFabricante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Fabricante" }));
        jComboBoxFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFabricanteActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 280, -1));

        jLabel34.setText("Quant.:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));
        jPanel1.add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 100, -1));

        jLabel39.setText("Valor Unit.");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 50, 20));
        jPanel1.add(txtValorUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 120, -1));

        jBtbIncluirPeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jBtbIncluirPeca.setText("Incluir Peça");
        jBtbIncluirPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbIncluirPecaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtbIncluirPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 110, -1));

        jTablePecas.setBackground(new java.awt.Color(254, 254, 233));
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
        jTablePecas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTablePecasFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePecas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 780, 130));

        jBtnRemoverPeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jBtnRemoverPeca.setText("Remover");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTablePecas, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jBtnRemoverPeca, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jBtnRemoverPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverPecaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnRemoverPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money.png"))); // NOI18N
        jLabel2.setText("Valor total de peças:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));
        jPanel1.add(txtTotalPecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 172, -1));

        jBtnInserirPeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/disk.png"))); // NOI18N
        jBtnInserirPeca.setText("Salvar");
        jBtnInserirPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInserirPecaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnInserirPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, 30));

        uJComboBoxPeca.setEditable(true);
        uJComboBoxPeca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                uJComboBoxPecaItemStateChanged(evt);
            }
        });
        uJComboBoxPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uJComboBoxPecaActionPerformed(evt);
            }
        });
        jPanel1.add(uJComboBoxPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 280, -1));

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 30));

        txtModelo.setEditable(false);
        txtModelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModeloFocusGained(evt);
            }
        });
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 280, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnInserirPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInserirPecaActionPerformed

        DetServicoProduto dtServ = new DetServicoProduto();

        for (int j = 0; j < jTablePecas.getRowCount(); j++) {

            dtServ.setCodServico(idServico);
            dtServ.setCodDetProduto(Integer.parseInt(jTablePecas.getValueAt(j, 0).toString()));
            dtServ.setQuantidade(Integer.parseInt(jTablePecas.getValueAt(j, 7).toString()));
            DetServicoProdutoDAO.CadDetServProduto(dtServ);
        }

        double totalGeral = telaDatalharServico.Total();
        double resultado = totalGeral + totalPeca;
        ServicoDAO.UpdateTotalServico(idServico, resultado);

        telaDatalharServico.TabelaProduto("SELECT * FROM vw_detservicoproduto where idservico = " + idServico + ";");
        telaDatalharServico.CarregaServico();
        verificaPagina();
        this.dispose();
    }//GEN-LAST:event_jBtnInserirPecaActionPerformed

    private void jComboBoxFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFabricanteActionPerformed
        idFabricanteComboBox();
        if (jComboBoxFabricante.getSelectedItem() != null) {
            fabricante = jComboBoxFabricante.getSelectedItem().toString();
            CarregaValorUnit();
        }
    }//GEN-LAST:event_jComboBoxFabricanteActionPerformed

    private void jBtnRemoverPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverPecaActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTablePecas.getModel();

        int linha = jTablePecas.getSelectedRow();

        double totalParcial = Double.parseDouble(jTablePecas.getValueAt(linha, 8).toString());

        totalPeca -= totalParcial;
        txtTotalPecas.setText(String.valueOf(totalPeca));

        if (linha != -1) {
            dtm.removeRow(linha);
        }
    }//GEN-LAST:event_jBtnRemoverPecaActionPerformed

    private void jBtbIncluirPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbIncluirPecaActionPerformed
        TabelaProduto();
    }//GEN-LAST:event_jBtbIncluirPecaActionPerformed

    private void uJComboBoxPecaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_uJComboBoxPecaItemStateChanged

        txtModelo.setText("");
        jComboBoxFabricante.removeAllItems();

        codProduto = 0;
        codModelo = 0;
        modelo = null;
        codFabricante = 0;
        fabricante = null;
        valorUnit = 0;
        valor = 0;
        idProdutoComboBox();
        populaComboBoxModelo();
        
        txtModelo.requestFocus();

        if (uJComboBoxPeca.getSelectedItem() != null) {
            produto = uJComboBoxPeca.getSelectedItem().toString();
        }
    }//GEN-LAST:event_uJComboBoxPecaItemStateChanged

    private void uJComboBoxPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uJComboBoxPecaActionPerformed
        idProdutoComboBox();
        if (uJComboBoxPeca.getSelectedItem() != null) {
            produto = uJComboBoxPeca.getSelectedItem().toString();
        }
    }//GEN-LAST:event_uJComboBoxPecaActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        this.dispose();
        verificaPagina();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        verificaPagina();
    }//GEN-LAST:event_formWindowClosed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        jComboBoxFabricante.removeAllItems();
        idModeloComboBox();
        populaComboBoxFabricante();
        txtValorUnit.setText("");       
        modelo = txtModelo.getText();
        CarregaValorUnit();      
    }//GEN-LAST:event_txtModeloActionPerformed

    private void jTablePecasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTablePecasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablePecasFocusGained

    private void txtModeloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModeloFocusGained
        jComboBoxFabricante.removeAllItems();
        idModeloComboBox();
        populaComboBoxFabricante();
        txtValorUnit.setText("");       
        modelo = txtModelo.getText();
        CarregaValorUnit(); 
    }//GEN-LAST:event_txtModeloFocusGained

    public void TabelaProduto() {

        codDetProduto = ProdutoDAO.codDetProduto();
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        valorUnit = Double.parseDouble(txtValorUnit.getText());
        double total = valorUnit * quantidade;
        try {

            DefaultTableModel dtm = (DefaultTableModel) jTablePecas.getModel();

            TableCellRenderer renderer = new TabelaZebrada();
            jTablePecas.setDefaultRenderer(Object.class, renderer);

            dtm.addRow(new Object[]{codDetProduto, codModelo,
                codFabricante, produto,
                modelo, fabricante,
                valorUnit,
                quantidade,
                total});

            totalPeca += total;
            txtTotalPecas.setEditable(false);
            txtTotalPecas.setText(String.valueOf(totalPeca));

            txtQuantidade.setText("");

        } catch (Exception erro) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public void CarregaValorUnit() {

        valor = ProdutoDAO.ExisteProduto(codProduto, codModelo, codFabricante);

        if (valor != 0) {
            txtValorUnit.setText(String.valueOf(valor));
        }
    }

    private void populaComboBoxModelo() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select modelo "
                + " from tabdetproduto inner join "
                + " tabproduto inner join "
                + " tabmodelo on tabmodelo_idtabModelo = idtabModelo and "
                + " tabproduto_id_prod = id_prod"
                + " where id_prod = " + codProduto + " group by modelo;";
        System.out.println(codProduto);

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                txtModelo.setText(rs.getString("modelo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void idModeloComboBox() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabmodelo where modelo = '" + txtModelo.getText() + "';";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                codModelo = (rs.getInt("idtabModelo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void populaComboBoxFabricante() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "SELECT * FROM vw_combofabricanteproduto "
                + " WHERE id_prod = " + codProduto
                + " AND tabmodelo_idtabModelo = " + codModelo + " group by fabricante;";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                jComboBoxFabricante.addItem(rs.getString("fabricante"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void idFabricanteComboBox() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabfabricante where fabricante = '" + jComboBoxFabricante.getSelectedItem() + "';";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                codFabricante = (rs.getInt("idtabFabricante"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void carregarComboPeca() {

        // uJComboBoxPeca.clear();
        ArrayList<Produto> pecas = new ArrayList<Produto>();
        pecas = ProdutoDAO.ListarProdutos();

        for (Produto prod : pecas) {
            uJComboBoxPeca.addItem(prod.getProduto(), prod);
        }
    }

    private void idProdutoComboBox() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabproduto inner join tabdetproduto on tabproduto_id_prod = id_prod"
                + " where produto = '" + uJComboBoxPeca.getSelectedItem() + "';";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                codProduto = (rs.getInt("id_prod"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void ocultaTabela() {
        
        jTablePecas.getColumnModel().getColumn(0).setMaxWidth(0);
        jTablePecas.getColumnModel().getColumn(0).setMinWidth(0);
        jTablePecas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        jTablePecas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        
        jTablePecas.getColumnModel().getColumn(1).setMaxWidth(0);
        jTablePecas.getColumnModel().getColumn(1).setMinWidth(0);
        jTablePecas.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        jTablePecas.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
        
        jTablePecas.getColumnModel().getColumn(2).setMaxWidth(0);
        jTablePecas.getColumnModel().getColumn(2).setMinWidth(0);
        jTablePecas.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        jTablePecas.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
    }
    
    private void verificaPagina() {

        if ((this.telaDatalharServico != null)) {
            this.telaDatalharServico.setEnabled(true);
            this.telaDatalharServico.toFront();
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtbIncluirPeca;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnInserirPeca;
    private javax.swing.JButton jBtnRemoverPeca;
    private javax.swing.JComboBox jComboBoxFabricante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePecas;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotalPecas;
    private javax.swing.JTextField txtValorUnit;
    private componentes.UJComboBox uJComboBoxPeca;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
