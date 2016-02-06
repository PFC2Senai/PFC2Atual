package telas;

import atributos.Modelo;
import static funcoes.Conexao.getConnection;
import funcoes.ModeloDAO;
import funcoes.ModeloTabela;
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
public class ExibeModelo extends javax.swing.JFrame {

    Statement stmt;
    Modelo modelo = new Modelo();
    private static int indice;

    /**
     * Creates new form ExibeModelo
     */
    public ExibeModelo() {
        initComponents();
        TabelaModelo("select * from tabmodelo;");
    }

    public static int GetIndice() {
        return indice;
    }

    public void TabelaModelo(String Sql) {

        try {
            
            stmt = getConnection().createStatement();
            ArrayList dados = new ArrayList();
            String[] Colunas = {"Código", "Modelo"};

            ResultSet rs;
            rs = stmt.executeQuery(Sql);

            while (rs.next()) {
                dados.add(new Object[]{
                    rs.getObject("idtabModelo"), 
                    rs.getObject("modelo")});
            }

            for (int i = 0; i < 2; i++) {
                
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
                jTableListarUsuarios.setModel(modelo);
                
                jTableListarUsuarios.getColumnModel().getColumn(0).setMaxWidth(0);
                jTableListarUsuarios.getColumnModel().getColumn(0).setMinWidth(0);
                jTableListarUsuarios.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                jTableListarUsuarios.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
                
                jTableListarUsuarios.getColumnModel().getColumn(1).setPreferredWidth(200);
                
                jTableListarUsuarios.getColumnModel().getColumn(i).setResizable(false);
                jTableListarUsuarios.getTableHeader().setReorderingAllowed(false);
               // jTableListarUsuarios.setAutoResizeMode(jTableListarUsuarios.AUTO_RESIZE_OFF);
                jTableListarUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExibeModelo.class.getName()).log(Level.SEVERE, null, ex);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListarUsuarios = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Raavi", 1, 18)); // NOI18N
        jLabel1.setText("Modelos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jTableListarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableListarUsuarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 176, 479, 270));

        jButton3.setText("Novo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 464, -1, -1));

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 464, -1, -1));

        jButton6.setText("Excluir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 464, -1, -1));

        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 464, -1, -1));

        jLabel2.setText("Pesquisar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 421, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leiaute/img2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 670, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CadastrarModelo().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        if (jTableListarUsuarios.getSelectedRow() != -1) {
            this.dispose();
            int linha = jTableListarUsuarios.getSelectedRow();
            indice = (Integer.parseInt(jTableListarUsuarios.getValueAt(linha, 0).toString()));
            new AlterarModelo().setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Primeiro selecione um registro.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        if (jTableListarUsuarios.getSelectedRow() != -1) {

            int linha = jTableListarUsuarios.getSelectedRow();
            modelo.setIdModelo(Integer.parseInt(jTableListarUsuarios.getValueAt(linha, 0).toString()));

            int cod = ModeloDAO.idModelo(modelo.getIdModelo());
            ModeloDAO.ExcluirModelo(cod);
            
        } else {
            JOptionPane.showMessageDialog(null, "Primeiro selecione um registro.");
        }
        TabelaModelo("select  * from tabmodelo;");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        TabelaModelo("select  * from tabmodelo where modelo "
                + "like '%" + txtBuscar.getText() + "%';");
    }//GEN-LAST:event_txtBuscarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableListarUsuarios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
