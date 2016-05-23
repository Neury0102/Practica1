

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
        Elements forms = doc.select("form");

        System.out.println("Cantidad de parrafos: "+parrafos.size());
        System.out.println("Cantidad de imagenes: "+imagenes.size());
        System.out.println("Cantidad de form: "+forms.size());
        System.out.println("Catidad de lineas: "+doc.html().split("\n").length);


        for (int i=0;i<forms.size();i++)
        {
            System.out.println("formulario " + (i+1));
            Elements input= forms.get(i).select("input");
            for(int j=0; j<input.size();j++)
            {
                System.out.println("\tTipo de input: "+input.get(j).attr("type"));
            }
        }


        in.close();
    }

}