package kiosk.infra;

import java.util.List;
import kiosk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "myOrderStatuses",
    path = "myOrderStatuses"
)
public interface MyOrderStatusRepository
    extends PagingAndSortingRepository<MyOrderStatus, Long> {}
