package com.example.tka_fancode.Service;

import com.example.tka_fancode.Entities.Favorite;
import com.example.tka_fancode.Exception.ResourceNotFoundException;
import com.example.tka_fancode.Repository.FavoriteRepository;
import com.example.tka_fancode.Request.FavoriteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService {
    @Autowired
    private FavoriteRepository favoriteRepository;

    public Favorite getFavorite(long favId){
        Favorite fav = favoriteRepository.findById(favId).orElseThrow(()-> new ResourceNotFoundException("Favorite ID not found"));
        return fav;
    }

    public Favorite updateFavorite(long favId, FavoriteRequest favoriteRequest){
        if(favoriteRepository.existsById(favId)){
            Favorite favoriteToBeUpdated = new Favorite(favoriteRequest);
            favoriteToBeUpdated.setId(favId);
            return favoriteRepository.save(favoriteToBeUpdated);
        }
        else
            throw new ResourceNotFoundException("Favorite ID not found");
    }

    public void deleteFavorite(long favId){
        if(favoriteRepository.existsById(favId))
            favoriteRepository.deleteById(favId);
        else
            throw new ResourceNotFoundException("Favorite ID not found");
    }

}
