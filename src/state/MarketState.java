package state;

public class MarketState extends BaseState{
    @Override
    public void doAction(Context context, String action) {
        action = action.toUpperCase();

    }
}
