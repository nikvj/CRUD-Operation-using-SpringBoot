package org.websparrow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.websparrow.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}
