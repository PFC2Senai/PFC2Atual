package telas;

import atributos.Setor;
import static funcoes.Conexao.getConnection;
import funcoes.ModeloTabela;
import funcoes.SetorDAO;
import funcoes.TabelaZebrada;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Josy
 */
public class OperacoesSegmento extends javax.swing.JFrame {

    Statement stmt;
    private static int indice;
    private Menu telaMenu;

    public OperacoesSegmento() {
        initComponents();
        TabelaSetor("SELECT * FROM tabsetor;");
        ocultaCampos();
    }
    
    public OperacoesSegmento(Menu menu) {
        this.telaMenu = menu;
        initComponents();
        TabelaSetor("SELECT * FROM tabsetor;");
        ocultaCampos();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarSetores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBtnSair = new javax.swing.JButton();
        txtSetor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jBtnCancelarCadSegmento = new javax.swing.JButton();
        jBtnCadastrarSegmento = new javax.swing.JButton();
        jBtnNovoSegmento = new javax.swing.JButton();
        jBtnEditarSegmento = new javax.swing.JButton();
        jBtnCancelarAlterarSegmento = new javax.swing.JButton();
        jBtnAlterarSegmento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SEGMENTO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 590, 260));

        jLabel3.setText("Segmento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        jLabel1.setText("SEGMENTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jBtnSair.setText("Voltar");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        txtSetor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtSetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 320, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.gif"))); // NOI18N
        jLabel2.setText("Pesquisar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 310, -1));

        jBtnCancelarCadSegmento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelarCadSegmento.setText("Cancelar");
        jBtnCancelarCadSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarCadSegmentoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelarCadSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, -1, -1));

        jBtnCadastrarSegmento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jBtnCadastrarSegmento.setText("Salvar");
        jBtnCadastrarSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarSegmentoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCadastrarSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        jBtnNovoSegmento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page.png"))); // NOI18N
        jBtnNovoSegmento.setText("Novo");
        jBtnNovoSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoSegmentoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnNovoSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jBtnEditarSegmento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jBtnEditarSegmento.setText("Editar");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableListarSetores, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jBtnEditarSegmento, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jBtnEditarSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarSegmentoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnEditarSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        jBtnCancelarAlterarSegmento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelarAlterarSegmento.setText("Cancelar");
        jBtnCancelarAlterarSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarAlterarSegmentoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelarAlterarSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, -1, -1));

        jBtnAlterarSegmento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jBtnAlterarSegmento.setText("Salvar");
        jBtnAlterarSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarSegmentoActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAlterarSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leiaute/img3-5.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableListarSetoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarSetoresMouseClicked
        int linha = jTableListarSetores.getSelectedRow();
        if (linha != -1) {
            txtSetor.setText(jTableListarSetores.getValueAt(linha, 1).toString());
            indice = Integer.parseInt(jTableListarSetores.getValueAt(linha, 0).toString());
        }

    }//GEN-LAST:event_jTableListarSetoresMouseClicked

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        verificaPagina();
        this.dispose();        
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        TabelaSetor("select  * from tabsetor where setor "
                + "like '%" + txtBuscar.getText().trim() + "%';");

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jBtnCancelarCadSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarCadSegmentoActionPerformed

        txtSetor.setText("");
        txtSetor.setEnabled(false);
        limparCampos();
        jBtnCancelarCadSegmento.setVisible(false);
        jBtnCadastrarSegmento.setVisible(false);
        jBtnNovoSegmento.setVisible(true);
        jTableListarSetores.setEnabled(true);
    }//GEN-LAST:event_jBtnCancelarCadSegmentoActionPerformed

    private void jBtnCadastrarSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarSegmentoActionPerformed
        Setor setor = new Setor();
        setor.setSetor(txtSetor.getText());
        SetorDAO.CadSetor(setor);
        limparCampos();
        TabelaSetor("SELECT * FROM tabsetor;");
        jBtnCadastrarSegmento.setVisible(false);
        jBtnCancelarCadSegmento.setVisible(false);
        jBtnNovoSegmento.setVisible(true);
        jTableListarSetores.setEnabled(true);
        txtSetor.setText("");
        txtSetor.setEnabled(false);
    }//GEN-LAST:event_jBtnCadastrarSegmentoActionPerformed

    private void jBtnNovoSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoSegmentoActionPerformed
        jTableListarSetores.getSelectionModel().clearSelection();
        txtSetor.setText("");
        txtSetor.setEnabled(true);
        jBtnCadastrarSegmento.setVisible(true);
        jBtnCancelarCadSegmento.setVisible(true);
        jBtnNovoSegmento.setVisible(false);

        jBtnEditarSegmento.setEnabled(false);
        jTableListarSetores.setEnabled(false);
    }//GEN-LAST:event_jBtnNovoSegmentoActionPerformed

    private void jBtnEditarSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarSegmentoActionPerformed
        txtSetor.setEnabled(true);
        jBtnEditarSegmento.setVisible(false);
        jBtnCancelarAlterarSegmento.setVisible(true);
        jBtnAlterarSegmento.setVisible(true);
        jBtnNovoSegmento.setEnabled(false);
    }//GEN-LAST:event_jBtnEditarSegmentoActionPerformed

    private void jBtnCancelarAlterarSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarAlterarSegmentoActionPerformed
        txtSetor.setText("");
        txtSetor.setEnabled(false);
        jTableListarSetores.getSelectionModel().clearSelection();
        limparCampos();
        jBtnAlterarSegmento.setVisible(false);
        jBtnCancelarAlterarSegmento.setVisible(false);
        jBtnEditarSegmento.setVisible(true);
        jBtnNovoSegmento.setEnabled(true);
    }//GEN-LAST:event_jBtnCancelarAlterarSegmentoActionPerformed

    private void jBtnAlterarSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarSegmentoActionPerformed
        Setor setor = new Setor();
        setor.setSetor(txtSetor.getText());
        SetorDAO.UpdateSetor(setor, indice);
       
        jBtnAlterarSegmento.setVisible(false);
        jBtnCancelarAlterarSegmento.setVisible(false);
        jBtnEditarSegmento.setVisible(true);
        jBtnNovoSegmento.setEnabled(true);
        txtSetor.setText("");
        txtSetor.setEnabled(false);
        TabelaSetor("SELECT * FROM tabsetor;");
    }//GEN-LAST:event_jBtnAlterarSegmentoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        verificaPagina();
    }//GEN-LAST:event_formWindowClosed

    private void ocultaCampos() {
        jBtnCadastrarSegmento.setVisible(false);
        jBtnAlterarSegmento.setVisible(false);
        jBtnCancelarCadSegmento.setVisible(false);
        jBtnCancelarAlterarSegmento.setVisible(false);
        txtSetor.setEnabled(false);
    }

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
                jTableListarSetores.setDefaultRenderer(Object.class, new TabelaZebrada());

                jTableListarSetores.getColumnModel().getColumn(0).setMaxWidth(0);
                jTableListarSetores.getColumnModel().getColumn(0).setMinWidth(0);
                jTableListarSetores.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                jTableListarSetores.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);

                jTableListarSetores.getColumnModel().getColumn(1).setPreferredWidth(200);

                jTableListarSetores.getColumnModel().getColumn(i).setResizable(false);
                jTableListarSetores.getTableHeader().setReorderingAllowed(false);
                jTableListarSetores.setAutoResizeMode(jTableListarSetores.AUTO_RESIZE_OFF);
                jTableListarSetores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        } catch (SQLException ex) {
            Logger.getLogger(OperacoesSegmento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limparCampos() {
        txtSetor.setText("");
        txtSetor.setEnabled(false);
    }
    
    private void verificaPagina() {

        if ((this.telaMenu != null)) {
            this.telaMenu.setVisible(true);
            // this.telaMenu.toFront();
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterarSegmento;
    private javax.swing.JButton jBtnCadastrarSegmento;
    private javax.swing.JButton jBtnCancelarAlterarSegmento;
    private javax.swing.JButton jBtnCancelarCadSegmento;
    private javax.swing.JButton jBtnEditarSegmento;
    private javax.swing.JButton jBtnNovoSegmento;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarSetores;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtSetor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
