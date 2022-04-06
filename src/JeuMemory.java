
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author thoar
 */
public class JeuMemory extends javax.swing.JFrame {
    
    //déclaration des attributs de la classe
    private LesJoueurs joueurs ; //ensemble des joueurs de la parite
    private LesPersonnages persos ; //ensemble des personnages de la partie
    private int l1,c1,l2,c2;
    private Jeu monJeu;

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    /*
     * Creates new form JeuMemory
     */
    
    //constructeur par défaut de la classe
    public JeuMemory(){
        initComponents();
        this.persos = new LesPersonnages();//On crée une liste de personnages vide
        this.joueurs = new LesJoueurs();//On crée une liste de joueurs vide
        //On initialise les coordonnées à -1 pour pour signifier qu'aucune carte n'a été séléctionnée
        this.l1=-1;
        this.c1=-1;
        this.l2=-1;
        this.c2=-1;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panneau = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JScrollp = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        NbPersosT = new javax.swing.JLabel();
        NbPersosR = new javax.swing.JLabel();
        JC = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Demarrer = new javax.swing.JButton();
        Recommencer = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Options = new javax.swing.JMenuItem();
        AjoutJoueur = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Joueurs = new javax.swing.JMenuItem();
        Cartes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        Panneau.setLayout(new java.awt.GridLayout(4, 5));
        Panneau.add(jButton1);
        Panneau.add(jButton2);
        Panneau.add(jButton3);
        Panneau.add(jButton4);
        Panneau.add(jButton5);
        Panneau.add(jButton6);
        Panneau.add(jButton7);
        Panneau.add(jButton8);
        Panneau.add(jButton9);
        Panneau.add(jButton10);
        Panneau.add(jButton11);
        Panneau.add(jButton12);
        Panneau.add(jButton13);
        Panneau.add(jButton14);
        Panneau.add(jButton15);
        Panneau.add(jButton16);
        Panneau.add(jButton17);
        Panneau.add(jButton18);
        Panneau.add(jButton19);
        Panneau.add(jButton20);

        getContentPane().add(Panneau, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        JScrollp.setPreferredSize(new java.awt.Dimension(226, 226));

        Edition.setColumns(20);
        Edition.setRows(5);
        Edition.setPreferredSize(new java.awt.Dimension(224, 227));
        JScrollp.setViewportView(Edition);

        jPanel2.add(JScrollp, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(3, 1));

        NbPersosT.setText("Nb de personnages trouvés :");
        jPanel4.add(NbPersosT);

        NbPersosR.setText("Nb de personnes restants : ");
        jPanel4.add(NbPersosR);

        JC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JC.setText("C'est à Lara de jouer !");
        jPanel4.add(JC);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        Demarrer.setText("Démarrer");
        Demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemarrerActionPerformed(evt);
            }
        });
        jPanel5.add(Demarrer);

        Recommencer.setText("Recommencer");
        Recommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecommencerActionPerformed(evt);
            }
        });
        jPanel5.add(Recommencer);

        jPanel2.add(jPanel5, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        jMenu1.setText("Paramètres");

        Options.setText("Options");
        Options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsActionPerformed(evt);
            }
        });
        jMenu1.add(Options);

        AjoutJoueur.setText("Ajout Joueur");
        AjoutJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutJoueurActionPerformed(evt);
            }
        });
        jMenu1.add(AjoutJoueur);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Visualiser");

        Joueurs.setText("Joueurs");
        Joueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoueursActionPerformed(evt);
            }
        });
        jMenu2.add(Joueurs);

        Cartes.setText("Cartes");
        Cartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartesActionPerformed(evt);
            }
        });
        jMenu2.add(Cartes);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RecommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecommencerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecommencerActionPerformed

    private void OptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsActionPerformed
        OptionDlg od = new OptionDlg(this,true); //appel du constructeur de la JDialog
        od.setVisible(true); //affichage de la JDialog
        if(od.getOk()==true){ //si le booléen renvoyé par la JDialog a la valeur true c'est-à-dire que des joueurs ont été créés et un niveau choisi
            this.joueurs.ajouteJoueurs(od.getJoueurs()); //on ajoute à la liste des joueurs de JeuMemory ceux créés dans la JDialog
            int niveau = od.getNiveau(); //on récupère le niveau sélectionnée et renvoyée dans la JDialog
            this.persos = new LesPersonnages(niveau); //on construit un paquet de personnages correspondant au niveau sélectionné grâce au constructeur prenant comme paramètre en entier
            this.monJeu = new Jeu(this.joueurs,this.persos,niveau);
        }
    }//GEN-LAST:event_OptionsActionPerformed

    private void CartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartesActionPerformed
        Joueur j=new Joueur("FanMemory", "commun"); //création d'un joueur test
        j.initPaquetTest(); //on lui affecte un paquet test
        VisuPersonnagesDlg vpd = new VisuPersonnagesDlg(this,true,j); //appel du constructeur de la JDialog
        vpd.setVisible(true); //affichage de la JDialog
    }//GEN-LAST:event_CartesActionPerformed

    private void JoueursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoueursActionPerformed
       VisuJoueursDlg visu = new VisuJoueursDlg(this,true,this.joueurs); //appel du constructeur de la JDialog
       visu.setVisible(true); //affichage de la JDialog
    }//GEN-LAST:event_JoueursActionPerformed

    private void AjoutJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutJoueurActionPerformed
        SaisieJoueurDlg sjd = new SaisieJoueurDlg(this,true,this.persos); //appel du constructeur de la JDialog
        sjd.setVisible(true); //affichage de la JDialog
        if(sjd.getOk()) //si le booléen renvoyé par la JDialog a la valeur true c'est-à-dire qu'un joueur a été créé
        {
            this.joueurs.ajouteJoueur(sjd.getJoueur()); //on ajoute le joueur renvoyé par la JDialog à la liste des joueurs
        }
    }//GEN-LAST:event_AjoutJoueurActionPerformed

    private void DemarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemarrerActionPerformed
       
        if(this.joueurs.getNbJoueurs()<2) //Si le nombre de joueurs est inférieur à 2 alors on message d'erreur est affiché dans la zone d'édition
            Edition.setText("Il n'y a pas assez de joueurs");
        else
        {
            //On rend les boutons valides ou pas selon le td 8
            Demarrer.setVisible(false);
            Recommencer.setVisible(true);
            Options.setVisible(false);
            AjoutJoueur.setVisible(false);
            Joueurs.setVisible(true);
            Cartes.setVisible(true);
            
            PlateauJeu p = monJeu.getMonP(); //On récupére le plateau, ce qui va rendre le code plus lisible
            NbPersosR.setText("Nombre de personnages restants: "+p.getNbp());//Mettre les personnages restants à jour
            NbPersosT.setText("Nombre de personnages trouvés: "+(this.persos.getTaille()- p.getNbp()));//Mettre les personnages trouvés à jour
            JC.setText("C'est à "+this.joueurs.getJoueur(this.monJeu.getIndice()).getPseudo()+" de jouer");//Mettre le joueur courant à jour
            
            //créer des boutons et les abonner à un écouteur de type « ActionListener » 
            //et donner un numéro à chaque bouton dans la propriété « Name »
            for (int i = 0; i < 2*this.persos.getTaille(); i++) {
                JButton bt = new JButton();
                bt.setName(""+i);
                bt.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evt){
                        boutonActionPerformed(evt);
                    }
                });
                Panneau.add(bt);
            }
            
        }
    }//GEN-LAST:event_DemarrerActionPerformed

    public void boutonActionPerformed(ActionEvent evt){
        
        JButton bt = (JButton)evt.getSource(); //récupérer le bouton cliqué

        int i = Integer.parseInt(bt.getName());  //récupérer l'indice du bouton 
        int l = i/this.monJeu.getMonP().getNbcol(); //Calculer la ligne du bouton cliqué
        int c = i%this.monJeu.getMonP().getNbcol();//Calculer la colonne du bouton cliqué

        Personnage p = this.persos.getPerso(this.monJeu.getMonP().getCase(l,c)); //récupérer le personnages

        p.setImgBouton(bt);//Mettre l'image u personnage sur le bouton (Révéler la carte)

        if(l1==-1&& c1==-1)//Si c'est le premier choix du joueur on initialise la colonne et la ligne du bouton cliqués
        {
            l1=l;
            c1=c;
        }
        else{//Si c'est le deuxième choix du joueur on initialise la colonne et la ligne du bouton cliqués
            l2=l;
            c2=c;
            startTimer();
        }
        
    }
    
    public void startTimer(){
        // définit un timer qui lance la vérification des deux personnages au bout d'une demi-seconde
        Timer t = new Timer(500, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                verifPersos();
            }
        });
        t.setRepeats(false);
        t.start();
    }
    
    public void verifPersos(){
        
        PlateauJeu p = this.monJeu.getMonP(); //On récupére le plateau, ce qui va rendre le code plus lisible
        Joueur j = this.joueurs.getJoueur(monJeu.getIndice()); //on récupére le joueur courant
        
        JButton bt1 = //le premier bouton cliqué
        JButton bt2 = //le deuxième bouton cliqué
                
        if(p.getCase(l1, c1) == p.getCase(l2, c2))//Si les personnages des deux cartes sont identiques (c’est-à-dire que les valeurs contenues dans les cases du plateau sont identiques)
        {
            String fam = this.persos.getPerso(p.getCase(l1, c1)).getFamille();//Récupération de la famille de ces personnages
            
            int bonus = traiteTour(j,p.getCase(l1, c1));//Traitement du tour de jeu avec un appel à la méthode « traiteTour » de la classe « Jeu »

            //Si le « bonus » est >= 0
            if(bonus>=0){
                //Affichage de message qui indique que le joueur a gagné tous les personnages la famille « fam » dans la zone d’édition
                Edition.append("\n"+j.getPseudo()+" a gagné tous les personnages de la famille "+fam+".");
                
                //Si le bonus = 0, c’est la famille préférée du joueur, le jeu se termine, un message indique le joueur gagnant, tous les boutons du jeu sont bloqués.
                if(bonus==0){
                    Edition.append("\n"+j.getPseudo()+" a gagné car il a gagné tous les personnages de sa famille préférée '"+j.getFamillePref()+"'.");
                    Demarrer.setVisible(false);
                    Recommencer.setVisible(false);
                    Options.setVisible(false);
                    AjoutJoueur.setVisible(false);
                    Joueurs.setVisible(false);
                    Cartes.setVisible(false);
                    p.termineJeu();
                }
                //Si le bonus = 1, un transfert doit être réalisé. La boite de dialogue « TransfertDlg » est ouverte, puis un message indique dans la zone d’édition le résultat du transfert. 
                if(bonus==1)
                {
                    Edition.append("\nUn transfert doit être réalisé");
                    TransfertDlg transfert = new TransfertDlg(this,true,this.joueurs,monJeu.getIndice());
                    transfert.setVisible(true);
                    if(transfert.getOk())
                    {
                        Edition.append(transfert.getTransfert().getDeroulement());
                    }
                }
                //Si le bonus = 2, une bataille doit être réalisée. La boite de dialogue « BatailleDlg » est ouverte, puis un message indique dans la zone d’édition le résultat de la bataille. 
                if(bonus==2)
                {
                    Edition.append("\nUne bataille va commencer");
                    BatailleDlg bataille = new BatailleDlg(this,true);
                    bataille.setVisible(true);
                    if(bataille.getOk())
                    {
                        Edition.append();//Afficher le résulat de la bataille
                    }
                }
            
                bonus=-1;//Réinitialisation de la valeur du bonus à -1.

                j = monJeu.getJoueurSuivant();//Le joueur courant change et est fixé au joueur suivant
            
            }
            
            p.invalide(l1, c1, l2, c2);//Les cartes sont retirées du plateau en utilisant la méthode invalide de la classe « PlateauJeu ».
            
            //S’il n’y plus de cartes à retourner (le plateau de jeu est vide), un message indique le ou
            //les gagnants dans la zone d’édition en utilisant la méthode « getGagnants » de la
            //classe « LesJoueurs ». 
            if(p.jeuVide())
            {
                Edition.append("\n"+joueurs.getGagnants());
            }
            //Sinon un message, ajouté dans la zone d’édition, indique qu’il s’agit du tour du joueur
            //suivant en donnant son pseudo.
            else
            {
                Edition.append("\nC'est le tour de "+);//Joueur Suivant pseudo
            }
            
            //Le nombre de personnages trouvés et restants est mis à jour.
            NbPersosR.setText("Nombre de personnages restants: "+p.getNbp());
            NbPersosT.setText("Nombre de personnages trouvés: "+(this.persos.getTaille()- p.getNbp()));
            

        }
        //Si les cartes sont différentes, les photos des cartes retournées sont « effacées », le joueur
        //courant est modifié au joueur suivant et l’affichage mis à jour
        else
        {
            //Retourner les cartes car elles ne sont pas identiques
        }
        //réinitialisation des valeurs des positions des cartes (l1,c1, l2, c2) à -1.
        this.l1=-1;
        this.c1=-1;
        this.l2=-1;
        this.c2=-1;
        
        
        
    }

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
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JeuMemory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AjoutJoueur;
    private javax.swing.JMenuItem Cartes;
    private javax.swing.JButton Demarrer;
    private javax.swing.JTextArea Edition;
    private javax.swing.JLabel JC;
    private javax.swing.JScrollPane JScrollp;
    private javax.swing.JMenuItem Joueurs;
    private javax.swing.JLabel NbPersosR;
    private javax.swing.JLabel NbPersosT;
    private javax.swing.JMenuItem Options;
    private javax.swing.JPanel Panneau;
    private javax.swing.JButton Recommencer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
