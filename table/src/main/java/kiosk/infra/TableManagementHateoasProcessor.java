package kiosk.infra;

import kiosk.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TableManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TableManagement>> {

    @Override
    public EntityModel<TableManagement> process(
        EntityModel<TableManagement> model
    ) {
        return model;
    }
}
