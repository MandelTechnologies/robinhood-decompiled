package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CardStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CardStore", m3645f = "CardStore.kt", m3646l = {57}, m3647m = "fetchCards$lib_store_card_externalDebug")
/* renamed from: com.robinhood.librobinhood.data.store.CardStore$fetchCards$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CardStore2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardStore2(CardStore cardStore, Continuation<? super CardStore2> continuation) {
        super(continuation);
        this.this$0 = cardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchCards$lib_store_card_externalDebug(this);
    }
}
