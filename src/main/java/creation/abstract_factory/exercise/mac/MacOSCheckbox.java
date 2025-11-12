package creation.abstract_factory.exercise.mac;

import creation.abstract_factory.exercise.Checkbox;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox");
    }
}
