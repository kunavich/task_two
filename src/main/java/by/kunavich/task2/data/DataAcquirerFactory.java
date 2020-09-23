package by.kunavich.task2.data;

public class DataAcquirerFactory {

    public DataAcquirer getDataAcquirer(String type)
    {
        switch (type)
        {
            case "CONSOLE":
                return new ConsoleDataAcquirer();
            default:
                throw new RuntimeException("wrong type : "+type);
        }
    }
}
