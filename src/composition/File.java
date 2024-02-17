package composition;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void printWithIndent(int indentLevel) {
        System.out.printf("%" + (indentLevel > 0 ? indentLevel * 2 : "") + "s%s\n", "", name);
    }
}
