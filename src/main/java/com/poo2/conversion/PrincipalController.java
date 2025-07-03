/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo2.conversion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrincipalController implements Initializable {
    final double METROS_KILOMETROS = 0.001;
    final double METROS_MILLAS = 0.00062137;
    final double KILOMETROS_MILLAS = 0.62137;
    final double CENTIMETROS_PULGADAS = 0.393701;
    
    @FXML 
    TextField cantidad;
    @FXML
    Button mtokm;
    @FXML
    Button mtom;
    @FXML
    Button kmtom;

    public Integer obtenerValor(){
        Integer retorno = null;
        try{
            retorno = Integer.valueOf(cantidad.getText());
        }catch (NumberFormatException nfe){
           // nfe.printStackTrace();
        }
        return retorno;
    }

    public void mostrarResultado(String tipoConversion, double resultado) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Resultado de la Convercion");
        alert.setHeaderText("Conversion Exitosa");
        alert.setContentText(String.format("El resultado de  convercion  %s  es: %.2f",tipoConversion, resultado));
        alert.showAndWait();
    }

    public void mostrarError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error ");
        alert.setHeaderText("No se puede realizar la conversion");
        alert.setContentText("Debe ingresar un numero");
        alert.showAndWait();
    }
    public void metrosKilometros(){
        System.out.println("Metros a Kilometros");

        Integer valor = obtenerValor();
        if(valor != null) {
            mostrarResultado("Metros a Kilometros", (METROS_KILOMETROS * valor));
        }else {
            mostrarError();
        }
    }
    public void metrosMillas(){
        System.out.println("Metros a Millas");
        Integer valor = obtenerValor();
        if(valor != null) {
            mostrarResultado("Metros a Millas", (METROS_MILLAS * valor));
        }else {
            mostrarError();
        }
        
    }
    public void kilometrosMillas(){
        System.out.println("Kilometros a Millas");
        Integer valor = obtenerValor();
        if(valor != null) {
            mostrarResultado("Kilometros a Millas", (KILOMETROS_MILLAS * valor));
        }else {
            mostrarError();
        }

    }
    public void centimetrosPulgadas(){
        System.out.println("Centimetros a Pulgadas");
        Integer valor = obtenerValor();
        if(valor != null) {
            mostrarResultado("Centimetros a Pulgadas", (CENTIMETROS_PULGADAS * valor));
        }else {
            mostrarError();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
