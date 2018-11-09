package com.redhat.migr.examples.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 * 
 * FX is not supported
 * ref: https://github.com/windup/windup-rulesets/blob/master/rules-reviewed/openjdk7/oraclejdk7/oracle2openjdk.rhamt.xml
 * 
 * */

@SuppressWarnings("restriction")
public class FxApp extends Application {

    @Override
    public void start(Stage pStage) throws Exception {
        pStage.setTitle("Sample Fx App");
        
        Label label = new Label("Time to migrate");
        Scene scene = new Scene(label, 200, 200);
        pStage.setScene(scene);
        
        pStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
