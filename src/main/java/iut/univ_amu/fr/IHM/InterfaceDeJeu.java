package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class InterfaceDeJeu extends JFrame implements ActionListener {
    JToolBar toolbar = new JToolBar();
    private JPanel screen = new JPanel();
    private JPanel panJeu = new JPanel();
    private JButton bGererAnimaux = new JButton("Gestion animaux");
    private JButton bGererStock = new JButton("Gestion stocks");
    private JButton bGererProduction = new JButton("Gestion production");
    private JButton bGererVentes = new JButton("Gestion ventes");
    private JButton bGererAchats = new JButton("Gestion achats");


    public InterfaceDeJeu() {
        this.setTitle("Interface du jeu");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        toolbar.setRollover(true);
        toolbar.add(bGererAchats);
        toolbar.addSeparator();
        toolbar.add(bGererVentes);
        toolbar.addSeparator();
        toolbar.add(bGererAnimaux);
        toolbar.addSeparator();
        toolbar.add(bGererStock);
        toolbar.addSeparator();
        toolbar.add(bGererProduction);

        BorderLayout BO1 = new BorderLayout();
        this.setLayout(BO1);
        this.add(toolbar, BorderLayout.NORTH);
        this.add(screen, BorderLayout.CENTER);

        bGererAchats.addActionListener(this);
        bGererVentes.addActionListener(this);
        bGererStock.addActionListener(this);
        bGererAnimaux.addActionListener(this);
        bGererProduction.addActionListener(this);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == bGererAnimaux)
            new GestionAnimaux();
        if (evt.getSource() == bGererStock)
            new GestionStock();
        if (evt.getSource() == bGererProduction)
            new GestionProduction();
        if (evt.getSource() == bGererVentes)
            new GestionVentes();
        if (evt.getSource() == bGererAchats)
            new GestionAchats();
        this.setVisible(false);
    };

    public JPanel getScreen() {
        return screen;
    }
    public JToolBar getToolbar() {
        return toolbar;
    }

}
