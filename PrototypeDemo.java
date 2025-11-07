
class Document implements Cloneable {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void showDocument() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        Document original = new Document("Report", "Initial draft content");
        Document copy = original.clone();

        copy.setContent("Edited draft content");

        System.out.println("Original Document:");
        original.showDocument();

        System.out.println("\nCloned Document:");
        copy.showDocument();
    }
}
