package telas;

import funcoes.ControleBackup;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author 015365
 */
public class Menu extends javax.swing.JFrame {

    private String caminho;
    private Menu telaMenu;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        telaMenu = this;
        jBtnRotinaContato.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBtnRotinaContato.setHorizontalTextPosition(SwingConstants.CENTER);
        jBtnCadastrarLembrete.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBtnCadastrarLembrete.setHorizontalTextPosition(SwingConstants.CENTER);
        jBtnProposta.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBtnProposta.setHorizontalTextPosition(SwingConstants.CENTER);
        jBtnFazerBackup.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBtnFazerBackup.setHorizontalTextPosition(SwingConstants.CENTER);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnRotinaContato = new javax.swing.JButton();
        jBtnCadastrarLembrete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBtnProposta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jBtnFazerBackup = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItemCadastrarServico = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnRotinaContato.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnRotinaContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1452414361_kontact_1.png"))); // NOI18N
        jBtnRotinaContato.setText("Rotina de Contato");
        jBtnRotinaContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRotinaContatoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnRotinaContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, -1));

        jBtnCadastrarLembrete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnCadastrarLembrete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadastrarLembrete.png"))); // NOI18N
        jBtnCadastrarLembrete.setText("Lembrete");
        jBtnCadastrarLembrete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarLembreteActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCadastrarLembrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 174, 140, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 11, -1, -1));

        jBtnProposta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnProposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1452415489_icon-57.fw_1.png"))); // NOI18N
        jBtnProposta.setText("Proposta");
        jBtnProposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPropostaActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnProposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 265, 140, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Lista mineração:\n\n- cliente mais atendido\n- tipo de serviço mais realizado\n(tipo definido, ex: troca de placa e \ntipo serviço ex: venda aluguel, ou manutenção)\n- peça com mais saída\n- peça com menos saída\n- periodo do ano com mais movimento\n- periodo do ano com menos mevimento\n- qual o período do ano que \ndeterminado setor está em alta\n- qual funcionário realizou mais serviços");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 380, 246));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.setText("Pendências do sistema:\n\n- tela de mineração\n- formatação dos campos(caracteres)\n- referências formatadas nas normas ABNT\n- verificar campos para evitar dados duplicados\n- Backup do banco automático  - ok\n- Aviso de estoque baixo\n- gerenciamento de telas\n- permissões dos usuários\n- campos que recebem números decimais \naceitar apenas ponto e não vírgula\n- não deixar cadastrar lembrete em data que já passou\n- cadastrar em auditoria tudo que for feito no sistema\n- mensagens para confirmar ações dos usuários : \n\"Deseja excluir?\" \"Cadastrado com sucesso\" algo assim \n- Formato da data\n- testar o sistema e corrigir bugs");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 440, 340));

        jBtnFazerBackup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnFazerBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backup (2).png"))); // NOI18N
        jBtnFazerBackup.setText("Fazer Backup");
        jBtnFazerBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFazerBackupActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnFazerBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 140, -1));

        jMenu4.setBackground(new java.awt.Color(204, 153, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu.png"))); // NOI18N
        jMenu4.setText("Menu");

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jMenu14.setText("Cadastrar");
        jMenu14.setMaximumSize(new java.awt.Dimension(35767, 35767));
        jMenu14.setPreferredSize(new java.awt.Dimension(130, 25));

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente3.png"))); // NOI18N
        jMenuItem10.setText("Cliente");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem10);

        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/equipamento.png"))); // NOI18N
        jMenuItem29.setText("Equipamento");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem29);

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estoque2.png"))); // NOI18N
        jMenuItem22.setText("Estoque");
        jMenu14.add(jMenuItem22);

        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fabricante.png"))); // NOI18N
        jMenuItem26.setText("Fabricante");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem26);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedor.png"))); // NOI18N
        jMenuItem5.setText("Fornecedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem5);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4.png"))); // NOI18N
        jMenuItem21.setText("Funcionário");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem21);

        jMenuItem15.setText("Modelo");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem15);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/prod.png"))); // NOI18N
        jMenuItem17.setText("Peça");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem17);

        jMenuItemCadastrarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/servicos.png"))); // NOI18N
        jMenuItemCadastrarServico.setText("Serviços");
        jMenuItemCadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarServicoActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItemCadastrarServico);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/setor.png"))); // NOI18N
        jMenuItem13.setText("Segmento");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem13);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.gif"))); // NOI18N
        jMenuItem8.setText("Usuário");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem8);

        jMenuItem31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas1.gif"))); // NOI18N
        jMenuItem31.setText("Vendas");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem31);

        jMenu4.add(jMenu14);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.gif"))); // NOI18N
        jMenu10.setText("Consultar");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente3.png"))); // NOI18N
        jMenuItem9.setText("Cliente");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem9);

        jMenuItem30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/equipamento.png"))); // NOI18N
        jMenuItem30.setText("Equipamento");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem30);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estoque2.png"))); // NOI18N
        jMenuItem19.setText("Estoque");
        jMenu10.add(jMenuItem19);

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fabricante.png"))); // NOI18N
        jMenuItem23.setText("Fabricante");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem23);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedor.png"))); // NOI18N
        jMenuItem6.setText("Fornecedor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem6);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4.png"))); // NOI18N
        jMenuItem18.setText("Funcionário");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem18);

        jMenuItem16.setText("Modelo");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem16);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/prod.png"))); // NOI18N
        jMenuItem20.setText("Produto");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem20);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/servicos.png"))); // NOI18N
        jMenuItem1.setText("Serviços");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem1);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/setor.png"))); // NOI18N
        jMenuItem14.setText("Segmento");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem14);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.gif"))); // NOI18N
        jMenuItem7.setText("Usuário");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem7);

        jMenuItem32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas1.gif"))); // NOI18N
        jMenuItem32.setText("Vendas");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem32);

        jMenu4.add(jMenu10);

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jMenu15.setText("Editar");

        jMenuItem11.setText("Cliente");
        jMenu15.add(jMenuItem11);

        jMenuItem25.setText("Estoque");
        jMenu15.add(jMenuItem25);

        jMenuItem24.setText("Funcionário");
        jMenu15.add(jMenuItem24);

        jMenuItem3.setText("Serviços");
        jMenu15.add(jMenuItem3);

        jMenu4.add(jMenu15);

        jMenu16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jMenu16.setText("Excluir");

        jMenuItem12.setText("Cliente");
        jMenu16.add(jMenuItem12);

        jMenuItem28.setText("Estoque");
        jMenu16.add(jMenuItem28);

        jMenuItem27.setText("Funcionário");
        jMenu16.add(jMenuItem27);

        jMenuItem4.setText("Serviços");
        jMenu16.add(jMenuItem4);

        jMenu4.add(jMenu16);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.gif"))); // NOI18N
        jMenu6.setText("Sair");
        jMenu6.setActionCommand("System.exit();");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenu6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu6KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRotinaContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRotinaContatoActionPerformed
        new CadastrarRotinaContato().setVisible(true);
    }//GEN-LAST:event_jBtnRotinaContatoActionPerformed

    private void jBtnCadastrarLembreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarLembreteActionPerformed
        new CadastrarLembrete().setVisible(true);
    }//GEN-LAST:event_jBtnCadastrarLembreteActionPerformed

    private void jBtnPropostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPropostaActionPerformed
        new Proposta().setVisible(true);
    }//GEN-LAST:event_jBtnPropostaActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        new ExibeVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new ExibeUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        new ExibeSetor().setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new ExibeServico().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        new ExibeProduto().setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        new ExibeModelo().setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        new ExibeFuncionario().setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.setVisible(false);
        new ExibeFornecedor(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        new ExibeFabricante().setVisible(true);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        new ExibeEquipamento().setVisible(true);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.setVisible(false);
        new ExibeCliente(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        new CadastrarVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new CadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        new CadastrarSetor().setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItemCadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarServicoActionPerformed
        new CadastrarServicoTeste().setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarServicoActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        new CadastrarProduto().setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        new CadastrarModelo().setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        new CadastrarFuncionario().setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.setVisible(false);
        new CadastrarFornecedor(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        new CadastrarFabricante().setVisible(true);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        new CadastrarEquipamento().setVisible(true);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        this.setVisible(false);
        new CadastrarCliente(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu6KeyPressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu6KeyPressed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        File file = new File("C:/Users/Josy/Desktop/Backup");
        file.mkdir();
        String caminho = file.getAbsolutePath();
        ControleBackup app = new ControleBackup(caminho);
        
        System.exit(0);
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jBtnFazerBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFazerBackupActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Selecione um diretório");
        fc.setApproveButtonText("Salvar");
        // restringe a amostra a diretorios apenas
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
              
            File diretorio = fc.getSelectedFile();
            caminho = diretorio.getAbsolutePath();
            ControleBackup app = new ControleBackup(caminho);

        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum diretorio.");
        }
    }//GEN-LAST:event_jBtnFazerBackupActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        Backup();        
    }//GEN-LAST:event_jMenu6MouseClicked

    public void Backup() {

        TelaEspera telaTeste = new TelaEspera();
        this.setEnabled(false);
        final Thread t1 = new Thread(new Runnable() {//cria uma thread pra gravar o seu arquivo

            @Override
            public void run() {

                telaTeste.setVisible(true);
                File file = new File("C:/Users/Josy/Desktop");
                file.mkdir();
                String caminho = file.getAbsolutePath();
                ControleBackup app = new ControleBackup(caminho);
            }
        });
        t1.start();
        new Thread(new Runnable() {//cria outra thread pra sua tela de espera
            @Override
            public void run() {
                try {
                    //cria a tela de espera e mostra ela
                    t1.join();//fica esperando a primeira thread acabar
                    telaMenu.setEnabled(true);  // quando acabar fecha a janela de espera, podes fazer outras coisas aqui
                    telaTeste.dispose();
                    System.exit(0);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Menu().setVisible(true);
////                Agendamentos a = new Agendamentos(); 
////                a.terceiraTarefa(21);
//            }
//        });   
//    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrarLembrete;
    private javax.swing.JButton jBtnFazerBackup;
    private javax.swing.JButton jBtnProposta;
    private javax.swing.JButton jBtnRotinaContato;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCadastrarServico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

}
