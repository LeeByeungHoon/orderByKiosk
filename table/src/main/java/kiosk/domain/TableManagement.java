package kiosk.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kiosk.TableApplication;
import kiosk.domain.DeactivatedTable;
import kiosk.domain.TableActivated;
import lombok.Data;

@Entity
@Table(name = "TableManagement_table")
@Data
//<<< DDD / Aggregate Root
public class TableManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer tableNo;

    private Boolean isActivate;

    @PostPersist
    public void onPostPersist() {
        TableActivated tableActivated = new TableActivated(this);
        tableActivated.publishAfterCommit();

        DeactivatedTable deactivatedTable = new DeactivatedTable(this);
        deactivatedTable.publishAfterCommit();
    }

    public static TableManagementRepository repository() {
        TableManagementRepository tableManagementRepository = TableApplication.applicationContext.getBean(
            TableManagementRepository.class
        );
        return tableManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void activateTable(ReturnedDishes returnedDishes) {
        //implement business logic here:

        /** Example 1:  new item 
        TableManagement tableManagement = new TableManagement();
        repository().save(tableManagement);

        TableActivated tableActivated = new TableActivated(tableManagement);
        tableActivated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(returnedDishes.get???()).ifPresent(tableManagement->{
            
            tableManagement // do something
            repository().save(tableManagement);

            TableActivated tableActivated = new TableActivated(tableManagement);
            tableActivated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void activateTable(StartedCooking startedCooking) {
        //implement business logic here:

        /** Example 1:  new item 
        TableManagement tableManagement = new TableManagement();
        repository().save(tableManagement);

        TableActivated tableActivated = new TableActivated(tableManagement);
        tableActivated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(startedCooking.get???()).ifPresent(tableManagement->{
            
            tableManagement // do something
            repository().save(tableManagement);

            TableActivated tableActivated = new TableActivated(tableManagement);
            tableActivated.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
