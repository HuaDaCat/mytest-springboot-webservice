package com.example.demo.controller;

import com.example.demo.entity.GetEntity;
import com.example.demo.entity.PostEntity;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Api(value = "类别信息",tags={"类别接口-华宇航的测试"})
@RestController
@RequestMapping("/hello")
public class EntityController {
    private static final String Template1 = "received %s";
    private static final String Template2 = "%s speak to %s \'%s\'";
    private final AtomicLong counter = new AtomicLong();//AtomicLong相当于加锁的Long

    /**
     *Get请求，返回json
     */
    @RequestMapping(value = "/getter/pattern1", method = RequestMethod.GET)
    public GetEntity httpGet(@RequestParam(value = "content", required = false) String
                                     alias) {
        return new GetEntity(counter.incrementAndGet(), String.format(Template1, alias));

    }

    /**
     *Post请求，提交json
     */
     //运行后访问http://localhost:8080/hello/getter/pattern1?content=hello
    @RequestMapping(value = "setter/pattern2", method = RequestMethod.POST)
    public GetEntity postHttp(@RequestBody PostEntity postEntity) {
        return new GetEntity(counter.incrementAndGet(), String.format(Template2, postEntity.getFrom(), postEntity.getTo(), postEntity.getContent()));
    }

    //curl -i -H "Content-Type:application/json" -d "{\"from\":\"Tom\",\"to\":\"Sandy\",\"content\":\"hello buddy\"}"http://localhost:8080/hello/setter/pattern2
}
