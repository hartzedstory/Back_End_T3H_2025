package homework_day_9;

import homework_day_9.Exception.CourseAlreadyRegisteredException;

public interface IStudent {
    void registerCourse(String courseName) throws CourseAlreadyRegisteredException;
    void getCourses();
    void inputInfo();
    void showInfo();
}
