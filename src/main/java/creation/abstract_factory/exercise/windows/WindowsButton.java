package creation.abstract_factory.exercise.windows;

import creation.abstract_factory.exercise.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}
