package com.caoyi.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.caoyi.gulimall.product.entity.BrandEntity;
import com.caoyi.gulimall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
     public void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("小米");
//////        brandEntity.setDescript("好品质");
//////        brandEntity.setName("华为");
//////        brandService.save(brandEntity);
//////        log.info("保存成功");
//        brandService.updateById(brandEntity);
        List<BrandEntity> brand_id =
                brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_id.forEach((item)->{

            log.info(""+item);
        });
    }

}
