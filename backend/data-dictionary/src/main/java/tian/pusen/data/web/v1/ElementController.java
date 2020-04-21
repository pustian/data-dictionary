package tian.pusen.data.web.v1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import tian.pusen.data.service.IElementService;

/**
 * <p>
 * 数据项 前端控制器
 * </p>
 *
 * @author 田圃森
 * @since 2020-04-06
 */
@RestController
public class ElementController {
    @Autowired
    IElementService elementService;
}

