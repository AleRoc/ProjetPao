package iut.univ_amu.fr.IHM;

import iut.univ_amu.fr.aminaux.*;
import iut.univ_amu.fr.installations.installationAnimaux.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionAnimaux extends JFrame  implements ActionListener {

    private Object[] elements = {"Liste Ovides", "Liste Bovins", "Listes Porcins", "Liste Volailles"};
    private JComboBox combobox = new JComboBox(elements);
    private InterfaceDeJeu frame = new InterfaceDeJeu();
    private Bergerie bergerie = new Bergerie();
    private Etable etable = new Etable();
    private Porcherie porcherie = new Porcherie();
    private Poulailler poulailler = new Poulailler();
    private JPanel panListe = new JPanel();


    public GestionAnimaux(){
        BorderLayout BL1 = new BorderLayout();
        frame.getScreen().setLayout(BL1);
        frame.getToolbar().addSeparator();
        getCombobox().setSelectedItem(4);
        frame.getToolbar().add(combobox);
        frame.getToolbar().addSeparator();

        frame.getScreen().add(panListe, BorderLayout.WEST);
        panListe.setLayout(new GridLayout(10,2));


        getCombobox().addActionListener(this);

        Mouton m1 = new Mouton();
        Mouton m2 = new Mouton();
        Mouton m3 = new Mouton();
        Mouton m4 = new Mouton();
        Brebis b1 = new Brebis();
        bergerie.ajouterAnimal(m1);
        bergerie.ajouterAnimal(m2);
        bergerie.ajouterAnimal(m3);
        bergerie.ajouterAnimal(m4);
        bergerie.ajouterAnimal(b1);
    }

    public JComboBox getCombobox() {
        return combobox;
    }

        @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String text = (String) cb.getSelectedItem();
        switch (text) {
            case "Liste Ovides":
                for (int i=0; i < bergerie.getOccupants().size(); ++i) {
                    JLabel jl = new JLabel( bergerie.getOccupants().get(i).toString() + " " +  i);
                    panListe.add(jl);
                    frame.revalidate();
                }
                break;
            case "Liste Bovins":
                break;
            case "Liste Porcins" :
                break;
            case "Liste Volailles" :
                break;
        }
    }
}
