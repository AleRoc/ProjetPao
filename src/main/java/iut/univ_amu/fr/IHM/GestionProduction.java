package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionProduction extends JFrame  implements ActionListener {
    private JButton bListe = new JButton("Liste des produits finis");

    public GestionProduction(){
        InterfaceDeJeu frame = new InterfaceDeJeu();
        frame.getPanJeu().setBorder(BorderFactory.createLineBorder(Color.red));
        frame.getPanJeu().add(bListe);
        bListe.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
