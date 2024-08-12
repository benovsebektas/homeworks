package serviceImpl;

import entity.Watch;
import service.WatchService;

import java.util.ArrayList;
import java.util.List;

public class WatchServiceImpl implements WatchService {
    static List<Watch>watchList=new ArrayList<>();
    static {
        watchList.add(new Watch("Baku", true, false, "Series 7", "Apple", "0501234567", 1200, "Apple Watch", 1));
        watchList.add(new Watch("Ganja", false, true, "Galaxy Watch 4", "Samsung", "0517654321", 900, "Samsung Watch", 2));
        watchList.add(new Watch("Baku", true, true, "GTS 2 Mini", "Amazfit", "0558765432", 300, "Amazfit Watch", 3));
    }

    @Override
    public void add(Watch watch) {
        watchList.add(watch);
    }

    @Override
    public void delete(int id) {
     watchList.remove(id-1);
    }

    @Override
    public List<Watch> getAllWatch() {
        return watchList;
    }

    @Override
    public Watch getById(int id) {
        return watchList.get(id);
    }

    @Override
    public List<Watch> getAllWatchBelowPrice(Integer price) {
        return watchList.stream().filter(below->below.getPrice()>price).toList();
    }

    @Override
    public List<Watch> getAllWatchAbovePrice(Integer price) {
        return watchList.stream().filter(above->above.getPrice()<price).toList();
    }

    @Override
    public List<Watch> getAllWatchLocationBaku() {
        return watchList.stream().filter(location->location.getLocation().equals(location)).toList();
    }

    @Override
    public List<Watch> getAllNewAndDeliveredWatch(boolean isNew, boolean delivered) {
        return watchList.stream().filter(newwatch->newwatch.isIsnewwatch()==isNew&&newwatch.isDelivered()==delivered).toList();
    }

    @Override
    public List<Watch> getAllWatchByBrandApple(String brand) {
        return watchList.stream().filter(brands->brands.getBrand().equals(brand)).toList();
    }

    @Override
    public List<Watch> getAllWatchByAzercellContact(String contact) {
        return watchList.stream().filter(contacts->contacts.getContactnumber().equals(contact)).toList();
    }

    @Override
    public List<Watch> getAllWatchByNameAndPrice(String name, int price) {
        return watchList.stream().filter(names->names.getName().equals(name)&&names.getPrice()==price).toList();
    }
}
