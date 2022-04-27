package session7;

import java.util.Locale;

public class Calculator {
    public static void main(String[] args) {
        Shape objShape;
        String shape;
        if (args.length==2) {
            shape = args[0].toLowerCase(Locale.ROOT);
            switch (shape) {
                case "circle":
                    objShape = new circle();
                    objShape.calculate(Float.parseFloat(args[1]));
                    break;
            }
        }
        else {
            System.out.println("Usage:java Calculator<shape-name><value>");
        }
    }
}
