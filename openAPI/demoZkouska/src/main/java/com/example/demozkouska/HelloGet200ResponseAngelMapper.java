package com.example.demozkouska;

import com.example.model.HelloGet200Response;
import com.example.model.HelloGet200ResponseAngel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper
public interface HelloGet200ResponseAngelMapper {

        HelloGet200ResponseAngel toDto(String white, String pink, String violet);
}
