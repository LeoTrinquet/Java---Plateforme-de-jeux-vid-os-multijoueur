import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    private static Joueur joueurConnecte;

    public static void main(String[] args) {

        Jeu jeu1 = new Jeu(1,"Wii Sports","Wii",2006,"Sports","Nintendo",41.49,29.02,3.77,8.46,82.74);
        Jeu jeu2 = new Jeu(2,"Super Mario Bros.","NES",1985,"Platform","Nintendo",29.08,3.58,6.81,0.77,40.24);
        Jeu jeu3 = new Jeu(3,"Mario Kart Wii","Wii",2008,"Racing","Nintendo",15.85,12.88,3.79,3.31,35.82);
        Jeu jeu4 = new Jeu(4,"Wii Sports Resort","Wii",2009,"Sports","Nintendo",15.75,11.01,3.28,2.96,33);
        Jeu jeu5 = new Jeu(5,"Pokemon Red/Pokemon Blue","GB",1996,"Role-Playing","Nintendo",11.27,8.89,10.22,1,31.37);
        Jeu jeu6 = new Jeu(6,"Tetris","GB",1989,"Puzzle","Nintendo",23.2,2.26,4.22,0.58,30.26);
        Jeu jeu7 = new Jeu(7,"New Super Mario Bros.","DS",2006,"Platform","Nintendo",11.38,9.23,6.5,2.9,30.01);
        Jeu jeu8 = new Jeu(8,"Wii Play","Wii",2006,"Misc","Nintendo",14.03,9.2,2.93,2.85,29.02);
        Jeu jeu9 = new Jeu(9,"New Super Mario Bros. Wii","Wii",2009,"Platform","Nintendo",14.59,7.06,4.7,2.26,28.62);
        Jeu jeu10 = new Jeu(10,"Duck Hunt","NES",1984,"Shooter","Nintendo",26.93,0.63,0.28,0.47,28.31);

        Machine m1 = new Machine("PC");
        Machine m2 = new Machine("PS4");
        Machine m3 = new Machine("Nintendo");
        m1.ajouterJeu(jeu1);
        m1.ajouterJeu(jeu2);
        m1.ajouterJeu(jeu3);
        m1.ajouterJeu(jeu4);
        m1.ajouterJeu(jeu5);
        m1.ajouterJeu(jeu6);
        m1.ajouterJeu(jeu7);
        m1.ajouterJeu(jeu8);
        m1.ajouterJeu(jeu9);
        m1.ajouterJeu(jeu10);

        Gold j1 = new Gold("Simon","Simon@gmail.com", "01/02/98", m1);
        /*j1.ajouterJeu(jeu1);
        j1.ajouterJeu(jeu2);
        j1.ajouterJeu(jeu3);
        j1.ajouterJeu(jeu4);
        j1.ajouterJeu(jeu5);
        j1.ajouterJeu(jeu6);
        j1.ajouterJeu(jeu7);
        j1.ajouterJeu(jeu8);
        j1.ajouterJeu(jeu9);
        j1.ajouterJeu(jeu10);*/

        Standard j2 = new Standard("Axel","Axel@gmail.com", "01/03/98", m1);
        /*j2.ajouterJeu(jeu1);
        j2.ajouterJeu(jeu2);
        j2.ajouterJeu(jeu3);
        j2.ajouterJeu(jeu4);
        j2.ajouterJeu(jeu5);
        j2.ajouterJeu(jeu6);
        j2.ajouterJeu(jeu7);
        j2.ajouterJeu(jeu8);
        j2.ajouterJeu(jeu9);
        j2.ajouterJeu(jeu10);*/

        Bot j3 = new Bot("Adrien","Adrien@gmail.com", "01/04/98", m1);
        /*j3.ajouterJeu(jeu1);
        j3.ajouterJeu(jeu2);
        j3.ajouterJeu(jeu3);
        j3.ajouterJeu(jeu4);
        j3.ajouterJeu(jeu5);
        j3.ajouterJeu(jeu6);
        j3.ajouterJeu(jeu7);
        j3.ajouterJeu(jeu8);
        j3.ajouterJeu(jeu9);
        j3.ajouterJeu(jeu10);*/

        Enfant j4 = new Enfant("Ivan","Ivan@gmail.com", "01/05/98", m1);
        /*j4.ajouterJeu(jeu1);
        j4.ajouterJeu(jeu2);
        j4.ajouterJeu(jeu3);
        j4.ajouterJeu(jeu4);
        j4.ajouterJeu(jeu5);
        j4.ajouterJeu(jeu6);
        j4.ajouterJeu(jeu7);
        j4.ajouterJeu(jeu8);
        j4.ajouterJeu(jeu9);
        j4.ajouterJeu(jeu10);*

        Enfant j5 = new Enfant("Didier","Didier@gmail.com", "01/06/98", m1);
        /*j5.ajouterJeu(jeu1);
        j5.ajouterJeu(jeu2);
        j5.ajouterJeu(jeu3);
        j5.ajouterJeu(jeu4);
        j5.ajouterJeu(jeu5);
        j5.ajouterJeu(jeu6);
        j5.ajouterJeu(jeu7);
        j5.ajouterJeu(jeu8);
        j5.ajouterJeu(jeu9);
        j5.ajouterJeu(jeu10);*/
        System.out.println("================================");

        /*System.out.println(j1.toString());
        System.out.println(m1.toString());*/

        java.util.Scanner scan = new java.util.Scanner(System.in);

        int execute = -1;
        while(execute != 0){

            System.out.println("1. Connexion en tant que joueur");
            System.out.println("2. Connexion en tant qu'admin");
            System.out.println("3. Quitter");

            int val = scan.nextInt();

            switch (val){

                case 1:
                    ConnexionJoueur(scan);
                    break;

                case 2:
                    ConnexionAdmin(scan);
                    break;

                case 3:
                    System.out.println("Vous avez quitté.");
                    execute = 0;
                    break;

                default:
                    System.out.println("Saisie invalide, entrez un nombre valide.");
                    break;
            }
        }


    }

    public static void ConnexionJoueur(Scanner scan){
        System.out.println("Saisissez votre pseudo.");
        scan.nextLine();
        String pseudo = scan.nextLine();

        joueurConnecte = Joueur.connexionJoueur(pseudo);
        if (joueurConnecte != null){
                System.out.println("Vous êtes bien connecté sous le pseudo " + pseudo);
                boolean connected = true;
                while(connected){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Le thread a été interrompu");
                    }
                    System.out.println("---------------------------------");
                    System.out.println("1. Afficher mes informations ");
                    System.out.println("2. Ajouter un joueur en ami");
                    System.out.println("3. Retirer un ami");
                    System.out.println("4. Afficher les informations pour un jeu");
                    System.out.println("5. Créer un compte enfant");
                    System.out.println("6. Ajouter un jeu à ma collection");
                    System.out.println("7. Offrir un jeu à un ami");
                    System.out.println("8. Envoyer une invitation à jouer à un ami");
                    System.out.println("9. Se désinscrire");
                    System.out.println("10. Se déconnecter");
                    System.out.println("---------------------------------");

                    int val = scan.nextInt();

                    switch (val){

                        case 1:
                            afficherMesInfos();
                            break;
                        case 2:
                            ajouterAmi(scan);
                            break;
                        case 3:
                            retirerAmi(scan);
                            break;
                        case 4:
                            afficherInfosJeu(scan);
                            break;
                        case 5:
                            creerCompteEnfant(scan);
                            break;
                        case 6:
                            ajouterJeu(scan);
                            break;
                        case 7:
                            offrirJeu(scan);
                            break;
                        case 8:
                            envoyerInvitationJeu(scan);
                            break;
                        case 9:
                            connected = desinscriptionJoueur(scan);
                            break;
                        case 10:
                            connected = false;
                            break;

                        default:
                            System.out.println("Saisie invalide, entrez un nombre valide.");
                            break;
                    }
                }
        }
        else{
            System.out.println("Erreur, le compte n'existe pas.");
        }
    }

    public static void afficherMesInfos(){
        String txt = "";
        for (int i=0 ; i<joueurConnecte.getListeJeux().size() ; i++){
            txt = txt + joueurConnecte.getListeJeux().get(i).name;
            if (i < joueurConnecte.getListeJeux().size()-1){
                txt = txt + ", ";
            }
        }
        System.out.println("Jeux possédés : " + txt);
        System.out.println("Ratio de victoire : 2");
        System.out.println("Nombre d'amis : " + joueurConnecte.getListeAmis().size());
    }

    public static void ajouterAmi(Scanner scan){
        System.out.println("Sélectionnez le joueur à ajouter: ");
        for (int i=0 ; i<Joueur.listeJoueurs.size() ; i++){
            System.out.println((i+1) + ". " + Joueur.listeJoueurs.get(i).getPseudo());
        }
        int val = scan.nextInt();

        Joueur ami = Joueur.listeJoueurs.get(val-1);
        joueurConnecte.ajouterAmi(ami);
    }

    public static void retirerAmi(Scanner scan){
        System.out.println("Sélectionnez le joueur à retirer: ");
        for (int i=0 ; i<joueurConnecte.getListeAmis().size() ; i++){
            System.out.println((i+1) + ". " + joueurConnecte.getListeAmis().get(i).getPseudo());
        }
        int val = scan.nextInt();

        Joueur ami = joueurConnecte.getListeAmis().get(val-1);
        joueurConnecte.retirerAmi(ami);
        System.out.println("Le joueur " + ami.getPseudo() + " a bien été retiré de votre liste d'amis.");
    }

    public static boolean desinscriptionJoueur(Scanner scan){
        System.out.println("Êtes-vous sûr de vouloir vous désinscrire ?");
        System.out.println("1. Oui");
        System.out.println("2. Non");

        int val = scan.nextInt();
        if(val == 1){
            Joueur.listeJoueurs.remove(joueurConnecte);
            joueurConnecte = null;
            return false;
        }
        return true;
    }

    public static void afficherInfosJeu(Scanner scan){
        System.out.println("Pour quel jeu voulez-vous connaître les informations ?");
        for (int i=0 ; i<Jeu.listeJeux.size() ; i++){
            System.out.println((i+1) + ". " + Jeu.listeJeux.get(i).name);
        }
        int val = scan.nextInt();
        joueurConnecte.afficherInformationsJeu(Jeu.listeJeux.get(val-1));
    }

    public static void creerCompteEnfant(Scanner scan){
        System.out.println("Renseignez le pseudo de l'enfant :");
        scan.nextLine();
        String pseudo = scan.nextLine();
        System.out.println("Renseignez le mail de l'enfant :");
        String mail = scan.nextLine();
        System.out.println("Renseignez la date de naissance de l'enfant (xx/xx/xx) :");
        String date = scan.nextLine();
        System.out.println("Renseignez la machine de l'enfant :");
        for (int i=0 ; i<Machine.listeMachine.size() ; i++){
            System.out.println((i+1) + ". " + Machine.listeMachine.get(i).getNom());
        }
        int ind_machine = scan.nextInt();

        if(joueurConnecte instanceof Gold){
            ((Gold) joueurConnecte).inscrireEnfant(pseudo, mail, date, Machine.listeMachine.get(ind_machine-1));
        }
        else if(joueurConnecte instanceof Standard){
            ((Standard) joueurConnecte).inscrireEnfant(pseudo, mail, date, Machine.listeMachine.get(ind_machine-1));
        }
    }

    public static void ajouterJeu(Scanner scan){
        System.out.println("Quel jeu voulez-vous ajouter à votre collection ?");
        for (int i=0 ; i<Jeu.listeJeux.size() ; i++){
            System.out.println((i+1) + ". " + Jeu.listeJeux.get(i).name);
        }
        int val = scan.nextInt();
        joueurConnecte.ajouterJeu(Jeu.listeJeux.get(val-1));
    }

    public static void offrirJeu(Scanner scan){
        System.out.println("Sélectionnez le joueur à qui offrir un jeu: ");
        for (int i=0 ; i<joueurConnecte.getListeAmis().size() ; i++){
            System.out.println((i+1) + ". " + joueurConnecte.getListeAmis().get(i).getPseudo());
        }
        int val = scan.nextInt();
        Joueur ami = joueurConnecte.getListeAmis().get(val-1);


        System.out.println("Sélectionnez le jeu à offrir à " + ami.getPseudo());
        for (int i=0 ; i<Jeu.listeJeux.size() ; i++){
            System.out.println((i+1) + ". " + Jeu.listeJeux.get(i).name);
        }
        int val2 = scan.nextInt();
        Jeu jeu = Jeu.listeJeux.get(val2-1);

        joueurConnecte.offrirJeu(jeu, ami);
        System.out.println(jeu + " a bien été offert à " + ami);
    }

    public static void envoyerInvitationJeu(Scanner scan){
        System.out.println("Sélectionnez l'ami avez qui vous voulez jouer :");
        for (int i=0 ; i<joueurConnecte.getListeAmis().size() ; i++){
            System.out.println((i+1) + ". " + joueurConnecte.getListeAmis().get(i).getPseudo());
        }
        int val = scan.nextInt();
        Joueur ami = joueurConnecte.getListeAmis().get(val-1);

        System.out.println("Sélectionnez le jeu sur lequel vous souhaitez affronter " + ami.getPseudo());
        for (int i=0 ; i<Jeu.listeJeux.size() ; i++){
            System.out.println((i+1) + ". " + Jeu.listeJeux.get(i).name);
        }
        int val2 = scan.nextInt();
        Jeu jeu = Jeu.listeJeux.get(val2-1);

        joueurConnecte.envoyerInvitationJeu(jeu, ami);
    }

    public static void ConnexionAdmin(Scanner scan){
        System.out.println("Saisissez votre pseudo.");
        scan.nextLine();
        String pseudo = scan.nextLine();

        joueurConnecte = Joueur.connexionJoueur(pseudo);
        if (joueurConnecte != null){
            System.out.println("Vous êtes bien connecté en tant qu'administrateur sous le pseudo " + pseudo);
            boolean connected = true;
            while(connected){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Le thread a été interrompu");
                }
                System.out.println("---------------------------------");
                System.out.println("1. Inscrire un nouveau joueur ");
                System.out.println("2. Afficher les informations d'un joueur");
                System.out.println("3. Créer un bot pour un jeu");
                System.out.println("4. Afficher les informations pour un jeu");
                System.out.println("5. Offrir un jeu à un ami");
                System.out.println("6. Se déconnecter");
                System.out.println("---------------------------------");

                int val = scan.nextInt();

                switch (val){

                    case 1:
                        //inscrireJoueur();
                        break;
                    case 2:
                        //afficherInfosJoueur(scan);
                        break;
                    case 3:
                        //creerBot(scan);
                        break;
                    case 4:
                        afficherInfosJeu(scan);
                        break;
                    case 5:
                        offrirJeu(scan);
                        break;
                    case 6:
                        connected = false;
                        break;
                    default:
                        System.out.println("Saisie invalide, entrez un nombre valide.");
                        break;
                }
            }
        }
        else{
            System.out.println("Erreur, le compte n'existe pas.");
        }
    }




}