package kiosk.domain;

import kiosk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "tableManagements",
    path = "tableManagements"
)
public interface TableManagementRepository
    extends PagingAndSortingRepository<TableManagement, Long> {}
