package com.example.demozkouska;

import com.example.model.HelloGet200Response;
import com.example.model.HelloGet200ResponseDevil;
import org.mapstruct.Mapper;

@Mapper
public interface HelloGet200ResponseDevilMapper {

    HelloGet200ResponseDevil toDto(String black, String blue, String green);
}
