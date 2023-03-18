package org.serf.project.lesson18.repository.impl;

import org.serf.project.lesson18.enums.Level;
import org.serf.project.lesson18.model.Participant;
import org.serf.project.lesson18.repository.ParticipantRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ParticipantRepositoryImpl implements ParticipantRepository {

    private List<Participant> participants = new ArrayList<>();

    @PostConstruct
    public void init() {
        Participant participant1 = new Participant(1, "Test1", "Test1@gmail.com", Level.L1, "test");
        Participant participant2 = new Participant(2, "Test2", "Test2@gmail.com", Level.L2, "test");
        Participant participant3 = new Participant(3, "Test3", "Test3@gmail.com", Level.L3, "test");
        Participant participant4 = new Participant(4, "Test4", "Test4@gmail.com", Level.L4, "test");
        Participant participant5 = new Participant(5, "Test5", "Test5@gmail.com", Level.L5, "test");

        participants.addAll(Arrays.asList(participant1, participant2, participant3, participant4, participant5));
    }

    @Override
    public void create(Participant participant) {
        participant.setId(participants.size() + 1);
        participants.add(participant);
    }

    @Override
    public void deleteById(int id) {
        participants.remove(participants.stream().filter(part -> part.getId() == id).findFirst().get());
        for (int i = 0; i < participants.size(); i++)
            participants.get(i).setId(i + 1);
    }

    @Override
    public Participant findById(int id) {
        return participants.stream().filter(part -> part.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Participant> findAll() {
        return participants;
    }
}
