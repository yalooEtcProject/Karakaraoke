package com.karakaraoke.be.member.domain.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Entity(name = "members")
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberId;

    @Column(name = "member_name", nullable = false)
    private String memberName;

    @Column(nullable = false, unique = true)
    private String loginId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String emailAddress;


}
