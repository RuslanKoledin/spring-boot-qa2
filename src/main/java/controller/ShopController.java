package controller;

import dto.ShopDTO;
import entity.Shop;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.ShopService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/shop")
public class ShopController {

    private final ShopService shopService;
    @PostMapping("/save")
    public Long saveShop(@RequestBody ShopDTO shopDTO){
        return shopService.saveNewShop(shopDTO);
    }
    @DeleteMapping("/shop/delete/{id}")
    void deleteShopById(@PathVariable Long id){
        shopService.deleteShopById(id);
    }

    @GetMapping("/shop/{id}")
    public Shop getById(@PathVariable Long id){
        return shopService.getByShopId(id);
    }
    @PutMapping("/shop/update/{id}")
    public Shop updateById(@RequestBody Shop shop){
        return shopService.updateByShopId(shop);
    }
    @GetMapping("/shop/allCities")
    public List<Shop> getAll(){
        return shopService.getAllShops();
    }

}
