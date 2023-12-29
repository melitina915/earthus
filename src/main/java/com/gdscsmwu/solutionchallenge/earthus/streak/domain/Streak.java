package com.gdscsmwu.solutionchallenge.earthus.streak.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
// - 기본 생성자 자동 추가
// - public Posts() {} 와 같은 효과
@Entity
public class Streak {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calendarId;

    //@ManyToOne
    //@JoinColumn(name = "userNickname")
    //@Column(nullable = false, unique = true)
    //@Column(name = "userNickname")
    @Column
    @ColumnDefault("'hello'")
    private String userNickname;

    @CreationTimestamp
    @Column(name = "streakDate", nullable = false)
    //private LocalDateTime streakDate = LocalDateTime.now();
    private LocalDateTime streakDate;

    @Column
    @ColumnDefault("0")
    private int streak;
}
