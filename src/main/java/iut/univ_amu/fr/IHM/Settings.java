package iut.univ_amu.fr.IHM;

import iut.univ_amu.fr.participants.Personne;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zekil_000 on 12/12/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Settings extends JFrame implements ActionListener{
    private JPanel screen = new JPanel();
    private JPanel pan1 = new JPanel();
    private boolean horticulteur = false;
    private boolean arboriculteur = false;
    private boolean producteurLait = false;
    private boolean producteurViande = false;
    private JCheckBox cb1 = new JCheckBox("Horticulteur");
    private JCheckBox cb2 = new JCheckBox("Arboriculteur");
    private JCheckBox cb3 = new JCheckBox("Producteur laitier");
    private JCheckBox cb4 = new JCheckBox("Producteur de viande");
    JTextField TFNom = new JTextField("Nom : ");
    JTextField TFPrenom = new JTextField("Prenom : ");
    JTextField TFAge = new JTextField("Age : ");
    private JButton bOK = new JButton("Sauvegarder");

        public Settings(){
            this.setTitle("Settings");
            this.setSize(500, 400);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setContentPane(screen);

            screen.add(pan1);
            GridLayout GL1 = new GridLayout(9,1);
            pan1.setLayout(GL1);

            bOK.setPreferredSize(new Dimension(40, 40));

            pan1.add(new JLabel("Sélectionner les capacités de paysan que vous souhaitez avoir :"));
            pan1.add(cb1);
            pan1.add(cb2);
            pan1.add(cb3);
            pan1.add(cb4);
            pan1.add(TFNom);
            pan1.add(TFPrenom);
            pan1.add(TFAge);
            pan1.add(bOK);

            TFNom.addMouseListener(new  MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    TFNom.setText("");
                }
            });
            TFPrenom.addMouseListener(new  MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    TFPrenom.setText("");
                }
            });
            TFAge.addMouseListener(new  MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    TFAge.setText("");
                }
            });
            bOK.addActionListener(this);
            this.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bOK) {
            if (cb1.isSelected())
                horticulteur = true;
            else if (cb2.isSelected())
                arboriculteur = true;
            else if (cb3.isSelected())
                producteurLait = true;
            else if (cb4.isSelected())
                producteurViande = true;
            else if (TFNom.getText() != null && TFPrenom.getText() != null && TFAge.getText() != null)
               // new Personne(TFNom.getText(), TFPrenom.getText(), TFAge.getText());
            this.dispose();
            new InterfaceDeJeu();
        }

    }
}
