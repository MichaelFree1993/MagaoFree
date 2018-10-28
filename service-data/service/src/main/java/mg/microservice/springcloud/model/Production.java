package mg.microservice.springcloud.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 使用springboot的jpa数据访问模式
 */
@Entity
@Data
public class Production {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int productionId;

    private String productionName;

    private double price;

    private String description;
}
