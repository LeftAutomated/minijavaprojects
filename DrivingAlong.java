import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

public class DrivingAlong extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Driving Along");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc) {
        //Sky
        Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.DEEPSKYBLUE)};
        LinearGradient lg1 = new LinearGradient(1, 0, 1, 1, true, CycleMethod.NO_CYCLE, stops);
        gc.setFill(lg1);
        gc.fillRect(0, 0, 1000, 800);

        //Moon
        gc.setFill(Color.WHITE);
        gc.fillOval(600,50,50,50);

        //Ground
        gc.setFill(Color.DARKGREEN);
        gc.fillRect(0,300,1000,800);

        //Road
        gc.setFill(Color.BLACK);
        gc.fillPolygon(new double[]{400, 600, 505, 495},new double[]{800,800,300,300},4);

        //Tree
        gc.setFill(Color.SADDLEBROWN);
        gc.fillRect(100,400,10,40);
        gc.setFill(Color.DARKOLIVEGREEN);
        gc.fillOval(75,370,40,40);
        gc.fillOval(85,360,40,40);
        gc.fillOval(95,370,40,40);

        //Clouds
        gc.setFill(Color.GREY);
        gc.fillOval(100,100,50,30);
        gc.fillOval(90,105,50,30);
        gc.fillOval(400,70,50,30);
        gc.fillOval(390,75,50,30);
        gc.fillOval(800,120,50,30);
        gc.fillOval(790,125,50,30);

        //Car
        gc.setFill(Color.RED);
        gc.fillRect(475,600,50,30);
        gc.setFill(Color.YELLOW);
        gc.fillRect(480,612,20,10);
        gc.fillRect(500,612,20,10);
        gc.setFill(Color.GREY);
        gc.fillRect(475,625,20,10);
        gc.fillRect(505,625,20,10);


    }
}