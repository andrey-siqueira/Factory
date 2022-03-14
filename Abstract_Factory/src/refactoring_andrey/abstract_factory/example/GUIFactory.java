package refactoring_andrey.abstract_factory.example;

import refactoring_andrey.abstract_factory.example.Button;
import refactoring_andrey.abstract_factory.example.Checkbox;

@SuppressWarnings("unused")
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
