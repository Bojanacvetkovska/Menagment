package at.bojana.menagment;

import java.awt.*;

import static java.awt.Color.BLUE;
import static java.awt.Color.orange;

public class Menagment {
    public static Color getBlock(Color color) {
        if (BLUE.equals(color)) {
            System.out.println("Blue");
        }
        return orange;
    }
}
