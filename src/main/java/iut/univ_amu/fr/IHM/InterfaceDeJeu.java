package iut.univ_amu.fr.IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class InterfaceDeJeu extends JFrame implements ActionListener {
    private JPanel screen = new JPanel();
    private JPanel panJeu = new JPanel();
    private JPanel panSud = new JPanel();
    private JPanel panNorth = new JPanel();
    private JPanel panEast = new JPanel();
    private JPanel panWest = new JPanel();
    private JButton bGererAnimaux = new JButton("Gestion les animaux");
    private JButton bGererStock = new JButton("Gestion des stocks");
    private JButton bGererProduction = new JButton("Gestion de la production");
    private JButton bGererVentes = new JButton("Gestion des ventes");
    private JButton bGererAchats = new JButton("Gestion des achats");
    private JLabel lTitrePanel = new JLabel("Vous êtes dans la panneau de ");


    public InterfaceDeJeu() {
        this.setTitle("Interface du jeu");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setContentPane(screen);

        BorderLayout BO1 = new BorderLayout();
        this.getContentPane().setLayout(BO1);
        panJeu.setBorder(BorderFactory.createLineBorder(Color.black));

        this.getContentPane().add(panJeu, BorderLayout.CENTER);
        this.getContentPane().add(panSud, BorderLayout.SOUTH);
        this.getContentPane().add(panNorth, BorderLayout.NORTH);
        this.getContentPane().add(panEast, BorderLayout.EAST);
        this.getContentPane().add(panWest, BorderLayout.WEST);

        panSud.setLayout(new GridLayout(1,3));
        panNorth.setLayout(new GridLayout(1,3));
        panEast.setLayout(new GridLayout(3,1));
        panWest.setLayout(new GridLayout(2,1));

        //panSud.add();
        panNorth.add(lTitrePanel, CENTER_ALIGNMENT);
        panEast.add(bGererAnimaux);
        panEast.add(bGererStock);
        panEast.add(bGererProduction);
        panWest.add(bGererVentes);
        panWest.add(bGererAchats);

        bGererAchats.addActionListener(this);
        bGererVentes.addActionListener(this);
        bGererStock.addActionListener(this);
        bGererAnimaux.addActionListener(this);
        bGererProduction.addActionListener(this);
        this.setVisible(true);
    }

    public JPanel getPanJeu() {
        return panJeu;
    }

    public void changerPanel(JPanel pan) {
        screen.remove(panJeu);
        screen.add(pan, BorderLayout.CENTER);
        pan.setBorder(BorderFactory.createLineBorder(Color.red));
        this.validate();
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

}
