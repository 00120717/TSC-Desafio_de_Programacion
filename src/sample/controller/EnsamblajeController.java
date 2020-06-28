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

public class EnsamblajeController implements Initializable {
    @FXML
    ImageView imgtable;
    @FXML
    ImageView imgelto1;
    @FXML
    ImageView imgglobal;
    @FXML
    ImageView imgensamblaje;
    @FXML
    ImageView scroll;
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
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image1 = new Image(getClass().getResourceAsStream("../images/ensamblaje/1.gif"));
        imgtable.setImage(image1);
        Image image2 = new Image(getClass().getResourceAsStream("../images/ensamblaje/elemento1.jpg"));
        imgelto1.setImage(image2);
        Image image3 = new Image(getClass().getResourceAsStream("../images/ensamblaje/2.gif"));
        imgglobal.setImage(image3);
        Image image4 = new Image(getClass().getResourceAsStream("../images/ensamblaje/4.gif"));
        imgensamblaje.setImage(image4);
        Image images = new Image(getClass().getResourceAsStream("../images/scroll.jpg"));
        scroll.setImage(images);
    }
}
