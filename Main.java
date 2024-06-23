import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        File src = new File("D://Java/Games/src");
        if (src.mkdir()) {
            text.append("src создан\n");
        }
        File main = new File("D://Java/Games/src/main");
        if (main.mkdir()) {
            text.append("main создан\n");
        }
        File mainFile = new File(main, "Main.java");
        try {
            if (mainFile.createNewFile()) {
                text.append("Main создан\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File utilFile = new File(main, "Util.java");
        try {
            if (utilFile.createNewFile()) {
                text.append("Util создан\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File test = new File("D://Java/Games/src/test");
        if (test.mkdir()) {
            text.append("test создан\n");
        }

        File res = new File("D://Java/Games/res");
        if (res.mkdir()) {
            text.append("res создан\n");
        }
        File drawables = new File("D://Java/Games/res/drawables");
        if (drawables.mkdir()) {
            text.append("drawables создан\n");
        }
        File vectors = new File("D://Java/Games/res/drawables/vectors");
        if (vectors.mkdir()) {
            text.append("vectors создан\n");
        }
        File icons = new File("D://Java/Games/res/drawables/icons");
        if (icons.mkdir()) {
            text.append("icons создан\n");
        }

        File savegames = new File("D://Java/Games/savegames");
        if (savegames.mkdir()) {
            text.append("savegames создан\n");
        }

        File temp = new File("D://Java/Games/temp");
        if (temp.mkdir()) {
            text.append("temp создан\n");
        }
        File tempFile = new File(temp, "temp.txt");
        try {
            if (tempFile.createNewFile()) {
                text.append("temp.txt создан\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("D://Java/Games/temp/temp.txt")) {
            writer.write(text.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}