package creation.abstract_factory.exercise;

import creation.abstract_factory.exercise.mac.MacOSFactory;
import creation.abstract_factory.exercise.windows.WindowsFactory;

public class Client {

    static GUIFactory factory;

    public static void main(String[] args) throws Exception{
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            throw new RuntimeException("not supported os");
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        System.out.println("***********************");
        button.paint();;

        System.out.println("***********************");
        checkbox.paint();
    }
}
