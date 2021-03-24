package ru.DAO;

import ru.Model.GraphicsCard;
import lombok.NonNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GraphicsCardDAO implements DAO<GraphicsCard, Integer>{
    private final SessionFactory sessionFactory;

    public GraphicsCardDAO(@NonNull SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(@NonNull final GraphicsCard graphicsCard) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(graphicsCard);
            session.getTransaction().commit();
        }
    }

    @Override
    public GraphicsCard read(@NonNull final Integer key) {
        try (final Session session = sessionFactory.openSession()){
            session.beginTransaction();
            GraphicsCard graphicsCard = session.get(GraphicsCard.class, key);
            return graphicsCard != null ? graphicsCard : new GraphicsCard();
        }
    }

    @Override
    public void update(@NonNull final GraphicsCard graphicsCard) {

    }

    @Override
    public void delete(@NonNull final GraphicsCard graphicsCard) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(graphicsCard);
            session.getTransaction().commit();
        }
    }
}
