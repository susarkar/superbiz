package com.ss.api.service;

public interface Service<T> {
	T create(T t);
	T remove(T t);
	T update(T t);
	void delete(T t);
	void deleteAll();
}
