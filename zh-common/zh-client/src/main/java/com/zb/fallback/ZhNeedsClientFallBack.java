package com.zb.fallback;

import com.zb.pojo.ZhNeeds;

import com.zb.client.RestZhNeedsClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Component
public class ZhNeedsClientFallBack implements RestZhNeedsClient {


    @Override
    public ZhNeeds getZhNeedsById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<ZhNeeds>	getZhNeedsListByMap(Map<String,Object> param)throws Exception{
        List<ZhNeeds> list=new ArrayList<ZhNeeds>();
        ZhNeeds zhNeeds=new ZhNeeds();
        zhNeeds.setGoodsBrand("qwer");
        zhNeeds.setGoodsModel("ssss");
        zhNeeds.setGoodsName("sda");
        zhNeeds.setGoodsPrice(1.2);
        zhNeeds.setGoodsYear(null);
        zhNeeds.setId(1);
        zhNeeds.setUserId(3);
        zhNeeds.setIssuedType(1);
        list.add(zhNeeds);
        return list;
    }

    @Override
    public Integer getZhNeedsCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddZhNeeds(ZhNeeds zhNeeds)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyZhNeeds(ZhNeeds zhNeeds)throws Exception{
        return null;
    }

//    @Override
//    public List<ZhNeeds> getZhNeedsPage(Map<String, Object> param) throws Exception {
//        List<ZhNeeds> list=new ArrayList<ZhNeeds>();
//        ZhNeeds zhNeeds=new ZhNeeds();
//        zhNeeds.setGoodsBrand("qwer");
//        zhNeeds.setGoodsModel("ssss");
//        zhNeeds.setGoodsName("sda");
//        zhNeeds.setGoodsPrice(1.2);
//        zhNeeds.setGoodsYear(null);
//        zhNeeds.setId(1);
//        zhNeeds.setUserId(3);
//        zhNeeds.setIssuedType(1);
//        list.add(zhNeeds);
//        return list;
//    }
}
