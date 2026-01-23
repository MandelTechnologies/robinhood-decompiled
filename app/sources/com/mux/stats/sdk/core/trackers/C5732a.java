package com.mux.stats.sdk.core.trackers;

/* renamed from: com.mux.stats.sdk.core.trackers.a */
/* loaded from: classes27.dex */
final class C5732a {

    /* renamed from: c */
    static final C5732a f1137c = new C5732a(10000, 300);

    /* renamed from: d */
    static final C5732a f1138d = new C5732a(30000, 600);

    /* renamed from: a */
    final int f1139a;

    /* renamed from: b */
    final int f1140b;

    private C5732a(int i, int i2) {
        this.f1139a = i;
        this.f1140b = i2;
    }

    /* renamed from: a */
    static C5732a m1113a(int i) {
        int i2 = 10000;
        if (i >= 10000) {
            i2 = 60000;
            if (i <= 60000) {
                i2 = i;
            }
        }
        int i3 = 1000;
        int i4 = (i / 1000) * 30;
        if (i4 < 300) {
            i3 = 300;
        } else if (i4 <= 1000) {
            i3 = i4;
        }
        return new C5732a(i2, i3);
    }
}
