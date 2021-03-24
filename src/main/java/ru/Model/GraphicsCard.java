package ru.Model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class GraphicsCard {
    private int id;
    private String model;
    Brand brandName;
}
