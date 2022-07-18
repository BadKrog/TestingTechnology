package testing.technology.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@lombok.Data
@Entity
@Table(name = "data")
public class Data {
    @Id
    @Column(name = "data_id")
    private Integer dataId;

    @Column(name = "data_name")
    private String dataName;
}
