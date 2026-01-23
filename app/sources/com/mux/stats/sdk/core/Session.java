package com.mux.stats.sdk.core;

import com.mux.stats.sdk.core.model.EnvironmentData;
import com.mux.stats.sdk.core.util.CurrentTime;
import com.mux.stats.sdk.core.util.UUID;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class Session {

    /* renamed from: a */
    private String f1002a;

    /* renamed from: b */
    private long f1003b;

    /* renamed from: c */
    private long f1004c;

    /* renamed from: d */
    private CurrentTime f1005d = new CurrentTime();

    /* renamed from: a */
    private void m1080a(long j) {
        this.f1002a = UUID.generateUUID();
        this.f1003b = j;
        this.f1004c = j + 1500000;
    }

    public long now() {
        return this.f1005d.now();
    }

    public void startSession() {
        m1080a(now());
    }

    public void updateEnvironmentData(EnvironmentData environmentData) throws JSONException {
        long jNow = now();
        if (jNow > this.f1004c) {
            m1080a(now());
        } else {
            this.f1004c = jNow + 1500000;
        }
        environmentData.setSessionStart(Long.valueOf(this.f1003b));
        environmentData.setSessionExpires(Long.valueOf(this.f1004c));
        environmentData.setSessionId(this.f1002a);
    }
}
