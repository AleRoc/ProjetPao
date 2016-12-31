package iut.univ_amu.fr.IHM;

import iut.univ_amu.fr.installations.InstallationProduction;
import iut.univ_amu.fr.installations.InstallationVegetaux;
import iut.univ_amu.fr.installations.installationAnimaux.Bergerie;
import iut.univ_amu.fr.installations.installationAnimaux.Etable;
import iut.univ_amu.fr.installations.installationAnimaux.Porcherie;
import iut.univ_amu.fr.installations.installationAnimaux.Poulailler;
import iut.univ_amu.fr.produit.ProduitFermier;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionStock extends JFrame implements ActionListener {
    private Object[] elements = {"Stock de viande", "Stock de vegetaux", "Stock de lait", "Stock de céréale", "Stock de fromage", "Stock de vin"};
    private JComboBox combobox = new JComboBox(elements);
    private InterfaceDeJeu frame = new InterfaceDeJeu();

    private Bergerie bergerie = new Bergerie();
    private Etable etable = new Etable();
    private Porcherie porcherie = new Porcherie();
    private Poulailler poulailler = new Poulailler();
    private InstallationVegetaux IV = new InstallationVegetaux();
    private InstallationProduction IP = new InstallationProduction();

    private List liste = new List();

    public GestionStock(){
        BorderLayout BL1 = new BorderLayout();
        frame.getScreen().setLayout(BL1);
        frame.getToolbar().addSeparator();
        getCombobox().setSelectedItem(4);
        frame.getToolbar().add(combobox);
        frame.getToolbar().addSeparator();

        frame.getScreen().add(liste, BorderLayout.WEST);

        getCombobox().addActionListener(this);
    }

    public JComboBox getCombobox() {
        return combobox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String text = (String) cb.getSelectedItem();
        switch (text) {
            case "Stock de viande":
                liste.removeAll();
                for (int i=0; i < bergerie.getOccupants().size(); ++i) {
                    liste.add(bergerie.getOccupants().get(i).toString() + " " +  i);
                }
                for (int i=0; i < etable.getOccupants().size(); ++i) {
                    liste.add(etable.getOccupants().get(i).toString() + " " +  i);
                }
                for (int i=0; i < porcherie.getOccupants().size(); ++i) {
                    liste.add(porcherie.getOccupants().get(i).toString() + " " +  i);
                }
                for (int i=0; i < poulailler.getOccupants().size(); ++i) {
                    liste.add(poulailler.getOccupants().get(i).toString() + " " +  i);
                }
                frame.revalidate();
                break;
            case "Stock de vegetaux":
                liste.removeAll();
                for (ProduitFermier pf : IV.getList()) {
                        liste.add(pf.toString());
                }
                frame.revalidate();
                break;
            case "Stock de lait" :
                liste.removeAll();
                for (ProduitFermier pf : IP.getList()) {
                    if (pf.getNom() == "lait")
                        liste.add(pf.toString());
                }
                frame.revalidate();
                break;
            case "Stock de céréales" :
                liste.removeAll();
                for (ProduitFermier pf : IV.getList()) {
                    if (pf.getNom() == "cereale")
                        liste.add(pf.toString());
                }
                frame.revalidate();
                break;
            case "Stock de fromage" :
                liste.removeAll();
                for (ProduitFermier pf : IP.getList()) {
                    if (pf.getNom() == "fromage")
                        liste.add(pf.toString());
                }
                frame.revalidate();
                break;
            case "Stock de vin" :
                liste.removeAll();
                for (ProduitFermier pf : IP.getList()) {
                    if (pf.getNom() == "vin")
                        liste.add(pf.toString());
                }
                frame.revalidate();
                break;
            default :
                break;
        }
    }
}
