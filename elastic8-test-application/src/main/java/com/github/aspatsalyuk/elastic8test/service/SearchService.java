package com.github.aspatsalyuk.elastic8test.service;

import com.github.aspatsalyuk.elastic8test.dto.SearchCriteriaDTO;
import com.github.aspatsalyuk.elastic8test.dto.SearchResultDTO;

import java.util.List;

public interface SearchService {

    List<SearchResultDTO> find(SearchCriteriaDTO searchCriteriaDTO);
}
