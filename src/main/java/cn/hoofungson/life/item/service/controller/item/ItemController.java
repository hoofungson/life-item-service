/**
 * @Project Name:life-item-service
 * @Package Name:cn.hoofungson.life.item.service.controller.item
 * @Since JDK 1.8
 */
package cn.hoofungson.life.item.service.controller.item;

import cn.hoofungson.life.item.service.domain.item.ItemVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Description: 流水项控制器
 * @Author 胡松 hoofungson@163.com
 * @Date 2019-07-22 16:40
 * @Version V1.0
 */
@Slf4j
@RequestMapping(value = "/life/service/item")
@RestController
public class ItemController {

    /**
     * 获取流水项
     **/
    @GetMapping
    public HttpEntity<List<ItemVO>> getList() {
        List<ItemVO> itemVOList = new ArrayList<>();
        itemVOList.add(new ItemVO(1L, "流水项一", new BigDecimal("12.89"), new Date(), new Date()));
        return new HttpEntity<>(itemVOList);
    }
}
