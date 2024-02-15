package composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> folders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createFile(String filename) {

    }

    public void deleteFile(String filename) {

    }

    public void createFolder(String folderName) {

    }

    public void deleteFolder(String folderName) {

    }

    public void print() {

    }
}
