package com.example.demozkouska;

import com.example.api.HelloApi;
import com.example.model.HelloGet200Response;
import com.example.model.HelloGet200ResponseAngel;
import com.example.model.HelloGet200ResponseCarsInner;
import com.example.model.HelloGet200ResponseDevil;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
public class HelloController implements HelloApi {

    private final HelloGet200ResponseMapper mapper;
    private final HelloGet200ResponseAngelMapper mapperAngel;
    private final HelloGet200ResponseDevilMapper mapperDevil;
/*
    private final HelloGet200ResponseCarsInnerMapper mapperCars;
*/

    @Override
    public ResponseEntity<HelloGet200Response> helloGet() {
        HelloGet200ResponseAngel angel = mapperAngel.toDto("Martin", "je", "skvely");
        HelloGet200ResponseDevil devil = mapperDevil.toDto("Martas", "to ", "umi");

        HelloGet200Response dto = mapper.toDto("Danicek spinka", angel, devil);

        return ResponseEntity.ok(dto);
    }
}

/*
List<HelloGet200ResponseCarsInner> cars = new ArrayList<>();
HelloGet200ResponseCarsInner car = new HelloGet200ResponseCarsInner();
        car.brand("Renault");
        car.model("Clio");
        car.year(2008);
        cars.add(car);*/
