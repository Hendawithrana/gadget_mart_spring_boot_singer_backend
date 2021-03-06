/*
 *Time   :- 5:11 PM
 *Author :- Ramesh Dilshan
 *Special Thing :-
 */

package com.edu.gadgetMaster.service;

import com.edu.gadgetMaster.entity.Brand;

import java.util.List;

public interface BrandService {

    public Brand addBrand(Brand brand);

    public Brand updateBrand(long id, Brand brand);

    public Brand deleteBrand(long id);

    public Brand searchBrand(long id);

    public List<Brand> getAllBrands();

}
