package domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void Go() {
        int randomNum = (int) (Math.random() * 9);
        if (randomNum >= 4) {
            this.position+=1;
        }
    }
}
