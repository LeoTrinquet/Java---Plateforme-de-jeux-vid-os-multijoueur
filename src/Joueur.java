import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Joueur {

    private String pseudo;
    private String mail;
    private String dateNaissance;
    private Machine machineDeJeu;
    protected ArrayList<Jeu> listeJeux;
    protected ArrayList<Joueur> listeAmis;

    public static ArrayList<Joueur> listeJoueurs = new ArrayList<>();

    public Joueur(String pseudo, String mail, String dateNaissance, Machine machineDeJeu){
        this.pseudo = pseudo;
        this.mail = mail;
        this.dateNaissance = dateNaissance;
        this.machineDeJeu = machineDeJeu;
        this.listeJeux = new ArrayList<>();
        this.listeAmis = new ArrayList<>();
        this.listeJoueurs.add(this);
    }
    //============= SET =============
    public void setPseudo(String pseudo){
        this.pseudo = pseudo;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public void setDateNaissance(String dateNaissance){
        this.dateNaissance = dateNaissance;
    }

    public void setMachineDeJeu(Machine machineDeJeu){
        this.machineDeJeu = machineDeJeu;
    }

    //============= GET =============
    public String getPseudo(){
        return this.pseudo;
    }

    public String getMail(){
        return this.mail;
    }

    public String getDateNaissance(){
        return this.dateNaissance;
    }

    public Machine getMachineDeJeu(){
        return this.machineDeJeu;
    }

    public List<Jeu> getListeJeux(){
        return this.listeJeux;
    }
    public List<Joueur> getListeAmis(){
        return this.listeAmis;
    }

    //============= Fonctions =============

    public void ajouterJeu(Jeu jeu){
            this.listeJeux.add(jeu);
            jeu.nombreTelechargements += 1;
            System.out.println(jeu.name + " a bien été ajouté à votre liste de jeux");
    }
    public void retirerJeu(Jeu jeu){
        this.listeJeux.remove(jeu);
        jeu.nombreTelechargements -= 1;
        System.out.println(jeu.name + " a bien été supprimé de votre liste de jeux");
    }

    public void afficherInformationsJeu(Jeu jeu){
        System.out.println("Voici les informations du jeu :\n- Rang : " + jeu.rank + "\n- Nom : " + jeu.name + "\n- Plateforme : " + jeu.plateforme + "\n- Année de sortie : " + jeu.year + "\n- Genre : " + jeu.genre + "\n- Éditeur : " + jeu.publisher + "\n- Ventes en Amérique du Nord : " + jeu.NA_sales + "\n- Ventes en Europe : " + jeu.EU_sales + "\n- Autres ventes : " + jeu.other_sales + "\n- Ventes globales : " + jeu.global_sales);
        System.out.println(jeu.nombreTelechargements + " personnes possèdent le jeu dans leur collection.");
        System.out.println("Vous pouvez jouer à '" + jeu.name + "' avec le BOT :");
    }

    public void envoyerInvitationJeu(Jeu jeu, Joueur ami){
        Random joueurWin = new Random();
        boolean randomBoolean = joueurWin.nextBoolean();
        if (randomBoolean){
            System.out.println(this.getPseudo() + " a remporté la partie sur " + jeu.name + " !");
        }
        else{
            System.out.println(ami.getPseudo() + " a remporté la partie sur " + jeu.name + " !");
        }
    }

    protected abstract void offrirJeu(Jeu jeu, Joueur ami);
    protected abstract void ajouterAmi(Joueur ami);

    public void retirerAmi(Joueur ami){
        this.listeAmis.remove(ami);
    }

    public static Joueur connexionJoueur(String pseudo) {
        for (Joueur obj : listeJoueurs) {
            if (obj.getPseudo().equals(pseudo)) {
                return obj;
            }
        }
        return null;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Pseudo : "+ pseudo + "\nMail : " + mail + "\nDate de naissance : "+ dateNaissance);
        return sb.toString();
    }

}
