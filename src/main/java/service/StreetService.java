package service;

import entity.City;
import entity.Shop;
import entity.Street;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.StreetRepo;

@Service
@AllArgsConstructor
public class StreetService {
    private final StreetRepo streetRepo;
    public void deleteStreetById(Long id) {
        streetRepo.deleteById(id);
    }
    public Street getByStreetId(Long id){
        return streetRepo.findById(id).get();
    }
    public Street updateByStreetId(Street street){
        return streetRepo.save(street);
    }
}
