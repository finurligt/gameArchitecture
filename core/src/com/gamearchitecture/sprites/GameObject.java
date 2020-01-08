package com.gamearchitecture.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public abstract class GameObject {
    private Vector3 position;
    private Vector3 velocity;
    protected Texture texture;

    public GameObject(int x, int y) {
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0);
    }

    public void update(float dt) {

    }

    public Texture getTexture() {
        return texture;
    }

    public Vector3 getPosition() {
        return position;
    }
}
