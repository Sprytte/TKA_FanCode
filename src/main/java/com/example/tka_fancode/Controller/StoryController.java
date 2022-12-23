package com.example.tka_fancode.Controller;

import com.example.tka_fancode.Entities.Arc;
import com.example.tka_fancode.Entities.Story;
import com.example.tka_fancode.Request.ArcRequest;
import com.example.tka_fancode.Request.StoryRequest;
import com.example.tka_fancode.Response.ArcResponse;
import com.example.tka_fancode.Response.StoryResponse;
import com.example.tka_fancode.Service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("TKA/Adaptations")
public class StoryController {
    @Autowired
    StoryService storyService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{story_id}/Arcs")
    public ArcResponse addArc(@PathVariable long story_id, @Valid @RequestBody ArcRequest arcRequest){
        return new ArcResponse(storyService.addArc(story_id, arcRequest));
    }
    @GetMapping("/{storyId}/Arcs")
    public List<ArcResponse> getAllArcs(@PathVariable long storyId){
        List<Arc> arcs = storyService.getAllArcs(storyId);
        List<ArcResponse> arcResponses = new ArrayList<>();
        for(int i = 0; i < arcs.size(); i++)
            arcResponses.add(new ArcResponse(arcs.get(i)));

        return arcResponses;
    }
    @DeleteMapping("/{storyId}/Arcs")
    public void deleteAllArcs(@PathVariable long storyId){
        storyService.deleteAllArcs(storyId);
    }

    @GetMapping()
    public List<StoryResponse> getAllStories(@RequestParam(required = false) String adaptationName){
        List<Story> stories = storyService.getAllStories(adaptationName);
        List<StoryResponse> storyResponses = new ArrayList<>();
        stories.forEach(story -> {
            StoryResponse storyResponse = new StoryResponse(story);
            storyResponses.add(storyResponse);
        });
        return storyResponses;
    }
    @GetMapping("/id")
    public StoryResponse getStory(@PathVariable long id,@RequestParam(required = false) String adaptationName){
        Story story = storyService.getStory(adaptationName);
        StoryResponse storyResponse = new StoryResponse(story) ;
        return storyResponse;
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public StoryResponse addStory(@Valid @RequestBody StoryRequest storyRequest){
        Story savedStory = storyService.addStory(storyRequest);
        return new StoryResponse(savedStory);
    }
    @PutMapping("/id")
    public StoryResponse updateStory(@PathVariable long id, @Valid @RequestBody StoryRequest storyRequest){
        Story updatedStory = storyService.updateStory(id, storyRequest);
        return new StoryResponse(updatedStory);
    }
    @DeleteMapping("/{id}")
    public void deleteStory(@PathVariable long id){
        storyService.deleteStory(id);
    }
}