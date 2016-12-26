package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionProduction extends JFrame  implements ActionListener {
    private Object[] elements = {"Liste des produits finis", "Liste des ressources", "Produire"};
    private JComboBox combobox = new JComboBox(elements);
    private InterfaceDeJeu frame = new InterfaceDeJeu();

    public GestionProduction(){
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
            case "Liste des produits finis":
                break;
            case "Liste des ressources":
                break;
            case "Produire" :
                break;
            default :
                break;
        }
    }
}
