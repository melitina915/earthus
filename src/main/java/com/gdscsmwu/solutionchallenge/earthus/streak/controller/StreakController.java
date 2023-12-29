package com.gdscsmwu.solutionchallenge.earthus.streak.controller;

import com.gdscsmwu.solutionchallenge.earthus.streak.dto.StreakListResponseDto;
import com.gdscsmwu.solutionchallenge.earthus.streak.repository.StreakRepository;
import com.gdscsmwu.solutionchallenge.earthus.streak.service.StreakService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
// 생성자는 @RequiredArgsConstructor에서 해결해 준다.
// final이 선언된 모든 필드를 인자값으로 하는 생성자를 롬복의 @RequiredArgsConstructor가 대신 생성해준다.
@RequestMapping("/api/streak")
@RestController
// 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 준다.
public class StreakController {

    private final StreakService streakService;
//    private final StreakRepository streakRepository;

    @GetMapping("/{userNickname}")
    public List<StreakListResponseDto> getStreakList(@PathVariable String userNickname) {

        return streakService.findAllStreak();

        //Streak streak = streakRepository.getReferenceById(calendarId);
        //return streakService.findAllStreak(streak.getCalendarId());
    }
}
