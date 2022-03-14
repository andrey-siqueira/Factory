package refactoring_andrey.factory_method.example.buttons;

import refactoring_andrey.factory_method.example.buttons.Button;

@SuppressWarnings("unused")

public abstract class Dialog {
	public void renderWindow() {
		Button okButton = createButton();
        okButton.render();
    }
	public abstract Button createButton();

}
