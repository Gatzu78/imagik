package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.MainModel;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class PreviewController  implements Initializable {
    @FXML
    ImageView imageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        MainModel.getInstance().addListener((observable, oldValue, newValue) -> loadImage(newValue));
    }

    private void loadImage(File file) {
        String uri = file.toURI().toString();
        imageView.imageProperty().setValue(new Image(uri));
    }
}
