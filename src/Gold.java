import java.util.ArrayList;

public class Gold extends Joueur {

    private ArrayList<Enfant> listeEnfants;
    public Gold(String pseudo, String mail, String dateNaissance, Machine machineDeJeu){
        super(pseudo, mail, dateNaissance, machineDeJeu);
        listeEnfants = new ArrayList<>();
    }

    public void ajouterAmi(Joueur ami){
        if (!(ami instanceof Enfant) || (this.listeEnfants.contains(ami))){
            this.listeAmis.add(ami);
            System.out.println(ami.getPseudo() + " a bien été ajouté à votre liste d'amis.");
        }
        else {
            System.out.println(ami.getPseudo() + " n'a pas pu être ajouté à votre liste d'amis, ce n'est pas votre enfant.");
        }
    }

    public Enfant inscrireEnfant(String pseudo, String mail, String dateNaissance, Machine machineDeJeu){
        Enfant enfant = new Enfant(pseudo, mail, dateNaissance, machineDeJeu);
        this.listeEnfants.add(enfant);
        System.out.println(pseudo + " a bien été inscrit en tant qu'enfant avec les informations suivantes :\nMail : " + mail + "\nDate de naissance : " + dateNaissance + "\nMachine : " + machineDeJeu.getNom());
        return enfant;
    }

    public void offrirJeu(Jeu jeu, Joueur ami){
        if (ami instanceof Enfant){
            if (ami.listeJeux.size() < ((Enfant) ami).MAX_JEUX){
                ami.ajouterJeu(jeu);
                jeu.nombreTelechargements += 1;
                System.out.println(jeu.name + " a bien été ajouté à la collection de " + ami.getPseudo());
            }
            else{
                System.out.println(jeu.name + " n'a pas pu être ajouté à la collection de " + ami.getPseudo() + ", la limite de " + ((Enfant) ami).MAX_JEUX + " a été atteinte.");
            }
        }
        else if (ami instanceof  Standard) {
            if (ami.listeJeux.size() < ((Standard) ami).MAX_JEUX){
                ami.ajouterJeu(jeu);
                jeu.nombreTelechargements += 1;
                System.out.println(jeu.name + " a bien été ajouté à la collection de " + ami.getPseudo());
            }
            else{
                System.out.println(jeu.name + " n'a pas pu être ajouté à la collection de " + ami.getPseudo() + ", la limite de " + ((Standard) ami).MAX_JEUX + " a été atteinte.");
            }
        }
        else{
            ami.ajouterJeu(jeu);
            jeu.nombreTelechargements += 1;
            System.out.println(jeu.name + " a bien été ajouté à la collection de " + ami.getPseudo());
        }
    }
}
