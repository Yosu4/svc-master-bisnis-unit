package org.master.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_contoh")
@Data
@NoArgsConstructor
public class Contoh {
    @Id
    private String idContoh;
    private String keterangan;
}
