package com.example.tka_fancode.Repository;

import com.example.tka_fancode.Entities.Arc;
import com.example.tka_fancode.Entities.Favorite;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteRepository extends CrudRepository<Favorite, Long> {
    public List<Favorite> findAllByStoryId(long storyId);
    @Transactional
    void deleteAllByStoryId(long storyId);
}

