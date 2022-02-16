
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/******
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author unknown
 */
public class VisuJoueursDlg extends javax.swing.JDialog {

    /**
     * Creates new form VisuJoueursDlg
     */
    LesJoueurs lj; 
    public VisuJoueursDlg(java.awt.Frame parent, boolean modal, LesJoueurs lj) {
        super(parent, modal);
        initComponents();
        this.lj=lj;
        initTrombi();
        
    }
    
    private void initTrombi(){
        int nb = this.lj.getNbJoueurs();
        Panneau.setLayout(new GridLayout(1, nb));
        for (int i=0; i< nb; i++)
        {
            JButton jb= new JButton();
            Joueur j= lj.getJoueur(i);
            jb.setName(""+i);
            jb.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficheInfosJoueur(evt);
                }
                });
        
        Panneau.add(jb);
        }
        this.pack();
    } // pour ajuster correctement la taille des composants après les ajouts si besoin

    private void AfficheInfosJoueur(java.awt.event.ActionEvent evt) {
        JButton jb = (JButton) evt.getSource();
        Edition.setText(lj.getJoueur(Integer. parseInt(jb.getName())).toString());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Afficher = new javax.swing.JButton();
        Panneau = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setText("Choisissez une joueur pour voir ses caractéristiques");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        Afficher.setText("Afficher");
        Afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherActionPerformed(evt);
            }
        });
        jPanel3.add(Afficher);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout PanneauLayout = new javax.swing.GroupLayout(Panneau);
        Panneau.setLayout(PanneauLayout);
        PanneauLayout.setHorizontalGroup(
            PanneauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        PanneauLayout.setVerticalGroup(
            PanneauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        getContentPane().add(Panneau, java.awt.BorderLayout.CENTER);

        Edition.setEditable(false);
        Edition.setColumns(20);
        Edition.setLineWrap(true);
        Edition.setRows(5);
        Edition.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Edition);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherActionPerformed
        JButton jb;
        for(int i =0;i<Panneau.getComponents().length;i++)
        {
            jb= (JButton)Panneau.getComponent(i);
           Image image = this.lj.getJoueur(i).getPhoto().getImage();
           Image adaptee = image.getScaledInstance(jb.getWidth(), jb.getHeight(), Image.SCALE_SMOOTH);
            jb.setIcon(new ImageIcon(adaptee));
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
            java.util.logging.Logger.getLogger(VisuJoueursDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuJoueursDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuJoueursDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuJoueursDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VisuJoueursDlg dialog = new VisuJoueursDlg(new javax.swing.JFrame(), true,null);
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
    private javax.swing.JTextArea Edition;
    private javax.swing.JPanel Panneau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
