package factory;

import bean.Armor;
import utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArmorFactory {
    private String path;

    public ArmorFactory() {
        path = "config/items.Armory.txt";
    }

    public List<Armor> readAll() throws IOException {
        List<Armor> armories = new ArrayList<>();

        Iterator<String> iterator = FileUtils.readFile(path).iterator();
        // skip first line
        iterator.next();
        while (iterator.hasNext()) {
            String[] array = iterator.next().split(" ");
            armories.add(new Armor(array));
        }

        return armories;
    }


}
