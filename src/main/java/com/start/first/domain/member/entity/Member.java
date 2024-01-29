package com.start.first.domain.member.entity;

import com.start.first.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
public class Member extends BaseEntity {
    @Comment("유저아이디")
    @Column(unique = true)
    private String username;
    private String password;
    @Column(unique = true)
    private String nickname;
    private String email;
}
