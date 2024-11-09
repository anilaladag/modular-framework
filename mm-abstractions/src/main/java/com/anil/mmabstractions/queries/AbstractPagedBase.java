package com.anil.mmabstractions.queries;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractPagedBase {
    private int currentPage;
    private int resultsPerPage;
    private int totalPages;
    private long totalResults;

    protected AbstractPagedBase() {

    }

    protected AbstractPagedBase(int currentPage, int resultsPerPage, int totalPages, long totalResults) {
        this.currentPage = currentPage;
        this.resultsPerPage = resultsPerPage;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
    }
}
