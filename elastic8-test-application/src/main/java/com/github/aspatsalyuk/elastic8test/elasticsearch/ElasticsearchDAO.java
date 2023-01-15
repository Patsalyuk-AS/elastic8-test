package com.github.aspatsalyuk.elastic8test.elasticsearch;

import com.github.aspatsalyuk.elastic8test.dto.SearchCriteriaDTO;
import com.github.aspatsalyuk.elastic8test.elasticsearch.index.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.github.aspatsalyuk.elastic8test.elasticsearch.utils.SearchQueryBuilder.buildSearchQuery;

@Service
@RequiredArgsConstructor
public class ElasticsearchDAO {

    private final ElasticsearchOperations elasticsearch;

    public List<Person> find(SearchCriteriaDTO searchCriteriaDTO) {
        Query query = buildSearchQuery(searchCriteriaDTO);
        SearchHits<Person> searchHits = elasticsearch.search(query, Person.class);
        return searchHits.stream().map(SearchHit::getContent).collect(Collectors.toList());
    }
}
