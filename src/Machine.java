import java.util.ArrayList;
import java.util.List;

public class Machine {

    private String nom;
    private ArrayList<Jeu> listeJeux;
    public static ArrayList<Machine> listeMachine = new ArrayList<>();

    public Machine(String nom){
        this.nom = nom;
        this.listeJeux = new ArrayList<>();
        listeMachine.add(this);
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public List<Jeu> getListeJeux(){
        return this.listeJeux;
    }

    public void ajouterJeu(Jeu jeu){
        this.listeJeux.add(jeu);
    }

    public void retirerJeu(Jeu jeu){
        this.listeJeux.remove(jeu);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom : "+ nom);
        for (int i=0 ; i<listeJeux.size() ; i++){
            sb.append("\nJeu " + (i+1) + " : " + listeJeux.get(i));
        }
        return sb.toString();
    }
}
