package RPSGame;

//Create and name two player classes (subclasses of Player).
//One of these players should always select rock.

/**
 * Created by anthonyfortney on 12/1/16.
 */
public class RockPlayer extends Player {

    @Override
    public String generateRoshambo() {
        return Roshambo.ROCK.toString();
    }
}
