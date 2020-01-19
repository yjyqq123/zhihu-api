package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {
    @Resource
    private RoundTableMapper roundTableMapper;
    @Test
    void selectRecent() {
        List<Map> roundTables =roundTableMapper.selectAll();
                roundTables.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<RoundTable> roundTables = roundTableMapper.selectRecent();
        roundTables.forEach(System.out::println);
    }
}