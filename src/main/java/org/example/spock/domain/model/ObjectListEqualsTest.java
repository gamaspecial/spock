package org.example.spock.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor(staticName = "of")
public class ObjectListEqualsTest {
    // H: 体力
    private int hp;
    // A: 攻撃
    private int attack;
    // B: 防御
    private int defence;
    // C: 特殊攻撃
    private int specialAttack;
    // D: 特殊防御
    private int specialDefence;
    // S: 素早さ
    private int speed;
    //
    private List<ObjectEqualsTest> list;
}
