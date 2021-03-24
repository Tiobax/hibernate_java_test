package ru.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Computer {
    private int id;
    private int name;
    private GraphicsCard graphicsCard;
}
