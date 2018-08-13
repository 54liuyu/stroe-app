package cn.ly.store;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyu685
 * @since 2018/8/13
 */
@RestController
@RequestMapping("/store")
public class StroeController {

  @RequestMapping("/{stroeId}")
  public String getStoreName(@PathVariable("stroeId") Long storeId) {
    if (storeId == 1) {
      return "iphone X";
    } else if (storeId == 2) {
      return "美的空调";
    } else {
      return "京东商城";
    }
  }
}
