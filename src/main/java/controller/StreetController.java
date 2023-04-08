package controller;

import entity.City;
import entity.Street;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.StreetService;

@RestController
@AllArgsConstructor
public class StreetController {
    private final StreetService streetService;
    @DeleteMapping("/street/delete/{id}")
    void deleteStreetById(@PathVariable Long id){
        streetService.deleteStreetById(id);
    }
    @GetMapping("/city/{id}")
    public Street getById(@PathVariable Long id){
        return streetService.getByStreetId(id);
    }
    @PutMapping("/city/update/{id}")
    public Street updateById(@RequestBody Street street){
        return streetService.updateByStreetId(street);
    }
}
