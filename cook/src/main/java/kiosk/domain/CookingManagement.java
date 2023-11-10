package kiosk.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kiosk.CookApplication;
import kiosk.domain.CancelledCooking;
import kiosk.domain.CancelledRequest;
import kiosk.domain.ComplatedCooking;
import kiosk.domain.StartedCooking;
import lombok.Data;

@Entity
@Table(name = "CookingManagement_table")
@Data
//<<< DDD / Aggregate Root
public class CookingManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderId;

    private String menuName;

    private Long menuId;

    private Integer tableNo;

    private Date cookingDt;

    private String status;

    @PostPersist
    public void onPostPersist() {
        StartedCooking startedCooking = new StartedCooking(this);
        startedCooking.publishAfterCommit();

        ComplatedCooking complatedCooking = new ComplatedCooking(this);
        complatedCooking.publishAfterCommit();

        CancelledRequest cancelledRequest = new CancelledRequest(this);
        cancelledRequest.publishAfterCommit();

        CancelledCooking cancelledCooking = new CancelledCooking(this);
        cancelledCooking.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {}

    public static CookingManagementRepository repository() {
        CookingManagementRepository cookingManagementRepository = CookApplication.applicationContext.getBean(
            CookingManagementRepository.class
        );
        return cookingManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startCooking(OrderedMenu orderedMenu) {
        //implement business logic here:

        /** Example 1:  new item 
        CookingManagement cookingManagement = new CookingManagement();
        repository().save(cookingManagement);

        StartedCooking startedCooking = new StartedCooking(cookingManagement);
        startedCooking.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderedMenu.get???()).ifPresent(cookingManagement->{
            
            cookingManagement // do something
            repository().save(cookingManagement);

            StartedCooking startedCooking = new StartedCooking(cookingManagement);
            startedCooking.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void cancelRequest(CancelledMenu cancelledMenu) {
        //implement business logic here:

        /** Example 1:  new item 
        CookingManagement cookingManagement = new CookingManagement();
        repository().save(cookingManagement);

        CancelledRequest cancelledRequest = new CancelledRequest(cookingManagement);
        cancelledRequest.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(cancelledMenu.get???()).ifPresent(cookingManagement->{
            
            cookingManagement // do something
            repository().save(cookingManagement);

            CancelledRequest cancelledRequest = new CancelledRequest(cookingManagement);
            cancelledRequest.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
