package telas;

import atributos.Endereco;
import atributos.Fornecedor;
import atributos.PessoaContato;
import atributos.Telefone;
import static atributos.Usuario.idUsuario;
import funcoes.CarregaCEP;
import funcoes.ContatosDAO;
import funcoes.FornecedorDAO;
import funcoes.LimitarDigitos;
import funcoes.PessoaContatoDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrarFornecedor extends javax.swing.JFrame {

    private CadastrarProduto telaCadastrarProduto;
    private CadastrarFornecedor telaForn;

    /**
     * Creates new form CadastrarFornecedor
     */
    public CadastrarFornecedor() {
        this.telaCadastrarProduto = null;
        telaForn = this;
        initComponents();

//        txtFornecedor.setDocument(new LimitarDigitos(45));
//        txtEstado.setDocument(new LimitarDigitos(45));
//        txtCidade.setDocument(new LimitarDigitos(45));
//        txtBairro.setDocument(new LimitarDigitos(45));
//        txtRua.setDocument(new LimitarDigitos(45));
//        txtNumero.setDocument(new LimitarDigitos(10));
//        
//        txtContato.setDocument(new LimitarDigitos(45));
//        txtEmail.setDocument(new LimitarDigitos(45));
//        txtTelCel.setDocument(new LimitarDigitos(25));
//        
    }

    public CadastrarFornecedor(CadastrarProduto telaCadProduto) {
        this.telaCadastrarProduto = telaCadProduto;
        telaForn = this;
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        btnCadFornecedor = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jBtnCarregaCep = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        jBtnOutroContato = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTel01 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTelCel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContatos = new javax.swing.JTable();
        jBtnRemoverContato = new javax.swing.JButton();
        jLabelEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(223, 237, 253));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar fornecedor");

        btnCadFornecedor.setText("Cadastrar");
        btnCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadFornecedorActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(223, 237, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Gerais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11))); // NOI18N

        jLabel14.setText("Cidade:");

        jLabel2.setText("CEP:");

        jLabel3.setText("Fornecedor:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        jLabel11.setText("Rua:");

        jLabel15.setText("Estado:");

        jLabel12.setText("Nº");

        jLabel8.setText("Bairro:");

        jLabel10.setText("País:");

        txtPais.setText("Brasil");

        jBtnCarregaCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.gif"))); // NOI18N
        jBtnCarregaCep.setText("Buscar");
        jBtnCarregaCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCarregaCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(48, 48, 48)
                                .addComponent(txtRua))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(33, 33, 33)
                                .addComponent(txtCidade)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFornecedor))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(48, 48, 48)
                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnCarregaCep))
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCarregaCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(223, 237, 253));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contatos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11))); // NOI18N

        jLabel5.setText("Contato:");

        jBtnOutroContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jBtnOutroContato.setText("Adicionar contato");
        jBtnOutroContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOutroContatoActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefone:");

        try {
            txtTel01.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setText("Celular:");

        jLabel9.setText("Email:");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jTableContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Contato", "Telefone", "Celular", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableContatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableContatos);

        jBtnRemoverContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jBtnRemoverContato.setText("Remover contato");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableContatos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jBtnRemoverContato, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jBtnRemoverContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverContatoActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnRemoverContato))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnOutroContato))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContato, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(txtEmail))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTel01, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnOutroContato)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jBtnRemoverContato)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(36, 36, 36)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadFornecedor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadFornecedor)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnLimpar)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFornecedorActionPerformed

        if (FornecedorDAO.VerificarFornecedor(txtFornecedor.getText()) == false) {

            Fornecedor forn = new Fornecedor();
            Telefone tel = new Telefone();
            Endereco endereco = new Endereco();
            PessoaContato pContato = new PessoaContato();
            String email;

            forn.setFornecedor(txtFornecedor.getText());
            forn.setCodUsuario(idUsuario());
            tel.setTel(txtTel01.getText());
            tel.setCel(txtTelCel.getText());

            int i = ContatosDAO.CadContato();

            forn.setCodContato(i);

            int codForn = FornecedorDAO.CadFornecedor(forn);

            endereco.setPais(txtPais.getText());
            endereco.setCep(txtCep.getText());
            endereco.setRua(txtRua.getText());
            endereco.setNumero(txtNumero.getText());
            endereco.setBairro(txtBairro.getText());
            endereco.setCidade(txtCidade.getText());
            endereco.setEstado(txtEstado.getText());
            endereco.setIdContato(i);

            ContatosDAO.CadEndereco(endereco);

            for (int j = 0; j < jTableContatos.getRowCount(); j++) {

                pContato.setNomeContato(jTableContatos.getValueAt(j, 0).toString());
                tel.setTel(jTableContatos.getValueAt(j, 1).toString());
                tel.setCel(jTableContatos.getValueAt(j, 2).toString());
                email = jTableContatos.getValueAt(j, 3).toString();

                int codContato = ContatosDAO.CadContato();

                ContatosDAO.CadTel(codContato, tel);
                ContatosDAO.CadEmail(codContato, email);
                pContato.setCodTabEstrangeira(codForn);
                pContato.setCodContato(codContato);

                PessoaContatoDAO.CadPesContatoFornecedor(pContato);
            }

            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Fornecedor ja cadastrado");
        }
    }//GEN-LAST:event_btnCadFornecedorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jBtnOutroContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOutroContatoActionPerformed

        TabelaContatos();
    }//GEN-LAST:event_jBtnOutroContatoActionPerformed

    private void jBtnRemoverContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverContatoActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTableContatos.getModel();
        int linha = jTableContatos.getSelectedRow();

        if (linha != -1) {
            dtm.removeRow(linha);
        }
    }//GEN-LAST:event_jBtnRemoverContatoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        if (telaCadastrarProduto != null) {
            telaCadastrarProduto.populaComboBoxFornecedor();
        }
    }//GEN-LAST:event_formWindowClosed

    private void jBtnCarregaCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCarregaCepActionPerformed
        CarregaCEP();
    }//GEN-LAST:event_jBtnCarregaCepActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        CarregaCEP();
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        ValidaEmail();
    }//GEN-LAST:event_txtEmailFocusLost

    public void TabelaContatos() {

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTableContatos.getModel();

            dtm.addRow(new Object[]{txtContato.getText(), txtTel01.getText(), txtTelCel.getText(), txtEmail.getText()});

            txtContato.setText("");
            txtTel01.setText(null);
            txtTelCel.setText(null);
            txtEmail.setText("");
            txtContato.requestFocus();

        } catch (Exception erro) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    private void limparCampos() {

        txtFornecedor.setText("");
        txtTel01.setText("");
        txtTelCel.setText("");
        txtEmail.setText("");
        txtPais.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtEstado.setText("");
        txtRua.setText("");
        ((DefaultTableModel) jTableContatos.getModel()).setNumRows(0);
        jTableContatos.updateUI();
    }

    public void ValidaEmail() {

        if ((txtEmail.getText().contains("@"))
                && (txtEmail.getText().contains("."))
                && (!txtEmail.getText().contains(" "))) {

            String usuario = new String(txtEmail.getText().substring(0,
                    txtEmail.getText().lastIndexOf('@')));

            String dominio = new String(txtEmail.getText().substring(txtEmail.getText().lastIndexOf('@') + 1, txtEmail.getText().length()));

            if ((usuario.length() >= 1) && (!usuario.contains("@"))
                    && (dominio.contains(".")) && (!dominio.contains("@")) && (dominio.indexOf(".")
                    >= 1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {

                jLabelEmail.setText("");

            } else {

                jLabelEmail.setText("E-mail Inválido");

                txtEmail.requestFocus();

            }

        } else {

            jLabelEmail.setText("E-mail Inválido");

            txtEmail.requestFocus();

        }
    }
    
    private void CarregaCEP(){
        TelaEspera telaTeste = new TelaEspera();
        this.setEnabled(false);
        final Thread t1 = new Thread(new Runnable() {//cria uma thread pra gravar o seu arquivo

            @Override
            public void run() {

                try {

                    telaTeste.setVisible(true);
                    CarregaCEP cep = new CarregaCEP();

                    String ceptxt = txtCep.getText();
                    txtCidade.setText(cep.getCidade(ceptxt));
                    txtBairro.setText(cep.getBairro(ceptxt));
                    txtRua.setText(cep.getEndereco(ceptxt));
                    txtEstado.setText(cep.getUF(ceptxt));

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
        t1.start();
        new Thread(new Runnable() {//cria outra thread pra sua tela de espera
            @Override
            public void run() {
                try {
                    //cria a tela de espera e mostra ela
                    t1.join();//fica esperando a primeira thread acabar
                    telaForn.setEnabled(true);  // quando acabar fecha a janela de espera, podes fazer outras coisas aqui
                    telaTeste.dispose();
                } catch (InterruptedException ex) {
                    Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadFornecedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jBtnCarregaCep;
    private javax.swing.JButton jBtnOutroContato;
    private javax.swing.JButton jBtnRemoverContato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContatos;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTel01;
    private javax.swing.JTextField txtTelCel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
