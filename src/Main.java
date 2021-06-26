import app.FileManager;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        final FileManager fileManager = new FileManager();
        final String defaultDir = "/Users/zea10th/GameDistr/";

        //Task 1
        File srcDir = new File(defaultDir + "src/");
        File resDir = new File(defaultDir + "res/");
        File savegamesDir = new File(defaultDir + "savegames/");
        File tempDir = new File(defaultDir + "temp/");

        fileManager.createDir(srcDir);
        fileManager.createDir(resDir);
        fileManager.createDir(savegamesDir);
        fileManager.createDir(tempDir);

        //Task 2
        File mainDir = new File(srcDir.getAbsolutePath() + "/main");
        File testDir = new File(srcDir.getAbsolutePath() + "/test");

        fileManager.createDir(mainDir);
        fileManager.createDir(tempDir);

        //Task 3
        fileManager.createFile(new File(mainDir, "Main.java"));
        fileManager.createFile(new File(mainDir, "Utils.java"));

        //Task 4
        File drawablesDir = new File(resDir.getAbsolutePath() + "/drawables");
        File vectorsDir = new File(resDir.getAbsolutePath() + "/vectors");
        File iconsDir = new File(resDir.getAbsolutePath() + "/icons");

        fileManager.createDir(drawablesDir);
        fileManager.createDir(vectorsDir);
        fileManager.createDir(iconsDir);

        //Task 6
        File tempFile = new File(tempDir, "temp.txt");
        fileManager.writeLogs(tempFile);
    }
}
