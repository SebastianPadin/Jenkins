package com.valery.demo.controller;

import com.valery.demo.entity.Student;
import com.valery.demo.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")  // Asegúrate de que este es el prefijo correcto
public class StudentController {

  private final StudentRepository repository;

  public StudentController(StudentRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<Student> getAll() {
    return repository.findAll();
  }

  @PostMapping("/create")  // Aquí mapeamos específicamente la ruta "/create"
  public Student create(@RequestBody Student student) {
      return repository.save(student);  // Guardamos el estudiante en la base de datos
  }

  @PutMapping("/{id}")
  public Student update(@PathVariable Long id, @RequestBody Student student) {
    student.setId(id);
    return repository.save(student);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    repository.deleteById(id);
  }
}