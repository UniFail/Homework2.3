public class ServiceStation implements Service {
    @Override
    public void check(Car[] cars) {
        System.out.println("Cars in service " + cars.length);
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("We service the car " + car.getModelName()
                    + " count wheels " + car.getWheelsCount());
            for (int i1 = 0; i1 < car.getWheelsCount(); i1++)
                car.updateTyre();
            car.checkEngine();
        }
    }
    @Override
    public void check(Truck[] trucks) {
        System.out.println("Trucks in service " + trucks.length);
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            System.out.println("We service the truck " + truck.getModelName()
                    + " count wheels " + truck.getWheelsCount());
            for (int i1 = 0; i1 < truck.getWheelsCount(); i1++)
                truck.updateTyre();
            truck.checkEngine();
            truck.checkTrailer();

        }
    }
    @Override
    public void check(Bicycle[] bicycles) {
        System.out.println("Bicycles in service " + bicycles.length);
        for (int i = 0; i < bicycles.length; i++) {
            Bicycle bicycle = bicycles[i];
            System.out.println("We service the truck " + bicycle.getModelName()
                    + " count wheels " + bicycle.getWheelsCount());
            for (int i1 = 0; i1 < bicycle.getWheelsCount(); i1++)
                bicycle.updateTyre();
        }
    }

}
