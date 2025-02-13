package com.bridgelabz.inheritance;

class Course{
   private String courseName;
   private int duration;

   public Course(String courseName, int duration){
       this.courseName=courseName;
       this.duration=duration;
   }

   public String getCourseName(){
       return courseName;
   }

   public int getDuration(){
       return duration;
   }
}
class OnlineCourse extends Course{
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    public String getPlatform(){
        return platform;
    }

    public boolean isRecorded(){
        return isRecorded;
    }
}
class PaidOnlineCourse extends OnlineCourse{
    private int fee;
    private float discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, float discount){
        super(courseName, duration, platform, isRecorded);
        this.fee=fee;
        this.discount=discount;
    }

    public void displayDetails(){
        System.out.println("Course name: "+getCourseName());
        System.out.println("Duration: "+getDuration());
        System.out.println("Platform: "+getPlatform());
        System.out.println("Is recorded: "+isRecorded());
        System.out.println("Fee: "+fee);
        System.out.println("Discount: "+discount);
        System.out.println("Total fee: "+(fee-(fee*discount/100)));
    }
}
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse paidOnlineCourse=new PaidOnlineCourse("Java", 120, "udemy", true, 1000, 10);
        paidOnlineCourse.displayDetails();
    }
}
