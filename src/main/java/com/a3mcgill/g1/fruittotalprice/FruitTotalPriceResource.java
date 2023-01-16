package com.a3mcgill.g1.fruittotalprice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/totalprice")
public class FruitTotalPriceResource {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{fruit}/{month}/{quantity}")
    public FruitTotalPrice getTotalPrice(@PathVariable("fruit") String fruits, @PathVariable("month") String month, @PathVariable("quantity") int quantity){

        String url = "http://localhost:8080/fruitprice/" + fruits + "/" + month;

        FruitMonthPrice newFruitMonthPrice = webClientBuilder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(FruitMonthPrice.class)
                .block();

        FruitTotalPrice response = new FruitTotalPrice();
        response.setFruit(newFruitMonthPrice.getFruit());
        response.setMonth(newFruitMonthPrice.getMonth());
        response.setPrice(newFruitMonthPrice.getPrice());
        response.setQuantity(quantity);

        return response;
    }



}
