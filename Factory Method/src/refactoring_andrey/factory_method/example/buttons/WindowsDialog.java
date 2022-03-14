package refactoring_andrey.factory_method.example.buttons;

import refactoring_andrey.factory_method.example.buttons.Button;
import refactoring_andrey.factory_method.example.buttons.WindowsButton;

@SuppressWarnings("unused")

public class WindowsDialog extends Dialog {
	@Override
	public Button createButton() {
        return new WindowsButton();
    }

}
