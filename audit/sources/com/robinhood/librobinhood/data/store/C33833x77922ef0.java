package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EquityTradingSessionChangedStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore", m3645f = "EquityTradingSessionChangedStore.kt", m3646l = {200, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "determineCurrentSessionConfiguration-yxL6bBk")
/* renamed from: com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$determineCurrentSessionConfiguration$1 */
/* loaded from: classes13.dex */
final class C33833x77922ef0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EquityTradingSessionChangedStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33833x77922ef0(EquityTradingSessionChangedStore equityTradingSessionChangedStore, Continuation<? super C33833x77922ef0> continuation) {
        super(continuation);
        this.this$0 = equityTradingSessionChangedStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM22647determineCurrentSessionConfigurationyxL6bBk = this.this$0.m22647determineCurrentSessionConfigurationyxL6bBk(null, null, null, false, this);
        return objM22647determineCurrentSessionConfigurationyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM22647determineCurrentSessionConfigurationyxL6bBk : Result.m28549boximpl(objM22647determineCurrentSessionConfigurationyxL6bBk);
    }
}
