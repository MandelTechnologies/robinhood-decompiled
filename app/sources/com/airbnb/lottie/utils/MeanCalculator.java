package com.airbnb.lottie.utils;

/* loaded from: classes16.dex */
public class MeanCalculator {

    /* renamed from: n */
    private int f580n;
    private float sum;

    public void add(float f) {
        float f2 = this.sum + f;
        this.sum = f2;
        int i = this.f580n + 1;
        this.f580n = i;
        if (i == Integer.MAX_VALUE) {
            this.sum = f2 / 2.0f;
            this.f580n = i / 2;
        }
    }
}
