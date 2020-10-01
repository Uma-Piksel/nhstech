package com.tech.nhstest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  Uma Shivalingaiah
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class People {

    private String id;
    private String name;
    private List<Skills> skills = new ArrayList<>();
}