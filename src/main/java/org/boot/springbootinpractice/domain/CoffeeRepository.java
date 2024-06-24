package org.boot.springbootinpractice.domain;

import org.boot.springbootinpractice.domain.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> { }
