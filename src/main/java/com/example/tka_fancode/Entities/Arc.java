package com.example.tka_fancode.Entities;

import com.example.tka_fancode.Request.ArcRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="arcs")
public class Arc {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="arc_name", nullable = false)
    private String arcName;
    @Column(name="arc_description", nullable = false)
    private String arcDescription;

    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="story_id")
    private Story story;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private Summary summary;

    public Arc(ArcRequest arcRequest){
        arcName = arcRequest.getArcName();
        arcDescription = arcRequest.getArcDescription();

        summary = new Summary(arcRequest.getSummary());
    }
}

