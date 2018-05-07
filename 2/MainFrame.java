import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton jbtnAdd = new JButton("->>");
    private JButton jbtnSub = new JButton("<<-");
    private JButton jbtnExit = new JButton("Exit");
    private JLabel jlb = new JLabel("ORZ");
    private JTextField jtf = new JTextField(0);
    private int x = 0;
    private int abs = 0;
    private int la = 0;
    public MainFrame(){
        init();
    }
    private void init(){
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       this.setLayout(null);
       this.setLocation(100,50);
       this.setSize(800,600);
       jbtnAdd.setLocation(50,60);
       jbtnAdd.setSize(120,30);
       this.add(jbtnAdd);
       jbtnAdd.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               abs = Integer.parseInt(jtf.getText());
               la += abs;
               jlb.setLocation(la,100);
               MainFrame.this.setTitle(Integer.toString(la));

           }
       });
       jbtnSub.setLocation(200,60);
       jbtnSub.setSize(120,30);
       this.add(jbtnSub);
       jbtnSub.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               abs = Integer.parseInt(jtf.getText());
               la -=abs;
               jlb.setLocation(la,100);
               MainFrame.this.setTitle(Integer.toString(la));
           }
       });
       jbtnExit.setLocation(350,60);
       jbtnExit.setSize(120,30);
       this.add(jbtnExit);
       jbtnExit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });
       this.add(jlb);
       jlb.setLocation(x,100);
       jlb.setSize(120,30);
       this.add(jtf);
       jtf.setLocation(100,300);
       jtf.setSize(120,30);
    }
}
