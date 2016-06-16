package com.fh.lernkarten.domain.studySession;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudySessionRepository  extends MongoRepository<StudySession, String> {

}
