package com.apnidukan.dto;

public class ProductDto {

    private Long id;
    private String title;

    public ProductDto() {
    }

    public ProductDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public ProductDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ProductDto setTitle(String title) {
        this.title = title;
        return this;
    }
}