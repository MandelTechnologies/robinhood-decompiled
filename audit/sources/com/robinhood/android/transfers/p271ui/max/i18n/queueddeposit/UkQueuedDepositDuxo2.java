package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UkQueuedDepositDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, 330, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE}, m3647m = "createStandardDeposit-yxL6bBk")
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$createStandardDeposit$1, reason: use source file name */
/* loaded from: classes9.dex */
final class UkQueuedDepositDuxo2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UkQueuedDepositDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UkQueuedDepositDuxo2(UkQueuedDepositDuxo ukQueuedDepositDuxo, Continuation<? super UkQueuedDepositDuxo2> continuation) {
        super(continuation);
        this.this$0 = ukQueuedDepositDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM19880createStandardDeposityxL6bBk = this.this$0.m19880createStandardDeposityxL6bBk(null, null, null, null, this);
        return objM19880createStandardDeposityxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19880createStandardDeposityxL6bBk : Result.m28549boximpl(objM19880createStandardDeposityxL6bBk);
    }
}
