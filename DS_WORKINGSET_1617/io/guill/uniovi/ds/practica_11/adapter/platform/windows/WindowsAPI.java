package io.guill.uniovi.ds.practica_11.adapter.platform.windows;

import io.guill.uniovi.ds.practica_11.adapter.api.PlatformAPI;
import io.guill.uniovi.ds.practica_11.adapter.platform.Image2D;

import java.awt.Point;


public class WindowsAPI implements PlatformAPI {
	
	private Point point = new Point(0, 0);

	@Override
	public Image2D loadImage(String file) {
		System.out.println("(Windows) Cargada imagen '" + file + "' del disco duro.");
		return new Image2D(file, 10, 10);
	}

	@Override
	public Point getPosition() {
		point.translate(10, 10);
		return new Point(point);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		System.out.println("(Windows) Dibujando '" + image.getName() + "' en [" + point.x + "," + point.y + "]");
		
	}

}
