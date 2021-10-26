public class Blockbuster {
    private double cost;
    private String title;
    public double profit;

    public Blockbuster(String m, double c){
        cost = c;
        title = m;
    }

    public void setBoxOffice(int t, double p){
        profit = t * p;
    }

    public double getNet(){
        return profit - cost;
    }

    public String getTitle(){
        return title;
    }

    public double diff(Blockbuster b){
        return profit - b.profit;
    }

    public String toString(){
        return getTitle() + "\n" +
                "cost $" + cost + "\n" +
                "grossed $" + profit + "\n" +
                "net $" + getNet() + "\n";
    }
}
