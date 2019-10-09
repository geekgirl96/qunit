public class AccesFilm {

    private int limitAge;
    private int age;

    public  boolean getAcces(int age , int limitAge) {
        if(age > limitAge)
            return true;
        else
            return false;
    }
}
