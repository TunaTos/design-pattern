package creation.prototype;

import javafx.geometry.Point3D;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        SwordsMan s1 = new SwordsMan();
        s1.move(new Point3D(-10, 0,0), 20);
        s1.attack();


    }
}
