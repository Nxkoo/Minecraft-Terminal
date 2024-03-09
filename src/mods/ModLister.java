package mods;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import logs.Logger;
import utils.Selection;
import utils.Utils;

public class ModLister {

    public List<String> listMods() {
        List<String> mods = new ArrayList<>();
        Utils utils = new Utils();

        String minePath = utils.getMinecraftFolder();
        File modFolder = new File(minePath + File.separator + "mods");
        Selection selection = new Selection();
        if (modFolder.exists() && modFolder.isDirectory()) {
            File[] modsFiles = modFolder.listFiles((dir, name) -> name.endsWith(".jar"));
            if (modsFiles != null && modsFiles.length != 0) {
                String[] options = new String[] { "1. Sim", "2. Não"};
                String select = selection.newSelection(2, options, "Deseja substituir os arquivos da pasta mods?\n 1. Sim, 2. Não");
                if (select.contains("1")) {
                    Logger.info("Substituindo mods");
                }else {
                    System.exit(0);
                }
            } else {
                Logger.error("Você não possui nenhum mod.");
            }
        } else {
            Logger.error("Você não possui uma pasta mods");
        }
        return mods;
    }

}
