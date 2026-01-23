package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WorkflowIdentifier.kt */
@Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.Workflows__WorkflowIdentifierKt$identifier$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class WorkflowIdentifier5 extends FunctionReferenceImpl implements Function0<String> {
    WorkflowIdentifier5(Object obj) {
        super(0, obj, ImpostorWorkflow.class, "describeRealIdentifier", "describeRealIdentifier()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ((ImpostorWorkflow) this.receiver).describeRealIdentifier();
    }
}
