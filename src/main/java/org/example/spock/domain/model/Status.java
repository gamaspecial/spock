package org.example.spock.domain.model;

/**
 * 種族値
 * @param hp
 * @param attack
 * @param defence
 * @param specialAttack
 * @param specialDefence
 * @param speed
 */
public record Status(
        // H: 体力
        int hp,
        // A: 攻撃
        int attack,
        // B: 防御
        int defence,
        // C: 特殊攻撃
        int specialAttack,
        // D: 特殊防御
        int specialDefence,
        // S: 素早さ
        int speed
) {
    /**
     * 合計種族値を取得する。
     *
     * @return 合計種族値
     */
    public int sum() {
        return hp +  attack + defence + specialAttack + specialDefence + speed;
    }
}
