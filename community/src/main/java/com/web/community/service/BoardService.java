package com.web.community.service;

import com.web.community.domain.Board;
import com.web.community.repository.BoardRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    public Page<Board> findBoardList(Pageable pageable){
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1, pageable.getPageSize());
        return boardRepository.findAll(pageable);
    }

    public Board findBoardByIdx(long idx){
        return boardRepository.findById(idx).orElse(new Board());
    }

}