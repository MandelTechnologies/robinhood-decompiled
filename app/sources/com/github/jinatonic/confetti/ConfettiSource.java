package com.github.jinatonic.confetti;

/* loaded from: classes16.dex */
public class ConfettiSource {

    /* renamed from: x0 */
    public final int f665x0;

    /* renamed from: x1 */
    public final int f666x1;

    /* renamed from: y0 */
    public final int f667y0;

    /* renamed from: y1 */
    public final int f668y1;

    public ConfettiSource(int i, int i2, int i3, int i4) {
        this.f665x0 = i;
        this.f667y0 = i2;
        this.f666x1 = i3;
        this.f668y1 = i4;
    }

    protected float getInitialX(float f) {
        return this.f665x0 + ((this.f666x1 - r0) * f);
    }

    protected float getInitialY(float f) {
        return this.f667y0 + ((this.f668y1 - r0) * f);
    }
}
