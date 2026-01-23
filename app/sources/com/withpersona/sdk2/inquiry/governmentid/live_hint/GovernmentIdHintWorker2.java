package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GovernmentIdHintWorker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1", m3645f = "GovernmentIdHintWorker.kt", m3646l = {93, 94}, m3647m = "emit")
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1$emit$1, reason: use source file name */
/* loaded from: classes18.dex */
final class GovernmentIdHintWorker2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GovernmentIdHintWorker.C435991.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GovernmentIdHintWorker2(GovernmentIdHintWorker.C435991.AnonymousClass1<? super T> anonymousClass1, Continuation<? super GovernmentIdHintWorker2> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((GovernmentIdHintWorker.HintEvent) null, (Continuation<? super Unit>) this);
    }
}
