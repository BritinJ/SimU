package SimU;

import javax.swing.*;
import java.awt.*;


public class MainMenu {
   MainMenu(){

       //window setup
       JFrame Game = new JFrame("Simulation U");
       ImageIcon student = new ImageIcon("src/Images/student.png");
       Game.setIconImage(student.getImage());
       ///////////////////////////////////////////////////

       ImageIcon Logo = new ImageIcon("src\\Images\\Title.png");
       JLabel label = new JLabel(Logo);
       label.setVisible(true);

       Game.getContentPane().setBackground(Color.gray);
       Game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Game.setSize(800,650);
       Game.setVisible(true);
       Game.setResizable(true);


       //Menu panel setup
       JPanel menu = new JPanel();
       menu.setLayout(new GridLayout(3,1, 20,20));
       menu.setBackground(Color.gray);

       // new game button
       JButton ng = new JButton("New Game");
       ng.setVisible(true);
       ng.setSize(new Dimension((Game.getWidth()/4),(Game.getHeight()/4)));
       ng.doClick();

       // load game button
       JButton lg = new JButton("Load Game");
       lg.setVisible(true);
       lg.setSize(new Dimension((Game.getWidth()/4),(Game.getHeight()/4)));


       menu.add(label);
       menu.add(ng);
       menu.add(lg);

       Game.add(menu);

   }

}


