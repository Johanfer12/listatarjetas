public class Tarjeta {

    public static void words(String[] s) {

        String f = s[1];

        if (f.equals("Debito")) {

            new Debito(Integer.valueOf(s[2]),Integer.valueOf(s[3]),Integer.valueOf(s[4]),Integer.valueOf(s[5]),1);
            System.out.println(f);
            //cont = cont + 1;
        }

        if (f.equals("Credito")) {

            System.out.println(f);
        }

        if (!f.equals("Credito") && !f.equals("Debito")) {

            return;
        }

    }

    public static void total() {
        System.out.println("***Inventario de tarjetas***");

    }
}