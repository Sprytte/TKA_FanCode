package com.example.tka_fancode.Response;

import com.example.tka_fancode.Entities.Arc;
import com.example.tka_fancode.Entities.Favorite;
import com.example.tka_fancode.Request.FavoriteRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteResponse {
    private long id;
    private String chapters;
    private String description;
    private String username;
    private StoryResponse story;

    public FavoriteResponse(Favorite favorite){
        id = favorite.getId();
        chapters = favorite.getChapters();
        description = favorite.getDescription();
        username = favorite.getUsername();

        story = new StoryResponse(favorite.getStory());
    }
}
