
interface Button {
    void paint();
}

interface Checkbox {
    void check();
}

// Light theme elements
class LightButton implements Button {
    public void paint() {
        System.out.println("Rendering Light Button");
    }
}

class LightCheckbox implements Checkbox {
    public void check() {
        System.out.println("Checking Light Checkbox");
    }
}

// Dark theme elements
class DarkButton implements Button {
    public void paint() {
        System.out.println("Rendering Dark Button");
    }
}

class DarkCheckbox implements Checkbox {
    public void check() {
        System.out.println("Checking Dark Checkbox");
    }
}

// Abstract Factory
interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightButton();
    }
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}

class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkButton();
    }
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        String theme = "dark"; // Change to "light" or "dark"

        UIFactory factory = theme.equalsIgnoreCase("light")
                ? new LightThemeFactory()
                : new DarkThemeFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.check();
    }
}
