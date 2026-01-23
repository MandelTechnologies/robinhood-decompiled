package com.robinhood.android.equity.ordercheck;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EquityOrderCheckValidator.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator", m3645f = "EquityOrderCheckValidator.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "cancelPendingCryptoOrders-IoAF18A")
/* renamed from: com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator$cancelPendingCryptoOrders$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityOrderCheckValidator2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EquityOrderCheckValidator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityOrderCheckValidator2(EquityOrderCheckValidator equityOrderCheckValidator, Continuation<? super EquityOrderCheckValidator2> continuation) {
        super(continuation);
        this.this$0 = equityOrderCheckValidator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM13719cancelPendingCryptoOrdersIoAF18A = this.this$0.m13719cancelPendingCryptoOrdersIoAF18A(this);
        return objM13719cancelPendingCryptoOrdersIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM13719cancelPendingCryptoOrdersIoAF18A : Result.m28549boximpl(objM13719cancelPendingCryptoOrdersIoAF18A);
    }
}
