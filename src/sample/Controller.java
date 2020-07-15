package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import javax.swing.*;

public class Controller {

    public Text output;
    private long number1=0;
    public String operator="";
    private boolean start= true;
    Model model= new Model();
    public void  processnum(ActionEvent event)
    {
        if(start){
            output.setText("");
            start=false;
        }

        String value= ((Button)event.getSource()).getText();
        output.setText(output.getText()+ value);

    }

    public void processop(ActionEvent event){

        String value= ((Button)event.getSource()).getText();

        if(!"=".equals(value)){
            if(!operator.isEmpty())
                return;

            operator=value;

            number1=Long.parseLong(output.getText());
            output.setText("");

        }
        else {
            if (operator.isEmpty())
                return;

            output.setText(String.valueOf(model.calculate(number1,Long.parseLong(output.getText()),operator)));
            operator="";
            start=true;

        }

    }

}