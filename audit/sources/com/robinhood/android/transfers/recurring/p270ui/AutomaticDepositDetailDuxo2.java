package com.robinhood.android.transfers.recurring.p270ui;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AutomaticDepositDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$cancelAutomaticDeposit$4$1", m3645f = "AutomaticDepositDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$cancelAutomaticDeposit$4$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AutomaticDepositDetailDuxo2 extends ContinuationImpl7 implements Function2<AutomaticDepositDetailViewState, Continuation<? super AutomaticDepositDetailViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AutomaticDepositDetailDuxo2(Continuation<? super AutomaticDepositDetailDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutomaticDepositDetailDuxo2 automaticDepositDetailDuxo2 = new AutomaticDepositDetailDuxo2(continuation);
        automaticDepositDetailDuxo2.L$0 = obj;
        return automaticDepositDetailDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AutomaticDepositDetailViewState automaticDepositDetailViewState, Continuation<? super AutomaticDepositDetailViewState> continuation) {
        return ((AutomaticDepositDetailDuxo2) create(automaticDepositDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AutomaticDepositDetailViewState.copy$default((AutomaticDepositDetailViewState) this.L$0, null, null, true, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }
}
