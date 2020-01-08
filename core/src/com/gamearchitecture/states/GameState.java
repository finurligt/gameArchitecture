package com.gamearchitecture.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gamearchitecture.main;

public class GameState extends State {
    Texture testImage;


    protected GameState(GameStateManager gsm) {
        super(gsm);
        cam.setToOrtho(false, com.gamearchitecture.main.WIDTH/2, com.gamearchitecture.main.HEIGHT/2);
        testImage = new Texture("testimage.png");
        cam.setToOrtho(false, com.gamearchitecture.main.WIDTH*2, main.HEIGHT*2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(testImage,50,50);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
