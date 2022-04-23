package utm.edu.ec.practica1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import utm.edu.ec.practica1.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class CustomProductRepositoryImpl implements CustomProductRepository{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Product> findProductByValue(Double value) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Product> query = cb.createQuery(Product.class);
        Root<Product> product = query.from(Product.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<Double> valuePath = product.get("value");
        Path<String> namePath = product.get("name");
        predicates.add(cb.equal(valuePath, value));
//        predicates.add(cb.like(namePath, "%3"));

        query.select(product).where(cb.and(predicates
                .toArray(new Predicate[0]))).orderBy((cb.desc(valuePath)));
        return entityManager.createQuery(query).getResultList();
    }
}
