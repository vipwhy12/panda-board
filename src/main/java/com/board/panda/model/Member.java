package com.board.panda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Member {
    private String id;
    private String email;
    private String name;
    private String password;
}
