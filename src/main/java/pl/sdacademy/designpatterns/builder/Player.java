package pl.sdacademy.designpatterns.builder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Player {

    private int health;
    private int mana;
    private String nick;
    private long level;
    private List<Object> friends;

    public Player(final int health, final int mana, final String nick, final long level, final List<Object> friends) {
        this.health = health;
        this.mana = mana;
        this.nick = nick;
        this.level = level;
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nick='" + nick + '\''+
                ", health=" + health +
                ", mana=" + mana +
                ", level=" + level +
                ", friends=" + friends +
                '}';
    }


    static class Builder {

        private int health;
        private int mana;
        private String nick;
        private long level;
        private List<Object> friends;



        public Builder setHealth(final int health) {
            this.health = health;
            return this;
        }

        public Builder setMana(final int mana) {
            this.mana = mana;
            return this;
        }

        public Builder setNick(final String nick) {
            this.nick = nick;
            return this;
        }

        public Builder setLevel(final long level) {
            this.level = level;
            return this;
        }

        public Builder setFriends(List<Object> friends) {
friends = new ArrayList<>();
            this.friends = friends;

            return this;
        }
        public Player build() {
            return new Player(health,mana,nick,level,friends);
        }
    }
}