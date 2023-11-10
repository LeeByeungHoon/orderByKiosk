package kiosk.domain;

import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class CancelledCooking extends AbstractEvent {

    private Long id;
}
