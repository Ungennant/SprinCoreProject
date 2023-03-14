package org.serf.project.service;

import org.serf.project.model.University;
import org.serf.project.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UniversityService {

    private final UniversityRepository universityRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Transactional
    public void createUniversity(University university) {
        universityRepository.save(university);
    }

    @Transactional
    public void updateUniversity(int id, University newUniversity) {
        newUniversity.setId(id);
        universityRepository.save(newUniversity);
    }

    @Transactional
    public void deleteUniversity(int id){
        universityRepository.deleteById(id);
    }

    public University findUniversityById(int id) {
        Optional<University> foundUniversity = universityRepository.findById(id);
        return foundUniversity.orElse(null);
    }

    public List<University> findAll() {
        return universityRepository.findAll();
    }
}
