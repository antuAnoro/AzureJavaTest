package xpadro.spring.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xpadro.spring.web.model.Series;
import xpadro.spring.web.repositories.SeriesRepository;
import xpadro.spring.web.service.SeriesService;

/**
 * Handles data using a mongoDB database
 * @author xpadro
 *
 */
@Service
public class SeriesServiceImpl implements SeriesService {
	
	@Autowired
	private SeriesRepository repository;
	//private MongoOperations mongoOps;
	
	
	@Override
	public Series[] getAllSeries() {
		List<Series> seriesList = repository.findAll();
		return seriesList.toArray(new Series[0]);
	}

	@Override
	public Series getSeries(String id) {
		return repository.findOne(id);
	}

	@Override
	public void insertSeries(Series series) {
		repository.save(series);
	}

	
	@Override
	public void deleteSeries(String id) {
		repository.delete(id);
	}
}
