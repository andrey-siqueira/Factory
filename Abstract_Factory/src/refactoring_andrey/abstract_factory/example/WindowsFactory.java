package refactoring_andrey.abstract_factory.example;

import refactoring_andrey.abstract_factory.example.Button;
import refactoring_andrey.abstract_factory.example.WindowsButton;
import refactoring_andrey.abstract_factory.example.Checkbox;
import refactoring_andrey.abstract_factory.example.WindowsCheckbox;

@SuppressWarnings("unused")
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
