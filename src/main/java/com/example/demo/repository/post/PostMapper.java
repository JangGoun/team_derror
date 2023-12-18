package com.example.demo.repository.post;

import com.example.demo.domain.board.Post;

import java.util.List;

public interface PostMapper {

    int save(Post post);


    Post findById(Long id);

    List<Post> listByRecent(int from, int rows, String category);

    List<Post> listByViewCnt(int from, int rows, String category);

    int countAll(String category);

    int viewCntUpdate(Long id);

    // 특정 id 글 수정 (제목, 내용) (UPDATE)
    int update(Post post);

    // 특정 id 글 삭제하기 (DELETE)
    int delete(Long id);

    // 키워드 검색 수
    int countKeyword(String keyword, String category);

    // 검색 리스트 불러오기
    List<Post> findListByKeyWord(String keyword,int from, int rows, String category);
}