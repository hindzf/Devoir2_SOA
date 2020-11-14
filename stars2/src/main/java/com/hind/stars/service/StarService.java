package com.hind.stars.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.hind.stars.entities.Star;

public interface StarService {
	Star saveStar(Star s);
	Star updateStar(Star s);
	void deleteStar(Star s);
	void deleteStarById(Long id);
	Star getStar(Long id);
	List<Star> getAllStars();
	Page<Star> getAllStarsParPage(int page, int size);
}
