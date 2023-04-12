package com.luongvandat.repositories;

import com.luongvandat.entities.OrderDetail;
import com.luongvandat.entities.Order_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}