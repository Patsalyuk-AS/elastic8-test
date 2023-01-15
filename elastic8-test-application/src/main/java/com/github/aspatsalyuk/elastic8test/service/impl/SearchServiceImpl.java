package com.github.aspatsalyuk.elastic8test.service.impl;

import com.github.aspatsalyuk.elastic8test.mapper.PersonMapper;
import com.github.aspatsalyuk.elastic8test.dto.SearchCriteriaDTO;
import com.github.aspatsalyuk.elastic8test.dto.SearchResultDTO;
import com.github.aspatsalyuk.elastic8test.elasticsearch.ElasticsearchDAO;
import com.github.aspatsalyuk.elastic8test.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService {

    private final ElasticsearchDAO elasticsearchDAO;
    private final PersonMapper personMapper;
    @Override
    public List<SearchResultDTO> find(SearchCriteriaDTO searchCriteriaDTO) {
        return personMapper.toSearchResultDTOList(elasticsearchDAO.find(searchCriteriaDTO));
    }
}
