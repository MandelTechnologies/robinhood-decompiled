package com.plaid.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.B4 */
/* loaded from: classes16.dex */
public final class C5806B4 {

    /* renamed from: a */
    public final String f1274a;

    /* renamed from: b */
    public final String f1275b;

    /* renamed from: c */
    public final byte[] f1276c;

    public C5806B4(String workflowId, String renderingId, byte[] model) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(renderingId, "renderingId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f1274a = workflowId;
        this.f1275b = renderingId;
        this.f1276c = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5806B4)) {
            return false;
        }
        C5806B4 c5806b4 = (C5806B4) obj;
        return Intrinsics.areEqual(this.f1274a, c5806b4.f1274a) && Intrinsics.areEqual(this.f1275b, c5806b4.f1275b) && Intrinsics.areEqual(this.f1276c, c5806b4.f1276c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1276c) + C7246x.m1646a(this.f1275b, this.f1274a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PaneEntity(workflowId=" + this.f1274a + ", renderingId=" + this.f1275b + ", model=" + Arrays.toString(this.f1276c) + ")";
    }
}
