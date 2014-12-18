/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaman;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 *
 * @author ecir
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Text yazi;
    
    int sayi=0;
    
    Timeline sure=new Timeline();
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sure.setCycleCount(Timeline.INDEFINITE);
        sure.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
                new EventHandler(){

            @Override
            public void handle(Event event) {
                yazi.setText(String.valueOf(sayi));
                sayi++;
            }
                    
                }
        ));
    }    

    @FXML
    private void basla(ActionEvent event) {
        sure.playFromStart();
    }

    @FXML
    private void dur(ActionEvent event) {
        sure.stop();
    }

 
    
    
    
}
