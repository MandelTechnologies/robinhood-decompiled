package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CryptoAccountPreferencesStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore", m3645f = "CryptoAccountPreferencesStore.kt", m3646l = {87}, m3647m = "refreshAccountPreferences-IoAF18A")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore$refreshAccountPreferences$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoAccountPreferencesStore6 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CryptoAccountPreferencesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAccountPreferencesStore6(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, Continuation<? super CryptoAccountPreferencesStore6> continuation) {
        super(continuation);
        this.this$0 = cryptoAccountPreferencesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM22601refreshAccountPreferencesIoAF18A = this.this$0.m22601refreshAccountPreferencesIoAF18A(this);
        return objM22601refreshAccountPreferencesIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM22601refreshAccountPreferencesIoAF18A : Result.m28549boximpl(objM22601refreshAccountPreferencesIoAF18A);
    }
}
