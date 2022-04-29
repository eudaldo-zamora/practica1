package utm.edu.ec.practica1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.practica1.entity.Sales;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class CustomSalesRepositoryImpl implements CustomSalesRepository{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Sales> findSalesByFecha(Date fecha) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Sales> query = cb.createQuery(Sales.class);
        Root<Sales> sales = query.from(Sales.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<Double> FechaPath = sales.get("fecha");
        // Path<String> namePath = sales.get("name");
        predicates.add(cb.equal(FechaPath, fecha));
//        predicates.add(cb.like(namePath, "%3"));

        query.select(sales).where(cb.and(predicates
                .toArray(new Predicate[0]))).orderBy((cb.desc(FechaPath)));
        return entityManager.createQuery(query).getResultList();
    }
}