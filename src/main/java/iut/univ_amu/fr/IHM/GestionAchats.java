package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionAchats extends JFrame  implements ActionListener {
    private Object[] elements = {"Achats du jour", "Achats réalisés", "Acheter"};
    private JComboBox combobox = new JComboBox(elements);
    private InterfaceDeJeu frame = new InterfaceDeJeu();


    public GestionAchats() {
        BorderLayout BL1 = new BorderLayout();
        frame.getScreen().setLayout(BL1);
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
            case "Achats du jour":
                break;
            case "Achats réalisés":
                break;
            case "Acheter" :
                break;
            default :
                break;
        }
    }
}
