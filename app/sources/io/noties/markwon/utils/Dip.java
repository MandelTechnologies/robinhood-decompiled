package io.noties.markwon.utils;

import android.content.Context;

/* loaded from: classes14.dex */
public class Dip {
    private final float density;

    public static Dip create(Context context) {
        return new Dip(context.getResources().getDisplayMetrics().density);
    }

    public Dip(float f) {
        this.density = f;
    }

    public int toPx(int i) {
        return (int) ((i * this.density) + 0.5f);
    }
}
