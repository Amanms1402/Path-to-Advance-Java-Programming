import java.awt.*;

public class PanelExample{
    public static void main(String[] args){
         Frame frame = new Frame ("Panel Example");


         Panel panel = new Panel();


         panel.setBounds(40, 80, 200, 200);

         panel.setBackground(Color.gray);

         frame.add(panel);

         frame.setSize(400, 400);

         frame.setVisible(true);

    }
}