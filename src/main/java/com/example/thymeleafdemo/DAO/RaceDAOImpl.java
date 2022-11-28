package com.example.thymeleafdemo.DAO;

import com.example.thymeleafdemo.Model.Race;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RaceDAOImpl implements RaceDAO {


    private final JdbcTemplate jdbcTemplate;

    public RaceDAOImpl(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }



    @Override
    public List<Race> getRace() {



        List<Race> list = jdbcTemplate.query("SELECT * FROM race ", new RowMapper<Race>() {

            @Override
            public Race mapRow(ResultSet rs, int rowNum) throws SQLException {
                Race r = new Race();

                r.setId(rs.getInt("id"));
                r.setName(rs.getString("name"));
                r.setYear(rs.getString("year"));
                r.setTrack_id(rs.getInt("track_id"));
                r.setDate(rs.getString("date"));
                String time = rs.getString("deadline");
                r.setDeadline(time.substring(0,5));
                r.setDistance(rs.getDouble("distance"));
                r.setFinish_time(rs.getDouble("finish_time"));



                return r;
            }

        });
        System.out.println("Successfully pulled from races.");
        return list;
    }




}
