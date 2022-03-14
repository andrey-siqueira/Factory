package refactoring_andrey.factory_method.example.buttons;

import refactoring_andrey.factory_method.example.buttons.Dialog;
import refactoring_andrey.factory_method.example.buttons.HtmlDialog;
import refactoring_andrey.factory_method.example.buttons.WindowsDialog;

@SuppressWarnings("unused")

public class Demo {
	private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
