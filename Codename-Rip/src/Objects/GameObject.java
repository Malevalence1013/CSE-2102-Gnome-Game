package com.game.object;

import java.awt.Graphics2D;

/**********************************************
 * Abstract class representing an object in the 
 * game. 
 **********************************************/
public abstract class GameObject {
	protected int x = 0, y = 0;
	protected int velX = 0, velY = 0;
	protected ObjectID id;

	public GameObject(int x, int y, ObjectID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	public abstract void tick();

	public abstract void render(Graphics2D g);

	// Accessor methods. 
	public int getX() {return x;}
	public int getY() {return y;}
	public int getVelX() {return velX;}
	public int getVelY() {return velY;}
	public ObjectID getID() {return id;}

	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public void setVelX(int velX) {this.velX = velX;}
	public void setVelY(int velY) {this.velY = velY;}
	public void setID(ObjectID id) {this.id = id;}
}