package composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    public List<File> files;
    public List<Folder> folders;

    public Folder() {
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public void print() {

    }
}
