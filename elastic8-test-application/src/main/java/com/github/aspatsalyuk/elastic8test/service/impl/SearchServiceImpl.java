package com.github.aspatsalyuk.elastic8test.service.impl;

import com.github.aspatsalyuk.elastic8test.dto.SearchCriteriaDTO;
import com.github.aspatsalyuk.elastic8test.dto.SearchResultDTO;
import com.github.aspatsalyuk.elastic8test.service.SearchService;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {

    @Override
    public SearchResultDTO find(SearchCriteriaDTO searchCriteriaDTO) {
        return SearchResultDTO.builder()
                .name(searchCriteriaDTO.getName())
                .age(searchCriteriaDTO.getAge())
                .birthday(searchCriteriaDTO.getBirthday())
                .descripton("Someone new person!!!")
                .build();
    }
}
