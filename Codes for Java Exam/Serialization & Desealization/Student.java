import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    transient int code; // transient keyword is used to neglect a variable so that it doesent get
                        // searializable

    Student(int id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
