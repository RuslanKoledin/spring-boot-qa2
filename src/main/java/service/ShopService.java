package service;

import dto.ShopDTO;
import entity.Shop;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.ShopRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class ShopService {
    private final ShopRepo shopRepo;
    public Long saveNewShop(ShopDTO shopDTO){
        Shop shop = new Shop();
        shop.setName(shopDTO.getName());
//        shop.setCity(shopDTO.getCity());
//        shop.setStreet(shopDTO.getStreet());
        shop.setHouseNumber(shopDTO.getHouseNumber());
        shop.setOpeningTime(shopDTO.getOpeningTime());
        shop.setClosingTime(shopDTO.getClosingTime());
        return shopRepo.save(shop).getId();
    }
    public void deleteShopById(Long id) {
        shopRepo.deleteById(id);
    }
    public Shop getByShopId(Long id){
        return shopRepo.findById(id).get();
    }
    public Shop updateByShopId(Shop shop){
        return shopRepo.save(shop);
    }
    public List<Shop> getAllShops() {
        return shopRepo.findAll();
    }
}
