package com.example.kutuphane.Controller;

import com.example.kutuphane.Model.Kitap;
import com.example.kutuphane.Service.KitapService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kitap")
public class KitapController {
    private KitapService kitapService;

    public KitapController(KitapService kitapService) {
        this.kitapService = kitapService;
    }
    @PostMapping
    public Kitap insert(@RequestBody Kitap kitap){
        return kitapService.createKitap(kitap);
    }
    @GetMapping
    public List<Kitap> getAllKitap(){
        return kitapService.findAllKitap();
    }
    @GetMapping("/{id}")
    public Kitap getKitapById(@PathVariable("id") String kitapId){
        return kitapService.getKitapById(kitapId);
    }
    @PutMapping("/{id}")
    public Kitap update(@PathVariable("id") String kitapId,@RequestBody Kitap kitap){
        return kitapService.updateKitap(kitapId,kitap);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String kitapId){
        kitapService.deleteKitapById(kitapId);
    }
}
