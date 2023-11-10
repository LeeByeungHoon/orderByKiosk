package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.infra.AbstractEvent;
import lombok.Data;

@Data
public class CancelledMenu extends AbstractEvent {

    private Long id;
    private Long menuId;
    private String menuName;
    private Integer price;
    private Date orderDT;
    private Integer tableNo;
    private String status;
}
