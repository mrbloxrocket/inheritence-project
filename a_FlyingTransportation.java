import java.util.Objects;

class a_FlyingTransportation {

    private String color;
    protected String pilot;

    public a_FlyingTransportation() {
        this.color = "almost white but still yellow";
        this.pilot = "kanye west";
    }

    public a_FlyingTransportation(String c, String p) {
        this.color = c;
        this.pilot = p;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String p) {
        pilot = p;
    }

    @Override
    public String toString() {
        return "a_FlyingTransportation{" + "color='" + color + ", pilot='" + pilot + '}';
    }

    @Override
    public boolean equals(Object bababa) {
        if (this == bababa)
            return true;
        if (!(bababa instanceof a_FlyingTransportation))
            return false;
        a_FlyingTransportation giggle = (a_FlyingTransportation) bababa;
        return Objects.equals(color, giggle.color) && Objects.equals(pilot, giggle.pilot);
    }

    public void land() {
        System.out.println("the flying transportation lands");
    }
}
