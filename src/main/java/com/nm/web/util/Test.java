package com.nm.web.util;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年07月04日上午9:57] 创建方法 by hw
 */
public class Test {
    public static void main(String []args){
        try{
            throw new RuntimeException("错误");
        }catch (Exception e){
            e.getCause();
            e.printStackTrace();
        }
    }
}
