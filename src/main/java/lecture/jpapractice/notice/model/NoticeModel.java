package lecture.jpapractice.notice.controller;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NoticeModel {

    // ID, 제목, 내용, 등록일(작성일)

    private int id;
    private int title;
    private int contents;
    private LocalDateTime regDate;
}
