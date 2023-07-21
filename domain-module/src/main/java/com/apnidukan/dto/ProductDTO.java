package com.apnidukan.dto;

public class ProductDTO {

    private Long id;
    private String title;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public ProductDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ProductDTO setTitle(String title) {
        this.title = title;
        return this;
    }
}