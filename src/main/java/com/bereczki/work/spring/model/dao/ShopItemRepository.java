package com.bereczki.work.spring.model.dao;

import com.bereczki.work.spring.model.ShopItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopItemRepository extends JpaRepository<ShopItem, Integer> {
}
