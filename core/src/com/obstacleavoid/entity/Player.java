package com.obstacleavoid.entity;

import com.obstacleavoid.config.GameConfig;

/**
 * Created by Milan on 3/12/2018.
 */

public class Player extends GameObjectBase{

    public Player(){
        super(GameConfig.PLAYER_BOUNDS_RADIUS);
        setSize(GameConfig.PLAYER_SIZE,GameConfig.PLAYER_SIZE);
    }



    public float getWidth() {
        return GameConfig.PLAYER_SIZE;
    }

    public float getHeight() {
        return GameConfig.PLAYER_SIZE;
    }


}
