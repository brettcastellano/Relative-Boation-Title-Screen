/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainmenu;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Font;
import javax.swing.ImageIcon;
/**
 *
 * @author lumat8093
 */
public class MainMenu {

    
   public static JLabel title = new JLabel();
   public static JLabel button = new JLabel();
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         BufferedImage wow = null;
         MainMenuActions panel = new MainMenuActions();      
         JFrame application = new JFrame();
         panel.setLayout(null);      
         File wowza = new File("titleScreen.png");
         
         try{
             wow = ImageIO.read(wowza);
         }catch(Exception e){
             
         }
        
        panel.add(button);
        
        button.setVisible(true);
        button.setText("START");
      
        
        button.setBounds(700,320,65,200);
        button.setForeground(Color.RED);
        
        panel.add(title);
        title.setVisible(true);
        title.setIcon(new ImageIcon(wow));
        title.setBounds(0,0,852,480);
               
               
                 button.addMouseListener(new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {   
          //application.setVisible(false);
          System.exit(0);
          }
          @Override
          public void mousePressed(MouseEvent me) {
              
          }
          @Override
          public void mouseReleased(MouseEvent me) {          }
          @Override
          public void mouseEntered(MouseEvent me) {          }
          @Override
          public void mouseExited(MouseEvent me) {          }
      });
      
      
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(852, 480);      
      application.setVisible(true);
        
    }
    
}
