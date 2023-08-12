interface bicycle {
    void applybrake(int decrement);

    void speedup(int increment);

    int a = 45;
}

interface blowhorn {
    void blowhorn2();

    void lightup();
}

public class interfacebycycle implements bicycle, blowhorn {
    public void applybrake(int decrement) {
        System.out.println("applying brake .......");
    }

    public void speedup(int increment) {
        System.out.println("speeding up........");
    }

    public void blowhorn2() {
        System.out.println("blowing horn peeee puuuuuu up bro...........");
    }

    public void lightup() {
        System.out.println("lightining up bro.....");
    }



    public static void main(String[] args) {
        interfacebycycle object = new interfacebycycle();
        object.applybrake(1);
        System.out.println(object.a);
        object.blowhorn2();
        object.lightup();
    }
}
