package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CancelledRequest extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String menuName;
    private Long menuId;
    private Integer tableNo;
    private Date cookingDt;
    private String status;

    public CancelledRequest(CookingManagement aggregate) {
        super(aggregate);
    }

    public CancelledRequest() {
        super();
    }
}
//>>> DDD / Domain Event
