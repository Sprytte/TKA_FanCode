package com.example.tka_fancode.Controller;

import com.example.tka_fancode.Request.FavoriteRequest;
import com.example.tka_fancode.Response.FavoriteResponse;
import com.example.tka_fancode.Service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/TKA/Favorites")
public class FavoriteController {
    @Autowired
    private FavoriteService favoriteService;

    @GetMapping("/{favId}")
    public FavoriteResponse getFavorite(@PathVariable Long favId){
        return new FavoriteResponse(favoriteService.getFavorite(favId));
    }

    @PutMapping("/{favId}")
    public FavoriteResponse updateFavorite(@PathVariable long favId, @Valid @RequestBody FavoriteRequest favoriteRequest){
        return new FavoriteResponse(favoriteService.updateFavorite(favId, favoriteRequest));
    }

    @DeleteMapping("/{favId}")
    public void deleteFavorite(@PathVariable long favId) { favoriteService.deleteFavorite(favId);}
}