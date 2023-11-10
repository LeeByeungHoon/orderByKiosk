package kiosk.infra;

import java.util.List;
import kiosk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "showOrderLists",
    path = "showOrderLists"
)
public interface ShowOrderListRepository
    extends PagingAndSortingRepository<ShowOrderList, Long> {}
