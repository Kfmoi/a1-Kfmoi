package pk;
import java.util.Random;


public class Random_num {
    public static int randomnum(int count){
        Random selection = new Random();
        int high = 8;
        int low =2;
        int determine = high-count;
        int rndmpick = selection.nextInt(determine-low)+low;
        return rndmpick;
    }
}
