package com.example.tka_fancode.Controller;

import com.example.tka_fancode.Request.ArcRequest;
import com.example.tka_fancode.Response.ArcResponse;
import com.example.tka_fancode.Service.ArcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/TKA/Arcs")
public class ArcController {
    @Autowired
    private ArcService arcService;

    @GetMapping("/{arcId}")
    public ArcResponse getArc(@PathVariable Long arcId) {
        return new ArcResponse((arcService.getArc(arcId)));
    }

    @PutMapping("/{arcId}")
    public ArcResponse updateArc(@PathVariable long arcId, @Valid @RequestBody ArcRequest arcRequest) {
        return new ArcResponse(arcService.updateArc(arcId, arcRequest));
    }

    @DeleteMapping("/{arcId}")
    public void deleteArc(@PathVariable long arcId) {
        arcService.deleteArc(arcId);
    }
}
