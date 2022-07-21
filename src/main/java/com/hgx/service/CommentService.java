package com.hgx.service;

import com.hgx.po.Comment;

import java.util.List;



public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
