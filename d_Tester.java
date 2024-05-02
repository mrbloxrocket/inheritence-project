//TEWSTER CLASS

import java.util.*;
public class d_Tester {
    public static void main(String[] args) {

        System.out.println("hello world");
        ArrayList<a_FlyingTransportation> flyingTransportations = new ArrayList<>();


        a_FlyingTransportation t1 = new a_FlyingTransportation("flying vehicle", "guh");
        b_Airplane a1 = new b_Airplane(314159, "maksim grach", "orang");
        c_Helicopter h1 = new c_Helicopter(12, "luca decaro", "blue");

        a_FlyingTransportation t2 = new c_Helicopter(12345, "aSBkaWRudCBjb3B5IGl0", "base64");
        a_FlyingTransportation t3 = new b_Airplane(9185, "club penguin", "black");
        a_FlyingTransportation t4 = a1;
        a_FlyingTransportation t5 = h1;
        a_FlyingTransportation t6 = t2;
        a_FlyingTransportation t7 = t3;

        flyingTransportations.add(a1);
        flyingTransportations.add(h1);
        flyingTransportations.add(t2);
        flyingTransportations.add(t3);
        flyingTransportations.add(t4);
        flyingTransportations.add(t5);
        flyingTransportations.add(t6);
        flyingTransportations.add(t7);

        System.out.println("hello world");
        System.out.println(flyingTransportations);

        for (a_FlyingTransportation thingamabob : flyingTransportations) {
            System.out.println(thingamabob);
            thingamabob.land();

            if (thingamabob instanceof b_Airplane) {
                ((b_Airplane) thingamabob).takeOff();
            } else if (thingamabob instanceof c_Helicopter) {
                ((c_Helicopter) thingamabob).turnOnTheEngineToTheHelicopterSoItCanFly();
            }

            System.out.println();
        }
    }
}