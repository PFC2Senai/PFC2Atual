package telas;

import atributos.DetEquipamentoCliente;
import atributos.Equipamento;
import funcoes.Conexao;
import funcoes.DetEquipamentoClienteDAO;
import funcoes.EquipamentoDAO;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josy
 */
public class CadastrarEquipCliente extends javax.swing.JFrame {

    private int codCliente;

    private int codEquipamento;
    private int codModeloEqui;
    private int codDetEquipamento;
    private String modeloEqui;
    private int codFabricanteEqui;
    private String equipamento;
    private String fabricanteEqui;
    private DetalharCliente telaDetCliente;

    private PreparedStatement pst;

    public CadastrarEquipCliente() {
        initComponents();
    }

    public CadastrarEquipCliente(int codCli, DetalharCliente detClie) {
        codCliente = codCli;
        this.telaDetCliente = detClie;
        initComponents();
        carregarComboEquipamento();
        combobox();
        ocultaColunaTabelas();
        // ocultaColunaTabelas();
    }

    private void combobox() {
        //Combobox equipamento
        uJComboBoxEquipamento.getEditor().getEditorComponent().addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (codEquipamento == 0 && uJComboBoxEquipamento.getSelectedIndex() != 0) {
                    JOptionPane.showMessageDialog(null, "Esse registro não encontra-se cadastrado na base de dados.");
                   // uJComboBoxEquipamento.getEditor().getEditorComponent().requestFocus();
                    uJComboBoxEquipamento.setSelectedIndex(0);
                }
            }
        });
        uJComboBoxEquipamento.setAutocompletar(true);
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

        jPanel5 = new javax.swing.JPanel();
        btnCadEquipCliente = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jBtnRemoveEquipamento = new javax.swing.JButton();
        jBtbIncluirEquipamento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEquipamento = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jComboBoxModeloEquip = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jComboBoxFabricanteEquip = new javax.swing.JComboBox();
        uJComboBoxEquipamento = new componentes.UJComboBox();
        jBtnNovoEquipamento = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(223, 237, 253));

        btnCadEquipCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/disk.png"))); // NOI18N
        btnCadEquipCliente.setText("Cadastrar");
        btnCadEquipCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEquipClienteActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(223, 237, 253));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11))); // NOI18N

        jLabel17.setText("Equipamento:");

        jBtnRemoveEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jBtnRemoveEquipamento.setText("Remover");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableEquipamento, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jBtnRemoveEquipamento, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jBtnRemoveEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoveEquipamentoActionPerformed(evt);
            }
        });

        jBtbIncluirEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jBtbIncluirEquipamento.setText("IncluirEquipamento");
        jBtbIncluirEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbIncluirEquipamentoActionPerformed(evt);
            }
        });

        jTableEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Id modelo", "Id fabricante", "Equipamento", "Modelo", "Fabricante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEquipamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableEquipamento);

        jLabel37.setText("Modelo:");

        jComboBoxModeloEquip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Modelo" }));
        jComboBoxModeloEquip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxModeloEquipItemStateChanged(evt);
            }
        });
        jComboBoxModeloEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModeloEquipActionPerformed(evt);
            }
        });

        jLabel38.setText("Fabricante:");

        jComboBoxFabricanteEquip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Fabricante" }));
        jComboBoxFabricanteEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFabricanteEquipActionPerformed(evt);
            }
        });

        uJComboBoxEquipamento.setEditable(true);
        uJComboBoxEquipamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                uJComboBoxEquipamentoItemStateChanged(evt);
            }
        });
        uJComboBoxEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uJComboBoxEquipamentoActionPerformed(evt);
            }
        });

        jBtnNovoEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/maquina02.png"))); // NOI18N
        jBtnNovoEquipamento.setText("Novo Equipamento");
        jBtnNovoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoEquipamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxFabricanteEquip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel37))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jComboBoxModeloEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(uJComboBoxEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jBtnNovoEquipamento))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnRemoveEquipamento)
                            .addComponent(jBtbIncluirEquipamento)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(uJComboBoxEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnNovoEquipamento))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jComboBoxModeloEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jComboBoxFabricanteEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtbIncluirEquipamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnRemoveEquipamento)
                .addContainerGap())
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/stop2.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar Equipamento do Cliente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(526, 526, 526)
                        .addComponent(btnCadEquipCliente)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadEquipCliente)
                    .addComponent(btnCancelar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadEquipClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEquipClienteActionPerformed
        
        if (VerificaEquipamentoTable() == true) {
            DetEquipamentoCliente detEqCli = new DetEquipamentoCliente();

            for (int j = 0; j < jTableEquipamento.getRowCount(); j++) {

                detEqCli.setCodEquipamento(Integer.parseInt(jTableEquipamento.getValueAt(j, 0).toString()));
                detEqCli.setCodCliente(codCliente);

                DetEquipamentoClienteDAO.CadEquipCliente(detEqCli);
            }
            telaDetCliente.TabelaEquipamentosCli();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            this.dispose();
        }
    }//GEN-LAST:event_btnCadEquipClienteActionPerformed

    private void jBtnRemoveEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoveEquipamentoActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION) == 0 ) {
            DefaultTableModel dtm = (DefaultTableModel) jTableEquipamento.getModel();
            int linha = jTableEquipamento.getSelectedRow();
            if (linha != -1) {
                dtm.removeRow(linha);
            }
        }
    }//GEN-LAST:event_jBtnRemoveEquipamentoActionPerformed

    private void jBtbIncluirEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbIncluirEquipamentoActionPerformed
        if (VerificaCampos() == true) {
            TabelaEquipamento();
        }
    }//GEN-LAST:event_jBtbIncluirEquipamentoActionPerformed

    private void jComboBoxModeloEquipItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxModeloEquipItemStateChanged

        jComboBoxFabricanteEquip.removeAllItems();
        idModeloEquiComboBox();
        populaComboBoxFabricanteEquip();
        if (jComboBoxModeloEquip.getSelectedItem() != null) {
            modeloEqui = jComboBoxModeloEquip.getSelectedItem().toString();
        }
    }//GEN-LAST:event_jComboBoxModeloEquipItemStateChanged

    private void jComboBoxModeloEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModeloEquipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxModeloEquipActionPerformed

    private void jComboBoxFabricanteEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFabricanteEquipActionPerformed

        idFabricanteEquiComboBox();
        if (jComboBoxFabricanteEquip.getSelectedItem() != null) {
            fabricanteEqui = jComboBoxFabricanteEquip.getSelectedItem().toString();
        }
    }//GEN-LAST:event_jComboBoxFabricanteEquipActionPerformed

    private void uJComboBoxEquipamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_uJComboBoxEquipamentoItemStateChanged

        jComboBoxModeloEquip.removeAllItems();
        jComboBoxFabricanteEquip.removeAllItems();
        codModeloEqui = 0;
        modeloEqui = null;
        codFabricanteEqui = 0;
        fabricanteEqui = null;
        codEquipamento = 0;
        idEquipamentoComboBox();
        populaComboBoxModeloEqui();
        if (uJComboBoxEquipamento.getSelectedItem() != null) {
            equipamento = uJComboBoxEquipamento.getSelectedItem().toString();
        }
    }//GEN-LAST:event_uJComboBoxEquipamentoItemStateChanged

    private void uJComboBoxEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uJComboBoxEquipamentoActionPerformed
        idEquipamentoComboBox();
        if (uJComboBoxEquipamento.getSelectedItem() != null) {
            equipamento = uJComboBoxEquipamento.getSelectedItem().toString();
        }
    }//GEN-LAST:event_uJComboBoxEquipamentoActionPerformed

    private void jBtnNovoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoEquipamentoActionPerformed
        this.setEnabled(false);
        new CadastrarEquipamento(this).setVisible(true);
    }//GEN-LAST:event_jBtnNovoEquipamentoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair? Os dados não serão salvos.", "Confirmar Cancelamento", JOptionPane.YES_NO_OPTION) == 0 ) {
            verificaPagina();
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        verificaPagina();
    }//GEN-LAST:event_formWindowClosed

    private boolean VerificaEquipamentoTable() {

        boolean valida = true;

        if (jTableEquipamento.getRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "Adicione um equipamento na Tabela!");
            valida = false;
            return valida;
        }
        return valida;
    }
    
    private boolean VerificaCampos() {

        boolean valida = true;
       
        if (uJComboBoxEquipamento.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campo(s) vazio(s)!");
            valida = false;
            return valida;
        }
        
        return valida;
    }

    public void ComboEquipamento(String item) {
        uJComboBoxEquipamento.setSelectedItem(item);
    }

    public void TabelaEquipamento() {

        codDetEquipamento = EquipamentoDAO.CodigoDetEquipamento(codEquipamento, codModeloEqui, codFabricanteEqui);

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTableEquipamento.getModel();

            dtm.addRow(new Object[]{codDetEquipamento,
                codModeloEqui,
                codFabricanteEqui,
                equipamento,
                modeloEqui,
                fabricanteEqui});

        } catch (Exception erro) {
            Logger.getLogger(CadastrarCliente.class
                    .getName()).log(Level.SEVERE, null, erro);
        }
    }

    public void carregarComboEquipamento() {

        uJComboBoxEquipamento.removeAllItems();

        ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
        equipamentos = EquipamentoDAO.ListarEquipamentos();

        uJComboBoxEquipamento.addItem("Selecione o equipamento");
        for (Equipamento equi : equipamentos) {
            uJComboBoxEquipamento.addItem(equi.getEquipamento(), equi);
        }
    }

    private void populaComboBoxModeloEqui() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select modelo "
                + " from tabdetequipamento inner join "
                + " tabequipamento inner join "
                + " tabmodelo on tabmodelo_idtabModelo = idtabModelo and "
                + " tabequipamento_idEquipamento = idEquipamento"
                + " where idEquipamento = " + codEquipamento + " group by modelo;";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                jComboBoxModeloEquip.addItem(rs.getString("modelo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void idModeloEquiComboBox() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabmodelo where modelo = '" + jComboBoxModeloEquip.getSelectedItem() + "';";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                codModeloEqui = (rs.getInt("idtabModelo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void idEquipamentoComboBox() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabequipamento where equipamento = '" + uJComboBoxEquipamento.getSelectedItem() + "';";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                codEquipamento = (rs.getInt("idEquipamento"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void populaComboBoxFabricanteEquip() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "SELECT * FROM vw_combofabricanteequipamento "
                + " WHERE idEquipamento = " + codEquipamento
                + " AND tabmodelo_idtabModelo = " + codModeloEqui + " group by fabricante;";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                jComboBoxFabricanteEquip.addItem(rs.getString("fabricante"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void idFabricanteEquiComboBox() {

        Connection conexao = Conexao.getConnection();
        ResultSet rs;
        String sql = "select * from tabfabricante where fabricante = '" + jComboBoxFabricanteEquip.getSelectedItem() + "';";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                codFabricanteEqui = (rs.getInt("idtabFabricante"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void ocultaColunaTabelas() {        
        //oculta coluna equipamento
        jTableEquipamento.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableEquipamento.getColumnModel().getColumn(0).setMinWidth(0);
        jTableEquipamento.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        jTableEquipamento.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);

        jTableEquipamento.getColumnModel().getColumn(1).setMaxWidth(0);
        jTableEquipamento.getColumnModel().getColumn(1).setMinWidth(0);
        jTableEquipamento.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        jTableEquipamento.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);

        jTableEquipamento.getColumnModel().getColumn(2).setMaxWidth(0);
        jTableEquipamento.getColumnModel().getColumn(2).setMinWidth(0);
        jTableEquipamento.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        jTableEquipamento.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
    }

    private void verificaPagina() {

        if ((this.telaDetCliente != null)) {
            this.telaDetCliente.setEnabled(true);
            this.telaDetCliente.toFront();
        }
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadEquipCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jBtbIncluirEquipamento;
    private javax.swing.JButton jBtnNovoEquipamento;
    private javax.swing.JButton jBtnRemoveEquipamento;
    private javax.swing.JComboBox jComboBoxFabricanteEquip;
    private javax.swing.JComboBox jComboBoxModeloEquip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEquipamento;
    private componentes.UJComboBox uJComboBoxEquipamento;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
