package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.infra.AbstractEvent;
import lombok.Data;

@Data
public class ComplatedCooking extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String menuName;
    private Long menuId;
    private Integer tableNo;
    private Date cookingDT;
    private String status;
}
