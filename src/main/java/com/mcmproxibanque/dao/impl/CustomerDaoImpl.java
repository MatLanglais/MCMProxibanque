package com.mcmproxibanque.dao.impl;

import org.springframework.stereotype.Component;

import com.mcmproxibanque.dao.interfaces.ICustomerDao;
import com.mcmproxibanque.model.Customer;

@Component
public class CustomerDaoImpl extends DaoImpl<Customer> implements ICustomerDao {

}
