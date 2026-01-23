package com.truelayer.payments.analytics;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.TrueLayerAnalyticsImpl;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TrueLayerAnalyticsImpl.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1$1", m3645f = "TrueLayerAnalyticsImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "emit")
/* renamed from: com.truelayer.payments.analytics.TrueLayerAnalyticsImpl$1$1$emit$1, reason: use source file name */
/* loaded from: classes6.dex */
final class TrueLayerAnalyticsImpl2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrueLayerAnalyticsImpl.C427081.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TrueLayerAnalyticsImpl2(TrueLayerAnalyticsImpl.C427081.AnonymousClass1<? super T> anonymousClass1, Continuation<? super TrueLayerAnalyticsImpl2> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((AnalyticsEvents) null, (Continuation<? super Unit>) this);
    }
}
