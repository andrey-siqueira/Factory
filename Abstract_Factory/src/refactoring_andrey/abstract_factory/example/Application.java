package refactoring_andrey.abstract_factory.example;

import refactoring_andrey.abstract_factory.example.Button;
import refactoring_andrey.abstract_factory.example.Checkbox;
import refactoring_andrey.abstract_factory.example.GUIFactory;

@SuppressWarnings("unused")
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
