package lab5;

public interface IStudent {
	String getName();
    String getId();
    void addCourse(ICourse course);
    void removeCourse(ICourse course);
    List<ICourse> getCourses();

}
