package com.basic.myspringboot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "student_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
// Owner(주인) - FK(외래키)를 가진 쪽이 주인임
public class StudentDetail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_detail_id")
    private Long id;
    
    @Column(nullable = false)
    private String address;
    
    @Column(nullable = false)
    private String phoneNumber;
    
    @Column
    private String email;
    
    @Column
    private LocalDate dateOfBirth;

    // 1:1 관계
    @OneToOne(fetch = FetchType.LAZY) // EAGER는 불필요한 연관관계까지 전부 다 불러오는 default이므로 LAZY로 설정
    // FK(외래키)에 해당하는 어노테이션
    @JoinColumn(name = "student_id", unique = true)
    private Student student;
}