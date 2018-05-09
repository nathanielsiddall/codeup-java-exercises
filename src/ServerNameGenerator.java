import java.util.Random;


public class ServerNameGenerator {

   static String [] noun = new String[]
           {"time","year","people","way","day","man","thing","life","woman","child"};

   static String adjective[] = new String[]
           {"good", "new", "first","last","long","great", "little","own", "other", "old"};

    public static int rando(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max) + min;
    }

    public static String serverName() {
        int random1 = rando(0, 10);
        int random2 = rando(0, 10);

        return noun[random1] + " " + adjective[random2];
    }


    public static void main(String[] args) {




    }






}
