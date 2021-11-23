// Driver Class

public class Main {
    public static void main(String[] args)
    {
         //Admin Department object
    AdminDepartment adminobj = new AdminDepartment(); 
    System.out.println("Welcome to " + adminobj.departmentName());
    System.out.println(adminobj.getTodaysWork());
    System.out.println(adminobj.getWorkDeadline());
    System.out.println(adminobj.isTodayAHoliday());

    //Printing space for Better Layout
    System.out.println("\n");

        //Hr Department object
    HrDepartment hrobj= new HrDepartment();
    System.out.println("Welcome to "+hrobj.departmentName());
    System.out.println(hrobj.doActivity());
    System.out.println(hrobj.getTodaysWork());
    System.out.println(hrobj.getWorkDeadline());
    System.out.println(hrobj.isTodayAHoliday());

    //Printing space for Better Layout
    System.out.println("\n\n");
    
        //Tech Department object
    TechDepartment techobj= new TechDepartment();
    System.out.println("Welcome to " + techobj.departmentName());
    System.out.println(techobj.getTodaysWork());      
    System.out.println(techobj.getWorkDeadline());
    System.out.println(techobj.getTechStackInformation());
    System.out.println(techobj.isTodayAHoliday());    

}

}

