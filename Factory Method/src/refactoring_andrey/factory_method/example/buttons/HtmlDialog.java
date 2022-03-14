package refactoring_andrey.factory_method.example.buttons;

import refactoring_andrey.factory_method.example.buttons.Button;
import refactoring_andrey.factory_method.example.buttons.HtmlButton;

@SuppressWarnings("unused")

public class HtmlDialog extends Dialog {
	@Override
    public Button createButton() {
        return new HtmlButton();
    }

}
