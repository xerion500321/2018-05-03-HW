import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel jlb1 = new JLabel("華氏度:");
    private JLabel jlb2 = new JLabel("攝氏度");
    private JLabel jlb3 = new JLabel();
    private JButton jbn = new JButton("=");
    private JTextField jtf = new JTextField();
    private JButton jbn2 = new JButton("Exit");
    public MainFrame(){
          tem();
    }
    public void tem(){
      this.setDefaultCloseOperation(3);
      this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        jlb1.setBounds(150,90,120,30);
        this.add(jlb1);
        jlb2.setBounds(580,90,120,30);
        this.add(jlb2);
        jlb3.setBounds(450,90,120,30);
        this.add(jlb3);
        jbn.setBounds(320,90,120,30);
        this.add(jbn);
        jtf.setBounds(200,90,120,30);
        this.add(jtf);
        jbn2.setBounds(350,150,120,30);
        this.add(jbn2);
        jbn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb3.setText(Double.toString((Double.parseDouble(jtf.getText())-32)*(5/9d)));
            }
        });
        jbn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }
        });
    }

}
