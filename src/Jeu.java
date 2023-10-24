import java.util.ArrayList;

public class Jeu {

    public static ArrayList<Jeu> listeJeux = new ArrayList<>();
    public int nombreTelechargements = 0;

    public int rank;
    public String name;
    public String plateforme;
    public int year;
    public String genre;
    public String publisher;
    public double NA_sales;
    public double EU_sales;
    public double JP_sales;
    public double other_sales;
    public double global_sales;
    public Jeu(int rank, String name, String plateforme, int year, String genre, String publisher, double NA_sales, double EU_sales, double JP_sales, double other_sales, double global_sales){
        this.rank = rank;
        this.name = name;
        this.plateforme = plateforme;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        this.NA_sales = NA_sales;
        this.EU_sales = EU_sales;
        this.JP_sales = JP_sales;
        this.other_sales = other_sales;
        this.global_sales = global_sales;
        this.listeJeux.add(this);
    }

}
