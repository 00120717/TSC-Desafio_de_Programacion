package sample.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.model.Elementos;

import java.net.URL;
import java.util.ResourceBundle;

public class TableController implements Initializable{
    @FXML
    TableView<Elementos> tabla = new TableView();
    @FXML
    TableColumn<Elementos,Integer> elto;
    @FXML
    TableColumn<Elementos,Integer> n1;
    @FXML
    TableColumn<Elementos,Integer> n2;
    @FXML
    TableColumn<Elementos,Integer> n3;
    @FXML
    TableColumn<Elementos,Integer> n4;

    final ObservableList<Elementos> data = FXCollections.observableArrayList(
            new Elementos(1,14,16,15,12),
            new Elementos(2,18,16,17,13),
            new Elementos(3,1,2,3,8),
            new Elementos(4,7,6,4,9),
            new Elementos(5,15,11,14,12),
            new Elementos(6,4,5,1,8),
            new Elementos(7,17,12,12,16),
            new Elementos(8,14,11,10,12),
            new Elementos(9,8,6,9,3),
            new Elementos(10,1,5,2,8),
            new Elementos(11,4,11,5,8),
            new Elementos(12,13,12,9,11),
            new Elementos(13,11,4,10,8),
            new Elementos(14,8,9,12,11),
            new Elementos(15,18,16,13,15),
            new Elementos(16,3,7,9,2),
            new Elementos(17,17,12,16,15),
            new Elementos(18,8,6,3,1),
            new Elementos(19,12,13,16,15),
            new Elementos(20,9,8,3,2),
            new Elementos(21,11,10,12,8),
            new Elementos(22,13,12,11,15),
            new Elementos(23,2,5,9,8),
            new Elementos(24,5,9,8,11)

    );

    @FXML
    Button btn_cerrar;

    @FXML
    public void cerrarVentana(ActionEvent event){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/main.fxml"));
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
        elto.setCellValueFactory(new PropertyValueFactory<Elementos, Integer>("elto"));
        n1.setCellValueFactory(new PropertyValueFactory<Elementos, Integer>("n1"));
        n2.setCellValueFactory(new PropertyValueFactory<Elementos, Integer>("n2"));
        n3.setCellValueFactory(new PropertyValueFactory<Elementos, Integer>("n3"));
        n4.setCellValueFactory(new PropertyValueFactory<Elementos, Integer>("n4"));

        tabla.setItems(data);
    }
}

