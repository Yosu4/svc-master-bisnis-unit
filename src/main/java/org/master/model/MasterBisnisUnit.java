package org.master.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "MST_BISNIS_UNIT")
@Data
@NoArgsConstructor
public class MasterBisnisUnit {

    @Id
    @Column(name = "ID_BU", length = 30)
    private String idBu;

    @Column(name = "NM_BU", length = 100)
    private String nameBu;

    @Column(name = "STATUS", columnDefinition = "int default 100")
    private int status;

    @Column(name = "CREATED_DT", columnDefinition = "DATE default SYSDATE")
    private Date createDate;

    @Column(name = "CREATED_BY", columnDefinition = "varchar(36) default 'SYSTEM'")
    private String createBy;

    @Column(name = "MODIFIED_DT")
    private Date modifiedDate;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "END_DT")
    private Date endDate;


}
