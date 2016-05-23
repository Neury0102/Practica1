

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


/**
 * Created by Dell_2 on 5/21/2016.
 */
public class Practica {


    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        System.out.println("URL por favor:");
        String url = in.nextLine();

        Document doc = Jsoup.connect(url).get();
        Elements parrafos = doc.select("p");
        Elements imagenes = doc.select("img");
        Elements form = doc.select("fomm");

        System.out.println("Cantidad de parrafos: "+parrafos.size());
        System.out.println("Cantidad de imagenes: "+imagenes.size());
        System.out.println("Cantidad de form"+form.size());
        System.out.println("Catidad de lineas"+doc.html().split("\n").length);





        in.close();
    }

}