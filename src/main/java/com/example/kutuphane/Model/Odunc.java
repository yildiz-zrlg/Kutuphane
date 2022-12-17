package com.example.kutuphane.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "odunc")
@NoArgsConstructor
@AllArgsConstructor
public class Odunc {
    @Id
    @Column(name = "odunc_id", nullable = false, length = 15)
    private String odunc_id;

    @Column(name = "oduncalma_tarihi", nullable = false, length = 15)
    private String oduncalma_tarihi;

    @Column(name = "iadeetme_tarihi", nullable = false, length = 15)
    private String iadeetme_tarihi;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uye_id", nullable = false)
    private Uye uye;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kitap_id", nullable = false)
    private Kitap kitap;


}
