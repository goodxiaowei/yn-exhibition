package com.yn.common.utils;

/**
 * Created by xiaow on 2018/10/17.
 */
public class TitleUtils {

    public static String getTitle(String requestUri){
        String title = "";
        switch (requestUri){
            case "/aboutExent":
                title = "关于事件";
                break;
            case "/aboutUs":
                title = "关于我们";
                break;
            case "/exhibitTeam":
                title = "我们的团队";
                break;
            case "/conferenceEvents":
                title = "同期活动";
                break;
            case "/exhibitWhy":
                title = "为何参展";
                break;
            case "/exhibitorFloorplan":
                title = "展位图";
                break;
            case "/exhibitorList":
                title = "展商名单";
                break;
            case "/highLight":
                title = "展会特色";
                break;
            case "/cmsArticleData":
                title = "展会特色READ ME";
                break;
            case "/homeLogo":
                title = "首页 -homeLogo";
                break;
            case "/homeFocusImage":
                title = "首页-焦点图";
                break;
            case "/homeShow":
                title = "首页-homeShow";
                break;
            case "/homeLogoEWM":
                title = "首页-二维码";
                break;
            case "/vistorFAQ":
                title = "参观常见问题";
                break;
            case "/visiterOption":
                title = "注册页面选项";
                break;
            case "/timeLocation":
                title = "旅行计划";
                break;
            case "/regiest":
                title = "参观注册";
                break;
        }
        return title;
    }
}
