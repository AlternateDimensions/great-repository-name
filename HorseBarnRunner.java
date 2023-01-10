/*

 * Activity 3.7.3

 */
import java.util.ArrayList;

public class HorseBarnRunner

{

    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn();
        ArrayList<Horse> barnSpaces = barn.getSpaces();
        ArrayList<Horse> newOrder = new ArrayList<Horse>();
        int[] randOrder = RandomPermutation.next(barnSpaces.size());
        for (int i : randOrder){
            newOrder.add(barnSpaces.get(i-1));
        }
        for (int x = 0; x < newOrder.size(); x++){
            String text = newOrder.get(x).getName() + " and " + newOrder.get(x+1).getName();
            newOrder.remove(x+1);
            System.out.println(text);
        }
        
    }
}