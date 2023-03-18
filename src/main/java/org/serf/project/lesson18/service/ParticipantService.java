package org.serf.project.lesson18.service;

import org.serf.project.lesson18.model.Participant;
import org.serf.project.lesson18.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ParticipantService {

    private final ParticipantRepository participantRepository;

    @Autowired
    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    public void create (Participant participant) {
        participantRepository.create(participant);
    }

    public void deleteById (Integer id) {
        participantRepository.deleteById(id);
    }

    public Participant findById (Integer id) {
        return participantRepository.findById(id);
    }

    public List<Participant> findAll(){
        return participantRepository.findAll();
    }
}
