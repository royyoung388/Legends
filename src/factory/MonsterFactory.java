package factory;

import bean.Monster;
import utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MonsterFactory {
    private String dragons, exoskeleton, spirit;

    public MonsterFactory() {
        dragons = "config/Dragons.txt";
        exoskeleton = "config/Exoskeletons.txt";
        spirit = "config/Spirits.txt";
    }

    public List<Monster> readAll(String path) throws IOException {
        List<Monster> monsters = new ArrayList<>();

        Iterator<String> iterator = FileUtils.readFile(path).iterator();
        // skip first line
        iterator.next();
        while (iterator.hasNext()) {
            String[] array = iterator.next().split(" ");
            monsters.add(new Monster(array));
        }

        return monsters;
    }
}
