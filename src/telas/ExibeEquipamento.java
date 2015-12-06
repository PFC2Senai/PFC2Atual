package telas;

import atributos.Equipamento;
import static funcoes.Conexao.getConnection;
import funcoes.EquipamentoDAO;
import funcoes.ModeloTabela;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josy
 */
public class ExibeEquipamento extends javax.swing.JFrame {

    
    Statement stmt ;
    private static int indice;
    
    /**
     * Creates new form ExibeEquipamento
     */
    public ExibeEquipamento() {
        initComponents();
        TabelaEquipamento("SELECT * FROM vw_equipamentos; ");
        DesabilitaCampos();
        jBtnEditar.setEnabled(false);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarEquipamento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEquipamento = new javax.swing.JTextField();
        jBtnNovo = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnExcluirEquipamento = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableListarEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Equipamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListarEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarEquipamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarEquipamento);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Equipamentos");

        jLabel3.setText("Equipamento:");

        jBtnNovo.setText("Novo");
        jBtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoActionPerformed(evt);
            }
        });

        jBtnEditar.setText("Detalhar Equipamento");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnExcluirEquipamento.setText("Excluir");
        jBtnExcluirEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirEquipamentoActionPerformed(evt);
            }
        });

        jBtnSalvar.setText("Salvar");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnExcluirEquipamento))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEquipamento)))))
                        .addGap(341, 341, 341))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnNovo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnSair)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnExcluirEquipamento))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void TabelaEquipamento(String Sql){
        
        try { 
            
            stmt = getConnection().createStatement();
            ArrayList dados = new ArrayList();               
            String [] Colunas = {"Código","Equipamento", "Fornecedor", "Fabricante", "Modelo"};
               
            ResultSet rs;
            rs = stmt.executeQuery(Sql);            
            //rs.first();
            
                while(rs.next()){
                    dados.add(new Object[]{ rs.getObject("idDetEquipamento"),rs.getObject("equipamento"),
                                            rs.getObject("fornecedor"),rs.getObject("fabricante"), 
                                            rs.getObject("modelo")});            
                }

                    for (int i = 0; i < 5; i++){
                        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
                        jTableListarEquipamento.setModel(modelo);
                        jTableListarEquipamento.getColumnModel().getColumn(i).setPreferredWidth(150);
                        jTableListarEquipamento.getColumnModel().getColumn(i).setResizable(false);
                        jTableListarEquipamento.getTableHeader().setReorderingAllowed(false);
                        jTableListarEquipamento.setAutoResizeMode(jTableListarEquipamento.AUTO_RESIZE_OFF);
                        jTableListarEquipamento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                    }
                    
        } catch (SQLException ex) {
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (Exception erro){
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, erro);
        }         
    }
    
    
//    public void TabelaEquipamento(){
//        
//        ((DefaultTableModel) jTableListarEquipamento.getModel()).setNumRows(0);
//        jTableListarEquipamento.updateUI();
//        ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
//        equipamentos = EquipamentoDAO.ListarEquipamentos();
//        
//        try { 
//            
//            DefaultTableModel dtm = (DefaultTableModel) jTableListarEquipamento.getModel();
//                   
//            for(Equipamento equipamento : equipamentos){
//                dtm.addRow(new Object[] {String.valueOf(equipamento.getIdEquipamento()),equipamento.getEquipamento()});
//            }
//                             
//        } catch (Exception erro){
//            Logger.getLogger(ExibeEquipamento.class.getName()).log(Level.SEVERE, null, erro);
//            System.out.println("erro" + erro);
//        }          
//    }
    
    private void jTableListarEquipamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarEquipamentoMouseClicked
                    
        if (jTableListarEquipamento.getSelectedRow() != -1) {
           int linha = jTableListarEquipamento.getSelectedRow();    
           txtEquipamento.setText(jTableListarEquipamento.getValueAt(linha, 1).toString()); 
           indice = Integer.parseInt(jTableListarEquipamento.getValueAt(linha, 0).toString());
        }
        jBtnEditar.setEnabled(true);                 
    }//GEN-LAST:event_jTableListarEquipamentoMouseClicked

    private void jBtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoActionPerformed
        new CadastrarEquipamento().setVisible(true);
    }//GEN-LAST:event_jBtnNovoActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        
        new DetalharEquipamento(indice,this).setVisible(true);
        
// if (jTableListarEquipamento.getSelectedRow() != -1) {
//        jBtnCancelar.setVisible(true);
//        jBtnSalvar.setVisible(true);
//        jBtnEditar.setVisible(false);
//        txtEquipamento.setEnabled(true);
 //   }else{
       // JOptionPane.showMessageDialog(null, "Primeiro selecione um registro na tabela.");
 //   }
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnExcluirEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirEquipamentoActionPerformed

        EquipamentoDAO.ExcluirEquipamento(indice);
        TabelaEquipamento("SELECT * FROM vw_equipamentos; ");
        limparCampos();
    }//GEN-LAST:event_jBtnExcluirEquipamentoActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        Equipamento equi = new Equipamento();
        equi.setTabusuarioIdUsuario(1);
        equi.setEquipamento(txtEquipamento.getText());
       // EquipamentoDAO.UpdateEquipamento(equi, indice);
        DesabilitaCampos();
        jBtnEditar.setVisible(true);
        TabelaEquipamento("SELECT * FROM vw_equipamentos; ");
        limparCampos();
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        DesabilitaCampos();
        limparCampos();
        jBtnEditar.setVisible(true);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void limparCampos() {       
        txtEquipamento.setText("");
    }
    
    private void DesabilitaCampos() {       
        txtEquipamento.setEnabled(false);
        jBtnCancelar.setVisible(false);
        jBtnSalvar.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluirEquipamento;
    private javax.swing.JButton jBtnNovo;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarEquipamento;
    private javax.swing.JTextField txtEquipamento;
    // End of variables declaration//GEN-END:variables
}
