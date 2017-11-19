package xpadro.spring.web.repositories;

import org.springframework.stereotype.Repository;

import com.microsoft.azure.spring.data.documentdb.repository.DocumentDbRepository;
import xpadro.spring.web.model.Series;

@Repository
public interface SeriesRepository extends DocumentDbRepository<Series, String> {

}
