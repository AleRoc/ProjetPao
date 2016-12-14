package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionVentes extends JFrame  implements ActionListener  {
    private JButton bListe = new JButton("Liste des ventes");

    public GestionVentes(){
        InterfaceDeJeu frame = new InterfaceDeJeu();
        frame.getPanJeu().setBorder(BorderFactory.createLineBorder(Color.red));
        frame.getPanJeu().add(bListe);
        bListe.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
