public class Wiskunde {


    public int Optellen(int a, int b){
        return a + b;
    }

    public String HoogsteGetal(double c, double d){
        if (c > d){
            return String.valueOf(c);
        }
        if (d > c){
            return String.valueOf(d);
        }
        return "Equal";
        }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    }


