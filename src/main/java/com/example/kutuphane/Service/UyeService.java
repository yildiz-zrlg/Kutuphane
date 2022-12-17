package com.example.kutuphane.Service;

import com.example.kutuphane.Model.Kitap;
import com.example.kutuphane.Model.Uye;
import com.example.kutuphane.Repository.UyeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UyeService {
    private UyeRepository uyeRepository;

    public UyeService(UyeRepository uyeRepository) {
        this.uyeRepository = uyeRepository;
    }
    public Uye createUye(Uye uye){
        return uyeRepository.save(uye);
    }
    public List<Uye> findAllUye(){
        return uyeRepository.findAll();
    }
    public Uye getUyeById(String uyeId){
        return uyeRepository.findById(uyeId).orElse(null);
    }
    public Uye updateUye(String uyeId,Uye uye){
        Uye lastUye=this.uyeRepository.findById(uyeId).get();
        lastUye.setUye_adi(uye.getUye_adi());
        lastUye.setUye_soyadi(uye.getUye_soyadi());
        lastUye.setUye_numarasi(uye.getUye_numarasi());
        return uyeRepository.save(lastUye);
    }
    public void deleteUyeById(String uyeId){
        uyeRepository.deleteById(uyeId);
    }

}
