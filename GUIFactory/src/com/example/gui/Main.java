package com.example.gui;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = getFactoryForOS("Windows"); // Change to "MacOS" or "Linux" as needed

        Button button = factory.createButton();
        TextField textField = factory.createTextField();

        button.render();
        textField.render();
    }

    private static GUIFactory getFactoryForOS(String os) {
        switch (os) {
            case "Windows":
                return new WindowsFactory();
            case "MacOS":
                return new MacOSFactory();
            case "Linux":
                return new LinuxFactory();
            default:
                throw new IllegalArgumentException("Unsupported OS: " + os);
        }
    }
}
