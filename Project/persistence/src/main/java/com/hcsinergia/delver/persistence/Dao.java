package com.hcsinergia.delver.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * Implementacion generica de la operaciones 
 * basicas de la capa de persistencia.
 * 
 * @author joaquin
 *
 * @param <T> - Entidad
 */
@Repository
public class Dao<T> {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Persiste la entidad recibida por parametro
	 * 
	 * @param entity
	 */
	public void persist(T entity) {
		entityManager.persist(entity);
	}
	
	/**
	 * Busca una entidad a partir de su clave primaria
	 * 
	 * @param clazz - Class de la entidad a buscar
	 * @param key - Clave primaria de la entidad
	 * @return entidad buscada
	 */
	public T find(Class<T> clazz, Object key) {
		return entityManager.find(clazz, key);
	}
	
	/**
	 * Actualiza en la base de datos una entidad recibida por parametro
	 * 
	 * @param entity - Entidad a actualizar
	 * @return entidad actualizada
	 */
	public T update(T entity) {
		return entityManager.merge(entity);
	}
	
	/** 
	 * @return the {@link EntityManager}
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
