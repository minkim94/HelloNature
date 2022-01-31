package com.hellonature.hellonature_back.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HelloCashApiResponse {

    private Long idx;
    private Long memIdx;
    private Integer point;
    private String dateUsed;
    private String dateVal;
    private Integer type;
    private String title;
    private LocalDateTime regdate;
}
