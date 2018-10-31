package org.nazarovpro.monolithic.db.repo;

import org.nazarovpro.monolithic.db.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepo extends CrudRepository<Account, Long> {

}
