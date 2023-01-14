package com.github.aspatsalyuk.elastic8test.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class SearchResultDTO {

    private final String name;
    private final Integer age;
    private final LocalDate birthday;

    private final String descripton;
}
