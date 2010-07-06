package org.anddev.andengine.entity;

import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.entity.shape.modifier.ScaleModifier;
import org.anddev.andengine.entity.sprite.Sprite;
import org.anddev.andengine.opengl.texture.region.TextureRegion;

/**
 * @author Nicolas Gramlich
 * @since 09:45:02 - 03.05.2010
 */
public class SplashScene extends Scene {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public SplashScene(final Camera pCamera, final TextureRegion pTextureRegion) {
		this(pCamera, pTextureRegion, -1, 1, 1, 1, 1);
	}

	public SplashScene(final Camera pCamera, final TextureRegion pTextureRegion, final float pDuration, final float pScaleFromX, final float pScaleToX, final float pScaleFromY, final float pScaleToY) {
		super(1);

		final Sprite loadingScreenSprite = new Sprite(pCamera.getMinX(), pCamera.getMinY(), pCamera.getWidth(), pCamera.getHeight(), pTextureRegion);
		if(pScaleToX != 1 || pScaleToY != 1) {
			loadingScreenSprite.addShapeModifier(new ScaleModifier(pDuration, pScaleFromX, pScaleToX, pScaleFromY, pScaleToY));
		}

		this.getLayer(0).addEntity(loadingScreenSprite);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
