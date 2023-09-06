package fi.haagahelia.testProject.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Student.Student;

@Controller
public class StudentController {

    @RequestMapping("/student")
    public String StudentList(Model model) {
    List<Student> students = new ArrayList<>();            
        students.add(new Student("Oppilas", "Yksi"));
        students.add(new Student("Oppilas", "Kaksi"));
        students.add(new Student("Oppilas", "Kolme"));
        // Add students to a list
        // Add list to model
        model.addAttribute("students", students);

        return "student";
}
    
}
