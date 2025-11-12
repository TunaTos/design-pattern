package creation.abstract_factory.exercise.mac;

import creation.abstract_factory.exercise.Button;
import creation.abstract_factory.exercise.Checkbox;
import creation.abstract_factory.exercise.GUIFactory;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
