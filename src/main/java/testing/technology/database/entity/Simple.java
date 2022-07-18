package testing.technology.database.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "simple")
public class Simple {

    @Id
    @Column(name = "simple_id")
    private Integer id;

    @Column(name = "simple_name")
    private String name;
}
