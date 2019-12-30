package com.jebus.hibernate.update.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Common service method for all the services.
 *
 * @param <T> - Entity
 * @param <K> - Entities Repository
 */
public interface ICommonService<T, K extends JpaRepository<T, Long>> {

	K getRepository();

	default T save(T entity) {
		return getRepository().save(entity);
	}

	default List<T> findAll() {
		return getRepository().findAll();
	}

}
