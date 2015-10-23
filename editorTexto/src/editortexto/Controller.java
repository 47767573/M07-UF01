package editortexto;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

public class Controller  {

<<<<<<< HEAD
public class Controller {

    @FXML
    private MenuItem salir;
    private TextArea editor;
=======
>>>>>>> 506d07b94a38773855ac1b5cf8201019efd44b06

    public MenuItem salir;
    public TextArea taEditor;
    public String selectedText="paco";

    public void OnSalir (ActionEvent actionEvent){
        Platform.exit();
    }

    public void OnCopiar (ActionEvent actionEvent){
        taEditor.copy();
    }

    public void OnCortar(ActionEvent actionEvent) {
        selectedText = taEditor.getSelectedText();
        taEditor.cut();
    }

    public void OnPegar(ActionEvent actionEvent) {
        taEditor.paste();
    }

    public void OnDeshacer(ActionEvent actionEvent){

    }

    public void OnChangeFont (ActionEvent actionEvent){
        taEditor.getSelectedText();
    }


}
