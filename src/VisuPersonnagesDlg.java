
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author thoar
 */
public class VisuPersonnagesDlg extends javax.swing.JDialog {

    /**
     * Creates new form VisuPersonnagesDlg
     */
     
    //déclaration de l'attribut 
    private Joueur joueur;
    
    public VisuPersonnagesDlg(java.awt.Frame parent, boolean modal, Joueur joueur) {
        super(parent, modal); //appel du constructeur de la classe mère
        initComponents();
        //this.joueur = joueur;
        /*LesPersonnages p = new LesPersonnages(4);
        joueur = new Joueur("Lara", "epiques");
        this.joueur.setPhoto(new ImageIcon(getClass().getResource("/img/lara.jpg")));
        this.joueur.setPaquet(p);*/
        //initialisation de l'attribut avec le joueur passé en paramètre
        this.joueur = joueur;
        Joueur.setText("Cartes du joueur : "+this.joueur.getPseudo()); //modification du JLabel Joueur de la JDialog
        Score.setText("Score : "+this.joueur.getScore()); //modification du JLabel Score de la JDialog
        //appel d'une méthode pour construire dynamiquement le trombinoscope des personnages du joueur
        initPanneau();
    }
    
    //Stratégie du panneau et ajout des boutons pour afficher les photos
    public void initPanneau(){
        int taille = this.joueur.getPaquet().getTaille(); //récupération de la taille du paquet du joueur
        trombinoscope.setLayout(new GridLayout(taille-1,taille-1)); //application au JPanel trombinoscope d'une stratégie GridLayout en fonction du nombre de cartes du joueur
        for(int i=0;i<this.joueur.getPaquet().getTaille();i++){
            JButton jb = new JButton(); //déclaration d'un nouveau bouton
            trombinoscope.add(jb); //on ajoute le bouton au trombinoscope
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

        jPanel_CENTER = new javax.swing.JPanel();
        Joueur = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        trombinoscope = new javax.swing.JPanel();
        Afficher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel_CENTER.setLayout(new java.awt.BorderLayout());

        Joueur.setText("Cartes du joueur :");
        jPanel_CENTER.add(Joueur, java.awt.BorderLayout.NORTH);

        Score.setText("Score : ");
        jPanel_CENTER.add(Score, java.awt.BorderLayout.SOUTH);

        trombinoscope.setLayout(new java.awt.GridLayout(2, 2));
        jPanel_CENTER.add(trombinoscope, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel_CENTER, java.awt.BorderLayout.CENTER);

        Afficher.setText("Afficher");
        Afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherActionPerformed(evt);
            }
        });
        getContentPane().add(Afficher, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherActionPerformed
        for(int i=0;i<this.joueur.getPaquet().getTaille();i++){ //on parcourt la liste de personnages
            JButton jb = (JButton)trombinoscope.getComponent(i); //on récupère le bouton d'indice i dans le JPanel
            this.joueur.getPaquet().getPerso(i).setImgBouton(jb);  //on affecte à ce bouton la photo du personnage correspondant
        } 
    }//GEN-LAST:event_AfficherActionPerformed

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
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VisuPersonnagesDlg dialog = new VisuPersonnagesDlg(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Afficher;
    private javax.swing.JLabel Joueur;
    private javax.swing.JLabel Score;
    private javax.swing.JPanel jPanel_CENTER;
    private javax.swing.JPanel trombinoscope;
    // End of variables declaration//GEN-END:variables
}
