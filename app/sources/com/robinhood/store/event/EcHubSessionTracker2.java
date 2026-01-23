package com.robinhood.store.event;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EcHubSessionTracker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EcHubSessionTracker", m3645f = "EcHubSessionTracker.kt", m3646l = {61}, m3647m = "isRecordStale$lib_store_event_externalDebug")
/* renamed from: com.robinhood.store.event.EcHubSessionTracker$isRecordStale$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EcHubSessionTracker2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EcHubSessionTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcHubSessionTracker2(EcHubSessionTracker ecHubSessionTracker, Continuation<? super EcHubSessionTracker2> continuation) {
        super(continuation);
        this.this$0 = ecHubSessionTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isRecordStale$lib_store_event_externalDebug(null, this);
    }
}
