package kiosk.domain;

import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class CancelledMenu extends AbstractEvent {

    private Long id;
    private Long menuId;
    private String menuName;
    private Integer price;
    private Date orderDt;
    private Integer tableNo;
    private String status;
}
