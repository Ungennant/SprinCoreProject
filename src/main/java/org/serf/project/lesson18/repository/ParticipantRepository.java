package org.serf.project.lesson18.repository;

import org.serf.project.lesson18.model.Participant;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipantRepository {

    void create (Participant participant);

    void deleteById (int id);

    Participant findById (int id);

    public List<Participant> findAll ();


}
