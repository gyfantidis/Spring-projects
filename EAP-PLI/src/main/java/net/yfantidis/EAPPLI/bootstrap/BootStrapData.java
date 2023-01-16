package net.yfantidis.EAPPLI.bootstrap;

import net.yfantidis.EAPPLI.entity.Lesson;
import net.yfantidis.EAPPLI.entity.Professor;
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


        Lesson pli10 = new Lesson("Introduction to Computer Science", "PLI 10", "1", 4, false);

        Giannis.getLessons().add(pli10);
         //lessonRepository.save(pli10);


        

        Professor Giorgos = new Professor("Giorgos", "Papadopoulos");

        pli10.setProfessor(Giorgos);

        professorRepository.save(Giorgos);

        System.out.println(Giannis.toString());
        System.out.println(pli10.toString());
        System.out.println(Giorgos.toString());





    }
}
