package com.mux.stats.sdk.muxstats;

/* loaded from: classes27.dex */
public class MuxErrorException extends Exception {

    /* renamed from: a */
    private final int f1151a;

    /* renamed from: b */
    private final String f1152b;

    public MuxErrorException(int i, String str) {
        this(i, str, null);
    }

    public MuxErrorException(int i, String str, String str2) {
        super(str);
        this.f1151a = i;
        this.f1152b = str2;
    }

    public int getCode() {
        return this.f1151a;
    }
}
