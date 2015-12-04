package telas;

import atributos.Produto;
import funcoes.Conexao;
import static funcoes.Conexao.getConnection;
import funcoes.ModeloTabela;
import funcoes.ProdutoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import static telas.ExibeProduto.GetIndiceProduto;

/**
 *
 * @author Josy
 */
public class ExibeProdutos extends javax.swing.JFrame {

    
    Statement stmt ;
    Produto produto = new Produto();
    private static int indice;
    ArrayList<Produto> prod = new ArrayList<Produto>();
    
    /**
     * Creates new form ExibeProdutos
     */
    public ExibeProdutos() {
        initComponents();
        TabelaProduto("SELECT * FROM vw_produtos WHERE id_prod = " + GetIndiceProduto() + ";");
    }

    
    public static int GetIndice() {         
        return indice;
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListarProdutos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecoEntrada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPercentual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecoSaida = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtQuantMinima = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQuantEstoque = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBtnCalcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        codigoProdutoTabela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Sair");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Produto");

        jLabel2.setText("Produto:");

        txtProduto.setEnabled(false);

        jTableListarProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableListarProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListarProdutos);

        jLabel3.setText("Fornecedor:");

        txtFornecedor.setEnabled(false);

        jLabel6.setText("Fabricante:");

        txtFabricante.setEnabled(false);

        jLabel5.setText("Modelo:");

        jLabel7.setText("Preço de Entrada:");

        jLabel9.setText("Percentual:");

        jLabel8.setText("Preço de Saída:");

        txtModelo.setEnabled(false);

        jLabel4.setText("Quantidade:");

        jLabel11.setText("Estoque Mínimo:");

        jLabel10.setText("Estoque Atual:");

        txtQuantEstoque.setEnabled(false);

        jLabel12.setText("Buscar:");

        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        jButton2.setText("Atualizar");

        jButton3.setText("Cancelar");

        jLabel13.setText("Código:");

        codigoProdutoTabela.setText("codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFornecedor)
                            .addComponent(txtModelo)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(30, 30, 30)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(codigoProdutoTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPrecoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(45, 45, 45)
                                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(5, 5, 5)
                                            .addComponent(txtPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jBtnCalcular)
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel8)
                                            .addGap(5, 5, 5)
                                            .addComponent(txtPrecoSaida))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(15, 15, 15)
                                            .addComponent(txtQuantMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13)
                    .addComponent(codigoProdutoTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtPrecoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCalcular))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuantMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableListarProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarProdutosMouseClicked

        int linha = jTableListarProdutos.getSelectedRow();
        indice = (Integer.parseInt(jTableListarProdutos.getValueAt(linha, 0).toString()));
        CarregarDadosProduto();
    }//GEN-LAST:event_jTableListarProdutosMouseClicked

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        float percentual = Float.parseFloat(txtPercentual.getText());
        double precoEntrada = Double.parseDouble(txtPrecoEntrada.getText());
        double resultado = (precoEntrada*percentual)/100;
        
        txtPrecoSaida.setText(String.valueOf(precoEntrada + resultado));
    }//GEN-LAST:event_jBtnCalcularActionPerformed
   
    public void TabelaProduto(String Sql) {
        
        try {
            stmt = getConnection().createStatement();
            ArrayList dados = new ArrayList();               
            String [] Colunas = {"Código", "Produto", "Fornecedor", "Fabricante",
                                 "Modelo", "Preço Entrada", "Preço Saída"};
               
            ResultSet rs;
            rs = stmt.executeQuery(Sql);            
            //rs.first();
            
            while(rs.next()){
               dados.add(new Object[]{rs.getObject("id_prod"),
                                      rs.getObject("produto"),
                                      rs.getObject("fornecedor"),
                                      rs.getObject("fabricante"),
                                      rs.getObject("modelo"),
                                      rs.getObject("precoEntrada"),
                                      rs.getObject("precoSaida"),
                                      rs.getObject("quantidadeMinima")
                                      });            
            }
                        
            for (int i = 0; i < 7; i++){
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

    public void CarregarDadosProduto() {
        
        Statement stmt;
        ArrayList<Produto> produto = new ArrayList<Produto>();
        
        try {            
            String Sql = "SELECT * FROM vw_produtos WHERE tabproduto_id_prod = " + indice + ";";
            
            ResultSet rs;            
            stmt = Conexao.getConnection().createStatement();            
            rs = stmt.executeQuery(Sql); 
            
            while(rs.next()){
                
                codigoProdutoTabela.setText(String.valueOf(rs.getInt("id_prod")));
                txtProduto.setText(rs.getString("produto"));
                txtFornecedor.setText(rs.getString("fornecedor"));
                txtQuantidade.setText(String.valueOf(rs.getInt("quantidade")));
                txtPrecoEntrada.setText(String.valueOf(rs.getDouble("precoEntrada")));
                txtPrecoSaida.setText(String.valueOf(rs.getDouble("precoSaida")));
                txtQuantMinima.setText(String.valueOf(rs.getInt("quantidadeMinima")));
                txtModelo.setText(rs.getString("modelo"));
                txtFabricante.setText(rs.getString("fabricante"));              
            }            
            rs.close();
            stmt.close();
            
        } catch (SQLException ex) {      
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao carregar os dados do Produto: ", ex);    
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigoProdutoTabela;
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableListarProdutos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPercentual;
    private javax.swing.JTextField txtPrecoEntrada;
    private javax.swing.JTextField txtPrecoSaida;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantEstoque;
    private javax.swing.JTextField txtQuantMinima;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
