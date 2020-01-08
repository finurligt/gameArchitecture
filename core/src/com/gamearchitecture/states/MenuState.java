package com.gamearchitecture.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gamearchitecture.main;

public class MenuState extends State {
    Texture startBtn = new Texture("startbutton.jpg");

    public MenuState(GameStateManager gsm) {
        super(gsm);
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new GameState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float delta) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(startBtn, ((float) com.gamearchitecture.main.WIDTH/2)-((float)startBtn.getWidth()/2),(float) main.HEIGHT/2);
        sb.end();
    }

    @Override
    public void dispose() {
        startBtn.dispose();
    }
}
