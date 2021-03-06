package telas;


import atributos.HistoricoProduto;
import atributos.Produto;
import funcoes.Conexao;
import static funcoes.FuncoesDiversas.FormataData;
import funcoes.HistoricoProdutoDAO;
import funcoes.ProdutoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static telas.ExibeProduto.GetIndiceProduto;

/**
 *
 * @author Josy
 */
public final class AlterarEstoque extends javax.swing.JFrame {

    private PreparedStatement pst;
    private int codDetProd;
    private int codFornecedor;
    private int codProduto;
    private ExibeProdutosDetalhe telaExibeProdutos = null;

    /**
     * Creates new form AlterarEstoque
     */
    public AlterarEstoque() {
        initComponents();
    }

    public AlterarEstoque(int codDetP, ExibeProdutosDetalhe telaExibeProd) {
        initComponents();
        this.codProduto = GetIndiceProduto();
        this.telaExibeProdutos = telaExibeProd;
        codDetProd = codDetP;
        CarregarDadosProduto();
        populaComboBoxFornecedor();
        ocultaCampos();
    }

    public void ocultaCampos() {
        txtDataCadProduto.setVisible(false);
        txtPercentual.setVisible(false);
        jLabData.setVisible(false);
        jLabPercentual.setVisible(false);
        jBtnCalcular.setVisible(false);
        jBtnAdicionar.setVisible(false);
        jBtnConfirmarBaixa.setVisible(false);
        txtPrecoEntrada.setEnabled(false);
        txtPrecoSaida.setEnabled(false);
        txtQuantidade.setVisible(false);
        jLabQuantidade.setVisible(false);
        jComboBoxFornecedor.setVisible(false);
        jLabelFornecedor.setVisible(false);
    }

    public void mostraCampos() {
        txtDataCadProduto.setVisible(true);
        txtPercentual.setVisible(true);
        jLabData.setVisible(true);
        jLabPercentual.setVisible(true);
        jBtnCalcular.setVisible(true);
        txtPrecoEntrada.setEnabled(true);
        txtPrecoSaida.setEnabled(true);
        txtQuantidade.setEnabled(true);
        txtQuantidade.setVisible(true);
        jLabQuantidade.setVisible(true);
    }

    private boolean VerificaCampos(){
        boolean valida = true;
        
         if (jComboBoxTipoAlteracao.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um item!");
            valida = false;
            return valida;
        }

        if (jComboBoxFornecedor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um item!");
            valida = false;
            return valida;
        }
        
        if (txtDataCadProduto.getDate()== null) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }
        
        if (txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }
        
        if (txtPrecoEntrada.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }
        
        if (txtPercentual.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }        
        
        if (txtPrecoSaida.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }
        return valida;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jBtnConfirmarBaixa = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTipoAlteracao = new javax.swing.JComboBox();
        jBtnAdicionar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtModelo = new javax.swing.JLabel();
        txtProduto = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtQuantEstoque = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtQuantMinima = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtPrecoEntrada = new javax.swing.JTextField();
        jLabPercentual = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtDataCadProduto = new com.toedter.calendar.JDateChooser();
        jLabQuantidade = new javax.swing.JLabel();
        jLabData = new javax.swing.JLabel();
        jLabelFornecedor = new javax.swing.JLabel();
        txtPrecoSaida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxFornecedor = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jBtnCalcular = new javax.swing.JButton();
        txtPercentual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALTERAR ESTOQUE");

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnConfirmarBaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Baixar.png"))); // NOI18N
        jBtnConfirmarBaixa.setText("Confirmar Baixa");
        jBtnConfirmarBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarBaixaActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnConfirmarBaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, -1, -1));

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jPanel2.add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        jLabel1.setText("ALTERAR ESTOQUE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jComboBoxTipoAlteracao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo de alteração", "Entrada", "Saída" }));
        jComboBoxTipoAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoAlteracaoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxTipoAlteracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 211, -1));

        jBtnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jBtnAdicionar.setText("Adicionar");
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtModelo.setText("modelo");

        txtProduto.setText("Peça");

        txtFabricante.setBackground(new java.awt.Color(255, 204, 204));
        txtFabricante.setText("fabricante");

        jLabel6.setText("Fabricante:");

        jLabel2.setText("Peça:");

        jLabel11.setText("Estoque Mínimo:");

        txtQuantEstoque.setText("estoque atual");

        jLabel10.setText("Estoque Atual:");

        txtQuantMinima.setText("estoque mínimo");

        jLabel5.setText("Modelo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 790, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtPrecoEntrada.setEnabled(false);

        jLabPercentual.setText("Percentual:");

        txtQuantidade.setEnabled(false);

        jLabQuantidade.setText("Quantidade:");

        jLabData.setText("Data:");

        jLabelFornecedor.setText("Fornecedor:");

        txtPrecoSaida.setEnabled(false);

        jLabel8.setText("Valor de Saída:");

        jComboBoxFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o fornecedor" }));
        jComboBoxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFornecedorActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor de Entrada:");

        jBtnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculator.png"))); // NOI18N
        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        txtPercentual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercentualKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabelFornecedor)
                    .addComponent(jLabel8)
                    .addComponent(jLabQuantidade))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtPrecoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabPercentual)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jBtnCalcular))
                                    .addComponent(txtPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addComponent(jLabData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataCadProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtPrecoSaida))
                        .addGap(0, 561, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFornecedor)
                        .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDataCadProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addComponent(txtPrecoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnCalcular)
                        .addComponent(txtPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabQuantidade))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 790, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leiaute/img3.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        float percentual = Float.parseFloat(txtPercentual.getText());
        double precoEntrada = Double.parseDouble(txtPrecoEntrada.getText());
        double resultado = (precoEntrada * percentual) / 100;

        txtPrecoSaida.setText(String.valueOf(precoEntrada + resultado));
    }//GEN-LAST:event_jBtnCalcularActionPerformed

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
if(VerificaCampos() == true){
        Produto prod = new Produto();

        int quantAtual = Integer.parseInt(txtQuantEstoque.getText());
        int quantAdicionada = Integer.parseInt(txtQuantidade.getText());

        prod.setQuantidade(quantAtual + quantAdicionada);
        prod.setPrecoEntrada(Double.parseDouble(txtPrecoEntrada.getText()));
        prod.setPrecoSaida(Double.parseDouble(txtPrecoSaida.getText()));
        prod.setDataCadProduto(FormataData(txtDataCadProduto.getDate()));

        ProdutoDAO.AlterarEstoque(prod, codDetProd);

        HistoricoProduto histProduto = new HistoricoProduto();

        histProduto.setCodDetProduto(codDetProd);
        histProduto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        histProduto.setValor(Double.parseDouble(txtPrecoEntrada.getText()));
        histProduto.setDataCadProduto(FormataData(txtDataCadProduto.getDate()));
        histProduto.setCodFornecedor(codFornecedor);
        HistoricoProdutoDAO.CadHistoricoProd(histProduto);
        CarregarDadosProduto();
        telaExibeProdutos.TabelaProduto("SELECT * FROM vw_produtos WHERE id_prod = " + codProduto + ";");
}
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jComboBoxTipoAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoAlteracaoActionPerformed

        switch (jComboBoxTipoAlteracao.getSelectedItem().toString()) {
            case "Entrada":
                mostraCampos();
                txtQuantidade.setText("");
                jBtnAdicionar.setVisible(true);
                jBtnConfirmarBaixa.setVisible(false);
                jComboBoxFornecedor.setVisible(true);
                jLabelFornecedor.setVisible(true);
                break;
            case "Saída":
                ocultaCampos();
                jBtnConfirmarBaixa.setVisible(true);
                jBtnAdicionar.setVisible(false);
                txtQuantidade.setText("");
                txtQuantidade.setVisible(true);
                txtQuantidade.setEnabled(true);
                jLabQuantidade.setVisible(true);
                jComboBoxFornecedor.setVisible(false);
                jLabelFornecedor.setVisible(false);
                break;
            default:
                ocultaCampos();
                jBtnAdicionar.setVisible(false);
                jBtnConfirmarBaixa.setVisible(false);
                break;
        }
    }//GEN-LAST:event_jComboBoxTipoAlteracaoActionPerformed

    private void jBtnConfirmarBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarBaixaActionPerformed

        int quantAtual = Integer.parseInt(txtQuantEstoque.getText());
        int quantRetirada = Integer.parseInt(txtQuantidade.getText());
        int result = quantAtual - quantRetirada;

        ProdutoDAO.BaixaEstoque(result, codDetProd);
        CarregarDadosProduto();
        telaExibeProdutos.TabelaProduto("SELECT * FROM vw_produtos WHERE id_prod = " + codProduto + ";");
    }//GEN-LAST:event_jBtnConfirmarBaixaActionPerformed

    private void jComboBoxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFornecedorActionPerformed
        idFornecedorComboBox();
    }//GEN-LAST:event_jComboBoxFornecedorActionPerformed

    private void txtPercentualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercentualKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321,.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPercentualKeyTyped

    public void CarregarDadosProduto() {

        Statement stmt;

        try {

            String Sql = "SELECT * FROM vw_produtos WHERE idDetProduto = " + codDetProd + ";";

            ResultSet rs;
            stmt = Conexao.getConnection().createStatement();
            rs = stmt.executeQuery(Sql);

            while (rs.next()) {

                txtProduto.setText(rs.getString("produto"));
                txtQuantEstoque.setText(String.valueOf(rs.getInt("quantidade")));
                txtPrecoEntrada.setText(String.valueOf(rs.getDouble("precoEntrada")));
                txtPrecoSaida.setText(String.valueOf(rs.getDouble("precoSaida")));
                txtQuantMinima.setText(String.valueOf(rs.getInt("quantidadeMinima")));
                txtModelo.setText(rs.getString("modelo"));
                txtFabricante.setText(rs.getString("fabricante"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(ExibeProdutosDetalhe.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao carregar os dados do Produto: ", ex);
        }
    }

    private void populaComboBoxFornecedor() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabfornecedor";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                jComboBoxFornecedor.addItem(rs.getString("fornecedor"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void idFornecedorComboBox() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabfornecedor where fornecedor = '" + jComboBoxFornecedor.getSelectedItem() + "';";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                codFornecedor = (rs.getInt("id_forn"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmarBaixa;
    private javax.swing.JComboBox jComboBoxFornecedor;
    private javax.swing.JComboBox jComboBoxTipoAlteracao;
    private javax.swing.JLabel jLabData;
    private javax.swing.JLabel jLabPercentual;
    private javax.swing.JLabel jLabQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFornecedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser txtDataCadProduto;
    private javax.swing.JLabel txtFabricante;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JTextField txtPercentual;
    private javax.swing.JTextField txtPrecoEntrada;
    private javax.swing.JTextField txtPrecoSaida;
    private javax.swing.JLabel txtProduto;
    private javax.swing.JLabel txtQuantEstoque;
    private javax.swing.JLabel txtQuantMinima;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
