package factory;

import bean.monster.Monster;
import utils.Dice;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MonsterFactory {
    private String dragons, exoskeleton, spirit;

    public MonsterFactory() {
        dragons = "config/Dragons.txt";
        exoskeleton = "config/Exoskeletons.txt";
        spirit = "config/Spirits.txt";
    }

    public List<Monster> readAll(String path) {
        List<Monster> monsters = new ArrayList<>();
        int type = 0;
        if (path.equals(dragons)) {
            type = Monster.DRAGON;
        } else if (path.equals(exoskeleton)) {
            type = Monster.EXOSKELETON;
        } else if (path.equals(spirit)) {
            type = Monster.SPIRIT;
        }

        Iterator<String> iterator = FileUtils.readFile(path).iterator();
        // skip first line
        iterator.next();
        while (iterator.hasNext()) {
            String[] array = iterator.next().split("[\s\t]+");
            monsters.add(new Monster(type, array));
        }

        return monsters;
    }

    public List<Monster> randomChoose(int count, int level) {
        List<Monster> all = readAll(dragons).stream().filter(m -> m.getLevel() <= level + 1).collect(Collectors.toList());
        all.addAll(readAll(exoskeleton).stream().filter(m -> m.getLevel() <= level + 1).collect(Collectors.toList()));
        all.addAll(readAll(spirit).stream().filter(m -> m.getLevel() <= level + 1).collect(Collectors.toList()));

        List<Monster> choice = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int index = Dice.roll(all.size());
            choice.add(all.get(index));
        }
        return choice;
    }
}
