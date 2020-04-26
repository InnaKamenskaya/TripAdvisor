package org.kamenskaya.tripadvisor.app.model.search.criteria;

import com.google.common.base.Preconditions;
import org.kamenskaya.tripadvisor.app.infra.exception.flow.InvalidParameterException;
import org.kamenskaya.tripadvisor.app.infra.util.Checks;

public class RangeCriteria {

    private final int page;
    private final int rowCount;

    public RangeCriteria(final int page, final int rowCount) {
        Checks.checkParameter(page >= 0, "Invalid page index: " + page);
        Checks.checkParameter(rowCount >= 0, "Incorrect row count: " + rowCount);
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
