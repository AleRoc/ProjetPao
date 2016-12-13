package iut.univ_amu.fr.IHM;

import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.aminaux.Bovin;
import iut.univ_amu.fr.aminaux.Vache;
import iut.univ_amu.fr.installations.installationAnimaux.Bergerie;
import iut.univ_amu.fr.installations.installationAnimaux.InstallationAnimaux;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionAnimaux extends JFrame  implements ActionListener {
    private JButton bListe = new JButton("Liste des animaux");
    private Bergerie bergerie = new Bergerie();



    private ArrayList<Animal> listeA = bergerie.getOccupants();

    public GestionAnimaux(){
        InterfaceDeJeu frame = new InterfaceDeJeu();
        frame.getPanJeu().setBorder(BorderFactory.createLineBorder(Color.red));
        frame.getPanJeu().add(bListe);
        bListe.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*for (Animal a : bergerie.getOccupants()) {
            System.out.println(a.toString());
        }*/
    }
}
