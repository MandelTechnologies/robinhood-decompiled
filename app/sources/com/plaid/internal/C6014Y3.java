package com.plaid.internal;

import android.net.NetworkCapabilities;
import android.os.Build;

/* renamed from: com.plaid.internal.Y3 */
/* loaded from: classes16.dex */
public final class C6014Y3 {

    /* renamed from: a */
    public final EnumC6053c4 f1846a;

    /* renamed from: b */
    public final EnumC7264z f1847b;

    /* renamed from: c */
    public final EnumC7264z f1848c;

    /* renamed from: d */
    public final EnumC7264z f1849d;

    public C6014Y3(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(0)) {
            this.f1846a = EnumC6053c4.CELLULAR;
        } else if (networkCapabilities.hasTransport(1)) {
            this.f1846a = EnumC6053c4.WIFI;
        } else if (networkCapabilities.hasTransport(3)) {
            this.f1846a = EnumC6053c4.WIRED;
        } else {
            this.f1846a = EnumC6053c4.OTHER;
        }
        this.f1848c = networkCapabilities.hasCapability(12) ? EnumC7264z.YES : EnumC7264z.NO;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1847b = networkCapabilities.hasCapability(19) ? EnumC7264z.YES : EnumC7264z.NO;
        } else {
            this.f1847b = EnumC7264z.UNKNOWN;
        }
        this.f1849d = networkCapabilities.hasCapability(16) ? EnumC7264z.YES : EnumC7264z.NO;
    }

    public final String toString() {
        return "type=" + this.f1846a.name() + ", foreground=" + this.f1847b + ", internet capable=" + this.f1848c + ", validated=" + this.f1849d;
    }
}
