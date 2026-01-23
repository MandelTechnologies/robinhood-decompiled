package com.withpersona.sdk2.inquiry.internal;

import com.squareup.workflow1.WorkflowInterceptor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: Interceptors.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/Interceptors;", "", "<init>", "()V", "getInterceptors", "", "Lcom/squareup/workflow1/WorkflowInterceptor;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class Interceptors {
    public static final Interceptors INSTANCE = new Interceptors();

    private Interceptors() {
    }

    public final List<WorkflowInterceptor> getInterceptors() {
        return CollectionsKt.emptyList();
    }
}
