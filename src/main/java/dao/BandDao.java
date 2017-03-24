package dao;

import entity.Band;

import java.util.List;

/**
 * Created by ������� on 12.03.2017.
 */
public interface BandDao {

    Band findById(Integer id);

    List<Band> findAll();

    void save(Band band);

    void delete(Integer id);
}
