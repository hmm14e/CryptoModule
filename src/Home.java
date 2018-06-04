
import java.awt.Component;
import java.util.Objects;
import javax.swing.JOptionPane;

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
        Welcome = new javax.swing.JLabel();
        FSULOGO = new javax.swing.JLabel();
        CaesarPanel = new javax.swing.JPanel();
        CaesarTitle = new javax.swing.JLabel();
        Warning = new javax.swing.JLabel();
        Ciphertext_Caesar = new javax.swing.JLabel();
        Submission = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        MainPanel.setLayout(new java.awt.CardLayout());

        WelcomePanel.setBackground(new java.awt.Color(255, 255, 255));

        Welcome.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        Welcome.setText("Welcome to the FSU Cryptography Module");

        FSULOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/fsu-seal-full-color.png"))); // NOI18N

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(FSULOGO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FSULOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        MainPanel.add(WelcomePanel, "card2");

        CaesarPanel.setBackground(new java.awt.Color(204, 204, 255));

        CaesarTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        CaesarTitle.setText("Let's practice breaking a Caesar Cipher!");

        Warning.setText("Please write a script to decrypt the following ciphertext. Instructors may ask students to demo or submit their code. ");

        Ciphertext_Caesar.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Ciphertext_Caesar.setText("Phrase: vogvizvetv zj kyv kvrtyvi fw rcc kyzexj ");

        Submission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmissionActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter the plaintext answer in lowercase");

        javax.swing.GroupLayout CaesarPanelLayout = new javax.swing.GroupLayout(CaesarPanel);
        CaesarPanel.setLayout(CaesarPanelLayout);
        CaesarPanelLayout.setHorizontalGroup(
            CaesarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaesarPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(CaesarTitle))
            .addGroup(CaesarPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Warning))
            .addGroup(CaesarPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(Ciphertext_Caesar))
            .addGroup(CaesarPanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(Submission, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(CaesarPanelLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(Submit))
            .addGroup(CaesarPanelLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1))
        );
        CaesarPanelLayout.setVerticalGroup(
            CaesarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaesarPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(CaesarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Warning)
                .addGap(84, 84, 84)
                .addComponent(Ciphertext_Caesar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(Submission, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Submit))
        );

        MainPanel.add(CaesarPanel, "card3");

        AtbashPanel.setBackground(new java.awt.Color(204, 255, 204));

        AtbashTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        AtbashTitle.setText("Let's practice breaking an Atbash Cipher!");

        Warning1.setText("Please write a script to decrypt the following ciphertext. Instructors may ask students to demo or submit their code. ");

        Ciphertext_Atbash.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Ciphertext_Atbash.setText("Phrase: vhmk ijpt e uavuav uigjev (key: caesar) ");

        Submission1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submission1ActionPerformed(evt);
            }
        });

        Submit1.setText("Submit");
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AtbashPanelLayout = new javax.swing.GroupLayout(AtbashPanel);
        AtbashPanel.setLayout(AtbashPanelLayout);
        AtbashPanelLayout.setHorizontalGroup(
            AtbashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtbashPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(AtbashTitle))
            .addGroup(AtbashPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Warning1))
            .addGroup(AtbashPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(Ciphertext_Atbash))
            .addGroup(AtbashPanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(Submission1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(AtbashPanelLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(Submit1))
        );
        AtbashPanelLayout.setVerticalGroup(
            AtbashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtbashPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AtbashTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Warning1)
                .addGap(84, 84, 84)
                .addComponent(Ciphertext_Atbash)
                .addGap(90, 90, 90)
                .addComponent(Submission1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Submit1))
        );

        MainPanel.add(AtbashPanel, "card4");

        VigenerePanel.setBackground(new java.awt.Color(255, 204, 204));

        VigenereTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        VigenereTitle.setText("Let's practice breaking a Vigenere Cipher!");

        Warning2.setText("Please write a script to decrypt the following ciphertext. Instructors may ask students to demo or submit their code. ");

        Ciphertext_Vigenere.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Ciphertext_Vigenere.setText("Phrase: mlgsrmt zylfg gsrh rh hvxfiv");

        Submission2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submission2ActionPerformed(evt);
            }
        });

        Submit2.setText("Submit");
        Submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VigenerePanelLayout = new javax.swing.GroupLayout(VigenerePanel);
        VigenerePanel.setLayout(VigenerePanelLayout);
        VigenerePanelLayout.setHorizontalGroup(
            VigenerePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VigenerePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(VigenereTitle))
            .addGroup(VigenerePanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Warning2))
            .addGroup(VigenerePanelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(Ciphertext_Vigenere))
            .addGroup(VigenerePanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(Submission2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(VigenerePanelLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(Submit2))
        );
        VigenerePanelLayout.setVerticalGroup(
            VigenerePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VigenerePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(VigenereTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Warning2)
                .addGap(74, 74, 74)
                .addComponent(Ciphertext_Vigenere)
                .addGap(100, 100, 100)
                .addComponent(Submission2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Submit2))
        );

        MainPanel.add(VigenerePanel, "card5");

        ECBPanel.setBackground(new java.awt.Color(255, 255, 255));

        ECB_Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ECB.png"))); // NOI18N
        ECB_Picture.setText("jLabel4");

        Answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answer1ActionPerformed(evt);
            }
        });

        ECB_Button.setText("Enter");
        ECB_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECB_ButtonActionPerformed(evt);
            }
        });

        Q1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Q1.setText("What does the following picture enrypted with 3DES ECB say?");

        javax.swing.GroupLayout ECBPanelLayout = new javax.swing.GroupLayout(ECBPanel);
        ECBPanel.setLayout(ECBPanelLayout);
        ECBPanelLayout.setHorizontalGroup(
            ECBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ECBPanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(Q1))
            .addGroup(ECBPanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(ECB_Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ECBPanelLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(Answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(ECB_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ECBPanelLayout.setVerticalGroup(
            ECBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ECBPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ECB_Picture)
                .addGap(24, 24, 24)
                .addGroup(ECBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ECB_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        MainPanel.add(ECBPanel, "card6");

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

        MainPanel.add(Correct_ECB, "card7");

        FeistelPanel.setBackground(new java.awt.Color(255, 255, 255));

        Feistel_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/feistel.jpg"))); // NOI18N

        Feistel_Intro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Feistel_Intro.setText("What is the final 8 bit value?");

        Feistel_Entry.setText("Answer Here!");
        Feistel_Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Feistel_EntryActionPerformed(evt);
            }
        });

        Feistel_Button.setText("Enter");
        Feistel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Feistel_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FeistelPanelLayout = new javax.swing.GroupLayout(FeistelPanel);
        FeistelPanel.setLayout(FeistelPanelLayout);
        FeistelPanelLayout.setHorizontalGroup(
            FeistelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeistelPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(Feistel_Intro))
            .addGroup(FeistelPanelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Feistel_Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Feistel_Entry, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Feistel_Button))
        );
        FeistelPanelLayout.setVerticalGroup(
            FeistelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeistelPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Feistel_Intro)
                .addGap(21, 21, 21)
                .addGroup(FeistelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Feistel_Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FeistelPanelLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(FeistelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Feistel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Feistel_Entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        MainPanel.add(FeistelPanel, "card8");

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
            JOptionPane.showMessageDialog(null, "You are correct!!", "CORRECT", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "This is not correct. Try again.", "INCORRECT", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_Feistel_ButtonActionPerformed
/*-----------------------------------------------*/
/*THESE ARE BUILT IN PRIMITIVES FOR THE TEXTFIELDS*/
/*-----------------------------------------------*/
    private void SubmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmissionActionPerformed

    private void Submission1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submission1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Submission1ActionPerformed

    private void Submission2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submission2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Submission2ActionPerformed
/*-----------------------------------------------*/
/*------END OF PRIMITIVES------------------------*/
/*-----------------------------------------------*/
    
    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();

        MainPanel.add(WelcomePanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_HomeActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String val1 = Submission.getText();
        String val2 = "experience is the teacher of all things";
        
        if(Objects.equals(val1, val2))
            JOptionPane.showMessageDialog(null, "You are correct!!", "CORRECT", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "This is not correct. Try again.", "INCORRECT", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_SubmitActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
        String val1 = Submission1.getText();
        String val2 = "nothing about this is secure";
        
        if(Objects.equals(val1, val2))
            JOptionPane.showMessageDialog(null, "You are correct!!", "CORRECT", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "This is not correct. Try again.", "INCORRECT", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_Submit1ActionPerformed

    private void Submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit2ActionPerformed
        String val1 = Submission2.getText();
        String val2 = "this isnt a caesar cipher";
        
        if(Objects.equals(val1, val2))
            JOptionPane.showMessageDialog(null, "You are correct!!", "CORRECT", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "This is not correct. Try again.", "INCORRECT", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_Submit2ActionPerformed

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
    private javax.swing.JLabel FSULOGO;
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
    private javax.swing.JLabel Welcome;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
