public class Main {
    public static void main(String[] args) {
    Kolo k1= new Kolo(5);
    Kwadrat k2 = new Kwadrat(5);

        System.out.println("Powierzchnia kształtu to: "+ k1.obliczPowierzchnie());
        System.out.println("Powierzchnia kształtu to: "+ k2.obliczPowierzchnie());
    }
}
interface Ksztalt{
    double obliczPowierzchnie();
    double obliczObwod();
}
class Kwadrat implements Ksztalt{
    double dlugoscBoku;

    Kwadrat(double a){
        dlugoscBoku=a;
    }
    public double obliczPowierzchnie(){
        return dlugoscBoku*dlugoscBoku;
    }
    public double obliczObwod(){
        return 4*dlugoscBoku;
    }
}
class Kolo implements Ksztalt{
    public double promien;

    Kolo( double promien){
        this.promien=promien;
    }
    public double obliczPowierzchnie(){
        return Math.PI*promien*promien;
    }
    public double obliczObwod(){
        return 2*Math.PI*promien;
    }
}

