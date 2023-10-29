package com.example.response.service;

import com.example.response.entity.Student;
import com.example.response.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    // Repository를 주입받아야 한다. 어떻게? 1) 생성자 2) 필드 3) 세터
    private final StudentRepository studentRepository;

    public Student addStudent(String name, int grade) {
        Student student = new Student(name, grade);
        studentRepository.add(student);

        return student;
    }

    // 전체 성적 조회
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    // 특정 성적을 입력 받아 해당 성적의 학생들을 조회
    public List<Student> getGradeStudent(int grade) {
        return studentRepository.get(grade);
    }
}
