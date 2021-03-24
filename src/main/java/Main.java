import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.DAO.BrandDAO;
import ru.DAO.DAO;
import ru.DAO.GraphicsCardDAO;
import ru.Model.Brand;
import ru.Model.GraphicsCard;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            MyWindowApp myWindowApp = new MyWindowApp();
            myWindowApp.setVisible(true);
            myWindowApp.pack();
//            DAO<GraphicsCard, Integer> graphicsCardDAO = new GraphicsCardDAO(sessionFactory);
//            GraphicsCard graphicsCard = graphicsCardDAO.read(2);
//            graphicsCardDAO.delete(graphicsCard);
//            DAO<Brand, Integer> brandDAO = new BrandDAO(sessionFactory);
//            Brand brand = brandDAO.read(4);
//            brandDAO.delete(brand);
//            GraphicsCard graphicsCard = new GraphicsCard();
//            graphicsCard.setModel("1060 GTX");
//            graphicsCard.setBrandName(brand);
//            DAO<GraphicsCard, Integer> graphicsCardDAO = new GraphicsCardDAO(sessionFactory);
//            graphicsCardDAO.create(graphicsCard);

//            GraphicsCard graphicsCard = new GraphicsCard();
//            graphicsCard.setName("Nvidia 3070");
//            GraphicsCardDAO graphicsCardDAO = new GraphicsCardDAO(sessionFactory);
//            graphicsCardDAO.create(graphicsCard);
//            Brand[] brand = {new Brand(), new Brand(), new Brand()};
//            brand[0].setBrandName("Asus");
//            brand[1].setBrandName("Aser");
//            brand[2].setBrandName("Gigabyte");
//            Brand brand = new Brand();
//            brand.setBrandName("Asus");
//            brand.setId(32);

//            brandDAO.create(brand);
//            for (Brand result: brand) {
//                brandDAO.create(result);
//            }
        } finally {
            if (sessionFactory!=null) sessionFactory.close();
        }



        //Computer computer = new Computer(graphicsCard);
        //System.out.println(computer.toString());
        //computer.getGraphicsCard().setName("231");
        //graphicsCard.setName("NVidia 1070");
        //System.out.println(computer.toString());
    }

}
