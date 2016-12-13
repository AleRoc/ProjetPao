package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionAchats extends JFrame  implements ActionListener {
    private JButton bListe = new JButton("Liste des achats");
    private JLabel lOffreVente = new JLabel();


    public GestionAchats() {
        InterfaceDeJeu frame = new InterfaceDeJeu();
        frame.getPanJeu().setBorder(BorderFactory.createLineBorder(Color.red));
        frame.getPanJeu().add(bListe);
        frame.getPanJeu().add(lOffreVente);
        bListe.addActionListener(this);
        lOffreVente.setText("/*toutlemonde.getOffreVentes().toString()*/");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
