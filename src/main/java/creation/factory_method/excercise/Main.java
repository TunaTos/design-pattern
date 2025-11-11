package creation.factory_method.excercise;

interface Transport {
    void deliver();
}

class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Hello I am Truck Deliver");
    }
}

class Ship implements  Transport {
    @Override
    public void deliver() {
        System.out.println("Hello I am Ship Deliver");
    }
}

class Airplane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Hello I am Airplane Deliver");
    }
}

abstract class Logistics {

    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}


class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

class SkyLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}


public interface Main {
    public static void main(String[] args) {

        Logistics logistics;

        logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new SeaLogistics();
        logistics.planDelivery();

        logistics = new SkyLogistics();
        logistics.planDelivery();
    }
}

