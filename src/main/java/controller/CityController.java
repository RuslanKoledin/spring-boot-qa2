package controller;

import dto.CityDTO;
import entity.City;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.CityService;

import java.util.List;

@RestController
@AllArgsConstructor
public class CityController {
    private final CityService cityService;
    @GetMapping("/city/nameOfCity")
    public String getCity(){
        return cityService.getCities().toString();
    }
    @GetMapping("/city/allCities")
    public List<City> getAllCities(){
        return cityService.getAllCities();
    }

    @DeleteMapping("/city/delete/{id}")
    void deleteCityById(@PathVariable Long id){
        cityService.deleteCityById(id);
    }

    @GetMapping("/city/{id}")
    public City getById(@PathVariable Long id){
        return cityService.getByCityId(id);
    }
    @PutMapping("/city/update/{id}")
    public City updateById(@RequestBody City city){
        return cityService.updateCityById(city);
    }
    @PostMapping("/city/save")
    Long saveNewCity (@RequestBody CityDTO cityDTO){
        return cityService.saveNewCity(cityDTO);
    }
}
