package DIP;

public class PatrolEngine implements Engine{

    @Override
    public void start(){
        System.out.println("Запустили бензиновый двигатель");
    }
}