
package com.mycompany.hospital_management_system;
import java.util.Date;
import java.time.LocalTime;
import java.util.List;
class User {
     int id;
     String name;
     String email;
     int phoneno;
     String gender;
     void Login(){
         
     }
     void Register(){
         
     }
    
    
    
    
}
class Patient extends User{
    Date last_visit;
    String Disease;
    void Book_Appointment(){
        
    }
    void Med_History(){
        
    }
    
}
class Doctor extends User{
    String specialization;
    String Schedule;
    Boolean Availablility;
    
    void Add_patient(){
        
    }
    void View_Schedule(){
    
}
}
class Appointment {
    int app_id;
    String P_name;
    Patient id;
     String D_name;
     Date App_date;
     LocalTime App_time;
     void Schedule(){
         
     }
     void Reschedule(){
         
     }
     void CancelApp(){
         
     }
     void SearchApp(){
         
     }
    
}
class Medical_Record{
    int M_id;
    Patient id;
    List<String> pastIllnesses;
    String Bloodpressure;
    double HeartRate;
    void Add_record(){
        
    }
    void Update_record(){
        
    }
    void Search_Record(){
        
    }
    
}
class Schedule{
    Doctor id;
    int noofApp;
     LocalTime off_time;
    
    void Display_Schedule(){
        
    }
    void Change_Schedule(){
        
    }
    
}
public class Hospital_Management_System {

    public static void main(String[] args) {
       
    }
}
