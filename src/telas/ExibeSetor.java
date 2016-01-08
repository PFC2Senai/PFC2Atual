package telas;


import atributos.Setor;
import static funcoes.Conexao.getConnection;
import funcoes.ModeloTabela;
import funcoes.SetorDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;


public class ExibeSetor extends javax.swing.JFrame {

    Statement stmt ;
    private static int indice;
    /**
     * Creates new form ExibeSetor
     */
    public ExibeSetor() {
        initComponents();
        TabelaSetor("SELECT * FROM tabsetor;");
        ocultaCampos();
    }
    
    private void ocultaCampos() {
        jBtnCadastrarSetor.setVisible(false);
        jBtnAlterarSetor.setVisible(false);
        jBtnCancelarCadSetor.setVisible(false);
        jBtnCancelarAlterarSetor.setVisible(false);
        txtSetor.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @return 
     */
    
    public static int GetIndiceSetor() {         
        return indice;
    }
    
    public void TabelaSetor(String Sql) {

        try {
            stmt = getConnection().createStatement();
            ArrayList dados = new ArrayList();
            String[] Colunas = {"Código", "Setor"};

            ResultSet rs;
            rs = stmt.executeQuery(Sql);

            while (rs.next()) {
                dados.add(new Object[]{rs.getObject("idtabSetor"), rs.getObject("setor")});
            }

            for (int i = 0; i < 2; i++) {
                
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
                jTableListarSetores.setModel(modelo);
                jTableListarSetores.getColumnModel().getColumn(i).setPreferredWidth(150);
                jTableListarSetores.getColumnModel().getColumn(i).setResizable(false);
                jTableListarSetores.getTableHeader().setReorderingAllowed(false);
                jTableListarSetores.setAutoResizeMode(jTableListarSetores.AUTO_RESIZE_OFF);
                jTableListarSetores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExibeModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarSetores = new javax.swing.JTable();
        jBtnAlterarSetor = new javax.swing.JButton();
        jBtnNovoSetor = new javax.swing.JButton();
        jBtnCadastrarSetor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBtnExcluirSetor = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jBtnEditarSetor = new javax.swing.JButton();
        txtSetor = new javax.swing.JTextField();
        jBtnCancelarAlterarSetor = new javax.swing.JButton();
        jBtnCancelarCadSetor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 252, 230));

        jTableListarSetores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Setor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListarSetores.getTableHeader().setReorderingAllowed(false);
        jTableListarSetores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarSetoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarSetores);
        if (jTableListarSetores.getColumnModel().getColumnCount() > 0) {
            jTableListarSetores.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTableListarSetores.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        jBtnAlterarSetor.setText("Alterar");
        jBtnAlterarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarSetorActionPerformed(evt);
            }
        });

        jBtnNovoSetor.setText("Novo");
        jBtnNovoSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoSetorActionPerformed(evt);
            }
        });

        jBtnCadastrarSetor.setText("Cadastrar");
        jBtnCadastrarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarSetorActionPerformed(evt);
            }
        });

        jLabel3.setText("Setor:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Setores");

        jBtnExcluirSetor.setText("Excluir");
        jBtnExcluirSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirSetorActionPerformed(evt);
            }
        });

        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jBtnEditarSetor.setText("Editar");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableListarSetores, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jBtnEditarSetor, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jBtnEditarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarSetorActionPerformed(evt);
            }
        });

        jBtnCancelarAlterarSetor.setText("Cancelar");
        jBtnCancelarAlterarSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarAlterarSetorActionPerformed(evt);
            }
        });

        jBtnCancelarCadSetor.setText("Cancelar");
        jBtnCancelarCadSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarCadSetorActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnExcluirSetor)
                            .addComponent(jBtnEditarSetor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnNovoSetor)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jBtnAlterarSetor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtnCancelarAlterarSetor))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtnCadastrarSetor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnCancelarCadSetor)
                                        .addGap(2, 2, 2))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBtnSair)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnNovoSetor)
                    .addComponent(jBtnCadastrarSetor)
                    .addComponent(jBtnCancelarCadSetor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEditarSetor)
                    .addComponent(jBtnAlterarSetor)
                    .addComponent(jBtnCancelarAlterarSetor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnExcluirSetor)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnCadastrarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarSetorActionPerformed
        
        Setor setor = new Setor();
        setor.setSetor(txtSetor.getText());
        SetorDAO.CadSetor(setor);
        limparCampos();
        TabelaSetor("SELECT * FROM tabsetor;");
        jBtnCadastrarSetor.setVisible(false);
        jBtnCancelarCadSetor.setVisible(false);
        jBtnNovoSetor.setVisible(true);
    }//GEN-LAST:event_jBtnCadastrarSetorActionPerformed

    private void jBtnExcluirSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirSetorActionPerformed

        SetorDAO.ExcluirSetor(indice);  
        TabelaSetor("SELECT * FROM tabsetor;");
        limparCampos();
    }//GEN-LAST:event_jBtnExcluirSetorActionPerformed

    private void jBtnAlterarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarSetorActionPerformed
        
        Setor setor = new Setor();        
        setor.setSetor(txtSetor.getText());
        SetorDAO.UpdateSetor(setor, indice);
        TabelaSetor("SELECT * FROM tabsetor;");
        limparCampos();
        jBtnAlterarSetor.setVisible(false);
        jBtnCancelarAlterarSetor.setVisible(false);
        jBtnEditarSetor.setVisible(true);
        
    }//GEN-LAST:event_jBtnAlterarSetorActionPerformed

    private void jTableListarSetoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarSetoresMouseClicked

        int linha = jTableListarSetores.getSelectedRow();
        txtSetor.setText(jTableListarSetores.getValueAt(linha, 1).toString());        
        indice = Integer.parseInt(jTableListarSetores.getValueAt(linha, 0).toString());
        
    }//GEN-LAST:event_jTableListarSetoresMouseClicked

    private void jBtnNovoSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoSetorActionPerformed
        
        txtSetor.setText("");
        txtSetor.setEnabled(true);
        jBtnCadastrarSetor.setVisible(true);
        jBtnCancelarCadSetor.setVisible(true);
        jBtnNovoSetor.setVisible(false);
        
    }//GEN-LAST:event_jBtnNovoSetorActionPerformed

    private void jBtnEditarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarSetorActionPerformed
        
        txtSetor.setEnabled(true);
        jBtnEditarSetor.setVisible(false);
        jBtnCancelarAlterarSetor.setVisible(true);
        jBtnAlterarSetor.setVisible(true);
    }//GEN-LAST:event_jBtnEditarSetorActionPerformed

    private void jBtnCancelarCadSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarCadSetorActionPerformed
        
        limparCampos();
        jBtnCancelarCadSetor.setVisible(false);
        jBtnCadastrarSetor.setVisible(false);
        jBtnNovoSetor.setVisible(true);
    }//GEN-LAST:event_jBtnCancelarCadSetorActionPerformed

    private void jBtnCancelarAlterarSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarAlterarSetorActionPerformed
        
        jTableListarSetores.getSelectionModel().clearSelection();
        limparCampos();
        jBtnAlterarSetor.setVisible(false);
        jBtnCancelarAlterarSetor.setVisible(false);
        jBtnEditarSetor.setVisible(true);
        
    }//GEN-LAST:event_jBtnCancelarAlterarSetorActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
        TabelaSetor("select  * from tabsetor where setor "
            + "like '%" + txtBuscar.getText() + "%';");
        
    }//GEN-LAST:event_txtBuscarKeyReleased
   
    private void limparCampos() {       
        txtSetor.setText("");
        txtSetor.setEnabled(false);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterarSetor;
    private javax.swing.JButton jBtnCadastrarSetor;
    private javax.swing.JButton jBtnCancelarAlterarSetor;
    private javax.swing.JButton jBtnCancelarCadSetor;
    private javax.swing.JButton jBtnEditarSetor;
    private javax.swing.JButton jBtnExcluirSetor;
    private javax.swing.JButton jBtnNovoSetor;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarSetores;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtSetor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
