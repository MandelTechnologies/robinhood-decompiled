package com.mux.stats.sdk.core.util;

import com.mux.stats.sdk.muxstats.MuxStats;
import java.util.Date;

/* loaded from: classes27.dex */
public class CurrentTime {

    /* renamed from: a */
    private long f1141a;

    /* renamed from: b */
    private long f1142b;

    /* renamed from: c */
    private final boolean f1143c;

    public CurrentTime() {
        boolean z;
        if (MuxStats.getHostDevice() != null) {
            this.f1141a = new Date().getTime();
            this.f1142b = MuxStats.getHostDevice().getElapsedRealtime();
            z = true;
        } else {
            z = false;
        }
        this.f1143c = z;
    }

    public long now() {
        return this.f1143c ? this.f1141a + (MuxStats.getHostDevice().getElapsedRealtime() - this.f1142b) : new Date().getTime();
    }
}
