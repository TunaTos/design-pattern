package creation.abstract_factory.exercise.windows;

import creation.abstract_factory.exercise.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox");
    }
}
