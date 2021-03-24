package ru.DAO;

import lombok.NonNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.Model.Brand;

public class BrandDAO implements DAO<Brand, Integer> {
    private final SessionFactory sessionFactory;

    public BrandDAO(@NonNull SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(@NonNull final Brand brand) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(brand);
            session.getTransaction().commit();
        }
    }

    @Override
    public Brand read(@NonNull Integer key) {
        try (Session session = sessionFactory.openSession()) {
            final Brand result = session.get(Brand.class, key);
            return result != null ? result : new Brand();
        }
    }

    @Override
    public void update(@NonNull Brand brand) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(brand);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(@NonNull Brand brand) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(brand);
            session.getTransaction().commit();
        }
    }
}
