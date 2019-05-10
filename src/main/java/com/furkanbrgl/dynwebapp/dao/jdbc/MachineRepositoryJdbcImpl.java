package com.furkanbrgl.dynwebapp.dao.jdbc;

import com.furkanbrgl.dynwebapp.dao.MachineRepository;
import com.furkanbrgl.dynwebapp.model.Machine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("machineRepositoryJDBC")
public class MachineRepositoryJdbcImpl implements MachineRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Machine findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Machine> findByOwnerId(Long ownerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void create(Machine machine) {
        // TODO Auto-generated method stub

    }

    @Override
    public Machine update(Machine machine) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteByOwnerId(Long ownerId) {
        String sql = "delete from t_machine where owner_id = ?";
        jdbcTemplate.update(sql,ownerId);
    }

}