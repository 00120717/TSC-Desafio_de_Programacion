package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Malla2Controller implements Initializable{
    public static final float WIDTH = 600;
    public static final float HEIGHT = 575;
    @FXML
    ImageView imgMalla;
    @FXML
    Button btn_show_malla;

    class SmartObject extends Group {
        Rotate r;
        Transform t = new Rotate();

        void rotarEnX(int x){
            r = new Rotate(x,Rotate.X_AXIS);
            t = t.createConcatenation(r);
            this.getTransforms().clear();
            this.getTransforms().addAll(t);
        }
        void rotarEnY(int y){
            r = new Rotate(y,Rotate.Y_AXIS);
            t = t.createConcatenation(r);
            this.getTransforms().clear();
            this.getTransforms().addAll(t);
        }
    }
    @FXML   /*+++++++++++ Pantalla Malla +++++++++++*/
    void malla2HandlerButton(ActionEvent event){
        try {
            Stage stage = new Stage();
            SmartObject domain = new SmartObject();
            domain.getChildren().add(prepareDomain());

            Group root = new Group();
            root.getChildren().add(prepareImageView());
            root.getChildren().add(domain);


            Camera camera = new PerspectiveCamera();
            Scene scene = new Scene(root,WIDTH,HEIGHT);
            scene.setFill(Color.SEASHELL);
            scene.setCamera(camera);

            domain.translateXProperty().set(WIDTH/2);
            domain.translateYProperty().set(HEIGHT/2);
            domain.translateZProperty().set(-400);

            mouseControl(domain,scene,stage);

            stage.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent ->{
                switch (keyEvent.getCode()){
                    case W:
                        domain.rotarEnX(10);
                        break;
                    case S:
                        domain.rotarEnX(-10);
                        break;
                    case A:
                        domain.rotarEnY(10);
                        break;
                    case D:
                        domain.rotarEnY(-10);
                        break;
                }
            });

            //mostrar ventana
            stage.setResizable(false);
            stage.setTitle("Malla");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            System.out.println("No se pudo abrir el FXML");
        }
        Stage stage = (Stage) btn_show_malla.getScene().getWindow();
        stage.close();
    }
    private Node prepareDomain() {

        PhongMaterial material = new PhongMaterial();
        material.setDiffuseMap(new Image(getClass().getResourceAsStream("/sample/images/lado1.jpg")));
        Box box =  new Box(100,20,50);
        box.setMaterial(material);
        box.setMaterial(material);
        return box;
    }

    private void mouseControl(SmartObject group, Scene scene, Stage stage) {
        stage.addEventHandler(ScrollEvent.SCROLL, scrollEvent -> {
            double mov = scrollEvent.getDeltaY();
            group.translateZProperty().set(group.getTranslateZ() + mov);
        });
    }

    private ImageView prepareImageView(){
        Image image = new Image(getClass().getResourceAsStream("/sample/images/fondo_malla_poligonal.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.getTransforms().add(new Translate(-image.getWidth()/5,-image.getHeight()/5,1800));
        return imageView;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image malla = new Image(getClass().getResourceAsStream("/sample/images/mef/malla.jpg"));
        imgMalla.setImage(malla);
    }
}
