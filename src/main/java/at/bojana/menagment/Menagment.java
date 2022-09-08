package at.bojana.menagment;

import java.awt.*;

import static java.awt.Color.BLUE;
import static java.awt.Color.orange;
@RequestMapping("/blue2orange")
public class Menagment {
    public static Color getBlock(Color color) {
        if (BLUE.equals(color)) {
            System.out.println("Blue");
        }
        return orange;
    }
    @RequestMapping("/red2green")
public class Menagment {
    public static Color getBlock(Color colors){
        if (RED.equals(colors)) {
            System.out.println("Red");
            ;
        }
        return green;
    }

        }
}
