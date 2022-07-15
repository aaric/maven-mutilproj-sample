package com.example.demo.api;

import com.example.demo.pojo.IdName;

import java.util.List;

/**
 * TestApi
 *
 * @author Aaric, created on 2022-07-14T15:24.
 * @version 0.1.0-SNAPSHOT
 */
public interface TestApi {

    String base64Get(int opr, String str);

    List<IdName> pojoGet(int count);
}
