package com.robinhood.android.investmentstracker.features.plaid;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions;
import com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDataState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DuxoExtensions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$DefaultImpls", m3645f = "DuxoExtensions.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "callBffLinkAccountForAnalyticOnly")
/* renamed from: com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDuxo$callBffLinkAccountForAnalyticOnly$1, reason: use source file name */
/* loaded from: classes10.dex */
final class DuxoExtensions2<DS extends PlaidEnabledDataState> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    DuxoExtensions2(Continuation<? super DuxoExtensions2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DuxoExtensions.DefaultImpls.callBffLinkAccountForAnalyticOnly(null, null, this);
    }
}
