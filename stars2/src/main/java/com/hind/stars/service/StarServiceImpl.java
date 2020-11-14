package com.hind.stars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.hind.stars.entities.Star;
import com.hind.stars.repos.StarRepository;

@Service
public class StarServiceImpl implements StarService{
	
	@Autowired
	StarRepository starRepository;

	
	@Override
	public Star saveStar(Star s) {
		return starRepository.save(s);
	}

	@Override
	public Star updateStar(Star s) {
		return starRepository.save(s);
	}

	@Override
	public void deleteStar(Star s) {
		 starRepository.save(s);
	}

	@Override
	public void deleteStarById(Long id) {
		starRepository.deleteById(id);	
	}

	@Override
	public Star getStar(Long id) {
		return starRepository.findById(id).get();
	}

	@Override
	public List<Star> getAllStars() {
		return starRepository.findAll();
	}
	
	@Override
	public Page<Star> getAllStarsParPage(int page, int size) {
	return starRepository.findAll(PageRequest.of(page, size));
	}

}
