
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
         System.out.println("hello world");
         
     }
     void Register(){
         
     }
    
    
    
    
}

class Doctor extends User{
    String specialization;
   
    Boolean Availablility;
    
    void Add_Doctor(){
        
    }
    void Update_dr_info(){
        
    }
    void Delete_doctor(){
        
    }
    void View_Availablity(){
    
}
}
class Appointment {
    int app_id;
    String P_name;
    Doctor id;
     String D_name;
     Date App_date;
     LocalTime App_time;
     String Status;
     void Schedule(){
         
     }
     void Reschedule(){
         
     }
     void CancelApp(){
         
     }
     void ViewApp(){
         
     }
    
}
class Medical_Record{
    int M_id;
    String p_name;
    int d_id;
    Date visit_date;
    String Bloodpressure;
    double HeartRate;
    void Add_record(){
        
    }
    void Update_record(){
        
    }
    void view_Record(){
        
    }
    
}

public class Hospital_Management_System {

    public static void main(String[] args) {
       
    }
}
