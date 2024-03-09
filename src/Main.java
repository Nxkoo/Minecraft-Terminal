import java.util.List;

import mods.ModLister;

public class Main {
    public static void main(String[] args) {

        ModLister modLister = new ModLister();

        List<String> listaDeMods = modLister.listMods();
        for (String nomeDoMod : listaDeMods) {
            System.out.println(nomeDoMod);
        }

    }
}