package com.anil.mmabstractions.queries;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractPagedQuery implements PagedQuery {
    private int page;
    private int results;
    private String orderBy;
    private String sortOrder;

    @Override
    public int getPage() {
        return page;
    }

    @Override
    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public int getResults() {
        return results;
    }

    @Override
    public void setResults(int results) {
        this.results = results;
    }
}
