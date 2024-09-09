package com.example.demozkouska;

import com.example.model.HelloGet200ResponseCarsInner;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;


import java.util.List;


@Mapper
public interface HelloGet200ResponseCarsInnerMapper {

    HelloGet200ResponseCarsInner toDto(String brand, String model, Integer year);

    List<HelloGet200ResponseCarsInner> toDto(List<@Valid HelloGet200ResponseCarsInner> cars);

}
