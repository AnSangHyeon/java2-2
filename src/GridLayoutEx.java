import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
  public GridLayoutEx() {
    super("GridLayout 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = getContentPane();

    contentPane.setLayout(new GridLayout(1, 10));

    for(int i=1;i<10;i++) {
      String text = Integer.toString(i);
      JButton button = new JButton(text);
      contentPane.add(button);
    }

    setSize(300, 150);
    
  }
  public static void main(String[] args) {
    new GridLayoutEx();
  }
}
