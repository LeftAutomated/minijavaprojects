public class Chicken {
    private int wingCount;
    private String color;

    public Chicken(){
        wingCount = 2;
        color = "White";
    }

    public Chicken(int count, String clr){
        wingCount = count;
        color = clr;
    }

    public void setWingCount(int count){
        wingCount = count;
    }

    public void setColor(String clr){
        color = clr;
    }

    public int getWingCount(){
        return wingCount;
    }

    public String getColor() {
        return color;
    }
}
