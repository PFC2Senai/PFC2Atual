package telas;

import atributos.Produto;
import static funcoes.Conexao.getConnection;
import funcoes.ModeloTabela;
import funcoes.ProdutoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author graciele
 */
public class ExibeProduto extends javax.swing.JFrame {
    
    Statement stmt ;
    Produto produto = new Produto();
    private static int indice;

    /**
     * Creates new form ExibeProduto
     */
    public ExibeProduto() {
        initComponents();
        TabelaProduto("SELECT * FROM tabproduto;");
    }
    
    public static int GetIndiceProduto() {         
        return indice;
    }
    
    public void TabelaProduto(String Sql) {
        
        try {
            
            stmt = getConnection().createStatement();
            ArrayList dados = new ArrayList();               
            String [] Colunas = {"Código", "Produto"};
               
            ResultSet rs;
            rs = stmt.executeQuery(Sql);            
            
            while(rs.next()) {
               dados.add(new Object[]{rs.getObject("id_prod"),
                                      rs.getObject("produto")});            
            }
                        
            for (int i = 0; i < 2; i++){
                
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
                jTableListarProdutos.setModel(modelo);
                jTableListarProdutos.getColumnModel().getColumn(i).setPreferredWidth(150);
                jTableListarProdutos.getColumnModel().getColumn(i).setResizable(false);
                jTableListarProdutos.getTableHeader().setReorderingAllowed(false);
                jTableListarProdutos.setAutoResizeMode(jTableListarProdutos.AUTO_RESIZE_OFF);
                jTableListarProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExibeProduto.class.getName()).log(Level.SEVERE, null, ex);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListarProdutos = new javax.swing.JTable();
        jBtnDetalharProduto = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Novo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 80, 30));

        jButton6.setText("Excluir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 70, 30));

        jButton7.setText("Voltar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 490, 70, 30));

        jLabel1.setFont(new java.awt.Font("Raavi", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/prod.png"))); // NOI18N
        jLabel1.setText("Produtos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTableListarProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableListarProdutos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 594, 285));

        jBtnDetalharProduto.setText("Detalhar");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableListarProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jBtnDetalharProduto, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jBtnDetalharProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDetalharProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnDetalharProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 90, 30));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 485, -1));

        jLabel2.setText("Pesquisar Produto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leiaute/img2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 110));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 580));

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CadastrarProduto().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        if(jTableListarProdutos.getSelectedRow() != -1) {

            int linha = jTableListarProdutos.getSelectedRow();
            produto.setIdProduto(Integer.parseInt(jTableListarProdutos.getValueAt(linha, 0).toString()));

            int cod = ProdutoDAO.idProduto(produto.getIdProduto());
            ProdutoDAO.ExcluirProduto(cod);
            
        } else {
            JOptionPane.showMessageDialog(null, "Primeiro selecione um registro.");
        }
        
        TabelaProduto("SELECT * FROM tabproduto;");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jBtnDetalharProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDetalharProdutoActionPerformed
        int linha = jTableListarProdutos.getSelectedRow();
        indice = (Integer.parseInt(jTableListarProdutos.getValueAt(linha, 0).toString()));
        new ExibeProdutosDetalhe().setVisible(true);
    }//GEN-LAST:event_jBtnDetalharProdutoActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        TabelaProduto("select * from tabproduto where produto "
            + "like '%" + txtBuscar.getText() + "%';");
    }//GEN-LAST:event_txtBuscarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDetalharProduto;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableListarProdutos;
    private javax.swing.JTextField txtBuscar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
