package dev.jack.service;
import java.util.List;
import java.util.Optional;

public interface CrudService<T> {

	List<T> list();
	void create(T t);    // insert
	Optional<T> get(int id);
	void update(T t, int id);
	void delete(int id);
}
