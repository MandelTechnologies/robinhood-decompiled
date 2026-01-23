package com.truelayer.payments.analytics.sender;

import com.truelayer.payments.analytics.events.AnalyticsEvent;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EventSenderWorker.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.analytics.sender.EventSenderWorker$doWork$2$1", m3645f = "EventSenderWorker.kt", m3646l = {54, 55, 67, 76}, m3647m = "emit")
/* renamed from: com.truelayer.payments.analytics.sender.EventSenderWorker$doWork$2$1$emit$1, reason: use source file name */
/* loaded from: classes6.dex */
final class EventSenderWorker2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventSenderWorker.C427152.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EventSenderWorker2(EventSenderWorker.C427152.AnonymousClass1<? super T> anonymousClass1, Continuation<? super EventSenderWorker2> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((AnalyticsEvent) null, (Continuation<? super Unit>) this);
    }
}
