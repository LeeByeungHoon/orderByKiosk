package kiosk.infra;

import kiosk.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CookingManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CookingManagement>> {

    @Override
    public EntityModel<CookingManagement> process(
        EntityModel<CookingManagement> model
    ) {
        return model;
    }
}
