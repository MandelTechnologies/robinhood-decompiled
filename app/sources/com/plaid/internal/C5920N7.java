package com.plaid.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.N7 */
/* loaded from: classes16.dex */
public final class C5920N7 {

    /* renamed from: a */
    public final String f1570a;

    /* renamed from: b */
    public final String f1571b;

    /* renamed from: c */
    public final byte[] f1572c;

    public C5920N7(String workflowId, String id, byte[] model) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f1570a = workflowId;
        this.f1571b = id;
        this.f1572c = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5920N7.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.plaid.internal.workflow.persistence.database.model.WorkflowAnalyticsEntity");
        C5920N7 c5920n7 = (C5920N7) obj;
        return Intrinsics.areEqual(this.f1570a, c5920n7.f1570a) && Intrinsics.areEqual(this.f1571b, c5920n7.f1571b) && Arrays.equals(this.f1572c, c5920n7.f1572c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1572c) + C7246x.m1646a(this.f1571b, this.f1570a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "WorkflowAnalyticsEntity(workflowId=" + this.f1570a + ", id=" + this.f1571b + ", model=" + Arrays.toString(this.f1572c) + ")";
    }
}
