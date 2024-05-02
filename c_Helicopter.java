import java.util.Objects;

class c_Helicopter extends a_FlyingTransportation {

    private String color;
    private int numPassengers;
    private static int random = ((int) (Math.random() * 11)) + 1;
    private static String guh;

    public static void main(String[] args) {
        if (random == 1)
            guh = "the white house";
        else if (random == 2)
            guh = "the local police station";
        else if (random == 3)
            guh = "my house";
        else if (random == 4)
            guh = "jaywons house";
        else if (random == 5)
            guh = "the school roof";
        else if (random == 6)
            guh = "the football field";
        else if (random == 7)
            guh = "yankee stadium";
        else if (random == 8)
            guh = "mexico city";
        else if (random == 9)
            guh = "30.117599, -97.631170";
        else if (random == 10)
            guh = "worlds frc compeition the one in albany";
        else if (random == 11)
            guh = "pluto";
    }

    public c_Helicopter() {
        super();
        color = "Gray and Green";
    }

    public c_Helicopter(int n, String p, String c) {
        super(c, p);
        numPassengers = n;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int n) {
        numPassengers = n;
    }

    @Override
    public String getPilot() {
        return pilot;
    }

    @Override
    public void setPilot(String p) {
        pilot = p;
    }

    @Override
    public String toString() {
        return "Helicopter{" + "number of passengers='" + getNumPassengers() + ", pilot=" + getPilot() + ", color =" + color + '}';
    }

    @Override
    public boolean equals(Object ashjfhajsuf) {
        if (this == ashjfhajsuf)
            return true;
        if (!(ashjfhajsuf instanceof c_Helicopter))
            return false;
        if (!super.equals(ashjfhajsuf))
            return false;
        c_Helicopter policeHelicopter = (c_Helicopter) ashjfhajsuf;
        return Objects.equals(color, policeHelicopter.color);
    }


    public void turnOnTheEngineToTheHelicopterSoItCanFly() {
        System.out.println("the engines to the helicopter are turned on so it can fly");
    }

    @Override
    public void land() {
        System.out.println("the helicopter lands in " + guh);
    }
}
