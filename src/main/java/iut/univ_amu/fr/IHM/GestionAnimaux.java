package iut.univ_amu.fr.IHM;

import iut.univ_amu.fr.aminaux.*;
import iut.univ_amu.fr.installations.installationAnimaux.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionAnimaux extends JFrame  implements ActionListener {
    private JButton listeBerge = new JButton("Liste des Ovides");
    private JButton listePoul = new JButton("Liste des Oiseaux");
    private JButton listePorc = new JButton("Liste des Porcins");
    private JButton listeEtab = new JButton("Liste des Bovins");
    private Bergerie bergerie = new Bergerie();
    private Etable etable = new Etable();
    private Porcherie porcherie = new Porcherie();
    private Poulailler poulailler = new Poulailler();

    public GestionAnimaux(){
        InterfaceDeJeu frame = new InterfaceDeJeu();
        GridLayout GL1 = new GridLayout(2,2);
        frame.getScreen().setLayout(GL1);
        frame.getScreen().add(listeBerge);
        frame.getScreen().add(listeEtab);
        frame.getScreen().add(listePorc);
        frame.getScreen().add(listePoul);
        listeBerge.addActionListener(this);
        listeEtab.addActionListener(this);
        listePorc.addActionListener(this);
        listePoul.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == listeBerge) {
            Mouton b1 = new Mouton();
            Brebis B1 = new Brebis();
            Mouton b2 = new Mouton();
            Mouton b3 = new Mouton();
            bergerie.ajouterAnimal(b1);
            bergerie.ajouterAnimal(b2);
            bergerie.ajouterAnimal(B1);
            bergerie.ajouterAnimal(b3);
            for (Ovide o : bergerie.getOccupants()) {
                System.out.println(o.toString());
            }
        }
        else if (e.getSource() == listeEtab) {

        }
        else if (e.getSource() == listePorc) {

        }
        else if (e.getSource() == listePoul) {

        }
    }
}
