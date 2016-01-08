package telas;

import static funcoes.Conexao.getConnection;
import funcoes.ModeloTabela;
import atributos.Usuario;
import funcoes.UsuarioDAO;
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
 * @author WilhamJr
 */
public class ExibeUsuario extends javax.swing.JFrame {

    Statement stmt;
    Usuario usuario = new Usuario();
    private String opcaoPesquisa = "usuario";
    private static int indice;

    /**
     * Creates new form CadastroDeFuncionarios
     */
    public ExibeUsuario() {
        initComponents();
        TabelaUsuario("select * from tabUsuario;");
    }

    public static int GetIndice() {
        return indice;
    }

    public void TabelaUsuario(String Sql) {

        try {

            stmt = getConnection().createStatement();
            ArrayList dados = new ArrayList();
            String[] Colunas = {"Código do Usuário", "Tipo de Usuário", "Usuario"};

            ResultSet rs;
            rs = stmt.executeQuery(Sql);

            while (rs.next()) {

                dados.add(new Object[] {
                    rs.getObject("id_usuario"),
                    rs.getObject("tipo_usuario"),
                    rs.getObject("usuario")
                });
            }

            for (int i = 0; i < 3; i++) {
                
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
                jTableListarUsuarios.setModel(modelo);
                jTableListarUsuarios.getColumnModel().getColumn(i).setPreferredWidth(150);
                jTableListarUsuarios.getColumnModel().getColumn(i).setResizable(false);
                jTableListarUsuarios.getTableHeader().setReorderingAllowed(false);
                jTableListarUsuarios.setAutoResizeMode(jTableListarUsuarios.AUTO_RESIZE_OFF);
                jTableListarUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExibeUsuario.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListarUsuarios = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jBtnEditarUsuario = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jComboBoxOpcaoPesquisa = new javax.swing.JComboBox();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipoUser = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Usuários");

        jTableListarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableListarUsuarios);

        jButton3.setText("Novo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jBtnEditarUsuario.setText("Editar");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableListarUsuarios, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jBtnEditarUsuario, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jBtnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarUsuarioActionPerformed(evt);
            }
        });

        jButton6.setText("Excluir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Voltar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jComboBoxOpcaoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a opção de pesquisa", "Código", "Usuário" }));
        jComboBoxOpcaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcaoPesquisaActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setText("Pesquisar:");

        jComboBoxTipoUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Administrador", "Funcionario" }));
        jComboBoxTipoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUserActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(57, 57, 57)
                                .addComponent(jBtnEditarUsuario)
                                .addGap(67, 67, 67)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxOpcaoPesquisa, 0, 211, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTipoUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxOpcaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jBtnEditarUsuario)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(26, 26, 26))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (jTableListarUsuarios.getSelectedRow() != -1) {

            int linha = jTableListarUsuarios.getSelectedRow();
            usuario.setIdUser(Integer.parseInt(jTableListarUsuarios.getValueAt(linha, 0).toString()));

            int cod = UsuarioDAO.idUsuario(usuario.getIdUser());
            UsuarioDAO.ExcluirUsuario(cod);

        } else {
            JOptionPane.showMessageDialog(null, "Primeiro selecione um registro.");
        }
        
        TabelaUsuario("select * from tabUsuario;");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jBtnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarUsuarioActionPerformed

        if (jTableListarUsuarios.getSelectedRow() != -1) {
            
            this.dispose();
            int linha = jTableListarUsuarios.getSelectedRow();
            indice = (Integer.parseInt(jTableListarUsuarios.getValueAt(linha, 0).toString()));
            new AlterarUsuario().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Primeiro selecione um registro.");
        }
    }//GEN-LAST:event_jBtnEditarUsuarioActionPerformed

    private void jComboBoxOpcaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcaoPesquisaActionPerformed

        if (jComboBoxOpcaoPesquisa.getSelectedIndex() == 0) {
            TabelaUsuario("SELECT * FROM tabUsuario;");
        }

        switch (jComboBoxOpcaoPesquisa.getSelectedItem().toString()) {

            case "Código":
                opcaoPesquisa = "id_usuario";
                txtBuscar.setVisible(true);
                break;
            case "Usuário":
                opcaoPesquisa = "usuario";
                txtBuscar.setVisible(true);
                break;
        }
        
    }//GEN-LAST:event_jComboBoxOpcaoPesquisaActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        TabelaUsuario("SELECT * FROM tabusuario where " + opcaoPesquisa
                + " like '%" + txtBuscar.getText() + "%';");
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jComboBoxTipoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUserActionPerformed

        String tipoUser = "";
        
        switch (jComboBoxTipoUser.getSelectedItem().toString()) {
            
            case "Administrador":
                tipoUser = "A";
                break;
            case "Funcionário":
                tipoUser = "F";
                break;
        }
        
        if (jComboBoxTipoUser.getSelectedIndex() != 0) {

            TabelaUsuario("select  * from tabusuario where " + opcaoPesquisa
                + " like '%" + txtBuscar.getText() + "%' "
                + "and tipo_usuario = '" + tipoUser + "';");

        } else if (jComboBoxTipoUser.getSelectedIndex() == 0) {

            TabelaUsuario("select  * from tabusuario where " + opcaoPesquisa
                + " like '%" + txtBuscar.getText() + "%' ;");
        }
    }//GEN-LAST:event_jComboBoxTipoUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEditarUsuario;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBoxOpcaoPesquisa;
    private javax.swing.JComboBox jComboBoxTipoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableListarUsuarios;
    private javax.swing.JTextField txtBuscar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
