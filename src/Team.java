import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Team, every team could have multiply players.
 */
public class Team<T> implements Iterable<T> {
    private String symbol;
    private List<T> list;
    private int point = 0;

    public Team(String symbol) {
        this.symbol = symbol;
        this.list = new ArrayList<>();
    }

    public void addPlayer(T player) {
        this.list.add(player);
    }

    public void addPlayers(T[] players) {
        this.list.addAll(List.of(players));
    }

    // the next player to play game.
    public T nextPlayer() {
        if (point >= list.size())
            point = 0;
        return list.get(point++);
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public Iterator<T> iterator() {
        return new TeamIterator<>();
    }

    public class TeamIterator<T> implements Iterator<T> {

        private int cursor;

        public TeamIterator() {
            cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public T next() {
            T item = (T) list.get(cursor);
            cursor++;
            return item;
        }
    }
}


