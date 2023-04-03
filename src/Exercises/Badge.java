package Exercises;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

 private static void keepTrackOfEmployeesNumber(){
     totalNumberOfEmployees++;
 }

 private String generateBadgeIdCode(){
     return badgeIdCode = "XYZ" + employee.getName() + employee.getSurname() + "XYZ";
 }

 public void showBadgeDetails(){
     keepTrackOfEmployeesNumber();
     generateBadgeIdCode();
     System.out.println(totalNumberOfEmployees + " " + employee.getEmployeeDetails() + " "
     + badgeIdCode);
 }
 
 public Badge(Employee employeesThatNeedsBadge){
     keepTrackOfEmployeesNumber();
     employee = employeesThatNeedsBadge;
     badgeIdCode = generateBadgeIdCode();

 }
}