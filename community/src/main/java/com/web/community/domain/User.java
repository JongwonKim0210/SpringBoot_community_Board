package com.web.community.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table
public class User implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

    @Builder
    public User(String name, String password, String email, LocalDateTime createDate, LocalDateTime updateDate){
        this.name = name;
        this.password = password;
        this.email = email;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

}
