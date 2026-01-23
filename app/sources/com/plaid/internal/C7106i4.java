package com.plaid.internal;

import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.i4 */
/* loaded from: classes16.dex */
public final class C7106i4 {

    /* renamed from: a */
    public final boolean f2858a;

    /* renamed from: b */
    public final long f2859b;

    /* renamed from: c */
    public final long f2860c;

    /* renamed from: com.plaid.internal.i4$a */
    public static final class a {
        /* renamed from: a */
        public static C7106i4 m1530a(Common$PollingOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            if (Intrinsics.areEqual(options, Common$PollingOptions.getDefaultInstance())) {
                C5953R5.a.m1304b(C5953R5.f1671a, "No polling options received");
                return new C7106i4(false, options.getIntervalMs() > 0 ? options.getIntervalMs() : 500L, options.getMaxDurationMs() > 0 ? options.getMaxDurationMs() : 5000L);
            }
            if (options.getIntervalMs() <= 0 || options.getMaxDurationMs() <= 0) {
                C5953R5.a.m1304b(C5953R5.f1671a, "Invalid polling options received - duration: " + options.getMaxDurationMs() + " interval: " + options.getIntervalMs());
            }
            return new C7106i4(true, options.getIntervalMs() > 0 ? options.getIntervalMs() : 500L, options.getMaxDurationMs() > 0 ? options.getMaxDurationMs() : 5000L);
        }
    }

    public C7106i4(boolean z, long j, long j2) {
        this.f2858a = z;
        this.f2859b = j;
        this.f2860c = j2;
    }

    /* renamed from: a */
    public final long m1527a() {
        return this.f2859b;
    }

    /* renamed from: b */
    public final long m1528b() {
        return this.f2860c;
    }

    /* renamed from: c */
    public final boolean m1529c() {
        return this.f2858a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7106i4)) {
            return false;
        }
        C7106i4 c7106i4 = (C7106i4) obj;
        return this.f2858a == c7106i4.f2858a && this.f2859b == c7106i4.f2859b && this.f2860c == c7106i4.f2860c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2860c) + ((Long.hashCode(this.f2859b) + (Boolean.hashCode(this.f2858a) * 31)) * 31);
    }

    public final String toString() {
        return "OAuthPollingOptions(shouldPoll=" + this.f2858a + ", interval=" + this.f2859b + ", maxDuration=" + this.f2860c + ")";
    }
}
