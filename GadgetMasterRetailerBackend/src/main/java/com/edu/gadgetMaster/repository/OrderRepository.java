/*
 *Time   :- 2:20 PM
 *Author :- Ramesh Dilshan
 *Special Thing :-
 */

package com.edu.gadgetMaster.repository;


import com.edu.gadgetMaster.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends JpaRepository<Orders,Long> {
}
