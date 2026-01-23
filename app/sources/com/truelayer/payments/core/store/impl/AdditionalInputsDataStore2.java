package com.truelayer.payments.core.store.impl;

import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AdditionalInputsDataStore.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.core.store.impl.AdditionalInputsDataStore", m3645f = "AdditionalInputsDataStore.kt", m3646l = {44, 56}, m3647m = "addOrUpdate-SpDDLgk")
/* renamed from: com.truelayer.payments.core.store.impl.AdditionalInputsDataStore$addOrUpdate$1, reason: use source file name */
/* loaded from: classes6.dex */
final class AdditionalInputsDataStore2 extends ContinuationImpl {
    byte B$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdditionalInputsDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalInputsDataStore2(AdditionalInputsDataStore additionalInputsDataStore, Continuation<? super AdditionalInputsDataStore2> continuation) {
        super(continuation);
        this.this$0 = additionalInputsDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo27023addOrUpdateSpDDLgk((String) null, (List<RecentAdditionalInput>) null, (byte) 0, this);
    }
}
