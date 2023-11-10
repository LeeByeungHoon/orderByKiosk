package kiosk.infra;

import java.util.List;
import kiosk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "showMenuLists",
    path = "showMenuLists"
)
public interface ShowMenuListRepository
    extends PagingAndSortingRepository<ShowMenuList, Long> {}
