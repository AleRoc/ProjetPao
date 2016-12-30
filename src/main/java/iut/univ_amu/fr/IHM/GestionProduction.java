package iut.univ_amu.fr.IHM;

import iut.univ_amu.fr.installations.InstallationProduction;
import iut.univ_amu.fr.produit.Cereale;
import iut.univ_amu.fr.produit.Fromage;
import iut.univ_amu.fr.produit.Viande;
import iut.univ_amu.fr.produit.Vin;

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
    private List liste = new List();

    public GestionProduction(){
        BorderLayout BL1 = new BorderLayout();
        frame.getScreen().setLayout(BL1);
        frame.getToolbar().addSeparator();
        getCombobox().setSelectedItem(4);
        frame.getToolbar().add(combobox);
        frame.getToolbar().addSeparator();
        getCombobox().addActionListener(this);

        frame.getScreen().add(liste, BorderLayout.WEST);

        Fromage f = new Fromage();
        Vin vi = new Vin();
        Viande v = new Viande();
        Cereale c = new Cereale();
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
