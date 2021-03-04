public class Main{
public static void main(String[] args){
     JFrame frame = new Jframe("bahar");
     frame.setSize(250,200);
     
     JPanel panel = new JPanel();
     
     JButton btn = new JButton("Buton");
     panel.add(btn);
     
     frame.add(panel);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible("true");
     }
 }
