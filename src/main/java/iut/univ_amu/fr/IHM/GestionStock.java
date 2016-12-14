package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionStock extends JFrame implements ActionListener {
    private JButton bListe = new JButton("Liste des produits stockés");

    public GestionStock(){
        InterfaceDeJeu frame = new InterfaceDeJeu();
        frame.getScreen().setBorder(BorderFactory.createLineBorder(Color.red));
        frame.getScreen().add(bListe);
        bListe.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
