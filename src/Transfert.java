/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aorus
 */
public class Transfert extends Action {
    
    private Joueur cible; //joueur cible du transfert
    private String fp; //famille de la carte sélectionnée
    private LesPersonnages cartesTransferees; // cartes transférées
    
    //Accesseurs des attributs
    public LesPersonnages getCartesTransferees() {
        return cartesTransferees;
    }
    
    public Joueur getJoueurCible(){ 
        return this.cible; 
    }
    
    //Constructeur de la classe à 3 paramètres
    public Transfert(Joueur sc, Joueur c, String f) {
        super(sc, "Transfert de cartes"); //Appel du constructeur de la classe mère
        //Initialisation des attributs
        this.cible = c;
        this.fp = f;
        this.cartesTransferees = new LesPersonnages();
    }
    
    public int execute() { 
        int res=-1;
        if(this.fp != null){
            this.cartesTransferees = this.cible.getPaquet().retirePersosFamille(this.fp);
            this.getJ().getPaquet().ajoutePersos(cartesTransferees);
            this.setDeroulement(this.getJ().getPseudo()+" a récupéré les cartes de la famille "+fp+" de "+this.cible.getPseudo());
            if(this.cartesTransferees.getTaille() == 0){
                res = 0;
            }
            else
                res = this.cartesTransferees.getTaille();
        }
        return res;
    }
}