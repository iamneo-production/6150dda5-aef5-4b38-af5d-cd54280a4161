package com.example.cartservice.utill;

import org.springframework.beans.BeanUtils;

public interface Transformer {
    default <T> T toDto(Class<T> type) {
        T dto = BeanUtils.instantiateClass(type);
        BeanUtils.copyProperties(this, dto);
        return dto;
    }

    default <T> T toEntity(Class<T> type) {
        T entity = BeanUtils.instantiateClass(type);
        BeanUtils.copyProperties(this, entity);
        return entity;
    }
}
