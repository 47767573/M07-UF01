package editortexto;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.text.EditorKit;

public class Controller {

    @FXML
    private MenuItem salir;
    private TextArea editor;


    public void OnSalir (ActionEvent actionEvent){
        Platform.exit();
    }

    public void OnCopiar (ActionEvent actionEvent){
        editor.copy();
    }

    public void OnCortar(ActionEvent actionEvent){
        editor.cut();
    }

    public void OnPegar(ActionEvent actionEvent){
        editor.paste();
    }

    public void OnDeshacer(ActionEvent actionEvent){
        editor.undo();
    }
}
