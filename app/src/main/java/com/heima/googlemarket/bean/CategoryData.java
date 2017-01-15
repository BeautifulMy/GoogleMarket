package com.heima.googlemarket.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/1/14.
 */

public class CategoryData {

    public List<CategoryList> list;

    public static class CategoryList {
        /**
         * infos : [{"name1":"休闲","name2":"棋牌","name3":"益智","url1":"image/category_game_0.jpg","url2":"image/category_game_1.jpg","url3":"image/category_game_2.jpg"},{"name1":"射击","name2":"体育","name3":"儿童","url1":"image/category_game_3.jpg","url2":"image/category_game_4.jpg","url3":"image/category_game_5.jpg"}]
         * title : 游戏
         */

        public String title;
        public List<InfosItem> infos;

        public static class InfosItem {
            /**
             * name1 : 休闲
             * name2 : 棋牌
             * name3 : 益智
             * url1 : image/category_game_0.jpg
             * url2 : image/category_game_1.jpg
             * url3 : image/category_game_2.jpg
             */

            public String name1;
            public String name2;
            public String name3;
            public String url1;
            public String url2;
            public String url3;
        }
    }
}
