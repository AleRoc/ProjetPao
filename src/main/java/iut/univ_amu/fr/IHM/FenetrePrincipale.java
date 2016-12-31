package iut.univ_amu.fr.IHM;

/**
 * Created by zekil_000 on 12/12/2016.
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.swing.text.html.CSS.Attribute.TEXT_ALIGN;

public class FenetrePrincipale extends JFrame implements ActionListener {
    private String path = "C:\\Users\\zekil_000\\Documents\\workspace\\ProjetPao\\src\\main\\java\\iut\\univ_amu\\fr\\IHM/";
   //private JPanel screen = new JPanel();
    private JButton bJouer = new JButton("Jouer");

    public FenetrePrincipale() {
        this.setTitle("Fenetre principale");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);

        JPanel screen = new JPanel()
        {
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                ImageIcon m = new ImageIcon(path + "fond11.jpg");
                Image monImage = m.getImage();
                g.drawImage(monImage, 0, -75,this);
            }
        };

        this.setContentPane(screen);
        this.setLayout(new BorderLayout());

        JLabel lBienvenue = new JLabel("================ Bienvenue ! ================");
        lBienvenue.setHorizontalAlignment(JLabel.CENTER);
        lBienvenue.setVerticalAlignment(JLabel.CENTER);
        lBienvenue.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
        lBienvenue.setForeground(new Color(10,223,0));

        this.getContentPane().add(lBienvenue,BorderLayout.NORTH);
        bJouer.setPreferredSize(new Dimension (900, 50));
        this.getContentPane().add(bJouer, BorderLayout.SOUTH);
        this.setVisible(true);

        bJouer.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == bJouer)
            this.dispose();
            new Settings();

    };

    public static void main( String[] args )
    {
        JFrame myApp = new FenetrePrincipale();
    }

}






