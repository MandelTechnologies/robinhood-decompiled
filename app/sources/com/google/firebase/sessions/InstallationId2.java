package com.google.firebase.sessions;

import com.google.firebase.sessions.InstallationId;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InstallationId.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.google.firebase.sessions.InstallationId$Companion", m3645f = "InstallationId.kt", m3646l = {32, 40}, m3647m = AnalyticsStrings.BUTTON_NEW_LIST_CREATE)
/* renamed from: com.google.firebase.sessions.InstallationId$Companion$create$1, reason: use source file name */
/* loaded from: classes.dex */
final class InstallationId2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InstallationId.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallationId2(InstallationId.Companion companion, Continuation<? super InstallationId2> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, this);
    }
}
