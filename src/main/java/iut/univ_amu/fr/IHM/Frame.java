package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class Frame extends JFrame {
    JPanel screen = new JPanel();

    public void Frame() {
        this.setTitle("Farmer's software");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(screen);
    }

}
