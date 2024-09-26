package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;



import controller.Controller;


public class GraphicsDemo extends Application {
    private static final int CELL_SIZE = 50;
    private Image petimage;
    private Canvas canvas;
    private GraphicsContext gc;
    private Controller controller;


    @Override
    public void start(Stage primaryStage) {
        controller = new Controller(this);
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;
        //kuva
        petimage = new Image("C:\\Users\\ubaxc\\IdeaProjects\\moduli6.1\\moduuli6.3\\src\\main\\java\\view\\cat1.jpg");

        canvas = new Canvas(canvasSize, canvasSize);
        gc = canvas.getGraphicsContext2D();
        canvas.setFocusTraversable(true);

        //ohjataan hiiren liikutuksella pelaajan sijaintia
        canvas.setOnMouseMoved(event -> {
            int x = (int) event.getX() / CELL_SIZE;
            int y = (int) event.getY() / CELL_SIZE;

            controller.updatePosition(x, y);
            updateCanvas(x, y);
        });

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, canvasSize, canvasSize);
        primaryStage.setTitle("A virtual pet!");
        primaryStage.setScene(scene);
        primaryStage.show();

        updateCanvas(controller.getPlayerX(), controller.getPlayerY());
    }

    public void updateCanvas(int playerX, int playerY) {
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;
        gc.clearRect(0, 0, canvasSize, canvasSize);


        int x = playerX * CELL_SIZE;
        int y = playerY * CELL_SIZE;


        gc.drawImage(petimage, playerX * CELL_SIZE, playerY * CELL_SIZE, CELL_SIZE, CELL_SIZE);
    }
}