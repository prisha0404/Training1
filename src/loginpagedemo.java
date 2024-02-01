import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginpagedemo  implements ActionListener {


            JFrame frame=new JFrame();
            JLabel label=new JLabel("login");
            JTextField userIDfield=new JTextField();
            JButton button=new JButton("click");
            public loginpagedemo(String text){
                userIDfield.setBounds(100,10,200,20);
                label.setBounds(100,20,200,400);
                button.setBounds(100,60,300,50);
                button.addActionListener(this);
                frame.add(label);
                frame.add(userIDfield);
                frame.add(button);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420,420);
                frame.setLayout(null);
                frame.setVisible(true);

        }


    @Override
    public void actionPerformed(ActionEvent e) {
                String text;
                if(e.getSource()==button){
                    text=userIDfield.getText();
                    try{
                        new loginpagedemo(text);

                    }catch(Exception ex){
                        throw new RuntimeException(ex);

                    }
                }

    }
}

