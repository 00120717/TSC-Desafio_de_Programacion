package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 575;
    @FXML
    private Button btn_model;
    @FXML
    private Button btn_domain;
    @FXML
    private Button btn_mesh;
    @FXML
    private Button btn_table;
    @FXML
    private Button btn_mef;
    @FXML
    private Button btn_matrix;
    @FXML
    private Button btn_ensambly;
    @FXML
    private Button btn_contorno;
    @FXML
    public Button btn_cerrar;

    @FXML   /*+++++++++++ Modelo +++++++++++*/
    void modeloHandlerButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/view/modelo.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Modelo");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
            System.out.println("No se pudo abrir Modelo");
        }
        Stage stage = (Stage) btn_model.getScene().getWindow();
        stage.close();
    }

    @FXML   /*+++++++++++ MEF +++++++++++*/
    void mefHandlerButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/view/mef.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("MEF");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
            System.out.println("No se pudo abrir el FXML");
        }
        Stage stage = (Stage) btn_mef.getScene().getWindow();
        stage.close();
    }
    @FXML   /*+++++++++++ Tabla de conectividades +++++++++++*/
    void tableHandlerButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/view/tableConectivity.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Tabla de Conectividad");
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e){
            System.out.println("No se pudo abrir el FXML");
        }
        Stage stage = (Stage) btn_table.getScene().getWindow();
        stage.close();
    }
    @FXML   /*+++++++++++ Condiciones de Contorno +++++++++++*/
    void contornoHandlerButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/view/condiciones.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Condiciones de Contorno");
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e){
            System.out.println("No se pudo abrir el FXML");
        }
        Stage stage = (Stage) btn_contorno.getScene().getWindow();
        stage.close();
    }
    @FXML   /*+++++++++++ Pantalla indicaciones Dominio +++++++++++*/
    void dominioHandlerButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/view/dominio.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Indicaciones Dominio");
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e){
            System.out.println("No se pudo abrir el FXML");
        }
    }
    @FXML   /*+++++++++++ Pantalla ensamblaje +++++++++++*/
    void assamblyHandlerButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/view/ensamblaje.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Ensamblaje");
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e){
            System.out.println("No se pudo abrir el FXML");
        }
        Stage stage = (Stage) btn_ensambly.getScene().getWindow();
        stage.close();
    }
    @FXML   /*+++++++++++ Pantalla Malla +++++++++++*/
    void mallaHandlerButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/view/malla.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Malla");
            stage.setScene(new Scene(root));
            stage.show();

        }catch (Exception e){
            System.out.println("No se pudo abrir el FXML");
        }
    }
    @FXML   /*+++++++++++ Modelo +++++++++++*/
    void matrixHandlerButton(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/view/matrix.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle("Modelo");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
            System.out.println("No se pudo abrir Modelo");
        }
        Stage stage = (Stage) btn_matrix.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void cerrarVentana(ActionEvent event){
        Stage stage = (Stage) btn_cerrar.getScene().getWindow();
        stage.close();
    }

}
