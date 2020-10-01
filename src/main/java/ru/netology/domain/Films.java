package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Films {
    private int id;
    private int filmId;
    private String filmName;
    private int filmPrice;
    private int count;
}
