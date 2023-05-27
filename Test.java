import java.awt.event.*;
import java.awt.*;

public class Test extends Frame implements ActionListener,MouseListener,MouseMotionListener {
    private Label label;
    private TextField textField;
    private Button button;
    
    public Test(){
        super("Event handling... ");
        label = new Label("Enter text: ");
        textField = new TextField(20);
        button = new Button("Submit");

        setLayout(new FlowLayout());

        add(label);
        add(textField);
        add(button);

        button.addActionListener(this);
        textField.addMouseMotionListener(this);
        textField.addMouseListener(this);
        
        setSize(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String text = textField.getText();
        System.out.println("Text Entered: "+text);
    }

    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked..");
    }
    
    public void mousePressed(MouseEvent e){
        System.out.println("Mouse Pressed..");
    }

    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released..");
    }

    public void mouseDragged(MouseEvent e){
        System.out.println("Mouse Dragged..");
    }

    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered..");
    }

    public void mouseExited(MouseEvent e){
        System.out.println("Mouse Exited..");
    }

    public void mouseMoved(MouseEvent e){
        System.out.println("Mouse Moved..");
    }

    public static void main(String[] args){
        Test ob = new Test();
        ob.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
