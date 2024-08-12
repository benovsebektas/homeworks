package service;

import entity.Watch;

import java.util.List;

public interface WatchService {
    void  add(Watch watch);
    void  delete(int id);
    List<Watch>getAllWatch();
    Watch getById(int id);
    List<Watch>getAllWatchBelowPrice(Integer price);
    List<Watch>getAllWatchAbovePrice(Integer price);
    List<Watch>getAllWatchLocationBaku();
    List<Watch> getAllNewAndDeliveredWatch(boolean isNew, boolean delivered);
    List<Watch> getAllWatchByBrandApple(String brand);
    List<Watch> getAllWatchByAzercellContact(String contact);
    List<Watch> getAllWatchByNameAndPrice(String name, int price);
}
