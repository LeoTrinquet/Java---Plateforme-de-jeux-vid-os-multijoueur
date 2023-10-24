public class Bot extends Joueur {

    public Bot(String pseudo, String mail, String dateNaissance, Machine machineDeJeu){
        super(pseudo, mail, dateNaissance, machineDeJeu);
    }

    public void ajouterAmi(Joueur ami){
        System.out.println("Un bot ne peut pas avoir d'amis.");
    }

    public void offrirJeu(Jeu jeu, Joueur ami){
        System.out.println("Un bot ne peut pas offrir de jeu");
    }
}
