package com.gdscsmwu.solutionchallenge.earthus.streak.service;

import com.gdscsmwu.solutionchallenge.earthus.streak.dto.StreakListResponseDto;
import com.gdscsmwu.solutionchallenge.earthus.streak.repository.StreakRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StreakService {
    private final StreakRepository streakRepository;

    // 스트릭 조회 기능
    @Transactional(readOnly = true)
    public List<StreakListResponseDto> findAllStreak() {
        return streakRepository.findAll().stream()
                .map(StreakListResponseDto::new)
                .collect(Collectors.toList());
    }
}
