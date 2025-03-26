import java.awt.*;
import java.awt.event.*;

public class reg extends Frame{

    private Label labelName, labelEmail, labelPassword;
    private TextField textName, textEmail, textPassword;
    private Button submitButton;
    private TextArea txtOutput;

    public reg(){
        setTitle("Registration Form");
        setSize(400, 480);
        setLayout(new FlowLayout());
        setBackground(Color.cyan);

        labelName = new Label("Enter your name");
        textName = new TextField(30);

        add(labelName);
        add(textName);

        labelEmail = new Label("Enter your email");
        textEmail = new TextField(50);

        add(labelEmail);
        add(textEmail);

        labelPassword = new Label("Enter your password");
        textPassword = new TextField(50);
        add(labelPassword);
        add(textPassword);

        submitButton = new Button("Submit");
        submitButton.addActionListener(
            e -> handleSubmit()
        );
        add(submitButton);

        Label output = new Label("Output: ");
        txtOutput = new TextArea(30, 40);
        add(txtOutput);

        setVisible(true);

    }


    public void handleSubmit(){
        txtOutput.setText("Registered");
    }


    public static void main(String[] args) {
        reg reg = new reg();
        

    }


    
}