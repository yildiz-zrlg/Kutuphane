package com.example.kutuphane.Repository;

import com.example.kutuphane.Model.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitapRepository extends JpaRepository<Kitap,String > {
}
