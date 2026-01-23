package com.robinhood.android.crypto.tab.p093ui.education;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CryptoHomeEducationDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo", m3645f = "CryptoHomeEducationDuxo.kt", m3646l = {87}, m3647m = "getSeriesId$feature_crypto_tab_externalDebug")
/* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$getSeriesId$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeEducationDuxo2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CryptoHomeEducationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeEducationDuxo2(CryptoHomeEducationDuxo cryptoHomeEducationDuxo, Continuation<? super CryptoHomeEducationDuxo2> continuation) {
        super(continuation);
        this.this$0 = cryptoHomeEducationDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSeriesId$feature_crypto_tab_externalDebug(false, this);
    }
}
