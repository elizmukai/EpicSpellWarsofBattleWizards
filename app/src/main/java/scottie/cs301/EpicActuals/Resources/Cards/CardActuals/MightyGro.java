package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import java.io.Serializable;

import scottie.cs301.EpicActuals.Resources.Cards.Card;
import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;
import scottie.cs301.Imports.GameFramework.R;

/**
 * Created by mukai18 on 4/12/2016.
 *
 * heals caster by 2. if caster is the weakest player, he heals additional 1 health point
 */
public class MightyGro extends CardNode implements Serializable{
    //to satisfy the Serializable interface
    private static final long serialVersionUID = 3339755561382710158L;
    protected MightyGro() {
        super(22, 0, 2, R.drawable.mightygro, SCHOOL.PRIMAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        heal(myCasterNum, 2, currentState);
        int weakest = returnWeakest(currentState);

        if (weakest == myCasterNum) {
            heal(myCasterNum, 1, currentState);
        }
    }
}
