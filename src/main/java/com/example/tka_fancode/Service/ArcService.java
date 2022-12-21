package com.example.tka_fancode.Service;

import com.example.tka_fancode.Entities.Arc;
import com.example.tka_fancode.Exception.ResourceNotFoundException;
import com.example.tka_fancode.Repository.ArcRepository;
import com.example.tka_fancode.Request.ArcRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArcService {
    @Autowired
    private ArcRepository arcRepository;

    public Arc getArc(long arcId){
        Arc arc = arcRepository.findById(arcId).orElseThrow(()-> new ResourceNotFoundException("Arc id not found"));
        return arc;
    }

    public Arc updateArc(long arcId, ArcRequest arcRequest){
        if(arcRepository.existsById(arcId)){
            Arc arcToBeUpdated = new Arc(arcRequest);
            arcToBeUpdated.setId(arcId);
            return arcRepository.save(arcToBeUpdated);
        }
        else
            throw new ResourceNotFoundException("Arc ID not found");
    }

    public void deleteArc(long arcId){
        if(arcRepository.existsById(arcId))
            arcRepository.deleteById(arcId);
        else
            throw new ResourceNotFoundException("Arc ID not found");
    }
}
