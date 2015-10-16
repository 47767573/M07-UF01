package CalcSimple;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private TextField tfPantalla, tfOperacion;

    String num1 = "";
    String num2 = "";
    String symbol;


    public void OnCalcular(ActionEvent actionEvent) {
        String clickNumero = ((Button)actionEvent.getSource()).getText();

        if (symbol == null) {
            num1 += clickNumero;
            tfPantalla.setText(num1);
        } else if (symbol != null) {
            num2 += clickNumero;
            tfPantalla.setText(num2);
        }
    }

    public void OnOperacion(ActionEvent actionEvent) {
        String clickOperacion = ((Button)actionEvent.getSource()).getText();

        symbol = clickOperacion;
        tfOperacion.setText(symbol);

        if (num2 != null){
            OnIgual(actionEvent);
        }
    }

    public void OnIgual(ActionEvent actionEvent) {
        Double dbNum1;
        Double dbNum2;
        Double total = 0.0;

        dbNum1 = Double.valueOf(num1);
        dbNum2 = Double.valueOf(num2);

        if (symbol.equals("x")) {
            total = dbNum1*dbNum2;
        }else if (symbol.equals("/")) {
            total = dbNum1/dbNum2;
        }else if (symbol.equals("+")) {
            total = dbNum1+dbNum2;
        }else if (symbol.equals("-")) {
            total = dbNum1-dbNum2;
        }

        num1 = String.valueOf(total);
        tfPantalla.setText(String.valueOf(total));
        num2="";

    }

    public void OnDelete(ActionEvent actionEvent) {
        String numAntes =  tfPantalla.getText();
        if (numAntes.length() >= 0) {
            numAntes.substring(0, (numAntes.length() - 2));
        }else{
            tfPantalla.setText ("0");
        }
    }
}
