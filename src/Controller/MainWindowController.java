/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXColorPicker;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author nipun
 */
public class MainWindowController implements Initializable {

    @FXML
    private JFXButton btnColorPicker;
    @FXML
    private JFXColorPicker ccColor;
    @FXML
    private Label lblRGBA;
    @FXML
    private Pane colorPane;
    @FXML
    private Label lblHex;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void colorPick(MouseEvent event) {
      
        System.out.println("nnnnnnnnnnnnnnnn");
      
     PointerInfo pointer;
     Point point;
     Robot robot;

     Color color;
        
        try{
            robot = new Robot();

            while(true){
                pointer = MouseInfo.getPointerInfo();
                point = pointer.getLocation();
                if(point.getX() == 0 && point.getY() == 0){
                    break; // stop the program when you go to (0,0)
                }else{
                    color = robot.getPixelColor((int)point.getX(),(int)point.getY());
                    System.out.println("Color at: " + point.getX() + "," + point.getY() + " is: " + color);
                   // pane.setBackground();
                   colorPane.setStyle("-fx-background-color: #" + color);
                   lblRGBA.setText(color.getRGB()+"");
                }
            }
        }catch(Exception e){

        }
        
        
    }
    
}
