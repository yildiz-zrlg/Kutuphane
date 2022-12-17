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
@Table(name="kitap")
public class Kitap {
    @Id
    @Column(name = "kitap_id", nullable = false, length = 15)
    private String kitap_id;

    @Column(name = "kitap_adi", nullable = false, length = 15)
    private String kitap_adi;

    @Column(name = "kitap_yazari", nullable = false, length = 15)
    private String kitap_yazari;

    @Column(name = "kitap_turu", nullable = false, length = 15)
    private String kitap_turu;
}
