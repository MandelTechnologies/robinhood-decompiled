package com.stripe.android.payments.core.authentication.threeds2;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", m3645f = "Stripe3ds2TransactionViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "perform3ds2AuthenticationRequest-yxL6bBk")
/* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1, reason: use source file name */
/* loaded from: classes22.dex */
final class Stripe3ds2TransactionViewModel3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Stripe3ds2TransactionViewModel3(Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, Continuation<? super Stripe3ds2TransactionViewModel3> continuation) {
        super(continuation);
        this.this$0 = stripe3ds2TransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26928perform3ds2AuthenticationRequestyxL6bBk = this.this$0.m26928perform3ds2AuthenticationRequestyxL6bBk(null, null, null, 0, this);
        return objM26928perform3ds2AuthenticationRequestyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26928perform3ds2AuthenticationRequestyxL6bBk : Result.m28549boximpl(objM26928perform3ds2AuthenticationRequestyxL6bBk);
    }
}
