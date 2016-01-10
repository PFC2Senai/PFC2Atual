package telas;

import static funcoes.Conexao.getConnection;
import funcoes.ModeloTabela;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Josy
 */
public class ExibeAluguel2 extends javax.swing.JFrame {

    Statement stmt;

    private int dataPesquisa;
    String opcaoPesquisa = "empresa";

    /**
     * Creates new form ExibeAluguel2
     */
    public ExibeAluguel2() {
        initComponents();
        TabelaAluguel("SELECT * FROM vw_aluguel;");
        txtDatapesquisa.setVisible(false);
    }

    public void TabelaAluguel(String Sql) {

        try {

            stmt = getConnection().createStatement();
            ArrayList dados = new ArrayList();
            String[] Colunas = {"Código", "Cliente", "Data de Locação", "Data de Devolução"};

            ResultSet rs;
            rs = stmt.executeQuery(Sql);

            while (rs.next()) {
                dados.add(new Object[]{rs.getObject("idtabDetLocacao"), rs.getObject("empresa"),
                    rs.getObject("dataLocacao"), rs.getObject("dataDevolucao")});
            }

            for (int i = 0; i < 4; i++) {
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
                jTableListarAluguel.setModel(modelo);
                jTableListarAluguel.getColumnModel().getColumn(i).setPreferredWidth(150);
                jTableListarAluguel.getColumnModel().getColumn(i).setResizable(false);
                jTableListarAluguel.getTableHeader().setReorderingAllowed(false);
                jTableListarAluguel.setAutoResizeMode(jTableListarAluguel.AUTO_RESIZE_OFF);
                jTableListarAluguel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExibeAluguel2.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception erro) {
            Logger.getLogger(ExibeAluguel2.class.getName()).log(Level.SEVERE, null, erro);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarAluguel = new javax.swing.JTable();
        jBtnDetalhar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxOpcaoPesquisa = new javax.swing.JComboBox();
        txtDatapesquisa = new com.toedter.calendar.JDateChooser();
        txtBuscar = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableListarAluguel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListarAluguel);

        jBtnDetalhar.setText("Detalhar");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableListarAluguel, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jBtnDetalhar, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jBtnDetalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDetalharActionPerformed(evt);
            }
        });

        jLabel1.setText("Aluguel");

        jLabel2.setText("Pesquisar:");

        jComboBoxOpcaoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a opção de pesquisa", "Código", "Data de Locação", "Data de Devolução", "Empresa" }));
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

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxOpcaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDatapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnBuscar))
                            .addComponent(jBtnDetalhar))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jComboBoxOpcaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDatapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnDetalhar)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnDetalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDetalharActionPerformed
        int linha = jTableListarAluguel.getSelectedRow();
        int idAluguel = (Integer.parseInt(jTableListarAluguel.getValueAt(linha, 0).toString()));
        new DetalharAluguel(idAluguel).setVisible(true);
    }//GEN-LAST:event_jBtnDetalharActionPerformed

    private void jComboBoxOpcaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcaoPesquisaActionPerformed

        switch (jComboBoxOpcaoPesquisa.getSelectedItem().toString()) {
            case "Código":
                opcaoPesquisa = "idtabDetLocacao";
                txtDatapesquisa.setVisible(false);
                txtBuscar.setVisible(true);
                dataPesquisa = 0;
                break;
            case "Empresa":
                opcaoPesquisa = "empresa";
                txtDatapesquisa.setVisible(false);
                txtBuscar.setVisible(true);
                dataPesquisa = 0;
                break;
            case "Data de Locação":
                opcaoPesquisa = "dataLocacao";
                dataPesquisa = 1;
                txtDatapesquisa.setVisible(true);
                txtBuscar.setVisible(false);
                break;
            case "Data de Devolução":
                opcaoPesquisa = "dataDevolucao";
                txtDatapesquisa.setVisible(true);
                dataPesquisa = 1;
                txtBuscar.setVisible(false);
                break;
        }
        
        if (jComboBoxOpcaoPesquisa.getSelectedIndex() == 0) {
            TabelaAluguel("SELECT * FROM vw_aluguel;");
        }
    }//GEN-LAST:event_jComboBoxOpcaoPesquisaActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
       
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
        
        String dt1 = formatador.format(txtDatapesquisa.getDate());
        
        TabelaAluguel("SELECT * FROM vw_aluguel where " + opcaoPesquisa
                + " like '%" + dt1 + "%';");
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
        TabelaAluguel("SELECT * FROM vw_aluguel where " + opcaoPesquisa
                + " like '%" + txtBuscar.getText() + "%';");
    }//GEN-LAST:event_txtBuscarKeyReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnDetalhar;
    private javax.swing.JComboBox jComboBoxOpcaoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarAluguel;
    private javax.swing.JTextField txtBuscar;
    private com.toedter.calendar.JDateChooser txtDatapesquisa;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}