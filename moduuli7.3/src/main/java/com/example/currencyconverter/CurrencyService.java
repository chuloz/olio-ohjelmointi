package com.example.currencyconverter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class CurrencyService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("currencyPU");

    public Currency getCurrency(String code) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Currency.class, code);
        } finally {
            em.close();
        }
    }

    public void saveCurrency(Currency currency) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
        em.close();
    }

    public List<Currency> getAllCurrencies() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT c FROM Currency c", Currency.class).getResultList();
        } finally {
            em.close();
        }
    }
}
