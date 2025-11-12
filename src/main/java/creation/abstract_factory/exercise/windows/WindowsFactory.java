package creation.abstract_factory.exercise.windows;

import creation.abstract_factory.exercise.Button;
import creation.abstract_factory.exercise.Checkbox;
import creation.abstract_factory.exercise.GUIFactory;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
