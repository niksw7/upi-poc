package org.acme.spring.web;

import org.springframework.data.repository.CrudRepository;

public interface UpiTransactionRepository extends CrudRepository<UpiTransaction,String> {
}

