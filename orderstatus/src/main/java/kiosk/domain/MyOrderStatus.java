package kiosk.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "MyOrderStatus_table")
@Data
public class MyOrderStatus {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String menuName;
    private Integer price;
    private Integer tableNo;
    private Date orderDt;
    private Long orderId;
    private Date cookingDt;
    private String orderStatus;
    private String cookingStatus;
}
