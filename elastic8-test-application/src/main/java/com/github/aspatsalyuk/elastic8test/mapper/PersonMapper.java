package com.github.aspatsalyuk.elastic8test.mapper;

import com.github.aspatsalyuk.elastic8test.dto.SearchResultDTO;
import com.github.aspatsalyuk.elastic8test.elasticsearch.index.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {

    SearchResultDTO toSearchResultDTO(Person person);
    List<SearchResultDTO> toSearchResultDTOList(List<Person> personList);
}
