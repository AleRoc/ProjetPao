package iut.univ_amu.fr.IHM;

import iut.univ_amu.fr.PlaceMarche;
import iut.univ_amu.fr.offre.OffreVente;
import iut.univ_amu.fr.produit.ProduitFermier;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zekil_000 on 13/12/2016.
 */
public class GestionVentes extends JFrame  implements ActionListener  {
    private Object[] elements = {"Ventes réalisées", "Ventes en cours"};
    private JComboBox combobox = new JComboBox(elements);
    private InterfaceDeJeu frame = new InterfaceDeJeu();
    private List liste = new List();

    public GestionVentes(){
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
            case "Ventes réalisées":
                break;
            case "Ventes en cours" :
                liste.removeAll();
                //pour tout les offres de vente de la place du marché dont l'offreur est notre personnage'
                /*for(OffreVente offreV : PlaceMarche.getInstance().getListeOffres()) {
                    if (PlaceMarche.getInstance().getOffreur() == "MOI" ) {
                        for (ProduitFermier produit : offreV.getProduitsVendus()) {
                            liste.add(produit.getNom());
                        }
                    }
                }*/
                break;
            default :
                break;
        }
    }
}
