package com.example.demo.api.controller;

import com.example.demo.api.TestApi;
import com.example.demo.pojo.IdName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * TestController
 *
 * @author Aaric, created on 2022-07-14T15:28.
 * @version 0.1.0-SNAPSHOT
 */
@RestController
@RequestMapping("/api/v1/test")
public class TestController implements TestApi {

    @GetMapping("/base64/{opr}/{str}")
    @Override
    public String base64Get(@PathVariable int opr, @PathVariable String str) {
        if (0 == opr) {
            return Base64.getEncoder().encodeToString(str.getBytes());
        } else {
            return new String(Base64.getDecoder().decode(str.getBytes()));
        }
    }

    @GetMapping("/pojo/{count}")
    @Override
    public List<IdName> pojoGet(@PathVariable int count) {
        int index;
        List<IdName> idNameList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            index = i + 1;
            idNameList.add(new IdName().setId("id-" + index).setName("name-" + index));
        }
        return idNameList;
    }
}
