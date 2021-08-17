import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Pago {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        ArrayList<String> list=new ArrayList<String>();

        while(true) {

            String t = text();

            String[] result = t.split("&");
            String f = result[0];


            if ((f.equals("1"))){

                String tar = result[1];

                if (tar.equals("Credito") ) {

                    list.add(t);

                }

                if (tar.equals("Debito") ) {

                    list.add(t);

                }

            }

            if ((f.equals("2"))){

                System.out.println("***Inventario de tarjetas***");

                for(String name:list) {
                    String[] res = name.split("&");

                    if (res[1].equals("Credito") ) {

                        System.out.println("    Tarjeta Credito - Código: "+ res[4]);
                        System.out.println("    dinero: "+ res[3] + " pesos");
                        System.out.println("    año: "+ res[2]);
                        System.out.println("    franquicia: "+ res[5]);

                    }

                    if (res[1].equals("Debito") ) {

                        System.out.println("    Tarjeta Debito - Código:"+ res[4]);
                        System.out.println("    dinero: "+ res[3] + " pesos");
                        System.out.println("    año: "+ res[2]);
                        System.out.println("    Dinero disponible: "+ res[5] + " pesos");

                    }

                }

            }

            if ((f.equals("3"))) break;

        }

    }

    public static String text() throws IOException {

        //Scanner s = new Scanner(System.in);

        String t;
        t = scanner.nextLine();
        return t;


    }

}