package com.github.aspatsalyuk.elastic8test.elasticsearch.utils;

import com.github.aspatsalyuk.elastic8test.dto.SearchCriteriaDTO;
import lombok.experimental.UtilityClass;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.Query;

import static com.github.aspatsalyuk.elastic8test.elasticsearch.index.Person.*;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

@UtilityClass
public class SearchQueryBuilder {

    public static Query buildSearchQuery(SearchCriteriaDTO searchCriteriaDTO) {
        BoolQueryBuilder query = QueryBuilders.boolQuery();
        addSearchCriteria(query, searchCriteriaDTO);
        return new NativeSearchQueryBuilder()
                .withQuery(query)
                .build();
    }

    private void addSearchCriteria(BoolQueryBuilder query, SearchCriteriaDTO searchCriteriaDTO) {
        if (searchCriteriaDTO == null) {
            return;
        }
        if (searchCriteriaDTO.getName() != null) {
            query.filter(termQuery(NAME_FIELD, searchCriteriaDTO.getName()));
        }
        if (searchCriteriaDTO.getAge() != null) {
            query.filter(termQuery(AGE_FIELD, searchCriteriaDTO.getAge()));
        }
        if (searchCriteriaDTO.getBirthday() != null) {
            query.filter(termQuery(BIRTHDAY_FIELD, searchCriteriaDTO.getBirthday()));
        }
    }
}
