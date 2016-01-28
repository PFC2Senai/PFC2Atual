/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import atributos.Vendas;
import static funcoes.Conexao.getConnection;
import funcoes.ModeloTabela;
import funcoes.VendasDAO;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import static telas.ExibeVenda.GetIndice;

/**
 *
 * @author WilhamJr
 */
public class ExibeDetVenda extends javax.swing.JFrame {

    Statement stmt;
    int idContato;
    int idDetVenda;
    Vendas vendas = new Vendas();
    private final int codVenda;
    private static int indice;
    private ExibeDetVenda telaDetalVenda;

    /**
     * Creates new form ExibeDetVenda
     */
    public ExibeDetVenda() {
        initComponents();
        //this.idContato = VendasDAO.idDetVenda(GetIndice());
        this.codVenda = GetIndice();
        telaDetalVenda = this;
        TabelaVendas();
//        CarregaVenda();
        /*initComponents();
         CarregaCliente();
         populaComboBox();
         TabelaLembrete2(GetIndice());
         TabelaContatos();
         TabelaEquipamentosCli();
         TabelaRotina("select  * from tabrotinacontato where cliente_idcliente = " + codVenda + ";");
         Color minhaCor = new Color(217, 228, 241);
         this.getContentPane().setBackground(minhaCor);   */
        //TabelaVendas("select * from tabvendas inner join tabdetvendas on tabvendas.idtabVendas = "
        //      + "tabdetvendas.tabVendas_idtabVendas;");
    }

    public void TabelaVendas() {

        try {
            String Sql = "select * from tabvendas v inner join tabdetvendas dtV on "
                    + "v.idtabVendas = dtV.tabVendas_idtabVendas where v.idtabVendas = " + codVenda + ";";

            stmt = getConnection().createStatement();
            ArrayList dados = new ArrayList();
            String[] Colunas = {"Código da Venda", "Código do cliente", "Código do Usuário", "Data da Venda",
                "Hora da Venda", "Código do Serviço", "Total da venda", "Código do Detalhe da Venda",
                "Quantidade", "Código do Detalhe do Produto"};

            ResultSet rs;
            rs = stmt.executeQuery(Sql);

            while (rs.next()) {
                dados.add(new Object[]{
                    rs.getObject("idtabVendas"), 
                    rs.getObject("cliente_idcliente"), 
                    rs.getObject("tabusuario_id_usuario"), 
                    rs.getObject("dataVenda"), 
                    rs.getObject("hora"), 
                    rs.getObject("tabordemserv_idtabOrdemServ"), 
                    rs.getObject("totalVenda"), 
                    rs.getObject("idtabDetVendas"), 
                    rs.getObject("quantidade"), 
                    rs.getObject("tabdetproduto_idDetProduto")});
            }

            for (int i = 0; i < 10; i++) {
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
                jTableListarVendas.setModel(modelo);
                jTableListarVendas.getColumnModel().getColumn(i).setPreferredWidth(200);
                jTableListarVendas.getColumnModel().getColumn(i).setResizable(false);
                jTableListarVendas.getTableHeader().setReorderingAllowed(false);
                jTableListarVendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExibeVenda.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jBtnEditarUsuario = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListarVendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Detalhe de Vendas");

        jButton3.setText("Novo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jBtnEditarUsuario.setText("Editar");
        jBtnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarUsuarioActionPerformed(evt);
            }
        });

        jButton7.setText("Voltar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTableListarVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableListarVendas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(jTableListarVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(51, 51, 51)
                        .addComponent(jBtnEditarUsuario)
                        .addGap(46, 46, 46)
                        .addComponent(jButton7)
                        .addGap(274, 274, 274))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(312, 312, 312))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton3))
                    .addComponent(jBtnEditarUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CadastrarVenda().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBtnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarUsuarioActionPerformed
        if (jTableListarVendas.getSelectedRow() != -1) {
            this.dispose();
            int linha = jTableListarVendas.getSelectedRow();
            indice = (Integer.parseInt(jTableListarVendas.getValueAt(linha, 0).toString()));
            new AlterarUsuario().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Primeiro selecione um registro.");
        }
    }//GEN-LAST:event_jBtnEditarUsuarioActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        new ExibeVenda().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEditarUsuario;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableListarVendas;
    // End of variables declaration//GEN-END:variables
}
