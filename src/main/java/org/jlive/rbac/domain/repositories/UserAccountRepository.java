package org.jlive.rbac.domain.repositories;

import org.jlive.rbac.domain.entities.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

    UserAccount findByUsername(String username);
}
