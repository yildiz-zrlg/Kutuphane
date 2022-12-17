package com.example.kutuphane.Service;

import com.example.kutuphane.Model.Odunc;
import com.example.kutuphane.Repository.OduncRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OduncService {
    private OduncRepository oduncRepository;

    public OduncService(OduncRepository oduncRepository) {
        this.oduncRepository = oduncRepository;
    }
    public Odunc createOdunc(Odunc odunc){
        return oduncRepository.save(odunc);
    }
    public List<Odunc> findAllOdunc(){
        return oduncRepository.findAll();
    }
    public Odunc getOduncById(String oduncId){
        return oduncRepository.findById(oduncId).orElse(null);
    }
    public Odunc updateOdunc(String oduncId,Odunc odunc){
        Odunc lastOdunc=this.oduncRepository.findById(oduncId).get();
        lastOdunc.setOduncalma_tarihi(odunc.getOduncalma_tarihi());
        lastOdunc.setIadeetme_tarihi(odunc.getIadeetme_tarihi());
        lastOdunc.setKitap(odunc.getKitap());
        lastOdunc.setUye(odunc.getUye());
        return oduncRepository.save(lastOdunc);
    }
    public void deleteOduncById(String oduncId){
        oduncRepository.deleteById(oduncId);
    }

}
