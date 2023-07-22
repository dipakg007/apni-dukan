package com.apnidukan.Enums;

public enum ProductEnum {
    ID("id"),
    TITLE("title");

    private final String displayName;

    ProductEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
