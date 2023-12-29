package com.gdscsmwu.solutionchallenge.earthus.streak.dto;

import com.gdscsmwu.solutionchallenge.earthus.streak.domain.Streak;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class StreakListResponseDto {
    private Long calendarId;
    private String userNickname;
    private LocalDateTime streakDate;
    private int streak;

    public StreakListResponseDto(Streak entity) {
        this.calendarId = entity.getCalendarId();
        this.userNickname = entity.getUserNickname();
        this.streakDate = entity.getStreakDate();///////////////////////
        this.streak = entity.getStreak();
    }
}
