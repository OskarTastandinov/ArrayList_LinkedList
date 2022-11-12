import java.util.Queue;
import java.util.LinkedList;
public class ServiceStation <T extends Transport> {
    private final String nameStation;
    private final String adressStation;

    public ServiceStation(String nameStation, String adressStation) {
        this.nameStation = nameStation;
        this.adressStation = adressStation;
    }

    private Queue<T> queue = new LinkedList<>();

    public void addCarQueue(T transports){
        queue.offer(transports);
    }
    public void conductTechnicalInspection(){
        T transport = queue.poll();
        if(transport != null){
            System.out.println("Происходит техосмотр " + transport);
            conductTechnicalInspection();
        }else {
            System.out.println("Очередь на техосмотр окончилась, автотранспорта нет");
        }

    }


}

