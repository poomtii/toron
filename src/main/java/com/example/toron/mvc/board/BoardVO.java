package com.example.toron.mvc.board;

import lombok.Data;

@Data
public class BoardVO {
    private String board_code;
    private String board_no;
    private String board_title;
    private String board_contents;
    private String board_image;
    private String user_nickname;
    private String create_date;
    private String update_date;
    private String coment_count;
    private String category_code;
    private String category_name;
    private int view_cnt;
}
