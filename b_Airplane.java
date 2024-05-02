import java.util.Objects;

class b_Airplane extends a_FlyingTransportation {

    private String color;
    private int flightNumber;
    private static int random = ((int) (Math.random() * 5)) + 1;
    private static String country;

    public static void main(String[] args) {
        if (random == 1)
            country = "germany";
        if (random == 2)
            country = "brazil";
        if (random == 3)
            country = "antarctica";
        if (random == 4)
            country = "hungary";
        if (random == 5)
            country = "mexico";
    }

    public b_Airplane() {
        color = "White and Red";
    }

    public b_Airplane(int n, String p, String c) {
        super(c, p);
        flightNumber = n;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int n) {
        flightNumber = n;
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
        return "Plane{" + "flightNumber='" + getFlightNumber() + ", pilot=" + getPilot() + ", color =" + color + '}';
    }

    @Override
    public boolean equals(Object ashjfhajsuf) {
        if (this == ashjfhajsuf)
            return true;
        if (!(ashjfhajsuf instanceof b_Airplane))
            return false;
        if (!super.equals(ashjfhajsuf))
            return false;
        b_Airplane SwissAirlines = (b_Airplane) ashjfhajsuf;
        return Objects.equals(color, SwissAirlines.color);
    }


    public void takeOff() {
        System.out.println("the plane takes off from the airport");
    }


    public void land() {
        System.out.println("the plane lands in " + country);
    }
}
