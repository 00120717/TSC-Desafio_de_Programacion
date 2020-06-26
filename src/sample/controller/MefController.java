package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;
public class MefController implements Initializable {

    @FXML
    ImageView imgP1;
    @FXML
    ImageView imgP1_1;
    @FXML
    ImageView imgP1_2;
    @FXML
    ImageView imgP2_A;
    @FXML
    ImageView imgP2_B;
    @FXML
    ImageView imgP3_1;
    @FXML
    ImageView imgP3_2;
    @FXML
    ImageView imgP4_1;
    @FXML
    ImageView imgP4_2;
    @FXML
    ImageView imgP4_3;
    @FXML
    ImageView imgP4_4;
    @FXML
    ImageView imgP5_1;
    @FXML
    ImageView imgP5_2;
    @FXML
    ImageView imgP5_3;
    @FXML
    ImageView imgP6_1;
    @FXML
    ImageView imgP6_2;
    @FXML
    ImageView imgP6_3;
    @FXML
    ImageView imgP6_4;
    @Override
    public void initialize(URL url , ResourceBundle resourceBundle) {
        //step1
        Image image = new Image(getClass().getResourceAsStream("../images/mef/mundoxyz.jpg"));
        imgP1.setImage(image);
        Image image2 = new Image(getClass().getResourceAsStream("../images/mef/mundoizo.jpg"));
        imgP1_1.setImage(image2);
        //step2
        Image image3 = new Image(getClass().getResourceAsStream("../images/mef/n.jpg"));
        imgP1_2.setImage(image3);
        Image imageA = new Image(getClass().getResourceAsStream("../images/mef/A.jpg"));
        imgP2_A.setImage(imageA);
        Image imageB = new Image(getClass().getResourceAsStream("../images/mef/B.jpg"));
        imgP2_B.setImage(imageB);
        Image image4 = new Image(getClass().getResourceAsStream("../images/mef/modeloN.jpg"));
        //step3
        imgP3_1.setImage(image4);
        Image image5 = new Image(getClass().getResourceAsStream("../images/mef/residuos.jpg"));
        imgP3_2.setImage(image5);
        //step4
        Image image6 = new Image(getClass().getResourceAsStream("../images/mef/w.jpg"));
        imgP4_1.setImage(image6);
        Image image7 = new Image(getClass().getResourceAsStream("../images/mef/R1.jpg"));
        imgP4_2.setImage(image7);
        Image image8 = new Image(getClass().getResourceAsStream("../images/mef/R2.jpg"));
        imgP4_3.setImage(image8);
        Image image9 = new Image(getClass().getResourceAsStream("../images/mef/R1masR2.jpg"));
        imgP4_4.setImage(image9);
        //Step5
        Image image10 = new Image(getClass().getResourceAsStream("../images/mef/WT.jpg"));
        imgP5_1.setImage(image10);
        Image image11 = new Image(getClass().getResourceAsStream("../images/mef/p5integrales.jpg"));
        imgP5_2.setImage(image11);
        Image image12 = new Image(getClass().getResourceAsStream("../images/mef/strongForm.jpg"));
        imgP5_3.setImage(image12);
        //Step5
        Image image13 = new Image(getClass().getResourceAsStream("../images/mef/matrixD.jpg"));
        imgP6_1.setImage(image13);
        Image image14 = new Image(getClass().getResourceAsStream("../images/mef/matrixE.jpg"));
        imgP6_2.setImage(image14);
        Image image15 = new Image(getClass().getResourceAsStream("../images/mef/formaDebil.jpg"));
        imgP6_3.setImage(image15);
        Image image16 = new Image(getClass().getResourceAsStream("../images/mef/presistema.jpg"));
        imgP6_4.setImage(image16);
    }
}