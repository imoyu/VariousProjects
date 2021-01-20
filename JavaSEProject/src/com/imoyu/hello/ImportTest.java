package com.imoyu.hello;

import com.google.common.collect.Lists;
import com.google.gson.Gson;

import java.util.ArrayList;

public class ImportTest {

    public static void main(String[] args) {

        ArrayList<Object> list = Lists.newArrayList();

        Gson gson = new Gson();

        System.out.println(list.getClass().getSimpleName());
        System.out.println(gson.getClass().getSimpleName());
    }

}
