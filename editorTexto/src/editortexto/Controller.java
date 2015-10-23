package editortexto;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.image.ImageView;

public class Controller  {

    //TEXTAREA
    public TextArea taEditor;

    //BUTTONS - TOOLBAR
    public Button btCopy;

    //MENU ITEMS
    public MenuItem miSalir;

    public MenuItem miCopiar;
    public MenuItem miCortar;
    public MenuItem miPegar;
    public MenuItem miDeshacer;

    public MenuItem miArial;
    public MenuItem miFreemono;
    public MenuItem miFontSize20;
    public MenuItem miFontSize14;
    public MenuItem miFontSize11;

    public MenuItem miAyuda;


    //INICIO ---------------------------------------------------------------------------------
    public void initialize(){

    }



    //Funciones FICHERO
    public void OnSalir (ActionEvent actionEvent){
        Platform.exit();
    }


    //Funciones EDITAR
    public void OnCopiar (ActionEvent actionEvent){
        taEditor.copy();
    }

    public void OnCortar(ActionEvent actionEvent) { taEditor.cut();  }

    public void OnPegar(ActionEvent actionEvent) {
        taEditor.paste();
    }

    public void OnDeshacer(ActionEvent actionEvent){
        taEditor.undo();
    }


    //Funciones OPCIONES
    public void setFontArial (ActionEvent actionEvent){
        taEditor.setFont(new Font("SansSerif", taEditor.getFont().getSize()));
    }
    public void setFontTimes(ActionEvent actionEvent) {
        taEditor.setFont(new Font("FreeMono", taEditor.getFont().getSize()));
    }

    public void setFontSize(ActionEvent actionEvent) {
        Double fontSize = Double.parseDouble(((MenuItem) actionEvent.getSource()).getText());
        taEditor.setFont(new Font(taEditor.getFont().getSize()));
    }


}
