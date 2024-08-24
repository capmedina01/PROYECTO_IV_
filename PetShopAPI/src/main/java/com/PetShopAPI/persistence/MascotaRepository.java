package com.PetShopAPI.persistence;

import com.PetShopAPI.persistence.crud.MascotaCrudRepository;
import com.PetShopAPI.persistence.entity.Mascota;

import java.util.List;
import java.util.Optional;

public class MascotaRepository {

    private MascotaCrudRepository mascotaCrudRepository;

    public Mascota createMascota(Mascota mascota) {

        try{
            return mascotaCrudRepository.save(mascota);
        }catch(Exception e){
            throw new RuntimeException("Error al crear la mascota"+e.getMessage());

        }
    }

    public List<Mascota> getMascotaAll(){

        try{
            return (List<Mascota>) mascotaCrudRepository.findAll();
        }catch(Exception e){
            throw new RuntimeException("Error al obtener las mascotas"+e.getMessage());
        }
    }

    public Mascota updateMascota(Mascota mascota) {

        try{
            Optional<Mascota> exist = mascotaCrudRepository.findById(mascota.getMascotaId());
            if(exist.isPresent()){
                Mascota mascotaActual = exist.get();
                mascotaActual.setNombre(mascota.getNombre());
                mascotaActual.setClienteId(mascota.getClienteId());
                mascotaActual.setEdad(mascota.getEdad());
                mascotaActual.setRaza(mascota.getRaza());
                mascotaActual.setEspecie(mascota.getEspecie());
                return mascotaCrudRepository.save(mascotaActual);
            }
        }catch(Exception e){
            throw new RuntimeException("Error al actualizar la mascota"+e.getMessage());
        }
    }


}
