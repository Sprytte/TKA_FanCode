package com.example.tka_fancode.Service;

import com.example.tka_fancode.Entities.Arc;
import com.example.tka_fancode.Entities.Favorite;
import com.example.tka_fancode.Entities.Story;
import com.example.tka_fancode.Exception.ResourceNotFoundException;
import com.example.tka_fancode.Repository.ArcRepository;
import com.example.tka_fancode.Repository.FavoriteRepository;
import com.example.tka_fancode.Repository.StoryRepository;
import com.example.tka_fancode.Request.ArcRequest;
import com.example.tka_fancode.Request.FavoriteRequest;
import com.example.tka_fancode.Request.StoryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {
    @Autowired
    StoryRepository storyRepository;
    @Autowired
    ArcRepository arcRepository;
    @Autowired
    FavoriteRepository favoriteRepository;

    public Favorite addFavorite(long storyId, FavoriteRequest favoriteRequest){
        Story story = storyRepository.findById(storyId).orElseThrow(
                ()-> new ResourceNotFoundException("Story ID not found"));

        Favorite favoriteToBeSaved = new Favorite(favoriteRequest);
        favoriteToBeSaved.setStory(story);

        return favoriteRepository.save(favoriteToBeSaved);
    }
    public List<Favorite> getAllFavorites(long storyId){
        return favoriteRepository.findAllByStoryId(storyId);
    }
    public void deleteAllFavorites(long storyId){
        if(storyRepository.existsById(storyId))
            favoriteRepository.deleteAllByStoryId(storyId);
        else
            throw new ResourceNotFoundException("Story ID not found");
    }

    public Arc addArc(long storyId, ArcRequest arcRequest){
        Story story = storyRepository.findById(storyId).orElseThrow(
                ()->new ResourceNotFoundException("Story ID is not found"));

        Arc arcToBeSaved = new Arc(arcRequest);
        arcToBeSaved.setStory(story);

        return arcRepository.save(arcToBeSaved);
    }
    public List<Arc> getAllArcs(long storyId){
        return arcRepository.findAllByStoryId(storyId);
    }
    public void deleteAllArcs(long storyId){
        if(storyRepository.existsById(storyId))
            arcRepository.deleteAllByStoryId(storyId);
        else
            throw new ResourceNotFoundException("Story ID not found");
    }

    public List<Story> getAllStories(String adaptationNameParam){
        if(adaptationNameParam == null || adaptationNameParam.isBlank())
            return (List<Story>) storyRepository.findAll();

        return storyRepository.findAllByAdaptationNameIgnoreCase(adaptationNameParam);
    }
    public Story getStory(String adaptationNameParam){
        if(adaptationNameParam == null || adaptationNameParam.isBlank())
            return (Story) storyRepository.findByAdaptationNameIgnoreCase(adaptationNameParam);

        return storyRepository.findByAdaptationNameIgnoreCase(adaptationNameParam);
    }
    public Story addStory(StoryRequest storyRequest){
        Story story = new Story(storyRequest);
        return storyRepository.save(story);
    }
    public Story updateStory(long storyId, StoryRequest storyRequest){
        storyRepository.findById(storyId)
                .orElseThrow(()-> new ResourceNotFoundException("story id is not found"));

        Story storyToBeUpdated = new Story(storyRequest);
        storyToBeUpdated.setId(storyId);

        return storyRepository.save(storyToBeUpdated);
    }
    public void deleteStory(long storyId){
        if(storyRepository.existsById(storyId))
            storyRepository.deleteById(storyId);
        else
            throw new ResourceNotFoundException("Story id not found");
    }
}
