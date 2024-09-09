package com.example.demozkouska;

import com.example.model.HelloGet200Response;
import com.example.model.HelloGet200ResponseAngel;
import com.example.model.HelloGet200ResponseCarsInner;
import com.example.model.HelloGet200ResponseDevil;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper
public interface HelloGet200ResponseMapper {

     HelloGet200Response toDto(String cokoliv, HelloGet200ResponseAngel angel, HelloGet200ResponseDevil devil);
}

