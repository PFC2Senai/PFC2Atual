package telas;

import atributos.Modelo;
import static funcoes.Conexao.getConnection;
import funcoes.ModeloDAO;
import funcoes.ModeloTabela;
import funcoes.TabelaZebrada;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Josy
 */
public class OperacaoModelo extends javax.swing.JFrame {

    
    Statement stmt;
    Modelo modelo = new Modelo();
    private static int indice;
    private Menu telaMenu;
    
    
    public OperacaoModelo() {
        initComponents();
        TabelaModelo("select * from tabmodelo;");
        ocultaCampos();
    }
    
    public OperacaoModelo(Menu menu) {
        this.telaMenu = menu;
        initComponents();
        TabelaModelo("select * from tabmodelo;");
        ocultaCampos();
    }

    
    public static int GetIndice() {
        return indice;
    }
    
    private void ocultaCampos() {
        jBtnCadastrarModelo.setVisible(false);
        jBtnAlterarModelo.setVisible(false);
        jBtnCancelarCadModelo.setVisible(false);
        jBtnCancelarAlterarModelo.setVisible(false);
        txtModelo.setEnabled(false);
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
                jTableListarModelo.setModel(modelo);
                TableCellRenderer renderer = new TabelaZebrada();
                jTableListarModelo.setDefaultRenderer(Object.class, renderer);
                
                jTableListarModelo.getColumnModel().getColumn(0).setMaxWidth(0);
                jTableListarModelo.getColumnModel().getColumn(0).setMinWidth(0);
                jTableListarModelo.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                jTableListarModelo.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
                
                jTableListarModelo.getColumnModel().getColumn(1).setPreferredWidth(200);
                
                jTableListarModelo.getColumnModel().getColumn(i).setResizable(false);
                jTableListarModelo.getTableHeader().setReorderingAllowed(false);
                jTableListarModelo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        } catch (SQLException ex) {
            Logger.getLogger(OperacaoModelo.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListarModelo = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jBtnNovoModelo = new javax.swing.JButton();
        jBtnCancelarCadModelo = new javax.swing.JButton();
        jBtnCadastrarModelo = new javax.swing.JButton();
        jBtnAlterarModelo = new javax.swing.JButton();
        jBtnCancelarAlterarModelo = new javax.swing.JButton();
        jBtnEditarModelo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableListarModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableListarModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarModeloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListarModelo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 169, 603, 296));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 131, 336, -1));

        jLabel4.setText("Modelo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 330, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leiaute/img2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 680, 120));

        jLabel1.setFont(new java.awt.Font("Raavi", 1, 18)); // NOI18N
        jLabel1.setText("MODELOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 41, -1, -1));

        jLabel2.setText("Pesquisar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 134, -1, -1));

        jButton7.setText("Voltar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jBtnNovoModelo.setText("Novo");
        jBtnNovoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoModeloActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnNovoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 480, -1, -1));

        jBtnCancelarCadModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelarCadModelo.setText("Cancelar");
        jBtnCancelarCadModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarCadModeloActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCancelarCadModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        jBtnCadastrarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jBtnCadastrarModelo.setText("Salvar");
        jBtnCadastrarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarModeloActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCadastrarModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        jBtnAlterarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jBtnAlterarModelo.setText("Salvar");
        jBtnAlterarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarModeloActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAlterarModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        jBtnCancelarAlterarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelarAlterarModelo.setText("Cancelar");
        jBtnCancelarAlterarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarAlterarModeloActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCancelarAlterarModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        jBtnEditarModelo.setText("Editar");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableListarModelo, org.jdesktop.beansbinding.ELProperty.create("${selectedElement  !=null}"), jBtnEditarModelo, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jBtnEditarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarModeloActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnEditarModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 650));

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableListarModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarModeloMouseClicked
        int linha = jTableListarModelo.getSelectedRow();
        if (linha != -1) {
            txtModelo.setText(jTableListarModelo.getValueAt(linha, 1).toString());
            indice = Integer.parseInt(jTableListarModelo.getValueAt(linha, 0).toString());
        }
    }//GEN-LAST:event_jTableListarModeloMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        TabelaModelo("select  * from tabmodelo where modelo "
            + "like '%" + txtBuscar.getText().trim() + "%';");
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        verificaPagina();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jBtnNovoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoModeloActionPerformed
        jTableListarModelo.getSelectionModel().clearSelection();
        txtModelo.setText("");
        txtModelo.setEnabled(true);
        jBtnCadastrarModelo.setVisible(true);
        jBtnCancelarCadModelo.setVisible(true);
        jBtnNovoModelo.setVisible(false);

        jBtnEditarModelo.setEnabled(false);
        jTableListarModelo.setEnabled(false);
    }//GEN-LAST:event_jBtnNovoModeloActionPerformed

    private void jBtnCancelarCadModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarCadModeloActionPerformed

        txtModelo.setText("");
        txtModelo.setEnabled(false);
        limparCampos();
        jBtnCancelarCadModelo.setVisible(false);
        jBtnCadastrarModelo.setVisible(false);
        jBtnNovoModelo.setVisible(true);
        // jBtnEditarFabricante.setEnabled(true);
        jTableListarModelo.setEnabled(true);
    }//GEN-LAST:event_jBtnCancelarCadModeloActionPerformed

    private void jBtnCadastrarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarModeloActionPerformed

        if (ModeloDAO.VerificarModelo(txtModelo.getText()) == false) {
            Modelo model = new Modelo();

            model.setModelo(txtModelo.getText());

            ModeloDAO.CadModelo(model);
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
            limparCampos();
            TabelaModelo("select * from tabmodelo;");
            
            jBtnCadastrarModelo.setVisible(false);
            jBtnCancelarCadModelo.setVisible(false);
            jBtnNovoModelo.setVisible(true);
            jTableListarModelo.setEnabled(true);
            txtModelo.setText("");
            txtModelo.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Modelo ja cadastrado");
        }
    }//GEN-LAST:event_jBtnCadastrarModeloActionPerformed

    private void jBtnAlterarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarModeloActionPerformed
        Modelo model = new Modelo();
        model.setModelo(txtModelo.getText());
        ModeloDAO.UpdateModelo(model, GetIndice());        
        jBtnAlterarModelo.setVisible(false);
        jBtnCancelarAlterarModelo.setVisible(false);
        jBtnEditarModelo.setVisible(true);
        jBtnNovoModelo.setEnabled(true);
        txtModelo.setText("");
        txtModelo.setEnabled(false);
        TabelaModelo("select * from tabmodelo");
    }//GEN-LAST:event_jBtnAlterarModeloActionPerformed

    private void jBtnCancelarAlterarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarAlterarModeloActionPerformed
        txtModelo.setText("");
        txtModelo.setEnabled(false);
        jTableListarModelo.getSelectionModel().clearSelection();
        limparCampos();
        jBtnAlterarModelo.setVisible(false);
        jBtnCancelarAlterarModelo.setVisible(false);
        jBtnEditarModelo.setVisible(true);
        jBtnNovoModelo.setEnabled(true);       
    }//GEN-LAST:event_jBtnCancelarAlterarModeloActionPerformed

    private void jBtnEditarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarModeloActionPerformed
        txtModelo.setEnabled(true);
        jBtnEditarModelo.setVisible(false);
        jBtnCancelarAlterarModelo.setVisible(true);
        jBtnAlterarModelo.setVisible(true);
        jBtnNovoModelo.setEnabled(false);
    }//GEN-LAST:event_jBtnEditarModeloActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        verificaPagina();
    }//GEN-LAST:event_formWindowClosed

    private void limparCampos() {
        txtModelo.setText("");
    }

    private void verificaPagina() {

        if ((this.telaMenu != null)) {
            this.telaMenu.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterarModelo;
    private javax.swing.JButton jBtnCadastrarModelo;
    private javax.swing.JButton jBtnCancelarAlterarModelo;
    private javax.swing.JButton jBtnCancelarCadModelo;
    private javax.swing.JButton jBtnEditarModelo;
    private javax.swing.JButton jBtnNovoModelo;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableListarModelo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtModelo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}