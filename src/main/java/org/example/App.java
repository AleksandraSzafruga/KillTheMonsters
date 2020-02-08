package org.example;

import org.example.allcharacters.Monster;
import org.example.allcharacters.Player;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello!");
        final Player player = PlayerCreator.creatorPlayer();
        System.out.println(player);

        List<Monster> listOfMonsters = MonsterCreationUtil.createMonsters();

       while (player.isAlive() && listOfMonsters.stream().anyMatch(m->m.isAlive())) {
        listOfMonsters.stream().filter(m ->m.isAlive()).findFirst().get().receiveDamage(player.attack());

        listOfMonsters.stream().filter(m->m.isAlive())
                .forEach(monster -> player.receiveDamage(monster.attack()));

        System.out.println(listOfMonsters);
    }

       if (player.isAlive()){
           System.out.println("You survived. Congratulations. You have killed "+ listOfMonsters.size() +" monsters.");
       }
       else {
           System.out.println("Oops. You died");
       }
}}


