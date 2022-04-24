package utm.edu.ec.practica1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.practica1.entity.Provider;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class CustomProviderRepositoryImpl implements CustomProviderRepository{
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Provider> findProviderByValue(String ruc) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Provider> query = cb.createQuery(Provider.class);
		Root<Provider> provider = query.from(Provider.class);
		List<Predicate> predicates = new ArrayList<>();

		Path<String> rucPath = provider.get("ruc");
		//Path<String> namePath = provider.get("name");
		predicates.add(cb.equal(rucPath, ruc));
//        predicates.add(cb.like(namePath, "%3"));

		query.select(provider).where(cb.and(predicates
				.toArray(new Predicate[0]))).orderBy((cb.desc(rucPath)));
		return entityManager.createQuery(query).getResultList();
	}
}
