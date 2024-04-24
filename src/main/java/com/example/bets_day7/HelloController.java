package com.example.bets_day7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Canvas Pict;

    private GraphicsContext graphicsContext;
    private GraphicsContext graphicsContext1;
    private GraphicsContext graphicsContext2;
    private GraphicsContext graphicsContext3;
    private GraphicsContext graphicsContext4;
    private GraphicsContext graphicsContext5;



    private void start(){
        //Намалювати фон
        graphicsContext = Pict.getGraphicsContext2D();
        graphicsContext.setFill(Color.LIGHTSTEELBLUE);
        graphicsContext.fillRect(0, 0, 1000, 1000);

        //Намалювати землю
        graphicsContext = Pict.getGraphicsContext2D();
        graphicsContext.setFill(Color.GREEN);
        graphicsContext.fillRect(0, 360, 1000, 200);

        //Намалювати каркас
        graphicsContext = Pict.getGraphicsContext2D();
        graphicsContext.setFill(Color.BEIGE);
        graphicsContext.fillRect(90, 180, 230, 200);

        //Зробити обводку
        graphicsContext.setStroke(Color.BROWN);
        graphicsContext.setLineWidth(2);
        graphicsContext.strokeRect(90, 180, 230, 200);

        //Намалювати двері
        graphicsContext1 = Pict.getGraphicsContext2D();
        graphicsContext1.setFill(Color.BROWN);
        graphicsContext1.fillRect(120, 220, 80, 140);

        //Намалювати сходинку 1
        graphicsContext2 = Pict.getGraphicsContext2D();
        graphicsContext2.setFill(Color.YELLOWGREEN);
        graphicsContext2.fillRect(110, 360, 98, 25);

        //Зробити обводку
        graphicsContext2.setStroke(Color.BROWN);
        graphicsContext2.setLineWidth(2);
        graphicsContext2.strokeRect(110, 360, 98, 25);

        //Намалювати сходинку 2
        graphicsContext3 = Pict.getGraphicsContext2D();
        graphicsContext3.setFill(Color.YELLOWGREEN);
        graphicsContext3.fillRect(103, 375, 112, 15);

        //Зробити обводку
        graphicsContext3.setStroke(Color.BROWN);
        graphicsContext3.setLineWidth(2);
        graphicsContext3.strokeRect(103, 375, 112, 15);

        //Намалювати дверну ручку
        graphicsContext.setFill(Color.YELLOW);
        graphicsContext.fillOval(177, 293, 15, 15);

        //Намалювати вікно
        graphicsContext4 = Pict.getGraphicsContext2D();
        graphicsContext4.setFill(Color.LIGHTSKYBLUE);
        graphicsContext4.fillRect(215, 230, 90, 65);

        //Зробити обводку
        graphicsContext4.setStroke(Color.BROWN);
        graphicsContext4.setLineWidth(5);
        graphicsContext4.strokeRect(215, 230, 90, 65);

        //Намалювати лінію вікна 1
        graphicsContext.setStroke(Color.BROWN);
        graphicsContext.setLineWidth(5);
        graphicsContext.strokeLine(260, 230, 260, 295);

        //Намалювати лінію вікна 2
        graphicsContext.setStroke(Color.BROWN);
        graphicsContext.setLineWidth(5);
        graphicsContext.strokeLine(216, 262, 302, 262);

        //Намалювати димохід
        graphicsContext1 = Pict.getGraphicsContext2D();
        graphicsContext1.setFill(Color.GRAY);
        graphicsContext1.fillRect(260, 80, 20, 60);

        //Намалювати дах
        graphicsContext5 = Pict.getGraphicsContext2D();
        graphicsContext5.setFill(Color.BROWN);
        graphicsContext5.fillPolygon(new double[]{50, 205, 360, 205}, new double[]{180, 80, 180, 180}, 4);
    }

    @FXML
    void initialize() {
        start();
    }
}