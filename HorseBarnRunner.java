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
        System.out.println("Original: "+barnSpaces+"\n");
        System.out.println("Shuffled: "+newOrder+"\n\nPairs:\n");
        while(newOrder.size() > 1){
            int random = 0;
            while (random == 0){
                random = (int) (Math.random()*(newOrder.size()));
            }

            String text = newOrder.remove(0).getName() + " and " + newOrder.remove((int) (Math.random()*(newOrder.size()-1))).getName();
            System.out.println(text);

        }
        System.out.println(newOrder.get(0).getName() +" has no pair :(");
        
    }
}