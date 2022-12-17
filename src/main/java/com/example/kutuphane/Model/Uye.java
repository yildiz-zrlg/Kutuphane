package com.example.kutuphane.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="uye")
public class Uye {
    @Id
    @Column(name = "uye_id", nullable = false, length = 15)
    private String uye_id;

    @Column(name = "uye_adi", nullable = false, length = 15)
    private String uye_adi;

    @Column(name = "uye_soyadı", nullable = false, length = 15)
    private String uye_soyadi;

    @Column(name = "uye_numarasi", nullable = false, length = 15)
    private String uye_numarasi;

}
