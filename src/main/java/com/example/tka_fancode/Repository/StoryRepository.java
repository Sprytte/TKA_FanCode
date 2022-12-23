package com.example.tka_fancode.Repository;

import com.example.tka_fancode.Entities.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository extends CrudRepository<Story, Long> {
    public List<Story> findAllByAdaptationNameIgnoreCase(String adaptationName);
    public Story findByAdaptationNameIgnoreCase(String adaptationName);
}
