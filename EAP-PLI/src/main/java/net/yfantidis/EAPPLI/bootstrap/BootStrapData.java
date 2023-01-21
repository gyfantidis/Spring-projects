package net.yfantidis.EAPPLI.bootstrap;

import net.yfantidis.EAPPLI.entity.*;
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
        Lesson pli11 = new Lesson();


        lessonRepository.save(pli10);
        Giannis.getLessons().add(pli10);
        studentRepository.save(Giannis);






        Professor Giorgos = new Professor("Giorgos", "Papadopoulos");
        //pli10.setProfessor(Giorgos);



        Coordinator Panos = new Coordinator("Panos", "Panagiotou");


        Assignment erg1Pli10 = new Assignment(1);


        Examination pli10ex1 = new Examination();

        pli10ex1.setLesson(pli10);
        pli10ex1.setGrade(4.1);
        pli10ex1.setPass(false);

        pli10.getAssignment().add(erg1Pli10);
        //lessonRepository.save(pli10);


        professorRepository.save(Giorgos);
        coordinatorRepository.save(Panos);
        assignmentRepository.save(erg1Pli10);
        examinationRepository.save(pli10ex1);


        System.out.println(Giannis);
        System.out.println(pli10.toString());
        System.out.println(Giorgos.toString());
        System.out.println(Panos.toString());
        System.out.println(erg1Pli10.toString());
        System.out.println(pli10ex1.toString());
        System.out.println(pli10.getName());




    }
}
