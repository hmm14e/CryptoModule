
import java.awt.Component;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. test
 */

/**
 *
 * @author hannahmclaughlin
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        MainPanel = new javax.swing.JPanel();
        WelcomePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CaesarPanel = new javax.swing.JPanel();
        CaesarTitle = new javax.swing.JLabel();
        Warning = new javax.swing.JLabel();
        Ciphertext_Caesar = new javax.swing.JLabel();
        Submission = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        AtbashPanel = new javax.swing.JPanel();
        AtbashTitle = new javax.swing.JLabel();
        Warning1 = new javax.swing.JLabel();
        Ciphertext_Atbash = new javax.swing.JLabel();
        Submission1 = new javax.swing.JTextField();
        Submit1 = new javax.swing.JButton();
        VigenerePanel = new javax.swing.JPanel();
        VigenereTitle = new javax.swing.JLabel();
        Warning2 = new javax.swing.JLabel();
        Ciphertext_Vigenere = new javax.swing.JLabel();
        Submission2 = new javax.swing.JTextField();
        Submit2 = new javax.swing.JButton();
        ECBPanel = new javax.swing.JPanel();
        ECB_Picture = new javax.swing.JLabel();
        Answer1 = new javax.swing.JTextField();
        ECB_Button = new javax.swing.JButton();
        Q1 = new javax.swing.JLabel();
        Correct_ECB = new javax.swing.JPanel();
        Correct_Pic = new javax.swing.JLabel();
        Correct1 = new javax.swing.JLabel();
        FeistelPanel = new javax.swing.JPanel();
        Feistel_Pic = new javax.swing.JLabel();
        Feistel_Intro = new javax.swing.JLabel();
        Feistel_Entry = new javax.swing.JTextField();
        Feistel_Button = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Home = new javax.swing.JMenu();
        SubstitutionCiphers = new javax.swing.JMenu();
        Caesar = new javax.swing.JMenuItem();
        Atbash = new javax.swing.JMenuItem();
        Vigenere = new javax.swing.JMenuItem();
        BlockCiphers = new javax.swing.JMenu();
        Feistel = new javax.swing.JMenuItem();
        RC5 = new javax.swing.JMenuItem();
        Blowfish = new javax.swing.JMenuItem();
        StreamCiphers = new javax.swing.JMenu();
        Entropy = new javax.swing.JMenu();
        EncryptionModes = new javax.swing.JMenu();
        ECB = new javax.swing.JMenuItem();
        CBC = new javax.swing.JMenuItem();
        CTR = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        Dev = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setText("Welcome to the FSU Cryptography Module");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/fsu-seal-full-color.png"))); // NOI18N

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        MainPanel.add(WelcomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CaesarPanel.setBackground(new java.awt.Color(204, 204, 255));
        CaesarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CaesarTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        CaesarTitle.setText("Let's practice breaking a Caesar Cipher!");
        CaesarPanel.add(CaesarTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 60));

        Warning.setText("Please write a script to decrypt the following ciphertext. Instructors may ask students to demo or submit their code. ");
        CaesarPanel.add(Warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        Ciphertext_Caesar.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Ciphertext_Caesar.setText("Phrase: vogvizvetv zj kyv kvrtyvi fw rcc kyzexj ");
        CaesarPanel.add(Ciphertext_Caesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        Submission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmissionActionPerformed(evt);
            }
        });
        CaesarPanel.add(Submission, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 450, 40));

        Submit.setText("Submit");
        CaesarPanel.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        MainPanel.add(CaesarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 516));

        AtbashPanel.setBackground(new java.awt.Color(204, 255, 204));
        AtbashPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AtbashTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        AtbashTitle.setText("Let's practice breaking an Atbash Cipher!");
        AtbashPanel.add(AtbashTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 60));

        Warning1.setText("Please write a script to decrypt the following ciphertext. Instructors may ask students to demo or submit their code. ");
        AtbashPanel.add(Warning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        Ciphertext_Atbash.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Ciphertext_Atbash.setText("Phrase: vhmk ijpt e uavuav uigjev (key: caesar) ");
        AtbashPanel.add(Ciphertext_Atbash, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        Submission1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submission1ActionPerformed(evt);
            }
        });
        AtbashPanel.add(Submission1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 450, 40));

        Submit1.setText("Submit");
        AtbashPanel.add(Submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        MainPanel.add(AtbashPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 516));

        VigenerePanel.setBackground(new java.awt.Color(255, 204, 204));
        VigenerePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VigenereTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        VigenereTitle.setText("Let's practice breaking a Vigenere Cipher!");
        VigenerePanel.add(VigenereTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 60));

        Warning2.setText("Please write a script to decrypt the following ciphertext. Instructors may ask students to demo or submit their code. ");
        VigenerePanel.add(Warning2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        Ciphertext_Vigenere.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Ciphertext_Vigenere.setText("Phrase: mlgsrmt zylfg gsrh rh hvxfiv");
        VigenerePanel.add(Ciphertext_Vigenere, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        Submission2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submission2ActionPerformed(evt);
            }
        });
        VigenerePanel.add(Submission2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 450, 40));

        Submit2.setText("Submit");
        VigenerePanel.add(Submit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        MainPanel.add(VigenerePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 516));

        ECBPanel.setBackground(new java.awt.Color(255, 255, 255));
        ECBPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ECB_Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ECB.png"))); // NOI18N
        ECB_Picture.setText("jLabel4");
        ECBPanel.add(ECB_Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 420, -1));

        Answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answer1ActionPerformed(evt);
            }
        });
        ECBPanel.add(Answer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 170, 30));

        ECB_Button.setText("Enter");
        ECB_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECB_ButtonActionPerformed(evt);
            }
        });
        ECBPanel.add(ECB_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 80, 30));

        Q1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Q1.setText("What does the following picture enrypted with 3DES ECB say?");
        ECBPanel.add(Q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 30));

        MainPanel.add(ECBPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        Correct_ECB.setBackground(new java.awt.Color(255, 255, 255));

        Correct_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Test.png"))); // NOI18N
        Correct_Pic.setText("jLabel2");

        Correct1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Correct1.setForeground(new java.awt.Color(51, 255, 51));
        Correct1.setText("CORRECT!");

        javax.swing.GroupLayout Correct_ECBLayout = new javax.swing.GroupLayout(Correct_ECB);
        Correct_ECB.setLayout(Correct_ECBLayout);
        Correct_ECBLayout.setHorizontalGroup(
            Correct_ECBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Correct_ECBLayout.createSequentialGroup()
                .addGroup(Correct_ECBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Correct_ECBLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(Correct_Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Correct_ECBLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(Correct1)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        Correct_ECBLayout.setVerticalGroup(
            Correct_ECBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Correct_ECBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Correct1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Correct_Pic)
                .addGap(103, 103, 103))
        );

        MainPanel.add(Correct_ECB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        FeistelPanel.setBackground(new java.awt.Color(255, 255, 255));
        FeistelPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Feistel_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/feistel.jpg"))); // NOI18N
        Feistel_Pic.setText("jLabel2");
        FeistelPanel.add(Feistel_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 450, 410));

        Feistel_Intro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Feistel_Intro.setText("What is the final 8 bit value?");
        FeistelPanel.add(Feistel_Intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        Feistel_Entry.setText("Answer Here!");
        Feistel_Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Feistel_EntryActionPerformed(evt);
            }
        });
        FeistelPanel.add(Feistel_Entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 90, 30));

        Feistel_Button.setText("Enter");
        Feistel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Feistel_ButtonActionPerformed(evt);
            }
        });
        FeistelPanel.add(Feistel_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, 30));

        MainPanel.add(FeistelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(Home);

        SubstitutionCiphers.setText("Substitution Ciphers");

        Caesar.setText("Caesar Cipher");
        Caesar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                CaesarComponentAdded(evt);
            }
        });
        Caesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaesarActionPerformed(evt);
            }
        });
        SubstitutionCiphers.add(Caesar);

        Atbash.setText("Atbash Cipher");
        Atbash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtbashActionPerformed(evt);
            }
        });
        SubstitutionCiphers.add(Atbash);

        Vigenere.setText("Vigenere Cipher");
        Vigenere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VigenereActionPerformed(evt);
            }
        });
        SubstitutionCiphers.add(Vigenere);

        jMenuBar1.add(SubstitutionCiphers);

        BlockCiphers.setText("Block Ciphers");

        Feistel.setText("Feistel Network");
        Feistel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeistelActionPerformed(evt);
            }
        });
        BlockCiphers.add(Feistel);

        RC5.setText("RC5");
        BlockCiphers.add(RC5);

        Blowfish.setText("Blowfish");
        BlockCiphers.add(Blowfish);

        jMenuBar1.add(BlockCiphers);

        StreamCiphers.setText("Stream Ciphers");
        jMenuBar1.add(StreamCiphers);

        Entropy.setText("Entropy");
        jMenuBar1.add(Entropy);

        EncryptionModes.setText("Encryption Modes");

        ECB.setText("ECB");
        ECB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECBActionPerformed(evt);
            }
        });
        EncryptionModes.add(ECB);

        CBC.setText("CBC");
        EncryptionModes.add(CBC);

        CTR.setText("CTR");
        EncryptionModes.add(CTR);

        jMenuBar1.add(EncryptionModes);

        Help.setText("Help");

        Dev.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Dev.setText("Developers");
        Help.add(Dev);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtbashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtbashActionPerformed
    MainPanel.removeAll();
    MainPanel.repaint();
    MainPanel.revalidate();

    MainPanel.add(AtbashPanel);
    MainPanel.repaint();
    MainPanel.revalidate();
    }//GEN-LAST:event_AtbashActionPerformed

    private void CaesarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_CaesarComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_CaesarComponentAdded

    private void CaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaesarActionPerformed
        
    MainPanel.removeAll();
    MainPanel.repaint();
    MainPanel.revalidate();

    MainPanel.add(CaesarPanel);
    MainPanel.repaint();
    MainPanel.revalidate();
    
    }//GEN-LAST:event_CaesarActionPerformed

    private void VigenereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VigenereActionPerformed
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(VigenerePanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_VigenereActionPerformed

    private void ECBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECBActionPerformed
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(ECBPanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_ECBActionPerformed

    private void Answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Answer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Answer1ActionPerformed

    private void ECB_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECB_ButtonActionPerformed
        String val1 = Answer1.getText();
        String val2 = "NEVER USE ECB";
        
        if(Objects.equals(val1, val2))
        {
            MainPanel.removeAll();
            MainPanel.repaint();
            MainPanel.revalidate();

            MainPanel.add(Correct_ECB);
            MainPanel.repaint();
            MainPanel.revalidate();
        }
        else
            System.out.println("FALSE");
        
        System.out.println(val1);
    }//GEN-LAST:event_ECB_ButtonActionPerformed

    private void FeistelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeistelActionPerformed
            MainPanel.removeAll();
            MainPanel.repaint();
            MainPanel.revalidate();

            MainPanel.add(FeistelPanel);
            MainPanel.repaint();
            MainPanel.revalidate();
    }//GEN-LAST:event_FeistelActionPerformed

    private void Feistel_EntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Feistel_EntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Feistel_EntryActionPerformed

    private void Feistel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Feistel_ButtonActionPerformed
        String val1 = Feistel_Entry.getText();
        String val2 = "01010100";
        
        if(Objects.equals(val1, val2))
        {
            MainPanel.removeAll();
            MainPanel.repaint();
            MainPanel.revalidate();

            MainPanel.add(Correct_ECB);
            MainPanel.repaint();
            MainPanel.revalidate();
        }
        else
            System.out.println("FALSE");
        
        System.out.println(val1);
    }//GEN-LAST:event_Feistel_ButtonActionPerformed

    private void SubmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmissionActionPerformed

    private void Submission1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submission1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Submission1ActionPerformed

    private void Submission2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submission2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Submission2ActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(WelcomePanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_HomeActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer1;
    private javax.swing.JMenuItem Atbash;
    private javax.swing.JPanel AtbashPanel;
    private javax.swing.JLabel AtbashTitle;
    private javax.swing.JMenu BlockCiphers;
    private javax.swing.JMenuItem Blowfish;
    private javax.swing.JMenuItem CBC;
    private javax.swing.JMenuItem CTR;
    private javax.swing.JMenuItem Caesar;
    private javax.swing.JPanel CaesarPanel;
    private javax.swing.JLabel CaesarTitle;
    private javax.swing.JLabel Ciphertext_Atbash;
    private javax.swing.JLabel Ciphertext_Caesar;
    private javax.swing.JLabel Ciphertext_Vigenere;
    private javax.swing.JLabel Correct1;
    private javax.swing.JPanel Correct_ECB;
    private javax.swing.JLabel Correct_Pic;
    private javax.swing.JMenuItem Dev;
    private javax.swing.JMenuItem ECB;
    private javax.swing.JPanel ECBPanel;
    private javax.swing.JButton ECB_Button;
    private javax.swing.JLabel ECB_Picture;
    private javax.swing.JMenu EncryptionModes;
    private javax.swing.JMenu Entropy;
    private javax.swing.JMenuItem Feistel;
    private javax.swing.JPanel FeistelPanel;
    private javax.swing.JButton Feistel_Button;
    private javax.swing.JTextField Feistel_Entry;
    private javax.swing.JLabel Feistel_Intro;
    private javax.swing.JLabel Feistel_Pic;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Home;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Q1;
    private javax.swing.JMenuItem RC5;
    private javax.swing.JMenu StreamCiphers;
    private javax.swing.JTextField Submission;
    private javax.swing.JTextField Submission1;
    private javax.swing.JTextField Submission2;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit1;
    private javax.swing.JButton Submit2;
    private javax.swing.JMenu SubstitutionCiphers;
    private javax.swing.JMenuItem Vigenere;
    private javax.swing.JPanel VigenerePanel;
    private javax.swing.JLabel VigenereTitle;
    private javax.swing.JLabel Warning;
    private javax.swing.JLabel Warning1;
    private javax.swing.JLabel Warning2;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
