package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zekil_000 on 12/12/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame implements ActionListener{
    private JPanel screen = new JPanel();
    private JPanel pan1 = new JPanel();
    private boolean horticulteur = false;
    private boolean arboriculteur = false;
    private boolean producteurLait = false;
    private boolean producteurViande = false;
    private JCheckBox cb1 = new JCheckBox("Horticulteur");
    private JCheckBox cb2 = new JCheckBox("Arboriculteur");
    private JCheckBox cb3 = new JCheckBox("Producteur laitier");
    private JCheckBox cb4 = new JCheckBox("Producteur de viande");
    private JButton bOK = new JButton("Sauvegarder");

        public Settings(){
            this.setTitle("Settings");
            this.setSize(500, 200);
            this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setContentPane(screen);

            screen.add(pan1);
            GridLayout GL1 = new GridLayout(6,1);
            pan1.setLayout(GL1);

            pan1.add(new JLabel("Sélectionner les capacités de paysan que vous souhaitez avoir :"));
            pan1.add(cb1);
            pan1.add(cb2);
            pan1.add(cb3);
            pan1.add(cb4);
            pan1.add(bOK);

            bOK.addActionListener(this);
            this.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bOK) {
            if (cb1.isSelected() == true)
                horticulteur = true;
            else if (cb2.isSelected() == true)
                arboriculteur = true;
            else if (cb3.isSelected() == true)
                producteurLait = true;
            else if (cb4.isSelected() == true)
                producteurViande = true;
            this.setVisible(false);
            new InterfaceDeJeu();
        }

    }
}
