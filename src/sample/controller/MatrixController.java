package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MatrixController implements Initializable {
    @FXML
    ImageView m1;
    @FXML
    ImageView m2;
    @FXML
    ImageView m3;
    @FXML
    ImageView mc1;
    @FXML
    ImageView mc2;
    @FXML
    ImageView menores;
    @FXML
    ImageView mconjyadj;
    @FXML
    ImageView mc3;
    @FXML
    ImageView mc4;
    @FXML
    ImageView mc5;
    @FXML
    ImageView mc6;
    @FXML
    ImageView mT;
    @FXML
    ImageView C;
    @FXML
    ImageView mk1;
    @FXML
    ImageView menores1;
    @FXML
    ImageView mconjyadj1;
    @FXML
    ImageView mk2;
    @FXML
    ImageView K;
    @FXML
    ImageView mj1;
    @FXML
    ImageView menoresj;
    @FXML
    ImageView adjuntaj;
    @FXML
    ImageView mj2;
    @FXML
    ImageView J;
    @FXML
    ImageView mf1;
    @FXML
    ImageView mf2;
    @FXML
    ImageView mf3;
    @FXML
    ImageView F;
    @FXML
    ImageView mg1;
    @FXML
    ImageView mg2;
    @FXML
    ImageView mg3;
    @FXML
    ImageView mg4;
    @FXML
    ImageView mg5;
    @FXML
    ImageView g;
    @FXML
    ImageView mh1;
    @FXML
    ImageView mh2;
    @FXML
    ImageView mh3;
    @FXML
    ImageView mh4;
    @FXML
    ImageView mh5;
    @FXML
    ImageView h;
    @FXML
    ImageView dimens;
    @FXML
    ImageView slocal;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("../images/matrices/m1.png"));
        m1.setImage(image);
        Image image2 = new Image(getClass().getResourceAsStream("../images/matrices/m2.png"));
        m2.setImage(image2);
        Image image3 = new Image(getClass().getResourceAsStream("../images/matrices/m3.png"));
        m3.setImage(image3);

        Image image4 = new Image(getClass().getResourceAsStream("../images/matrices/mc1.png"));
        mc1.setImage(image4);
        Image image5 = new Image(getClass().getResourceAsStream("../images/matrices/mc2.png"));
        mc2.setImage(image5);
        Image image6 = new Image(getClass().getResourceAsStream("../images/matrices/menores.png"));
        menores.setImage(image6);
        Image image7 = new Image(getClass().getResourceAsStream("../images/matrices/mconyadj.png"));
        mconjyadj.setImage(image7);
        Image image8 = new Image(getClass().getResourceAsStream("../images/matrices/mc3.png"));
        mc3.setImage(image8);
        Image image9 = new Image(getClass().getResourceAsStream("../images/matrices/mc4.png"));
        mc4.setImage(image9);
        Image image10 = new Image(getClass().getResourceAsStream("../images/matrices/mc5.png"));
        mc5.setImage(image10);
        Image image11 = new Image(getClass().getResourceAsStream("../images/matrices/mc6.png"));
        mc6.setImage(image11);
        Image image12 = new Image(getClass().getResourceAsStream("../images/matrices/mT.png"));
        mT.setImage(image12);
        Image image13 = new Image(getClass().getResourceAsStream("../images/matrices/C.png"));
        C.setImage(image13);

        Image image14 = new Image(getClass().getResourceAsStream("../images/matrices/mk1.png"));
        mk1.setImage(image14);
        Image image15 = new Image(getClass().getResourceAsStream("../images/matrices/mk2.png"));
        mk2.setImage(image15);
        Image image16 = new Image(getClass().getResourceAsStream("../images/matrices/menoresk.png"));
        menores1.setImage(image16);
        Image image17 = new Image(getClass().getResourceAsStream("../images/matrices/adjuntak.png"));
        mconjyadj1.setImage(image17);
        Image image18 = new Image(getClass().getResourceAsStream("../images/matrices/K.png"));
        K.setImage(image18);

        Image image19 = new Image(getClass().getResourceAsStream("../images/matrices/mj1.png"));
        mj1.setImage(image19);
        Image image20 = new Image(getClass().getResourceAsStream("../images/matrices/menores.png"));
        menoresj.setImage(image20);
        Image image21 = new Image(getClass().getResourceAsStream("../images/matrices/adjuntak.png"));
        adjuntaj.setImage(image21);
        Image image22 = new Image(getClass().getResourceAsStream("../images/matrices/mj2.png"));
        mj2.setImage(image22);
        Image image23 = new Image(getClass().getResourceAsStream("../images/matrices/J.png"));
        J.setImage(image23);
        Image image24 = new Image(getClass().getResourceAsStream("../images/matrices/mf1.png"));
        mf1.setImage(image24);
        Image image25 = new Image(getClass().getResourceAsStream("../images/matrices/mf2.png"));
        mf2.setImage(image25);
        Image image26 = new Image(getClass().getResourceAsStream("../images/matrices/mf3.png"));
        mf3.setImage(image26);
        Image image27 = new Image(getClass().getResourceAsStream("../images/matrices/F.png"));
        F.setImage(image27);

        Image image28 = new Image(getClass().getResourceAsStream("../images/matrices/mg1.png"));
        mg1.setImage(image28);
        Image image29 = new Image(getClass().getResourceAsStream("../images/matrices/mg2.png"));
        mg2.setImage(image29);
        Image image30 = new Image(getClass().getResourceAsStream("../images/matrices/mg3.png"));
        mg3.setImage(image30);
        Image image31 = new Image(getClass().getResourceAsStream("../images/matrices/mg4.png"));
        mg4.setImage(image31);
        Image image32 = new Image(getClass().getResourceAsStream("../images/matrices/mg5.png"));
        mg5.setImage(image32);
        Image image33 = new Image(getClass().getResourceAsStream("../images/matrices/g.png"));
        g.setImage(image33);

        Image image34 = new Image(getClass().getResourceAsStream("../images/matrices/mh1.png"));
        mh1.setImage(image34);
        Image image35 = new Image(getClass().getResourceAsStream("../images/matrices/mg2.png"));
        mh2.setImage(image35);
        Image image36 = new Image(getClass().getResourceAsStream("../images/matrices/mg3.png"));
        mh3.setImage(image36);
        Image image37 = new Image(getClass().getResourceAsStream("../images/matrices/mg4.png"));
        mh4.setImage(image37);
        Image image38 = new Image(getClass().getResourceAsStream("../images/matrices/mg5.png"));
        mh5.setImage(image38);
        Image image39 = new Image(getClass().getResourceAsStream("../images/matrices/h.png"));
        h.setImage(image39);

        Image image40 = new Image(getClass().getResourceAsStream("../images/matrices/dimens.png"));
        dimens.setImage(image40);
        Image image41 = new Image(getClass().getResourceAsStream("../images/matrices/sistema_local.png"));
        slocal.setImage(image41);
    }
}
