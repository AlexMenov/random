package ru.mechetin.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mechetin.blog.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
