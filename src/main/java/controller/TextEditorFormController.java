package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class TextEditorFormController {
    public MenuItem mntNew;
    public MenuItem mntOpen;
    public MenuItem mntSave;
    public MenuItem mntPrint;
    public MenuItem mntClose;
    public MenuItem mntCut;
    public MenuItem mntCopy;
    public MenuItem mntPaste;
    public MenuItem mntSelectAll;
    public MenuItem mntAbout;
    public HTMLEditor txtEditor;

    public void initialize(){

        mntClose.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0); //JVM is stopped
                //Platform.exit();   java fx runtime environment will exit
            }
        });
        mntNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                txtEditor.setHtmlText("");
                txtEditor.requestFocus();
            }
        });
        mntAbout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    Parent container = FXMLLoader.load(getClass().getResource("/About.fxml"));
                    Scene scene = new Scene(container);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("About");
                    stage.centerOnScreen();
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
