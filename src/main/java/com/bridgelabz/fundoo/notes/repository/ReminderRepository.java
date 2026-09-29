package com.bridgelabz.fundoo.notes.repository;

import com.bridgelabz.fundoo.notes.entity.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {

    List<Reminder> findAllByNoteUserId(Long userId);

    Optional<Reminder> findByIdAndNoteUserId(Long id, Long userId);
}