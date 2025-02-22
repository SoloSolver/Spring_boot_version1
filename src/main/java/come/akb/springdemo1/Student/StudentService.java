package come.akb.springdemo1.Student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> StudentController()
    {
        return List.of
                (
                        new Student("Amartya Bera  ",
                                "34",
                                "male",
                                "Amartyabera@gmail.com"
                        ),
                        new Student("ram",
                                "34",
                                "male",
                                "ram@gmail.com"
                        )
                );
    }
}
