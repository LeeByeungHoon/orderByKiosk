package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeactivatedTable extends AbstractEvent {

    private Long id;

    public DeactivatedTable(TableManagement aggregate) {
        super(aggregate);
    }

    public DeactivatedTable() {
        super();
    }
}
//>>> DDD / Domain Event
