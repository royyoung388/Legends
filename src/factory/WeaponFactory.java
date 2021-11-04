package factory;

import bean.Weapon;
import utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeaponFactory {
    private String path;

    public WeaponFactory() {
        path = "config/Weaponry.txt";
    }

    public List<Weapon> readAll(String path) throws IOException {
        List<Weapon> weapons = new ArrayList<>();

        Iterator<String> iterator = FileUtils.readFile(path).iterator();
        // skip first line
        iterator.next();
        while (iterator.hasNext()) {
            String[] array = iterator.next().split(" ");
            weapons.add(new Weapon(array));
        }

        return weapons;
    }
}
