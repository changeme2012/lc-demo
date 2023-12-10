package com.lc.demo.sqlitedemo;

import com.lc.demo.sqlitedemo.entity.StudentCourseDTO;
import com.lc.demo.sqlitedemo.mapper.StudentCourseMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest()
class SqliteDemoApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    static final Logger log = LoggerFactory.getLogger(SqliteDemoApplicationTests.class);

    @Test
    void contextLoads() {
/*        // 1、首先创建数据表
        String ddl = "CREATE TABLE `user` (" +
                "    id INTEGER PRIMARY KEY NOT NULL," +
                "    name TEXT," +
                "    create_at TEXT" +
                ");";

        this.jdbcTemplate.execute(ddl);

        // 2、插入一条数据
        int ret = this.jdbcTemplate.update("INSERT INTO `user` (`id`, `name`, `create_at`) VALUES (?, ?, ?);", new Object[] {1, "springdoc", LocalDateTime.now()});

        log.info("插入数据：{}", ret);*/

        // 3、检索一条数据
        List<Tag> tags = this.jdbcTemplate.query("SELECT * FROM tag_info", new TagRowMapper());

        tags.forEach(System.out::println);
    }

   static class Tag {
        private int addres_start;
        private String name;
        private List<Integer> address;

       public int getAddres_start() {
           return addres_start;
       }

       public void setAddres_start(int addres_start) {
           this.addres_start = addres_start;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public List<Integer> getAddress() {
           return address;
       }

       public void setAddress(List<Integer> address) {
           this.address = address;
       }

       @Override
       public String toString() {
           return "Tag{" +
                   "addres_start=" + addres_start +
                   ", name='" + name + '\'' +
                   ", address=" + address +
                   '}';
       }
   }

    class TagRowMapper implements RowMapper<Tag> {

        @Override
        public Tag mapRow(ResultSet rs, int rowNum) throws SQLException {
            Tag tag = new Tag();
            tag.setAddres_start(rs.getInt("addres_start"));
            tag.setName(rs.getString("name"));

            String addressStr = rs.getString("address");
            List<Integer> addressList = Arrays.stream(addressStr.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            tag.setAddress(addressList);
            return tag;
        }
    }

    @Autowired
    StudentCourseMapper studentCourseMapper;

    @Test
    void join() {
        List<StudentCourseDTO> studentCourseDetails = studentCourseMapper.getStudentCourseDetails(1l);
        studentCourseDetails.forEach(System.out::println);
    }
}
