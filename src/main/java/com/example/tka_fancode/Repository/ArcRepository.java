package com.example.tka_fancode.Repository;

import com.example.tka_fancode.Entities.Arc;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArcRepository extends CrudRepository<Arc, Long> {
    public List<Arc> findAllByStoryId(long story_id);
    @Transactional
    void deleteAllByStoryId(long storyId);
}
