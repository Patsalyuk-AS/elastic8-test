package com.github.aspatsalyuk.elastic8test.service;

import com.github.aspatsalyuk.elastic8test.dto.SearchCriteriaDTO;
import com.github.aspatsalyuk.elastic8test.dto.SearchResultDTO;

public interface SearchService {

    SearchResultDTO find(SearchCriteriaDTO searchCriteriaDTO);
}
