package com.yorkehan.backstage.controller.Home;

import com.yorkehan.backstage.entity.custom.*;
import com.yorkehan.backstage.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 用户的controller
 * Created by 言曌 on 2017/8/24.
 */
@RestController
public class IndexController {
	
	@Autowired
	private ArticleService articleService;

	@Autowired
	private LinkService linkService;

	@Autowired
	private NoticeService noticeService;
	

	
	//首页显示
	@RequestMapping("/")
	public List<ArticleListVo> IndexView() throws Exception {

		//文章列表
		int pageSize = 10;
		List<ArticleListVo> articleListVoList = articleService.listArticleByPage(1,null,pageSize);

		return articleListVoList;
	}
	@RequestMapping("/test")
	public List<ArticleListVo> IndexView1() throws Exception {
		int pageSize = 10;
		List<ArticleListVo> articleListVoList = articleService.listArticleByPage(1,null,pageSize);
		return articleListVoList;
	}
	
	//文章分页显示
	@RequestMapping("p/{pageNow}")
	//适合RESTful
	public List<ArticleListVo> ArticleListByPageView(@PathVariable("pageNow") Integer pageNow) throws Exception{
		//设置每页显示的数量
		int pageSize = 10;
		List<ArticleListVo> articleListVoList = articleService.listArticleByPage(1,pageNow,pageSize);
		return articleListVoList;
	}

}




