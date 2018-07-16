package com.obstacleavoid.entity;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.obstacleavoid.config.GameConfig;

/**
 * Created by Milan on 3/12/2018.
 */

public class Obstacle extends GameObjectBase implements com.badlogic.gdx.utils.Pool.Poolable{

    private Circle bounds;

    private float ySpeed = GameConfig.MEDIUM_OBSTACLE_SPEED;
    private boolean hit;

    public Obstacle(){
        super(GameConfig.OBSTACLE_BOUNDS_RADIUS);
        setSize(GameConfig.OBSTACLE_SIZE, GameConfig.OBSTACLE_SIZE);
    }

    public void update(){
        setY(getY() - ySpeed);
    }

    public boolean isPlayerColliding(Player player) {
        Circle playerBounds = player.getBounds();
        //this will check if player bounds overlaps obstacle bounds.
       boolean overlaps = Intersector.overlaps(playerBounds, getBounds());

//     if(overlaps)
//            hit = true;
        // Better way is do just do this:
        hit = overlaps;
        return overlaps;
    }

    public boolean isNotHit(){
        return !hit;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void reset() {
        hit = false;
    }
}
