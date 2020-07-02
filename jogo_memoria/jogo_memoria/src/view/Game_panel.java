package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Info;
import view.introducao;

public class Game_panel extends javax.swing.JFrame {

    public int numPergunta = 0;
    public int pontos = 0;

    public Game_panel() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/casa1.jpg"));
        lblImagem1.setIcon(icon);
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/casa2.jpg"));
        lblImagem2.setIcon(icon1);

    }

    public void recebeNome(Info txtNome) {
        lblNome.setText(txtNome.getNome());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_inbox1 = new javax.swing.JLabel();
        lbl_mark = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPergunta = new javax.swing.JLabel();
        btn_login = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        lblImagem1 = new javax.swing.JLabel();
        rdoImagem2 = new javax.swing.JRadioButton();
        lblNome = new javax.swing.JLabel();
        lblImagem2 = new javax.swing.JLabel();
        rdoImagem1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        recebePonto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 175, 98));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        lbl_inbox1.setBackground(new java.awt.Color(17, 175, 98));
        lbl_inbox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_inbox1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_inbox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_inbox1.setText("Ínicio");
        lbl_inbox1.setIconTextGap(10);
        lbl_inbox1.setOpaque(true);
        lbl_inbox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_inbox1MouseClicked(evt);
            }
        });

        lbl_mark.setBackground(new java.awt.Color(17, 175, 98));
        lbl_mark.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_mark.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mark.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mark.setText("Sair");
        lbl_mark.setIconTextGap(10);
        lbl_mark.setOpaque(true);
        lbl_mark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_markMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_inbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_mark, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_inbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_mark, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 449));

        jPanel3.setBackground(new java.awt.Color(41, 168, 73));

        lblPergunta.setBackground(new java.awt.Color(41, 168, 73));
        lblPergunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta.setText("<html>Com base nos seus conhecimentos, qual casa o senhor(a)<br>\n acreditaria ser mais cara e a que traz mais benefícios em questão<br>\n ao meio ambiente e a si mesmo, e qual causaria mais prejuízos <br>\nseja pelo meio ambiente ou financeiramente? </html>");
        lblPergunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 30, -1, -1));

        btn_login.setBackground(new java.awt.Color(41, 168, 73));
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setLabel("escolher");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 393, 145, 36));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 165, 72));
        jLabel2.setText("?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 30, 40));

        lblImagem1.setBackground(new java.awt.Color(204, 204, 204));
        lblImagem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem1.setText("imagem 1 aqui");
        lblImagem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagem1MouseClicked(evt);
            }
        });
        jPanel2.add(lblImagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 125, 240, 228));

        buttonGroup1.add(rdoImagem2);
        rdoImagem2.setText("Imagem 2");
        jPanel2.add(rdoImagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));
        jPanel2.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 370, 20));

        lblImagem2.setBackground(new java.awt.Color(204, 204, 204));
        lblImagem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem2.setText("imagem 2 aqui ");
        lblImagem2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblImagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 125, 240, 228));

        buttonGroup1.add(rdoImagem1);
        rdoImagem1.setText("Imagem 1");
        jPanel2.add(rdoImagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 360, -1, -1));

        jLabel3.setText("Desafiante:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 20));
        jPanel2.add(recebePonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void lbl_markMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_markMouseClicked

        setLblColor(lbl_mark);
        resetLblColor(lbl_inbox1);
        int reply = JOptionPane.showConfirmDialog(null, "Deseja realmente sair ?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lbl_markMouseClicked

    private void lbl_inbox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_inbox1MouseClicked

        setLblColor(lbl_inbox1);
        resetLblColor(lbl_mark);
        new Main().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lbl_inbox1MouseClicked

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        Info frm = new Info();

        resut_panel panel = new resut_panel();

        //   while(numPergunta < 2){
        switch (numPergunta) {

            case 0:
                if (rdoImagem1.isSelected() == true) {
                    numPergunta++;
                    pontos++;
                    frm.setPontos(pontos);
                } else if (rdoImagem2.isSelected() == true) {
                    numPergunta++;
                }
                //tratamento de erro e  de valores
                if (rdoImagem1.isSelected() == true || rdoImagem2.isSelected() == true) {
                    ImageIcon icon = new ImageIcon(getClass().getResource("/images/casa3.jpg"));
                    lblImagem1.setIcon(icon);
                    ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/casa4.jpg"));
                    lblImagem2.setIcon(icon1);
                    lblPergunta.setText("<html>Qual telhado seria mais útil barato e quais são os "
                            + "benefícios de um telhado<br> verde referente ao comum que todos conhecem atualmente?");
                } else {
                    JOptionPane.showMessageDialog(null, "Para prosseguir selecione uma das imagens");
                }
                buttonGroup1.clearSelection();
                break;
            case 1:
                if (numPergunta == 1) {
                    if (rdoImagem1.isSelected() == true) {

                        numPergunta++;
                    } else if (rdoImagem2.isSelected() == true) {
                        numPergunta++;
                        pontos++;
                        frm.setPontos(pontos);

                    }
                    //tratamento de erro e  de valores
                    if (rdoImagem1.isSelected() == true || rdoImagem2.isSelected() == true) {
                        ImageIcon icon = new ImageIcon(getClass().getResource("/images/casa6.jpg"));
                        lblImagem1.setIcon(icon);
                        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/casa5.jpg"));
                        lblImagem2.setIcon(icon1);
                        lblPergunta.setText("<html>A partir do conceito de contruções sustentáveis. "
                                + "Assinale a alternativa que<br> melhor representa uma estratégia que menos atinge o meio<br>"
                                + "ambiente e possuí uma vantagem econòmica significativa.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Para prosseguir selecione uma das imagens");
                    }
                    buttonGroup1.clearSelection();

                    //   }
                    break;

                }
            case 2:
                if (numPergunta == 2) {
                    if (rdoImagem1.isSelected() == true) {
                        numPergunta++;
                        pontos++;
                        frm.setPontos(pontos);
                    } else if (rdoImagem2.isSelected() == true) {
                        numPergunta++;

                    }
                    //tratamento de erro e  de valores
                    if (rdoImagem1.isSelected() == true || rdoImagem2.isSelected() == true) {
                        ImageIcon icon = new ImageIcon(getClass().getResource("/images/casa7.jpg"));
                        lblImagem1.setIcon(icon);
                        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/casa8.jpg"));
                        lblImagem2.setIcon(icon1);
                        lblPergunta.setText("<html>Os materias para a construção sustentável "
                                + "Também são de suma<br> importância para não agredir a natureza. Indique<br>"
                                + "qual imagem representa um material sustentável para contrução.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Para prosseguir selecione uma das imagens");
                    }
                    buttonGroup1.clearSelection();
                    break;

                }
            case 3:
                if (numPergunta == 3) {
                    if (rdoImagem1.isSelected() == true) {
                        numPergunta++;
                        pontos++;
                        frm.setPontos(pontos);
                    } else if (rdoImagem2.isSelected() == true) {
                        numPergunta++;
                    }
                    //tratamento de erro e  de valores
                    if (rdoImagem1.isSelected() == true || rdoImagem2.isSelected() == true) {
                        ImageIcon icon = new ImageIcon(getClass().getResource("/images/casa9.jpg"));
                        lblImagem1.setIcon(icon);
                        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/casa10.jpg"));
                        lblImagem2.setIcon(icon1);
                        lblPergunta.setText("<html>Em relação ao Green Building, qual das imagens melhor "
                                + "representa características<br> desta técnica ? Tendo como base sua estrutura.");
                    } else if (rdoImagem1.isSelected() == true & rdoImagem2.isSelected() == true) {
                        JOptionPane.showMessageDialog(null, "Selecione apenas uma imagem !");

                    } else {
                        JOptionPane.showMessageDialog(null, "Para prosseguir selecione uma das imagens");
                    }
                    buttonGroup1.clearSelection();
                    break;
                }
            case 4:
                if (numPergunta == 4) {
                    frm.setPontos(pontos);
                    panel.setVisible(true);
                    this.dispose();

                }
                break;
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void lblImagem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagem1MouseClicked

    }//GEN-LAST:event_lblImagem1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        introducao frm = new introducao();

        frm.remider();
        if (numPergunta == 0) {

            frm.dica();
            frm.setVisible(true);
        }
        if (numPergunta == 1) {
            frm.dica1();
            frm.setVisible(true);
        }
        if (numPergunta == 2) {
            frm.dica2();
            frm.setVisible(true);
        }
        if (numPergunta == 3) {
            frm.dica3();
            frm.setVisible(true);
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    int xy;
    int xx;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game_panel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_panel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_panel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_panel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_panel().setVisible(true);
            }
        });
    }

    public void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(15, 157, 88));
    }

    public void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(17, 175, 98));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_login;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImagem1;
    private javax.swing.JLabel lblImagem2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lbl_inbox1;
    private javax.swing.JLabel lbl_mark;
    private javax.swing.JRadioButton rdoImagem1;
    private javax.swing.JRadioButton rdoImagem2;
    private javax.swing.JLabel recebePonto;
    // End of variables declaration//GEN-END:variables
}
