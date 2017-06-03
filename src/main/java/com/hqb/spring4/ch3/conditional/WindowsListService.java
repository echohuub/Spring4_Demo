package com.hqb.spring4.ch3.conditional;

/**
 * Created by heqingbao on 2017/6/3.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
