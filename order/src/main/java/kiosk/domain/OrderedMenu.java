package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderedMenu extends AbstractEvent {

    private Long id;
    private Long menuId;
    private String menuName;
    private Integer price;
    private Date orderDt;
    private Integer tableNo;
    private String status;

    public OrderedMenu(OrderManagement aggregate) {
        super(aggregate);
    }

    public OrderedMenu() {
        super();
    }
}
//>>> DDD / Domain Event
