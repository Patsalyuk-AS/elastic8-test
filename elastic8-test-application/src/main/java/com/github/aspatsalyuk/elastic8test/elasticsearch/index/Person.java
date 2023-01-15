package com.github.aspatsalyuk.elastic8test.elasticsearch.index;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "people")
public class Person {

    public static final String NAME_FIELD = "name";
    public static final String AGE_FIELD = "age";
    public static final String BIRTHDAY_FIELD = "birthday";
    public static final String DESCRIPTION_FIELD = "description";

    @Field(name = NAME_FIELD)
    private String name;
    @Field(name = AGE_FIELD)
    private Integer age;
    @Field(name = BIRTHDAY_FIELD)
    private LocalDate birthday;

    @Field(name = DESCRIPTION_FIELD)
    private String descripton;
}
