package gr.codelearn.spring.showcase.hackathon.service;

import gr.codelearn.spring.showcase.hackathon.domain.BlogPost;
import gr.codelearn.spring.showcase.hackathon.repository.BlogPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BlogPostServiceImpl extends BaseServiceImpl<BlogPost> implements BlogPostService {
	private final BlogPostRepository blogPostRepository;

	@Override
	public JpaRepository<BlogPost, Long> getRepository() {
		return blogPostRepository;
	}
}
