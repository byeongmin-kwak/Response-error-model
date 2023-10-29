package com.example.response.repository;

import com.example.response.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {
    Set<Student> students = new HashSet<>();

    //이름과 성적을 입력받아 저장
    public void add(Student student) {
        students.add(student);
    }

    //전체 성적을 오름차순으로 조회
    public List<Student> getAll() {
        return students.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // 특정 성적을 입력 받아 해당 성적의 학생들을 조회
    public List<Student> get(int grade) {
        return students.stream()
                .filter(student -> student.getGrade() == grade)
                .collect(Collectors.toList());
    }
}
