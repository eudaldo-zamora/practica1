package utm.edu.ec.practica1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.practica1.entity.Sales;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomSalesRepositoryImpl implements CustomSalesRepository{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Sales> findSalesById(UUID id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Sales> query = cb.createQuery(Sales.class);
        Root<Sales> sales = query.from(Sales.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<Double> IdPath = sales.get("id");
        // Path<String> namePath = sales.get("name");
        predicates.add(cb.equal(IdPath, id));
//        predicates.add(cb.like(namePath, "%3"));

        query.select(sales).where(cb.and(predicates
                .toArray(new Predicate[0]))).orderBy((cb.desc(IdPath)));
        return entityManager.createQuery(query).getResultList();
    }
}