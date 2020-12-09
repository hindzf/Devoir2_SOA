package com.hind.stars.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hind.stars.entities.Star;

public interface StarRepository extends JpaRepository<Star, Long> {
	
}
