package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [P, S] */
/* compiled from: WorkflowInterceptor.kt */
@Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.WorkflowInterceptorKt$intercept$1$onPropsChanged$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class WorkflowInterceptor7<P, S> extends FunctionReferenceImpl implements Function3<P, P, S, S> {
    WorkflowInterceptor7(Object obj) {
        super(3, obj, StatefulWorkflow.class, "onPropsChanged", "onPropsChanged(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final S invoke(P p, P p2, S s) {
        return (S) ((StatefulWorkflow) this.receiver).onPropsChanged(p, p2, s);
    }
}
