package com.stepit.model;

public enum Realms {
    SKULL_ISLAND(1, "☠️SKULL ISLAND  ☠️",
            "\n" +
                    "                    .-\"      \"-.\n" +
                    "                   /            \\\n" +
                    "       _          |              |          _\n" +
                    "      ( \\         |,  .-.  .-.  ,|         / )\n" +
                    "       > \"=._     | )(__/  \\__)( |     _.=\" <\n" +
                    "      (_/\"=._\"=._ |/     /\\     \\| _.=\"_.=\"\\_)\n" +
                    "             \"=._ (_     ^^     _)\"_.=\"\n" +
                    "                 \"=\\__|IIIIII|__/=\"\n" +
                    "                _.=\"| \\IIIIII/ |\"=._\n" +
                    "      _     _.=\"_.=\"\\          /\"=._\"=._     _\n" +
                    "     ( \\_.=\"_.=\"     `--------`     \"=._\"=._/ )\n" +
                    "      > _.=\"                            \"=._ <\n" +
                    "     (_/                                    \\_)"),
    VALLEY_OF_THE_SNAKES(2, "\uD83D\uDC0D   VALLEY OF THE SNAKES  \uD83D\uDC0D",
            " ---_ ......._-_--.\n" +
                    "      (|\\ /      / /| \\  \\\n" +
                    "      /  /     .'  -=-'   `.\n" +
                    "     /  /    .'             )\n" +
                    "   _/  /   .'        _.)   /\n" +
                    "  / o   o        _.-' /  .'\n" +
                    "  \\          _.-'    / .'*|\n" +
                    "   \\______.-'//    .'.' \\*|\n" +
                    "    \\|  \\ | //   .'.' _ |*|\n" +
                    "     `   \\|//  .'.'_ _ _|*|\n" +
                    "      .  .// .'.' | _ _ \\*|\n" +
                    "      \\`-|\\_/ /    \\ _ _ \\*\\\n" +
                    "       `/'\\__/      \\ _ _ \\*\\\n" +
                    "      /^|            \\ _ _ \\*\n" +
                    "     '  `             \\ _ _ \\      \n" +
                    "                       \\_"),

    SPIDER_CAVE(3, "\uD83D\uDD77   SPIDER CAVE  \uD83D\uDD77",
            " ____                      ,\n" +
                    "          /---.'.__             ____//\n" +
                    "               '--.\\           /.---'\n" +
                    "          _______  \\\\         //\n" +
                    "        /.------.\\  \\|      .'/  ______\n" +
                    "       //  ___  \\ \\ ||/|\\  //  _/_----.\\__\n" +
                    "      |/  /.-.\\  \\ \\:|< >|// _/.'..\\   '--'\n" +
                    "         //   \\'. | \\'.|.'/ /_/ /  \\\\\n" +
                    "        //     \\ \\_\\/\" ' ~\\-'.-'    \\\\\n" +
                    "       //       '-._| :H: |'-.__     \\\\\n" +
                    "      //           (/'==='\\)'-._\\     ||\n" +
                    "      ||                        \\\\    \\|\n" +
                    "      ||                         \\\\    '\n" +
                    "      |/                          \\\\\n" +
                    "                                   ||\n" +
                    "                                   ||\n" +
                    "                                   \\\\\n" +
                    "                                    '");

    private int id;
    private String name;
    private String caracter;

    Realms(int id, String name, String caracter) {
        this.id = id;
        this.name = name;
        this.caracter = caracter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCaracter() {

        return caracter;
    }


    public static Realms getEnumById(int id) {
        for (Realms i : Realms.values()) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }
}

