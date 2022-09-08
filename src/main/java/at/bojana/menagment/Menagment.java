package at.bojana.menagment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;

import static java.awt.Color.RED;
import static java.awt.Color.green;
@RequestMapping
public class Menagment {
    public static Color getBlock(Color colors){
        if (RED.equals(colors)) {
            System.out.println("Red");
            ;
        }
        return green;
    }

        }


