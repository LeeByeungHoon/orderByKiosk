package kiosk.domain;

import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class ComplatedCooking extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String menuName;
    private Long menuId;
    private Integer tableNo;
    private Date cookingDt;
    private String status;
}
