/*
 *Time   :- 2:12 PM
 *Author :- Ramesh Dilshan
 *Special Thing :-
 */

package com.edu.gadgetMaster.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderDetailsModel {

    private long id;
    private String item;
    private int qty;
    private double price;

    public OrderDetailsModel(String item, int qty) {
        this.item = item;
        this.qty = qty;

    }
}
