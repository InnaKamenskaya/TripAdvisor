package org.kamenskaya.tripadvisor.app.model.search.criteria;

public class RangeCriteria {

    private final int page;
    private final int rowCount;

    public RangeCriteria(int page, int rowCount) {
        this.page = page;
        this.rowCount = rowCount;
    }

    public int getPage() {
        return page;
    }

    public int getRowCount() {
        return rowCount;
    }
}
