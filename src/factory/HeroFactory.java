package factory;

import bean.Hero;
import utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeroFactory {
    public final String paladin, sorcerer, warrior;

    public HeroFactory() {
        paladin = "config/Paladins.txt";
        sorcerer = "config/Sorcerers.txt";
        warrior = "config/Warriors.txt";
    }

    public List<Hero> readAll(String path)  {
        List<Hero> heroes = new ArrayList<>();

        Iterator<String> iterator = FileUtils.readFile(path).iterator();
        // skip first line
        iterator.next();
        while (iterator.hasNext()) {
            String[] array = iterator.next().split("\s+");
            heroes.add(new Hero(array));
        }

        return heroes;
    }
}
