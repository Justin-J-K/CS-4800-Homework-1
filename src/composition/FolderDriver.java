package composition;

public class FolderDriver {
    public static void main(String[] args) {
        Folder phpDemo1 = generateFolderStructure();

        System.out.println("Initial Structure:");
        phpDemo1.print();
        System.out.println();

        phpDemo1.getFolder("Source Files").deleteFolder("app");

        System.out.println("After Deleting app:");
        phpDemo1.print();
        System.out.println();

        phpDemo1.getFolder("Source Files").deleteFolder("public");

        System.out.println("After Deleting public:");
        phpDemo1.print();
    }

    private static Folder generateFolderStructure() {
        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        sourceFiles.addFolder(new Folder(".phalcon"));
        Folder app = new Folder("app");
        app.addFolder(new Folder("config"));
        app.addFolder(new Folder("controllers"));
        app.addFolder(new Folder("library"));
        app.addFolder(new Folder("migrations"));
        app.addFolder(new Folder("models"));
        app.addFolder(new Folder("views"));
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        sourceFiles.addFolder(app);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(publicFolder);
        sourceFiles.addFile(".htaccess");
        sourceFiles.addFile(".htrouter.php");
        sourceFiles.addFile("index.html");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        phpDemo1.addFolder(sourceFiles);
        phpDemo1.addFolder(includePath);
        phpDemo1.addFolder(remoteFiles);

        return phpDemo1;
    }
}
