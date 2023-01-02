package com.example.testcontainers.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String email;
    
    public Student() {
		
	}
	public Student(String firstname, String lastname, String email) {
		super();
	
		this.firstName=firstname;
		this.lastName = lastname;
		this.email = email;
		
	}
    
    
    public long getId() {
    	return id;
    }
    
}

