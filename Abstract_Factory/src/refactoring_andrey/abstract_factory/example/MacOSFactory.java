package refactoring_andrey.abstract_factory.example;

import refactoring_andrey.abstract_factory.example.Button;
import refactoring_andrey.abstract_factory.example.MacOSButton;
import refactoring_andrey.abstract_factory.example.Checkbox;
import refactoring_andrey.abstract_factory.example.MacOSCheckbox;

@SuppressWarnings("unused")
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
