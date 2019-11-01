package com.hshc.ldg.heenoor.study.util;


import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zp
 * @Description:
 * @date 2018/10/8 下午3:16
 */
public class ListUtils {

    /**
     * @Description:  将list等分成n份
     * @Param:  num分成几个list
     * @return:
     * @Author: zp
     * @Date: 2018/10/10 下午2:29
     */
    public static <T> Map<Integer, List<T>> spiltList(List<T> list, int num) {
        Map<Integer,List<T>>  map = new HashMap<>(num) ;
        int length =list.size()/num ;

        for(int i = 0;i < num;i++){
            List<T> subList ;
            if(i != num-1){
             subList = list.subList(i*length,i*length+length);
            }else {
                subList=list.subList(i*length,list.size());
            }

            map.put(i,subList);

        }
        return map;
    }
   /**
    * @Description: 将List 分成n个长度由调用者指定的子List
    * @Param:  size子list长度
    * @return:
    * @Author: zp
    * @Date: 2018/10/10 下午2:37
    */
    public static <T> List<List<T>>  partitionList(List<T> list,int size){

        return  Lists.partition(list,size);
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
       List<List<Integer>> lists = Lists.partition(list,5);

        System.out.println(lists);
        //[[1, 2, 3, 4, 5], [6, 7, 8]]
    }

}