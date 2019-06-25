package pl.sdacademy.designpatterns.builder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayerDemo {
    public static void main(String[] args) {
        List<Object> sd = new ArrayList<>();
        sd.add("23");
        sd.add("sdc");
        sd.add("223dcs");

        Player player = new Player.Builder().setNick("bob").setMana(10).setLevel(2).setFriends(sd).build();
        System.out.println(player.toString());
    }

}
