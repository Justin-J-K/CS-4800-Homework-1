package composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private final List<File> files;
    private final List<Folder> folders;

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

    public void addFolder(Folder folder) {
        folders.add(folder);
    }

    public Folder getFolder(String folderName) {
        return folders.stream()
                .filter(f -> f.getName().equals(folderName))
                .findFirst().orElse(null);
    }

    public void deleteFolder(String folderName) {
        folders.removeIf(f -> f.getName().equals(folderName));
    }

    public void addFile(String filename) {
        files.add(new File(filename));
    }

    public File getFile(String filename) {
        return files.stream()
                .filter(f -> f.getName().equals(filename))
                .findFirst().orElse(null);
    }

    public void deleteFile(String filename) {
        files.removeIf(f -> f.getName().equals(filename));
    }

    public void print() {
        printWithIndent(0);
    }

    protected void printWithIndent(int indentLevel) {
        System.out.printf("%" + (indentLevel > 0 ? indentLevel * 2 : "") + "s%s\n", "", name);

        for (Folder f : folders) {
            f.printWithIndent(indentLevel + 1);
        }

        for (File f : files) {
            f.printWithIndent(indentLevel + 1);
        }
    }
}
