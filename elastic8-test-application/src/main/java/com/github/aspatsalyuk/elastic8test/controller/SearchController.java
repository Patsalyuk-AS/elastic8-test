package com.github.aspatsalyuk.elastic8test.controller;

import com.github.aspatsalyuk.elastic8test.dto.SearchCriteriaDTO;
import com.github.aspatsalyuk.elastic8test.dto.SearchResultDTO;
import com.github.aspatsalyuk.elastic8test.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(SearchController.CONTROLLER_URI)
public class SearchController {

    static final String CONTROLLER_URI = "search";
    static final String FIND_URI = "find";
    private final SearchService searchService;

    @PostMapping(
            value = FIND_URI,
            produces = APPLICATION_JSON_VALUE,
            consumes = APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<SearchResultDTO>> find(@RequestBody SearchCriteriaDTO searchCriteriaDTO) {
        return ResponseEntity.ok(searchService.find(searchCriteriaDTO));
    }
}
