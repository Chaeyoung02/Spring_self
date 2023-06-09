package com.example.server.domain;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
public class  Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//자동 ID생성
    private Long id;

    @Column(nullable = false, length=50, unique = true)
    private String email;

    @Column(nullable = false, length=50, unique= true)
    private String username;

    @Column(nullable = false, unique = true)
    private String password;
}
