package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionStock extends JFrame implements ActionListener {
    private Object[] elements = {"Stock de viande", "Stock de vegetaux", "Stock de lait", "Stock de céréale", "Stock de fromage", "Stock de vin"};
    private JComboBox combobox = new JComboBox(elements);
    private InterfaceDeJeu frame = new InterfaceDeJeu();

    public GestionStock(){
        GridLayout GL1 = new GridLayout(2,2);
        frame.getScreen().setLayout(GL1);
        frame.getToolbar().addSeparator();
        getCombobox().setSelectedItem(4);
        frame.getToolbar().add(combobox);
        frame.getToolbar().addSeparator();
        getCombobox().addActionListener(this);
    }

    public JComboBox getCombobox() {
        return combobox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String text = (String) cb.getSelectedItem();
        switch (text) {
            case "Stock de viande":
                break;
            case "Stock de vegetaux":
                break;
            case "Stock de lait" :
                break;
            case "Stock de céréales" :
                break;
            case "Stock de fromage" :
                break;
            case "Stock de vin" :
                break;
            default :
                break;
        }
    }
}
