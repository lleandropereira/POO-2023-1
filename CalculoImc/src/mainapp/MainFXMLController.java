/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainapp;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author leandropereira
 */
public class MainFXMLController implements Initializable {

    @FXML
    private TextField textFieldNome;
    @FXML
    private Spinner<Integer> spinnerIdade;
    @FXML
    private ComboBox<String> comboBoxSexo;
    private String [] sexo = {"Masculino", "Feminino"};
    @FXML
    private TextField textFieldAltura;
    @FXML
    private TextField textFieldPeso;
    @FXML
    private Button buttonCalcular;
    @FXML
    private Button buttonNovo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        SpinnerValueFactory<Integer> idade = 
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 150);
        idade.setValue(1);
        
        spinnerIdade.setValueFactory(idade);
        comboBoxSexo.getItems().addAll(sexo);
    }    

    @FXML
    private void handleButtonCalcular(ActionEvent event) {
        String nome = textFieldNome.getText();
        float idade = spinnerIdade.getValue();
        String sexo = comboBoxSexo.getValue();
        float altura = Float.parseFloat(textFieldAltura.getText());
        float peso = Float.parseFloat(textFieldPeso.getText());
        
        float imc = peso / (altura * altura);
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        String resultado = "";
        if(imc < 18.5) {
            resultado = "Baixo peso";
        } else if(imc < 25) {
            resultado = "Normal";
        } else if(imc < 30) {
            resultado = "Sobrepeso";
        } else if( imc > 29) {
            resultado = "Obesidade";
        }
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Resultado IMC");
        alert.setContentText("Nome: " + nome +
                             "\nIdade: " + idade +
                             "\nSexo: " + sexo + 
                             "\nAltura: " + altura +
                             "\nPeso: " + peso +
                             "\n\nIMC: " + df.format(imc) +
                             "\nClassificação: " + resultado);
        Optional<ButtonType> result = alert.showAndWait();
        System.out.println(result);
    }

    @FXML
    private void handleButtonNovo(ActionEvent event) {
        textFieldNome.clear();
        spinnerIdade.getValueFactory().setValue(1);
        comboBoxSexo.setValue(null);
        textFieldAltura.clear();
        textFieldPeso.clear();
    }
    
}
