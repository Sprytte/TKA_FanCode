package com.example.tka_fancode.Entities;

import com.example.tka_fancode.Request.ArcRequest;
import com.example.tka_fancode.Request.FavoriteRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="favorites")
public class Favorite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="chapters", nullable = false)
    private String chapters;
    @Column(name="description", nullable = false)
    private String description;
    @Column(name="userName", nullable = false)
    private String username;

    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="story_id")
    private Story story;

    public Favorite(FavoriteRequest favoriteRequest){
        chapters = favoriteRequest.getChapters();
        description = favoriteRequest.getDescription();
        username = favoriteRequest.getUsername();
    }
}
