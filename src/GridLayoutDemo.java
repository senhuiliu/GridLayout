/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame
{
   JPanel panel1,panel2;
   JButton[] buttons;
   public GridLayoutDemo()
   {
       super("Grid Layout Demo");//calling the title constructor
       panel1=new JPanel(new GridLayout(2,2));//setting layout inside the panel decleration itself
       panel2=new JPanel();
       panel2.setLayout(new GridLayout(2,2));
      
       //setting the layout of the frame
       setLayout(new BorderLayout());
      
      
       buttons=new JButton[6];
      
       for(int i=0;i<6;i++)buttons[i]=new JButton("Button "+(i+1));//declaring the individual buttons
      
       //adding the buttons to the respective panels
       panel1.add(buttons[0]);panel1.add(buttons[1]);panel1.add(buttons[2]);
       panel2.add(buttons[3]);panel2.add(buttons[4]);panel2.add(buttons[5]);
      
       //adding the panels to the JFrame
       add(panel1,BorderLayout.SOUTH);
       add(panel2,BorderLayout.CENTER);
      
       setSize(200,200);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public static void main(String[] args) {
       new GridLayoutDemo();
   }

}
