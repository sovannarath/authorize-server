package com.event.authorizeserver.models.repositoties;

import com.event.authorizeserver.models.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
