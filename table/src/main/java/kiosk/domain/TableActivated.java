package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class TableActivated extends AbstractEvent {

    private Long id;

    public TableActivated(TableManagement aggregate) {
        super(aggregate);
    }

    public TableActivated() {
        super();
    }
}
//>>> DDD / Domain Event
