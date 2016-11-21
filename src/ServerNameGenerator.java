/**
 * Created by anthonyfortney on 11/21/16.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] listOfNouns = {"analyst","mud","professor","kitty","rock","historian","death","director","distribution","spoon","computer","blood"};
        String[] listOfAdjectives = {"miniature","victorious","fluffy","hungry","disagreeable","gorgeous","disillusioned","technical","subdued","adhesive","decisive","careless"};

        int nounsLength = listOfNouns.length;
        int adjectiveLength = listOfAdjectives.length;

        int randnouns = (int) (Math.random() * nounsLength);
        int randadjectives = (int) (Math.random() * adjectiveLength);

        String serverName = listOfAdjectives[randadjectives] + " " + listOfNouns[randnouns];
        System.out.println("Your new server name is " + serverName);
    }
}
