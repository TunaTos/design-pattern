package creation.abstract_factory.exercise.mac;

import creation.abstract_factory.exercise.Button;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
