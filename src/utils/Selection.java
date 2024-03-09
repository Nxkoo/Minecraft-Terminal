package utils;

import java.util.Scanner;

import logs.Logger;

public class Selection {
    private Scanner input;
    private final String BREAK_LINE = "\n";

    public Selection() {
        this.input = new Scanner(System.in);
    }

    public String newSelection(int options, String[] optionsMsg, String msg) {
        Logger.info(msg);
        int optionSelect = input.nextInt();
        for (int i = 0; i <= options - 1; i++) {
            if (i == optionSelect - 1) {
                System.out.println(optionsMsg[i] + BREAK_LINE);
                return optionsMsg[i];
            }
            if (i == options - 1) {
                clearConsole();
                Logger.warning("\nSelecione uma opção valida!");
                System.out.println(msg);
                i = -1;
                optionSelect = input.nextInt();
            }
        }
        return "";
    }

    private void clearConsole() {
        System.out.println(Color.ENDC);
        System.out.flush();
    }

}
