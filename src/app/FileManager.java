package app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    private final Logger LOGGER;

    public FileManager() {
        this.LOGGER = new Logger();
    }

    public void createDir(File dir) {
        if (dir.exists()) {
            LOGGER.add("Directory " + dir.getPath() + " is already exist.");
        } else if (dir.mkdir()) {
            LOGGER.add("Directory " + dir.getName() + " successfully created.");
        } else {
            LOGGER.add("ERROR! Directory " + dir.getName() + " wasn't created.");
        }
    }

    public void createFile(File file) {
        try {
            if (file.createNewFile()) {
                LOGGER.add("File \"" + file.getName() + " was created in folder " + file.getParent() + ".");
            }
        } catch (IOException exception) {
            LOGGER.add(exception.getMessage());
        }
    }

    public void writeLogs(File file) {
        String logs = LOGGER.getLogs();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(logs);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
