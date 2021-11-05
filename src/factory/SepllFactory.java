package factory;

import bean.Monster;
import bean.Spell;
import utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SepllFactory {
    private String fire, ice, lighting;

    public SepllFactory() {
        fire = "config/FireSpells.txt";
        ice = "config/IceSpells.txt";
        lighting = "config/LightningSpells.txt";
    }

    public List<Spell> readAll(String path) {
        List<Spell> spells = new ArrayList<>();

        Iterator<String> iterator = FileUtils.readFile(path).iterator();
        // skip first line
        iterator.next();
        while (iterator.hasNext()) {
            String[] array = iterator.next().split(" ");
            spells.add(new Spell(array));
        }

        return spells;
    }
}
