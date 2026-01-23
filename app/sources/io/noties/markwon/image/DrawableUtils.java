package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes14.dex */
public abstract class DrawableUtils {
    public static Rect intrinsicBounds(Drawable drawable) {
        return new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static void applyIntrinsicBounds(Drawable drawable) {
        drawable.setBounds(intrinsicBounds(drawable));
    }
}
