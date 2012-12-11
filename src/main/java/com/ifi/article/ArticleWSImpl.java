package com.ifi.article;

import java.util.List;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.ifi.bo.Article;

/**
 * @question 1.4 implémentation du web service banquaire
 * 
 */
@Service
@WebService(name = "ArticleWebService", serviceName = "ArticleWebService", portName = "ArticleWebServicePort")
public class ArticleWSImpl implements ArticleWS {

	@Override
	public void publierArticle(Article a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Article> listerArticle() {
		// TODO Auto-generated method stub
		return null;
	}


}
