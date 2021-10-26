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

public class Animal extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Animal: Ant");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(0,0,1000,800);
        gc.setFill(Color.SADDLEBROWN);
        gc.fillRect(0,600,1000,200);
        gc.setFill(Color.YELLOW);
        gc.fillOval(50,50,100,100);
        gc.setFill(Color.GREEN);
        for(int i = 1; i <= 20; i++)
        {
            gc.fillPolygon(new double[]{0, 50*(i-1) + 25, 50 * i},new double[]{600,400,600},3);
        }

        gc.setFill(Color.BLACK);
        gc.fillOval(200,570,30,30);
        gc.fillOval(230,580, 20,20);
        gc.fillOval(250,580, 20,20);
        gc.setLineWidth(5);
        gc.strokeLine(215,585,250,590);
        gc.setLineWidth(1);
        gc.strokeLine(260,580,270,560);
        gc.strokeLine(260,580,270,570);
        gc.strokeLine(215, 600, 210,610);
        gc.strokeLine(215,600, 220,610);
        gc.strokeLine(240,600,235,610);
        gc.strokeLine(240,600,245,610);
        gc.strokeLine(260,600,255,610);
        gc.strokeLine(260,600,265,610);
    }
}