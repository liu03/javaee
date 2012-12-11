package com.ifi.article;

import java.util.List;

import javax.jws.WebService;

import com.ifi.article.dao.Article;

/**
 * @question 1.4 Interface du web service banquaire
 */
@WebService
public interface ArticleWS {

	public void publierArticle(Article a);

	public List<Article> listerArticle();

}
