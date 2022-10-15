package com.example.demo.Repositorio;

import com.example.demo.Interface.QuadbikeInterface;
import com.example.demo.Modelo.Quadbike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class QuadbikeRepository {
    @Autowired
    
    private QuadbikeInterface extencionesCrud;
    
    public List<Quadbike> getAll(){
        return (List<Quadbike>) extencionesCrud.findAll();
    }
    
    public Optional<Quadbike> getQuadbike(int id){
        return extencionesCrud.findById(id);
    }
    
    public Quadbike save(Quadbike quadbike){
        return extencionesCrud.save(quadbike);
    }
}