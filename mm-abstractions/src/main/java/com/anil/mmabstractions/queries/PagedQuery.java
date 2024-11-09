package com.anil.mmabstractions.queries;

public interface PagedQuery extends Query {
    int getPage();

    void setPage(int page);

    int getResults();

    void setResults(int results);
}
