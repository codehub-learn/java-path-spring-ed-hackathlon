package gr.codelearn.spring.showcase.hackathon.repository;

import gr.codelearn.spring.showcase.hackathon.domain.Activity;
import gr.codelearn.spring.showcase.hackathon.domain.ActivityKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, ActivityKey> {
}
