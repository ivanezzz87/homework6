package belhard.java28;

public class Car extends Vehicle implements Costable{
    private int doorsCount;
    private double cost;

    public Car(int wheelCount, int doorsCount, double cost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.cost = cost;
    }
    @Override
    protected void printInfo() {
        System.out.println (
                "Транспортное средство: Машина - Количество дверей: " + this.doorsCount + " - Количество колес: " +
                        this.wheelCount);
    }
    @Override
    public double getCost() {
        return this.cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public int getDoorsCount() {
        return doorsCount;
    }
    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }
}
