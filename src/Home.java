/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hannahmclaughlin
 */
import java.awt.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        CaesarPanel = new javax.swing.JPanel();
        WelcomePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AtbashPanel = new javax.swing.JPanel();
        VigenerePanel = new javax.swing.JPanel();
        ECBPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
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

        CaesarPanel.setBackground(new java.awt.Color(204, 204, 255));
        CaesarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setText("Welcome to the FSU Cryptography Module");

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomePanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        CaesarPanel.add(WelcomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MainPanel.add(CaesarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 516));

        AtbashPanel.setBackground(new java.awt.Color(204, 255, 204));
        AtbashPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainPanel.add(AtbashPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 516));

        VigenerePanel.setBackground(new java.awt.Color(255, 204, 204));
        VigenerePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainPanel.add(VigenerePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 516));

        ECBPanel.setBackground(new java.awt.Color(255, 255, 255));
        ECBPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ECB.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        ECBPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 420, -1));

        MainPanel.add(ECBPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

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

        Component add = MainPanel.add(ECBPanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_ECBActionPerformed

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
    private javax.swing.JMenuItem Atbash;
    private javax.swing.JPanel AtbashPanel;
    private javax.swing.JMenu BlockCiphers;
    private javax.swing.JMenuItem Blowfish;
    private javax.swing.JMenuItem CBC;
    private javax.swing.JMenuItem CTR;
    private javax.swing.JMenuItem Caesar;
    private javax.swing.JPanel CaesarPanel;
    private javax.swing.JMenuItem Dev;
    private javax.swing.JMenuItem ECB;
    private javax.swing.JPanel ECBPanel;
    private javax.swing.JMenu EncryptionModes;
    private javax.swing.JMenu Entropy;
    private javax.swing.JMenuItem Feistel;
    private javax.swing.JMenu Help;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuItem RC5;
    private javax.swing.JMenu StreamCiphers;
    private javax.swing.JMenu SubstitutionCiphers;
    private javax.swing.JMenuItem Vigenere;
    private javax.swing.JPanel VigenerePanel;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

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
        CaesarPanel = new javax.swing.JPanel();
        AtbashPanel = new javax.swing.JPanel();
        VigenerePanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
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

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomePanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        MainPanel.add(WelcomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        CaesarPanel.setBackground(new java.awt.Color(204, 204, 255));
        CaesarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainPanel.add(CaesarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 516));

        AtbashPanel.setBackground(new java.awt.Color(204, 255, 204));
        AtbashPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainPanel.add(AtbashPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 516));

        VigenerePanel.setBackground(new java.awt.Color(255, 204, 204));
        VigenerePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainPanel.add(VigenerePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 516));

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atbash;
    private javax.swing.JPanel AtbashPanel;
    private javax.swing.JMenu BlockCiphers;
    private javax.swing.JMenuItem Blowfish;
    private javax.swing.JMenuItem CBC;
    private javax.swing.JMenuItem CTR;
    private javax.swing.JMenuItem Caesar;
    private javax.swing.JPanel CaesarPanel;
    private javax.swing.JMenuItem Dev;
    private javax.swing.JMenuItem ECB;
    private javax.swing.JMenu EncryptionModes;
    private javax.swing.JMenu Entropy;
    private javax.swing.JMenuItem Feistel;
    private javax.swing.JMenu Help;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuItem RC5;
    private javax.swing.JMenu StreamCiphers;
    private javax.swing.JMenu SubstitutionCiphers;
    private javax.swing.JMenuItem Vigenere;
    private javax.swing.JPanel VigenerePanel;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
