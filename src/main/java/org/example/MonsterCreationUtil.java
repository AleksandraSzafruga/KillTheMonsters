package org.example;

import org.example.allcharacters.Ghul;
import org.example.allcharacters.Goblin;
import org.example.allcharacters.Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterCreationUtil {



    public static List<Monster> createMonsters() {

        int howManyMonster = new Random().nextInt(4);
        List<Monster> monsters = new ArrayList<>();

        for (int i = 0; i <= howManyMonster; i++) {
            int monsterType = new Random().nextInt(2);

            if (monsterType == 0) {
                monsters.add(new Goblin());
            } else monsters.add(new Ghul());
        }
        return monsters;
    }

}
