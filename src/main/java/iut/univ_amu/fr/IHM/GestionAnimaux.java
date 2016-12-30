package iut.univ_amu.fr.IHM;

import iut.univ_amu.fr.aminaux.*;
import iut.univ_amu.fr.installations.installationAnimaux.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
public class GestionAnimaux extends JFrame  implements ActionListener, ItemListener{

    private Object[] elements = {"Liste Ovides", "Liste Bovins", "Listes Porcins", "Liste Volailles"};
    private JComboBox combobox = new JComboBox(elements);
    private InterfaceDeJeu frame = new InterfaceDeJeu();
    private JPanel panBouton = new JPanel();
    private JPanel panEtat = new JPanel();
    private Bergerie bergerie = new Bergerie();
    private Etable etable = new Etable();
    private Porcherie porcherie = new Porcherie();
    private Poulailler poulailler = new Poulailler();

    private JButton bTuer = new JButton("Tuer l'animal");
    private JButton bFeconder = new JButton("Féconder cette femelle");
    private JButton bRecolter = new JButton("Récolter ressources");

    private List liste = new List();
    private List listeE = new List();

    public GestionAnimaux(){
        BorderLayout BL1 = new BorderLayout();
        frame.getScreen().setLayout(BL1);
        frame.getToolbar().addSeparator();
        getCombobox().setSelectedItem(4);
        frame.getToolbar().add(combobox);
        frame.getToolbar().addSeparator();

        frame.getScreen().add(liste, BorderLayout.WEST);
        frame.getScreen().add(listeE, BorderLayout.EAST);

        GridLayout GL1 = new GridLayout(3,1);
        panBouton.setLayout(GL1);
        frame.getScreen().add(panBouton, BorderLayout.CENTER);
        panBouton.add(bTuer);
        panBouton.add(bRecolter);
        panBouton.add(bFeconder);

        panEtat.setPreferredSize(new Dimension(900,100));
        frame.getScreen().add(panEtat, BorderLayout.SOUTH);

        getCombobox().setSelectedIndex(0);
        getCombobox().addActionListener(this);
        liste.addItemListener(this);
        bTuer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panEtat.removeAll();
                panEtat.updateUI();
                panEtat.add(new JLabel(liste.getItem(liste.getSelectedIndex()) + " Tuer !"));
                frame.revalidate();
            }
        });
        bRecolter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panEtat.removeAll();
                panEtat.updateUI();
                panEtat.add(new JLabel(liste.getItem(liste.getSelectedIndex()) + " Recolter !"));
                frame.revalidate();
            }
        });
        bFeconder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panEtat.removeAll();
                panEtat.updateUI();
                panEtat.add(new JLabel(liste.getItem(liste.getSelectedIndex()) + " Feconder !"));
                frame.revalidate();
            }
        });

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
    public void itemStateChanged(ItemEvent e)
    {
        listeE.removeAll();
        listeE.add(liste.getItem(liste.getSelectedIndex()));
        listeE.add("Temps de gestation restant");
        listeE.add("poids et age de  l'animal");
        listeE.add("Recoltables et fecond ?");
    }

        @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String text = (String) cb.getSelectedItem();

        switch (text) {
            case "Liste Ovides":
                liste.removeAll();
                for (int i=0; i < bergerie.getOccupants().size(); ++i) {
                    liste.add(bergerie.getOccupants().get(i).toString() + " " +  i);
                }
                frame.revalidate();
                break;
            case "Liste Bovins":
                liste.removeAll();
                for (int i=0; i < etable.getOccupants().size(); ++i) {
                    liste.add(etable.getOccupants().get(i).toString() + " " +  i);
                }
                frame.revalidate();
                break;
            case "Liste Porcins" :
                liste.removeAll();
                for (int i=0; i < porcherie.getOccupants().size(); ++i) {
                    liste.add(porcherie.getOccupants().get(i).toString() + " " +  i);
                }
                frame.revalidate();
                break;
            case "Liste Volailles" :
                liste.removeAll();
                for (int i=0; i < poulailler.getOccupants().size(); ++i) {
                    liste.add(poulailler.getOccupants().get(i).toString() + " " +  i);
                }
                frame.revalidate();
                break;
        }
    }
}
