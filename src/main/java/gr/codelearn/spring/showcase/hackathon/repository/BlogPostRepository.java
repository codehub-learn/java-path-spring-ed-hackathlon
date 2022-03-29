package gr.codelearn.spring.showcase.hackathon.repository;

import gr.codelearn.spring.showcase.hackathon.domain.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
