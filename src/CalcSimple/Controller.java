package CalcSimple;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Button btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,
                btnOcho,btnNueve,btnCero,btnClear,btnDot,btnResultado,btnSuma,
                btnResta,btnDividir,btnMultiplicar;

    private TextField tfPantalla;


    String num1;
    String num2;


    public void OnCalcular(ActionEvent actionEvent) {
        String clickNumero = ((Button)actionEvent.getSource()).getText();

        num1 += (clickNumero);
        tfPantalla.setText(num1);
    }

}
