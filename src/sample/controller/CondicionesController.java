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

public class CondicionesController implements Initializable {
    @FXML
    ImageView imgVCondicion;
    @FXML
    ImageView imgVCondicion1;
    @FXML
    ImageView imgVCondicion2;
    @FXML
    ImageView neu;
    @FXML
    ImageView dirich;
    @FXML
    ImageView condicion;
    @FXML
    ImageView condFinal;
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
        Image image = new Image(getClass().getResourceAsStream("../images/Captura.png"));
        imgVCondicion.setImage(image);
        Image image1 = new Image(getClass().getResourceAsStream("../images/dirich.png"));
        imgVCondicion1.setImage(image1);
        Image image2 = new Image(getClass().getResourceAsStream("../images/neu.png"));
        imgVCondicion2.setImage(image2);
        Image image3 = new Image(getClass().getResourceAsStream("../images/neumannCondition.png"));
        neu.setImage(image3);
        Image image4 = new Image(getClass().getResourceAsStream("../images/dirichletCondicion.png"));
        dirich.setImage(image4);
        Image image5 = new Image(getClass().getResourceAsStream("../images/ensamblaje/4.gif"));
        condicion.setImage(image5);
        Image image6 = new Image(getClass().getResourceAsStream("../images/ensamblaje/5.gif"));
        condFinal.setImage(image6);
    }
}
