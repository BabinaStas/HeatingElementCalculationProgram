package by.calculate.heatingelementcalculationprogram.dao;

import java.util.List;

    public interface DefaultRepository<T> {

         List<T> getAll();

        T getOneById(T entity);

        void updateById(Integer id, T entity);

        void deleteById(Integer id);

        void insertOne(T entity);
}
