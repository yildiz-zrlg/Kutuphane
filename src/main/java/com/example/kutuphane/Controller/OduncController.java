package com.example.kutuphane.Controller;

import com.example.kutuphane.Model.Odunc;
import com.example.kutuphane.Service.OduncService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odunc")
public class OduncController {
    private OduncService oduncService;

    public OduncController(OduncService oduncService) {
        this.oduncService = oduncService;
    }
    @PostMapping
    public Odunc insert(@RequestBody Odunc odunc){
        return oduncService.createOdunc(odunc);
    }
    @GetMapping
    public List<Odunc> getAllOdunc(){
        return oduncService.findAllOdunc();
    }
    @GetMapping("/{id}")
    public Odunc getOduncById(@PathVariable("id") String oduncId){
        return oduncService.getOduncById(oduncId);
    }
    @PutMapping("/{id}")
    public Odunc update(@PathVariable("id") String oduncId,@RequestBody Odunc odunc){
        return oduncService.updateOdunc(oduncId,odunc);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String oduncId){
        oduncService.deleteOduncById(oduncId);
    }
}
