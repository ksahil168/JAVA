class fraction {
    private int num;
    private int denum;
    double sub, mul, div;
    public double num4;
    public double denum4;

    // single argument constructor
    public fraction(int num) {
        this.num = num;
    }

    // static argument constructor ,value already set to 0 and 1
    public fraction() {
        // Create an object representing 0/1.
        num = 0;
        denum = 1;
    }

    // double argument constructor, with double as parameter
    public fraction(double num4, double denum4) {
        this.num4 = num4;
        this.denum4 = denum4;
    }

    // double argument constructor, with int as parameter
    public fraction(int num1, int denum1) {
        this.num = num1;
        this.denum = denum1;

    }

    public int getNumerator() {
        // An accessor method for the numerator field
        return num;
    }

    public int getDenominator() {
        // An accessor method for the denominator field
        return denum;
    }

    // method to show
    void show() {
        System.out.println("Numerator is : " + num + " \nDenominator is : " + denum);

    }

    // method to show double parameter variable
    void show_double() {
        System.out.println("Doubly Numerator is : " + num4 + " \nDoubly Denominator is : " + denum4);
    }

    // method single
    void show_single() {
        System.out.println(" Only Numerator is : " + num);
    }

    double add() {

        double sum = num + denum;
        return sum;

    }

    double sub() {
        if (num > denum) {
            sub = num - denum;
        } else {
            sub = denum - num;
        }

        return sub;

    }

    double mul() {
        mul = num * denum;
        return mul;

    }

    double div() {
        div = num4 / denum4;
        return div;

    }

    public double div2() {
        // Return the magnitude of a Fraction object
        return Math.abs((double) num / denum);
    }

    public String toString() {
        // Return a string representing the implicit Fraction
        // object. If the object represents an undefined or
        // indeterminate value, return an appropriate string.
        if (denum != 0)
            return num + "/" + denum;
        else if (num == 0)
            return "NaN";
        else if (num > 0)
            return "Infinity";
        else
            return "-Infinity";
    }

    public void reduce() {

        if (denum < 0) {
            denum *= -1;
            num *= -1;
        }

        // store zero as 0/1
        if (num == 0 && denum != 0)
            denum = 1;

        // store infinities as 1/0 or -1/0
        if (denum == 0 && num != 0)
            if (num > 0)
                num = 1;
            else
                num = -1;

        // eliminate any common factors in num and den fields
        for (double i = Math.min(Math.abs(num), denum); i >= 2; i--)
            if (num % i == 0 && denum % i == 0) {
                num /= i;
                denum /= i;
            }
        System.out.println("Reduce Numerator is : " + num + " \nReduce Denominator is : " + denum);

    }

    // method to cross multiplication one fraction to another fraction
    public fraction dividedBy(fraction other) {
        fraction result = new fraction(num * other.denum, denum * other.num);
        return result;
    }

    // method to multiply one fraction to another
    public fraction times(fraction other) {

        fraction result = new fraction(num * other.num, denum * other.denum);
        return result;

    }

    // method to plus one fraction to another
    public fraction plus(fraction other) {

        fraction result = new fraction(num * other.denum + denum * other.num, denum * other.denum);

        return result;
    }

    // method to minus
    public fraction minus(fraction other) {

        fraction result = new fraction(num * other.denum - denum * other.num, denum * other.denum);

        return result;
    }

}

class fraction_app {
    public static void main(String[] args) {
        fraction f = new fraction(25);
        fraction f1 = new fraction(3, 6);
        fraction f4 = new fraction(2, 5);

        fraction f2 = new fraction(24.5, 56.5);

        f1.show();
        System.out.println("--------------------------");

        System.out.println("String Format of fraction : " + f1.toString());
        System.out.println("--------------------------");

        f.show_single();
        System.out.println("--------------------------");

        f2.show_double();
        System.out.println("--------------------------");

        System.out.println("String Format of fraction : " + f1.toString());
        System.out.println("--------------------------");

        System.out.println("+++ Sum is : " + f1.add());
        System.out.println("--------------------------");
        System.out.println("--- Subtract is : " + f1.sub());
        System.out.println("--------------------------");

        System.out.println("*** Multiply is : " + f1.mul());
        System.out.println("--------------------------");

        System.out.println("/// Division is : " + f2.div());
        System.out.println("--------------------------");

        System.out.println("/// Division 2 is : " + f1.div2());
        System.out.println("--------------------------");

        System.out.println("Cross Multiplication : " + f1.dividedBy(f4));
        System.out.println("--------------------------");

        // f1.reduce();// wherever reduce funtion called it reduces the fraction to
        // lowest form
        System.out.println("Fraction Multiplication : " + f1.times(f4));
        System.out.println("--------------------------");

        f1.reduce();
        System.out.println("--------------------------");

    }
}