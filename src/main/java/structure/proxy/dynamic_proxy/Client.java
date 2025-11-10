package structure.proxy.dynamic_proxy;

import javafx.geometry.Point2D;

public class Client {
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("File 1");

        System.out.println("************img*********");
        System.out.println(img);


        img.setLocation(new Point2D(-10, 0));
        System.out.println("************Location*********");
        System.out.println(img.getLocation());

        img.render();
        System.out.println("************render*********");


    }
}
