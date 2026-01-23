package com.plaid.internal;

/* renamed from: com.plaid.internal.C0 */
/* loaded from: classes16.dex */
public final class C5811C0 {

    /* renamed from: a */
    public final String f1289a;

    /* renamed from: b */
    public final Exception f1290b;

    /* renamed from: c */
    public final String f1291c;

    public C5811C0(String str, Exception exc, String str2) {
        this.f1289a = str;
        this.f1290b = exc;
        this.f1291c = str2;
    }

    /* renamed from: a */
    public final String m1159a() {
        return this.f1289a;
    }

    public final String toString() {
        return "DeviceDescriptor{ip='" + this.f1289a + "', mno='null', phoneNumber='null', preCheckError=" + this.f1290b + ", desc='" + this.f1291c + "'}";
    }
}
