package dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class ShopDTO {
    private Long id;
    private String name;

    private String city;
    private String street;
    private int houseNumber;
    private LocalTime openingTime;
    private LocalTime closingTime;
}
