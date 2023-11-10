package kiosk.domain;

import kiosk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "cookingManagements",
    path = "cookingManagements"
)
public interface CookingManagementRepository
    extends PagingAndSortingRepository<CookingManagement, Long> {}
