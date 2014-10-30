package voxels.map;

import com.jme3.math.*;
import static voxels.map.Corner.*;

public enum TextureOrientation {
	U (TL,TR,BR,BL),
	L (BL,TL,TR,BR),
	D (BR,BL,TL,TR),
	R (TR,BR,BL,TL),
	UI(TR,TL,BL,BR),
	LI(TL,BL,BR,TR),
	DI(BL,BR,TR,TL),
	RI(BR,TR,TL,BL);
	
	public final Vector2f[] corners;
	
	private TextureOrientation(Corner... corners) {
		this.corners = new Vector2f[corners.length];
		for(int i = 0; i < corners.length; i++) {
			this.corners[i] = corners[i].position;
		}
	}
}