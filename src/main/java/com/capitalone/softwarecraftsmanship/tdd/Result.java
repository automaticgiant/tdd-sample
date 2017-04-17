package com.capitalone.softwarecraftsmanship.tdd;

/**
 * Created by mbh475 on 4/12/17.
 */
public class Result {
    private final boolean approved;
    private final int limit;

    public Result(boolean approved, int limit) {
        this.approved = approved;
        this.limit = limit;
    }

    public boolean isApproved() {
        return approved;
    }

    public int getLimit() {
        return limit;
    }
}
