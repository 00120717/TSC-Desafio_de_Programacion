package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Malla2Controller implements Initializable{
    @FXML
    ImageView imgMalla;
    @FXML
    Button btn_show_malla;
    @FXML   /*+++++++++++ Pantalla Malla +++++++++++*/
    void malla2HandlerButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/malla2.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Instrucciones Malla");
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e){
            System.out.println("No se pudo abrir el FXML");
        }
        Stage stage = (Stage) btn_show_malla.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image malla = new Image(getClass().getResourceAsStream("../images/mef/malla.jpg"));
        imgMalla.setImage(malla);
    }
}
