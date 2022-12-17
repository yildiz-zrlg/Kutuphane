package com.example.kutuphane.Controller;

import com.example.kutuphane.Model.Uye;
import com.example.kutuphane.Service.UyeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uye")
public class UyeController {
    private UyeService uyeService;

    public UyeController(UyeService uyeService) {
        this.uyeService = uyeService;
    }
    @PostMapping
    public Uye insert(@RequestBody Uye uye){
        return uyeService.createUye(uye);
    }
    @GetMapping
    public List<Uye> getAllUye(){
        return uyeService.findAllUye();
    }
    @GetMapping("/{id}")
    public Uye getUyeById(@PathVariable("id") String uyeId){
        return uyeService.getUyeById(uyeId);
    }
    @PutMapping("/{id}")
    public Uye update(@PathVariable("id") String uyeId,@RequestBody Uye uye){
        return uyeService.updateUye(uyeId,uye);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String uyeId){
        uyeService.deleteUyeById(uyeId);
    }
}
