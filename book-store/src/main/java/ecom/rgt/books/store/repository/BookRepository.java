package ecom.rgt.books.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ecom.rgt.books.store.entity.Books;

public interface BookRepository extends JpaRepository<Books, Integer>{
	public Books findById(Long id);
}
