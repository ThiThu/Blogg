package repository;

import model.Blog;
import model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    Iterable<Blog> findAllByCategory(Category category);
}