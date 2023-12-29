package com.gdscsmwu.solutionchallenge.earthus.streak.repository;

import com.gdscsmwu.solutionchallenge.earthus.streak.domain.Streak;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JPA Repository
// 인터페이스로 생성한다.
// 단순히 인터페이스를 생성 후, JpaRepository<Entity 클래스, PK 타입>를 상속하면 기본적인 CRUD 메소드가 자동으로 생성된다.
// @Repository를 추가할 필요도 없다.
// 주의할 점은 Entity 클래스와 기본 Entity Repository는 함께 위치해야 하는 점이다.
// 둘은 아주 밀접한 관계이고, Entity 클래스는 기본 Repository 없이는 제대로 역할을 할 수가 없다.
// 나중에 프로젝트 규모가 커져 도메인별로 프로젝트를 분리해야 한다면
// 이때 Entity 클래스와 기본 Repository는 함께 움직여야 하므로 도메인 패키지에서 함께 관리한다.

// Streak 클래스로 Database를 접근하게 해줄 JpaRepository
public interface StreakRepository extends JpaRepository<Streak, Long> {
    List<Streak> findAll();
}
