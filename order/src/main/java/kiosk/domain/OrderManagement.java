package kiosk.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kiosk.OrderApplication;
import kiosk.domain.CancelledMenu;
import kiosk.domain.OrderedMenu;
import kiosk.domain.ReturnedDishes;
import lombok.Data;

@Entity
@Table(name = "OrderManagement_table")
@Data
//<<< DDD / Aggregate Root
public class OrderManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long menuId;

    private String menuName;

    private Integer price;

    private Integer tableNo;

    private Date orderDt;

    private String status;

    @PostPersist
    public void onPostPersist() {
        OrderedMenu orderedMenu = new OrderedMenu(this);
        orderedMenu.publishAfterCommit();

        CancelledMenu cancelledMenu = new CancelledMenu(this);
        cancelledMenu.publishAfterCommit();

        ReturnedDishes returnedDishes = new ReturnedDishes(this);
        returnedDishes.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {}

    public static OrderManagementRepository repository() {
        OrderManagementRepository orderManagementRepository = OrderApplication.applicationContext.getBean(
            OrderManagementRepository.class
        );
        return orderManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void changeStatus(ComplatedCooking complatedCooking) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(complatedCooking.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeStatus(CancelledRequest cancelledRequest) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(cancelledRequest.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeStatus(CancelledCooking cancelledCooking) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(cancelledCooking.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void notifyToWatingCustomer(
        DeactivatedTable deactivatedTable
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(deactivatedTable.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
