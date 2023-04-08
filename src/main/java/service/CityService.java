package service;

import dto.CityDTO;
import entity.City;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.CityRepo;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CityService {
    private CityRepo cityRepo;
    public List<String> getCities() {
        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        return cities;
    }
    public List<City> getAllCities(){
        return cityRepo.findAll();
    }
    public void deleteCityById(Long id) {
        cityRepo.deleteById(id);
    }
    public City getByCityId(Long id){
        return cityRepo.findById(id).get();
    }
    public City updateCityById(City city) {
        return cityRepo.save(city);
    }
    public Long saveNewCity(CityDTO cityDTO){
        City city = new City();
        city.setNameOfCity(cityDTO.getNameOfCity());
        return cityRepo.save(city).getId();
    }
}
