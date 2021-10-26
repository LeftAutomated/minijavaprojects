import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Group;



public class SpentTimePieChart extends Application
{


    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Spent Time Pie Chart");
        Group root = new Group();
        Canvas canvas = new Canvas(800, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc)
    {
        //Background
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,800,800);

        //Text Standards
        String[] list = {"Exercise(0.5)", "Eating(1.5)", "Fun Stuff(4)", "Sleep(5)", "Homework(5)", "School(8)"};
        Color[] c = {Color.BEIGE, Color.BLUE, Color.RED, Color.GREEN, Color.SANDYBROWN,Color.ORANGE};
        gc.setFont(Font.font("Verdana", FontWeight.BOLD,30));
        gc.setStroke(Color.WHITE);

        //Key
        for(int i = 0; i < list.length;i++) {
            gc.setFill(c[i]);
            gc.strokeText(list[i], 550, 40 * i+250);
            gc.fillText(list[i], 550, 40 * i+250);
        }

        //Chart
        double[] angle = {360-7.5,352.5-22.5,330-60,270-75,195-75,.0001};
        double[] angleExt  = {7.5,22.5,60,75,75,120};
        for(int i = 0; i < 6; i++){
            gc.setFill(c[i]);
            gc.fillArc( 100,150,400,400,angle[i],angleExt[i], ArcType.ROUND);
        }

        //Percentages
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("Verdana", FontWeight.BOLD,15));
        gc.fillText(2.08 + "%",400,360);
        gc.fillText(6.25 + "%",400,400);
        gc.fillText(16.66 + "%",340,460);
        gc.fillText(20.83 + "%",180,460);
        gc.fillText(20.83 + "%",140,300);
        gc.fillText(33.33+  "%",320,250);

    }
}
