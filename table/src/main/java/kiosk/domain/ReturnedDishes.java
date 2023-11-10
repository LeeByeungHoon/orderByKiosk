package kiosk.domain;

import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class ReturnedDishes extends AbstractEvent {

    private Long id;
    private Integer tableNo;
}
