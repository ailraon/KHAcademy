package com.kh.reactbackend.YHProject.repository;

import com.kh.reactbackend.YHProject.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserRespositoryImpl implements UserRespository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(User user) {
        em.persist(user);
    }

    @Override
    public User Login(String id, String password) {
        String jpql = "select u from User u where u.id = :id and u.password = :password";
        return em.createQuery(jpql, User.class).setParameter("id", id).setParameter("password", password).getSingleResult();
    }
}
