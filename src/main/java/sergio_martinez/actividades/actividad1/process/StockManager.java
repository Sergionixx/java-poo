package sergio_martinez.actividades.actividad1.process;
import java.util.ArrayList;
import java.util.List;
import sergio_martinez.actividades.actividad1.models.Car;
public class StockManager {
    ArrayList<Car> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }

    public void addCar(String color, String marca, String modelo,int precio){
        Car car = new Car(color,marca,modelo,precio);
        stock.add(car);
    }

    public List<Car> getStock(){
        return this.stock;
    }
}