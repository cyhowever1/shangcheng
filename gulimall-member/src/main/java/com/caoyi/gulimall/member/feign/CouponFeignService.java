package com.caoyi.gulimall.member.feign;

import com.caoyi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author:cy
 * Date:2020/6/11 13:46
 */
@FeignClient(value ="gulimall-coupon" )
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
