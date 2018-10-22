package com.yn.module.rest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yn.common.msg.ResultResponse;
import com.yn.module.entity.*;
import com.yn.module.service.*;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xw
 * @Description:
 * @Date: 13:03 2018/9/21
 */
@RestController
//@Api(description = "业务", tags = {"业务"})
public class Controller {
    private Logger log = LoggerFactory.getLogger(Controller.class);

    @Value("${spring.Chinese}")
    public String ch;
    @Value("${spring.English}")
    public String en;

    @Autowired
    private AboutEventService aboutEventService;
    @Autowired
    private AboutUsService aboutUsService;
    @Autowired
    private ExhibitTeamService exhibitTeamService;
    @Autowired
    private ConferenceEventsService conferenceEventsService;
    @Autowired
    private ExhibitService exhibitService;
    @Autowired
    private ExhibitorListService exhibitorListService;
    @Autowired
    private CmsArticleService cmsArticleService;
    @Autowired
    private HomeService homeService;
    @Autowired
    private VisiterFaqService visiterFaqService;
    @Autowired
    private VisiterOptionService visiterOptionService;
    @Autowired
    private VisiterRegService visiterRegService;

    //    @ApiOperation(value = "关于事件", notes = "C 切换到中文 E切换到英文")
    @GetMapping("/aboutExent")
    public ResultResponse<AboutEvent> findAboutEvent(/*@ApiParam(value = "中英文识别",required = true, defaultValue = "C") */@RequestParam(value = "language", required = true,defaultValue = "C") String language){
        ResultResponse result = ResultResponse.success(null);
        try {
            AboutEvent aboutEvent = new AboutEvent();
            if ("C".equals(language)){
                aboutEvent.setId(ch);
            }else if ("E".equals(language)){
                aboutEvent.setId(en);
            }
            result = ResultResponse.success(aboutEventService.getAboutEvent(aboutEvent));
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    //    @ApiOperation(value = "关于我们", notes = "C 切换到中文 E切换到英文")
    @GetMapping("/aboutUs")
    public ResultResponse<List<AboutUs>> findAboutUs(/*@ApiParam(value = "中英文识别",required = true, defaultValue = "C") */@RequestParam(value = "language",required = true, defaultValue = "C") String language){
        ResultResponse result = ResultResponse.success(null);
        try {
            AboutUs aboutUs = new AboutUs();
            if ("C".equals(language)) {
                aboutUs.setLan("0");
            } else if ("E".equals(language)) {
                aboutUs.setLan("1");
            }
            result = aboutUsService.getAboutUsList(aboutUs);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/exhibitTeam")
    public ResultResponse<List<ExhibitTeam>> findExhibitTeam(@RequestParam(value = "language",required = true, defaultValue = "C") String language){
        ResultResponse result = ResultResponse.success(new ArrayList<>());
        try {
            ExhibitTeam exhibitTeam = new ExhibitTeam();
            if ("C".equals(language)) {
                exhibitTeam.setLan("0");
            } else if ("E".equals(language)) {
                exhibitTeam.setLan("1");
            }
            result = exhibitTeamService.getExhibitTeamList(exhibitTeam);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    //    @ApiOperation(value = "同期活动", notes = "C 切换到中文 E切换到英文")
    @GetMapping("/conferenceEvents")
    public ResultResponse<List<ConferenceEvents>> findConferenceEventsList(/*@ApiParam(value = "中英文识别",required = true, defaultValue = "C")*/
                                                                           @RequestParam(value = "language",required = true, defaultValue = "C") String language,
                                                                           @RequestParam(value = "pageNum", defaultValue = "1", required = true) Integer pageNum,                                                                               @RequestParam(value = "pageSize", defaultValue = "8", required = true) Integer pageSize
    ){
        ResultResponse result = ResultResponse.success(new ArrayList<>());
        try {
            PageHelper.startPage(pageNum, pageSize);
            ConferenceEvents conferenceEvents = new ConferenceEvents();
            if ("C".equals(language)) {
                conferenceEvents.setLan("0");
            } else if ("E".equals(language)) {
                conferenceEvents.setLan("1");
            }
            result = ResultResponse.successList(new PageInfo<ConferenceEvents>(conferenceEventsService.getConferenceEventsList(conferenceEvents)), conferenceEventsService.getConferenceEventsCount(conferenceEvents));
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/conferenceEventsById")
    public ResultResponse<ConferenceEvents> findConferenceEvents(@RequestParam(value = "id",required = true) String id ){
        ResultResponse result = ResultResponse.success(null);
        try {
            ConferenceEvents conferenceEvents = new ConferenceEvents();
            conferenceEvents.setId(id);
            result = ResultResponse.success(conferenceEventsService.getConferenceEvents(conferenceEvents));
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    //    @ApiOperation(value = "为何参展", notes = "C 切换到中文 E切换到英文")
    @GetMapping("/exhibitWhy")
    public ResultResponse<ExhibitWhy> findExhibitWhy(/*@ApiParam(value = "中英文识别",required = true, defaultValue = "C") */@RequestParam(value = "language",required = true, defaultValue = "C") String language){
        ResultResponse result = ResultResponse.success(null);
        try {
            ExhibitWhy exhibitWhy = new ExhibitWhy();
            if ("C".equals(language)){
                exhibitWhy.setId("cn1");
            }else if ("E".equals(language)){
                exhibitWhy.setId("en1");
            }
            result = exhibitService.getExhibitWhy(exhibitWhy);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    //    @ApiOperation(value = "展位图", notes = "C 切换到中文 E切换到英文")
    @GetMapping("/exhibitorFloorplan")
    public ResultResponse<ExhibitorFloorplan> findExhibitorFloorplan(/*@ApiParam(value = "中英文识别",required = true, defaultValue = "C") */@RequestParam(value = "language",required = true, defaultValue = "C") String language){
        ResultResponse result = ResultResponse.success(null);
        try {
            ExhibitorFloorplan exhibitorFloorplan = new ExhibitorFloorplan();
            if ("C".equals(language)){
                exhibitorFloorplan.setLan("0");
            }else if ("E".equals(language)){
                exhibitorFloorplan.setLan("1");
            }
            result = exhibitService.getExhibitorFloorplan(exhibitorFloorplan);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    //    @ApiOperation(value = "展商名单", notes = "C 切换到中文 E切换到英文")
    @GetMapping("/exhibitorList")
    public ResultResponse<List<ExhibitorList>> findExhibitorList(/*@ApiParam(value = "中英文识别",required = true, defaultValue = "C") */
                                                                 @RequestParam(value = "language",required = true, defaultValue = "C") String language,
                                                                 @RequestParam(value = "title",required = false) String title,
                                                                 @RequestParam(value = "pageNum", defaultValue = "1", required = true) Integer pageNum,
                                                                 @RequestParam(value = "pageSize", defaultValue = "8", required = true) Integer pageSize){
        ResultResponse result = ResultResponse.success(new ArrayList<>());
        try {
            ExhibitorList exhibitorList = new ExhibitorList();
            exhibitorList.setTitle(title);
            PageHelper.startPage(pageNum, pageSize);
            if ("C".equals(language)){
                exhibitorList.setLan("0");
            }else if ("E".equals(language)){
                exhibitorList.setLan("1");
            }
            result = ResultResponse.successList(new PageInfo<ExhibitorList>(exhibitorListService.getExhibitorList(exhibitorList)), exhibitorListService.getExhibitorListCount(exhibitorList));
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    //    @ApiOperation(value = "展会特色", notes = "C 切换到中文 E切换到英文")
    @GetMapping("/highLight")
    public ResultResponse<List<CmsArticle>> findCmsArticleList(/*@ApiParam(value = "中英文识别",required = true, defaultValue = "C") */@RequestParam(value = "language",required = true, defaultValue = "C") String language){
        ResultResponse result = ResultResponse.success(new ArrayList<>());
        try {
            CmsArticle cmsArticle = new CmsArticle();
            if ("C".equals(language)){
                cmsArticle.setCategoryId("4");
            }else if ("E".equals(language)){
                cmsArticle.setCategoryId("5");
            }
            result = cmsArticleService.getCmsArticleList(cmsArticle);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/cmsArticleData")
    public ResultResponse<CmsArticleData> findCmsArticleData(@RequestParam(value = "id",required = true) String id){
        ResultResponse result = ResultResponse.success(new ArrayList<>());
        try {
            CmsArticleData cmsArticleData = new CmsArticleData();
            cmsArticleData.setId(id);
            CmsArticleData cmsArticleDataResult = cmsArticleService.getCmsArticleData(cmsArticleData);
            result.setData(cmsArticleDataResult);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/homeLogo")
    public ResultResponse<HomeLogo> findHomeLogo(@RequestParam(value = "language",required = true, defaultValue = "C") String language) {
        ResultResponse result = ResultResponse.success(null);
        try {
            HomeLogo homeLogo = new HomeLogo();
            if ("C".equals(language)) {
                homeLogo.setId("cn1");
            } else if ("E".equals(language)) {
                homeLogo.setId("en1");
            }
            result = homeService.getHomeLog(homeLogo);
        } catch (Exception e) {
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/homeFocusImage")
    public ResultResponse<FocusImage> findFocusImage(@RequestParam(value = "language",required = true, defaultValue = "C") String language) {
        ResultResponse result = ResultResponse.success(null);
        try {
            result = homeService.getFocusImage(language);
        } catch (Exception e) {
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/homeShow")
    public ResultResponse<List<HomeShow>> findHomeShowList(/*@ApiParam(value = "中英文识别",required = true, defaultValue = "C") */@RequestParam(value = "language",required = true, defaultValue = "C") String language) {
        ResultResponse result = ResultResponse.success(null);
        try {
            HomeShow homeShow = new HomeShow();
            if ("C".equals(language)) {
                homeShow.setLan("0");
            } else if ("E".equals(language)) {
                homeShow.setLan("1");
            }
            result = homeService.getHomeShowList(homeShow);
        } catch (Exception e) {
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/homeLogoEWM")
    public ResultResponse<HomeLogo> findHomeLogoEWM(@RequestParam(value = "language",required = true, defaultValue = "C") String language) {
        ResultResponse result = ResultResponse.success(null);
        try {
            HomeLogo homeLogo = new HomeLogo();
            if ("C".equals(language)) {
                homeLogo.setId("ewmcn");
            } else if ("E".equals(language)) {
                homeLogo.setId("ewmen");
            }
            result = homeService.getHomeLog(homeLogo);
        } catch (Exception e) {
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    //    @ApiOperation(value = "参观常见问题", notes = "C 切换到中文 E切换到英文")
    @GetMapping("/vistorFAQ")
    public ResultResponse findVisterFaqList(/*@ApiParam(value = "中英文识别",required = true, defaultValue = "C") */
                                            @RequestParam(value = "language",required = true, defaultValue = "C") String language){
        ResultResponse result = ResultResponse.success(null);
        try {
            VisiterFaq visiterFaq = new VisiterFaq();
            if ("C".equals(language)){
                visiterFaq.setLan("0");
            }else if ("E".equals(language)){
                visiterFaq.setLan("1");
            }
            result = visiterFaqService.getVisiterFaqList(visiterFaq);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/visiterOption")
    public ResultResponse findVisiterOptionList(@RequestParam(value = "language",required = true, defaultValue = "C") String language){
        if ("C".equals(language)){
            language = "0";
        }else if ("E".equals(language)){
            language = "1";
        }
        ResultResponse result = ResultResponse.success(new ArrayList<>());
        try {
            result = visiterOptionService.getVisiterOptionList(language);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/timeLocation")
    public ResultResponse<TimeLocation> findTimeLocation(@RequestParam(value = "language",required = true, defaultValue = "C") String language){
        ResultResponse result = ResultResponse.success(null);
        try {
            ExhibitWhy whenWhere = new ExhibitWhy();
            ExhibitWhy travel = new ExhibitWhy();
            if ("C".equals(language)){
                whenWhere.setId("when0");
                travel.setId("travel0");
            }else if ("E".equals(language)){
                whenWhere.setId("when1");
                travel.setId("travel1");
            }
            result = exhibitService.getTimeLocation(whenWhere, travel);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @PostMapping("/regiest")
    public ResultResponse<VisiterReg> insertVisiterReg(@RequestBody(required =  true) VisiterReg visiterReg){
        ResultResponse result = ResultResponse.success(null);
        try {
            result = visiterRegService.insertVisiterReg(visiterReg);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }

    @GetMapping("/visiterReg")
    public ResultResponse<VisiterReg> findVisiterReg(@RequestParam("id") String id){
        ResultResponse result = ResultResponse.success(null);
        try {
            VisiterReg visiterReg = new VisiterReg();
            visiterReg.setId(id);
            result = visiterRegService.select(visiterReg);
        }catch (Exception e){
            result = ResultResponse.fail(e.getMessage());
            log.error(e.getStackTrace().toString());
        }
        return result;
    }
}
