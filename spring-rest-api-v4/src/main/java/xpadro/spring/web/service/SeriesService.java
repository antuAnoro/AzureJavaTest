package xpadro.spring.web.service;

import xpadro.spring.web.model.Series;

/**
 * Manages data from series
 * @author xpadro
 *
 */
public interface SeriesService {
	
	/**
	 * Returns all series
	 * @return
	 */
	Series[] getAllSeries();
	
	/**
	 * Returns the series identified by the id
	 * @param id
	 * @return the series
	 */
	Series getSeries(String id);
	
	/**
	 * Inserts a series into the DB
	 * @param series
	 */
	void insertSeries(Series series);
	
	/**
	 * Deletes the specified series
	 * @param id
	 */
	void deleteSeries(String id);
}
