package com.anil.mmabstractions.queries;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Paged<T> extends AbstractPagedBase {
    private final List<T> items;

    public Paged() {
        super(1, 10, 1, 0L);
        this.items = Collections.emptyList();
    }

    public Paged(List<T> items, int currentPage, int resultsPerPage, int totalPages, long totalResults) {
        super(currentPage, resultsPerPage, totalPages, totalResults);
        this.items = items != null ? items : Collections.emptyList();
    }

    public static <T> Paged<T> create(List<T> items, int currentPage, int resultsPerPage, int totalPages, long totalResults) {
        return new Paged<>(items, currentPage, resultsPerPage, totalPages, totalResults);
    }

    public static <T> Paged<T> from(AbstractPagedBase result, List<T> items) {
        return new Paged<>(items, result.getCurrentPage(), result.getResultsPerPage(), result.getTotalPages(), result.getTotalResults());
    }

    public static <T> Paged<T> asEmpty() {
        return new Paged<>();
    }

    public List<T> getItems() {
        return Collections.unmodifiableList(items);
    }

    public boolean isEmpty() {
        return items == null || items.isEmpty();
    }

    public <R> Paged<R> map(Function<T, R> mapper) {
        List<R> mappedItems = items.stream().map(mapper).toList();
        return Paged.from(this, mappedItems);
    }
}
