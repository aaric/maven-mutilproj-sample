package com.example.demo.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * IdName
 *
 * @author Aaric, created on 2022-07-14T16:11.
 * @version 0.1.0-SNAPSHOT
 */
@Data
@Accessors(chain = true)
public class IdName {

    private String id;
    private String name;
}
