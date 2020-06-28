package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ModeloController implements Initializable {

    @FXML
    Pane pane;

    @FXML
    Label label;

    @FXML
    ImageView imageView;

    @FXML
    Button btn_cerrar;

    @FXML
    public void cerrarVentana(ActionEvent event){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/view/main.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("MEF");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
            System.out.println("No se pudo abrir el FXML");
        }
        Stage stage = (Stage) btn_cerrar.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url , ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("../images/modelo.png"));
        imageView.setImage(image);
    }
}
