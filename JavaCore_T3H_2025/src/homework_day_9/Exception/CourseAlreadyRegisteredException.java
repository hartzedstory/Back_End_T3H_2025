package homework_day_9.Exception;

public class CourseAlreadyRegisteredException extends Exception{
    private String courseName;
    private String message;
    public CourseAlreadyRegisteredException(String courseName, String message) {
        super(courseName + message);
    }
}
