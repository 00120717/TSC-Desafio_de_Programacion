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
public class MefController implements Initializable {

    @FXML
    ImageView imgP1;
    @FXML
    ImageView imgP1_1;
    @FXML
    ImageView imgP2_A;
    @FXML
    ImageView imgP3_1;
    @FXML
    ImageView imgP4_1;
    @FXML
    ImageView imgP5_1;
    @FXML
    ImageView imgP6_1;
    @FXML
    ImageView imgP6_2;
    @FXML
    ImageView imgP6_3;
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
        //step1
        Image image = new Image(getClass().getResourceAsStream("/sample/images/mef/mundoxyz.jpg"));
        imgP1.setImage(image);
        Image image2 = new Image(getClass().getResourceAsStream("/sample/images/mef/mundoizo.jpg"));
        imgP1_1.setImage(image2);
        //step3
        Image imageA = new Image(getClass().getResourceAsStream("/sample/images/mef/A.jpg"));
        imgP2_A.setImage(imageA);
        Image image4 = new Image(getClass().getResourceAsStream("/sample/images/mef/modeloN.jpg"));
        imgP3_1.setImage(image4);
        //step4
        Image image6 = new Image(getClass().getResourceAsStream("/sample/images/mef/w.jpg"));
        imgP4_1.setImage(image6);

        //Step5
        Image image10 = new Image(getClass().getResourceAsStream("/sample/images/mef/WT.jpg"));
        imgP5_1.setImage(image10);
        //Step5
        Image image13 = new Image(getClass().getResourceAsStream("/sample/images/mef/matrixD.jpg"));
        imgP6_1.setImage(image13);
        Image image14 = new Image(getClass().getResourceAsStream("/sample/images/mef/matrixE.jpg"));
        imgP6_2.setImage(image14);
        Image image15 = new Image(getClass().getResourceAsStream("/sample/images/mef/formaDebil.jpg"));
        imgP6_3.setImage(image15);

    }
}
