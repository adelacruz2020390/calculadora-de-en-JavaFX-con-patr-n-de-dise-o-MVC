
package org.alandelacruz.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.alandelacruz.bean.*;
/**
 * FXML Controller class
 *
 * @author Alan Eduardo De La Cruz Najera
 * @date 20 abr. 2021
 * @time 22:55:35
 * Carnet:2020390
 * Codigo Tecnico: IN5BV
 */
public class FXMLCalculadoraController implements Initializable {
    private double resultado=0;
    private double numero;
    private int contadorOperadores = 0;
    private String operadorAnterior;
    private boolean ingresNuevo = false;

    public double getNumero1() {
        return resultado;
    }

    public void setNumero1(double numero1) {
        this.resultado = numero1;
    }

    public double getNumero2() {
        return numero;
    }

    public void setNumero2(double numero2) {
        this.numero = numero2;
    }

    public int getContador() {
        return contadorOperadores;
    }

    public void setContador(byte contador) {
        this.contadorOperadores = contador;
    }

    public String getOperador() {
        return operadorAnterior;
    }

    public void setOperador(String operador) {
        this.operadorAnterior = operador;
    }

    public Label getLblPantalla() {
        return lblPantalla;
    }

    public void setLblPantalla(Label lblPantalla) {
        this.lblPantalla = lblPantalla;
    }

    public Button getBtnCero() {
        return btnCero;
    }

    public void setBtnCero(Button btnCero) {
        this.btnCero = btnCero;
    }

    public Button getBtnUno() {
        return btnUno;
    }

    public void setBtnUno(Button btnUno) {
        this.btnUno = btnUno;
    }

    public Button getBtnDos() {
        return btnDos;
    }

    public void setBtnDos(Button btnDos) {
        this.btnDos = btnDos;
    }

    public Button getBtnTres() {
        return btnTres;
    }

    public void setBtnTres(Button btnTres) {
        this.btnTres = btnTres;
    }

    public Button getBtnCuatro() {
        return btnCuatro;
    }

    public void setBtnCuatro(Button btnCuatro) {
        this.btnCuatro = btnCuatro;
    }

    public Button getBtnCinco() {
        return btnCinco;
    }

    public void setBtnCinco(Button btnCinco) {
        this.btnCinco = btnCinco;
    }

    public Button getBtnSies() {
        return btnSies;
    }

    public void setBtnSies(Button btnSies) {
        this.btnSies = btnSies;
    }

    public Button getBtnSiete() {
        return btnSiete;
    }

    public void setBtnSiete(Button btnSiete) {
        this.btnSiete = btnSiete;
    }

    public Button getBtnOcho() {
        return btnOcho;
    }

    public void setBtnOcho(Button btnOcho) {
        this.btnOcho = btnOcho;
    }

    public Button getBtnNueve() {
        return btnNueve;
    }

    public void setBtnNueve(Button btnNueve) {
        this.btnNueve = btnNueve;
    }

    public Button getBtnMas() {
        return btnMas;
    }

    public void setBtnMas(Button btnMas) {
        this.btnMas = btnMas;
    }

    public Button getBtsMenos() {
        return btsMenos;
    }

    public void setBtsMenos(Button btsMenos) {
        this.btsMenos = btsMenos;
    }

    public Button getBtnMultiplicacion() {
        return btnMultiplicacion;
    }

    public void setBtnMultiplicacion(Button btnMultiplicacion) {
        this.btnMultiplicacion = btnMultiplicacion;
    }

    public Button getBtnDivision() {
        return btnDivision;
    }

    public void setBtnDivision(Button btnDivision) {
        this.btnDivision = btnDivision;
    }

    public Button getBtnPorcentaje() {
        return btnPorcentaje;
    }

    public void setBtnPorcentaje(Button btnPorcentaje) {
        this.btnPorcentaje = btnPorcentaje;
    }

    public Button getBtnIgual() {
        return btnIgual;
    }

    public void setBtnIgual(Button btnIgual) {
        this.btnIgual = btnIgual;
    }

    public Button getBtnRevertir() {
        return btnRevertir;
    }

    public void setBtnRevertir(Button btnRevertir) {
        this.btnRevertir = btnRevertir;
    }

    public Button getBtnPunto() {
        return btnPunto;
    }

    public void setBtnPunto(Button btnPunto) {
        this.btnPunto = btnPunto;
    }

    public Button getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(Button btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }
    

    @FXML
    private Label lblPantalla;
    @FXML
    private Button btnCero;
    @FXML
    private Button btnUno;
    @FXML
    private Button btnDos;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnCuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSies;
    @FXML
    private Button btnSiete;
    @FXML
    private Button btnOcho;
    @FXML
    private Button btnNueve;
    @FXML
    private Button btnMas;
    @FXML
    private Button btsMenos;
    @FXML
    private Button btnMultiplicacion;
    @FXML
    private Button btnDivision;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnRevertir;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnLimpiar;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void clicCero(ActionEvent event) {
        actualizarPantallan("0");
    }
    
    @FXML
    private void clicUno(ActionEvent event) {
        actualizarPantallan("1");
    }
    
    @FXML
    private void clicDos(ActionEvent event) {
        actualizarPantallan("2");
    }
    
    @FXML
    private void clicTres(ActionEvent event) {
        actualizarPantallan("3");
    }
    
    @FXML
    private void clicCuatro(ActionEvent event) {
        actualizarPantallan("4");
    }
    
    @FXML
    private void clicCinco(ActionEvent event) {
        actualizarPantallan("5");
    }
    
    @FXML
    private void clicSies(ActionEvent event) {
        actualizarPantallan("6");
    }
    
    @FXML
    private void clicSiete(ActionEvent event) {
        actualizarPantallan("7");
    }
    
    @FXML
    private void clicOcho(ActionEvent event) {
        actualizarPantallan("8");
    }
    
    @FXML
    private void clicNueve(ActionEvent event) {
        actualizarPantallan("9");
    }
    
    @FXML
    private void clicMas(ActionEvent event) {
        Calcular("+");
    }
    
    @FXML
    private void clicMenos(ActionEvent event) {
        Calcular("-");
    }
    
    @FXML
    private void clicMultiplicacion(ActionEvent event) {
        Calcular("*");
    }
    
    @FXML
    private void clicDivision(ActionEvent event) {
        Calcular("/");
    }
    
    @FXML
    private void clicPorcentaje(ActionEvent event) {
        Calcular("%");
    }
    
    @FXML
    private void clicIgual(ActionEvent event) {
        Calcular(this.operadorAnterior);
        lblPantalla.setText(String.valueOf(this.resultado));
    }
    
    @FXML
    private void clicRevertir(ActionEvent event) {
    cambioSigno();     
    }
    
    @FXML
    private void clicPunto(ActionEvent event) {
        agregarPunto(); 
    }

    @FXML
    private void clicLimpiar(ActionEvent event) {
        limpiar();
        resultado = 0.0;
        numero = 0.0;
        contadorOperadores = 0;
        operadorAnterior =" ";
    }
    private void Calcular(String operador){
        if(!(lblPantalla.getText().equals(""))){
            String srtPantalla = lblPantalla.getText();
                if (ingresNuevo == false){
                this.numero = Float.parseFloat(srtPantalla);
                contadorOperadores++;
                    if (contadorOperadores == 1){
                    this.resultado = numero;
                        } else if (contadorOperadores >= 2 ){ 
                            
                       switch(this.operadorAnterior){
                           
                       case"+":                          
                        Suma opsu = new Suma();
                        opsu.setNumero1((float) resultado);
                        opsu.setNumero2((float) numero);
                        this.resultado = opsu.operar((float)getNumero1(), (float)getNumero2());
                       break;
                        
                       case"-":                           
                        Resta opre = new Resta();
                        opre.setNumero1((float) resultado);
                        opre.setNumero2((float) numero);
                        this.resultado = opre.operar((float)getNumero1(), (float)getNumero2());                        
                        break;
                        
                       case"*":         
                        Multiplicacion opMul = new Multiplicacion();                           ;
                        opMul.setNumero1((float) resultado);
                        opMul.setNumero2((float) numero);
                        this.resultado = opMul.operar((float)getNumero1(), (float)getNumero2());                        
                       break;
                       
                       case"/":                         
                        Division opDiv = new Division();
                        opDiv.setNumero1((float)resultado);
                        opDiv.setNumero2((float)numero);
                        this.resultado = opDiv.operar((float)getNumero1(), (float)getNumero2());                                                
                        break;
                        
                        case"%":
                         Porcentaje opPorce = new Porcentaje();
                         opPorce.setNumero1((float)resultado);
                         opPorce.setNumero2((float)numero);
                        this.resultado = opPorce.operar((float)getNumero1(), (float)getNumero2());
                        break;
                       }
                      System.out.println("resultado" + this.resultado);
                     lblPantalla.setText(String.valueOf(this.resultado));   
                    }               
                   }     
                  this.operadorAnterior = operador;
                 }
                ingresNuevo = true;
               }
        
    public void limpiar (){
    lblPantalla.setText("");
    resultado = 0.0;
    numero = 0.0;
    contadorOperadores=0;
    operadorAnterior = "";
    ingresNuevo = false;
    }

    public void actualizarPantallan (String digito){
        if(ingresNuevo){
           lblPantalla.setText("");
        }
        lblPantalla.setText(lblPantalla.getText().concat(digito));
        ingresNuevo = false;
    }
    
    public void agregarPunto(){
        String cadena = lblPantalla.getText();
      
        if(cadena.length() <= 0 ){
           lblPantalla.setText("0.");
           ingresNuevo = false;
        } else if (!(lblPantalla.getText().contains("."))){
            actualizarPantallan(".");
        }   
    }
    
    public void cambioSigno(){
        String cadena = lblPantalla.getText();
        if(cadena.length() > 0 ){
           resultado =(-1)*Double.parseDouble(lblPantalla.getText());
           lblPantalla.setText(String.valueOf(resultado));
            
//otra forma de hacerlo pero un poco mas desordenada pero funcional
   
        //solucion dos
        /*resultado = Double.parseDouble(lblPantalla.getText());
        double cambio = Double.parseDouble(lblPantalla.getText());
        
        resultado = -1 * cambio ;
        System.out.println("multi" + this.resultado);
        lblPantalla.setText(String.valueOf(resultado));*/
        }
    }    
}
