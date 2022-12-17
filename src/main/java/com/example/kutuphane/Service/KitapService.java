package com.example.kutuphane.Service;

import com.example.kutuphane.Model.Kitap;
import com.example.kutuphane.Repository.KitapRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitapService {
    private KitapRepository kitapRepository;

    public KitapService(KitapRepository kitapRepository) {
        this.kitapRepository = kitapRepository;
    }
    public Kitap createKitap(Kitap kitap){
        return kitapRepository.save(kitap);
    }
    public List<Kitap> findAllKitap(){
        return kitapRepository.findAll();
    }
    public Kitap getKitapById(String kitapId){
        return kitapRepository.findById(kitapId).orElse(null);
    }
    public Kitap updateKitap(String kitapId,Kitap kitap){
        Kitap lastKitap=this.kitapRepository.findById(kitapId).get();
        lastKitap.setKitap_adi(kitap.getKitap_adi());
        lastKitap.setKitap_yazari(kitap.getKitap_yazari());
        lastKitap.setKitap_turu(kitap.getKitap_turu());
        return kitapRepository.save(lastKitap);
    }
    public void deleteKitapById(String kitapId){
        kitapRepository.deleteById(kitapId);
    }

}
