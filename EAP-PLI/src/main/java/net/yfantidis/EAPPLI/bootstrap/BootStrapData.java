package net.yfantidis.EAPPLI.bootstrap;

import net.yfantidis.EAPPLI.entity.Student;
import net.yfantidis.EAPPLI.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AssignmentRepository assignmentRepository;
    private final CoordinatorRepository coordinatorRepository;
    private final ExaminationRepository examinationRepository;
    private final LessonRepository lessonRepository;
    private final ProfessorRepository professorRepository;
    private final StudentRepository studentRepository;

    public BootStrapData(AssignmentRepository assignmentRepository, CoordinatorRepository coordinatorRepository, ExaminationRepository examinationRepository, LessonRepository lessonRepository, ProfessorRepository professorRepository, StudentRepository studentRepository) {
        this.assignmentRepository = assignmentRepository;
        this.coordinatorRepository = coordinatorRepository;
        this.examinationRepository = examinationRepository;
        this.lessonRepository = lessonRepository;
        this.professorRepository = professorRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in BootStrap");

        Student Giannis = new Student();
        Giannis.setFirstName("Giannis");
        Giannis.setLastName("Yfantidis");
        Giannis.setFatherName("Konstantinos");
        Giannis.setMotherName("Stilianni");
        Giannis.setCity("Kilkis, Greece");

        Student Petros = new Student("Petros", "Georgiadis");

        studentRepository.save(Giannis);
        studentRepository.save(Petros);

        System.out.println("Students count:" + studentRepository.count());
        System.out.println("Student1 :" +Giannis.getLastName());
        System.out.println(Giannis.toString());



    }
}
