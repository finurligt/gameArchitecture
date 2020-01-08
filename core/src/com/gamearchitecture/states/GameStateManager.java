package com.gamearchitecture.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManager {
    private Stack<com.gamearchitecture.states.State> states;
    public GameStateManager() {
        states = new Stack<com.gamearchitecture.states.State>();
    }

    public void push(com.gamearchitecture.states.State state) {
        states.push(state);
    }

    public void pop() {
        states.pop();
    }

    public void update(float delta) {
        states.peek().update(delta);
    }

    public void render(SpriteBatch sb) {
        states.peek().render(sb);
    }

    public void set(State state) {
        states.pop();
        states.push(state);
    }
}
