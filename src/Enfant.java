public class Enfant extends Joueur{

    protected int MAX_JEUX = 30;
    final int MAX_AMIS = 10;
    public Enfant(String pseudo, String mail, String dateNaissance, Machine machineDeJeu){
        super(pseudo, mail, dateNaissance, machineDeJeu);
    }

    public void ajouterJeu(Jeu jeu){
        if (this.listeJeux.size() < MAX_JEUX){
            this.listeJeux.add(jeu);
            jeu.nombreTelechargements += 1;
            System.out.println(jeu.name + " a bien été ajouté à votre liste de jeux");

        }
        else {
            System.out.println(jeu.name + " n'a pas pu être ajouté à votre liste de jeux, la limite de " + MAX_JEUX + " a été atteinte.");
        }
    }

    public void ajouterAmi(Joueur ami){
        if (this.listeAmis.size() <= MAX_AMIS){
            if (ami instanceof Enfant){
                this.listeAmis.add(ami);
                System.out.println(ami.getPseudo() + " a bien été ajouté à votre liste d'amis.");
            }
            else{
                System.out.println("Vous ne pouvez ajouter que des enfants à votre liste d'amis.");
            }
        }
        else {
            System.out.println(ami.getPseudo() + " n'a pas pu être ajouté à votre liste d'amis, la limite de " + MAX_AMIS + " a été atteinte.");
        }
    }

    public void offrirJeu(Jeu jeu, Joueur ami){
        System.out.println("Un enfant ne peut pas offrir de jeu");
    }

}
