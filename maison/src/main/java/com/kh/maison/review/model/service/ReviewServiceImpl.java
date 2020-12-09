package com.kh.maison.review.model.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.maison.review.model.dao.ReviewDao;
import com.kh.maison.review.model.vo.Review;
import com.kh.maison.review.model.vo.ReviewReply;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDao dao;
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public int insertReview(Review r) {
		// TODO Auto-generated method stub
		return dao.insertReview(session,r);
	}

	@Override
	public List<Review> selectReviewList(int productNo) {
		// TODO Auto-generated method stub
		return dao.selectReviewList(session,productNo);
	}

	@Override
	public int insertReviewReply(Map param) {
		// TODO Auto-generated method stub
		return dao.insertReviewReply(session,param);
	}

	@Override
	public List<ReviewReply> selectReviewReplyList(int reviewNo) {
		// TODO Auto-generated method stub
		return dao.selectReviewReplyList(session,reviewNo);
	}

	
}
