import java.awt.event.*;
import javax.swing.*;

public class QuestionTwo {

    public static void main(String[] args) {
        
        //Creating GUI
        //Creating Frame
        JFrame frmWebBrowser = new JFrame("VennBrowser");
        frmWebBrowser.setVisible(true);
        frmWebBrowser.setLayout(null);
        frmWebBrowser.setSize(1400, 750);
        frmWebBrowser.setLocation(0, 0);
        frmWebBrowser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creating textfield
        JTextField txtUrl = new JTextField();
        txtUrl.setBounds(350, 50, 500, 30);
        frmWebBrowser.getContentPane().add(txtUrl);
        
        //Creating Button
        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(860, 50, 100, 30);
        frmWebBrowser.getContentPane().add(btnSearch);
        
        //Creating editorpane
        JEditorPane edtpDisplay = new JEditorPane();
        edtpDisplay.setEditable(false);
        
        //Creating scrollpane and adding editorpane to it
        JScrollPane scrp = new JScrollPane(edtpDisplay);
        scrp.setBounds(80, 100, 1200, 600);
        frmWebBrowser.getContentPane().add(scrp);//adding scrollpane to frame
        
        //Action listener created
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Getting valeu from textfield
                String urlAddress = txtUrl.getText().toString();
                    
                try{
                    //display the page of the url
                    edtpDisplay.setPage(urlAddress);
                }catch(Exception ex){
                    
                }
                
            }
        });
        
    }
    
}
