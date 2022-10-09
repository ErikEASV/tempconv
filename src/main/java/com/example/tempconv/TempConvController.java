package com.example.tempconv;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class TempConvController {

    @FXML
    private Label labelC;

    @FXML
    private Label labelF;

    @FXML
    private Slider sliderF;

    public void initialize() {
        sliderF.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                                        Number oldValue, Number newValue) {
                        labelC.setText(String.valueOf(afrund1dec((sliderF.getValue()-32)*0.5556)) + " C");
                        labelF.setText(String.valueOf(afrund1dec(sliderF.getValue())) + " F");

                    }
                }
        );

    }

    private double afrund1dec(double tal) {
        return Math.round(tal*10.0d) / 10.0d;
    }
}
