package com.robinhood.android.transfers.recurring.p270ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AutomaticDepositDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$skipAutomaticDeposit$4$1", m3645f = "AutomaticDepositDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$skipAutomaticDeposit$4$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AutomaticDepositDetailDuxo7 extends ContinuationImpl7 implements Function2<AutomaticDepositDetailViewState, Continuation<? super AutomaticDepositDetailViewState>, Object> {

    /* renamed from: $t */
    final /* synthetic */ Throwable f5023$t;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutomaticDepositDetailDuxo7(Throwable th, Continuation<? super AutomaticDepositDetailDuxo7> continuation) {
        super(2, continuation);
        this.f5023$t = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutomaticDepositDetailDuxo7 automaticDepositDetailDuxo7 = new AutomaticDepositDetailDuxo7(this.f5023$t, continuation);
        automaticDepositDetailDuxo7.L$0 = obj;
        return automaticDepositDetailDuxo7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AutomaticDepositDetailViewState automaticDepositDetailViewState, Continuation<? super AutomaticDepositDetailViewState> continuation) {
        return ((AutomaticDepositDetailDuxo7) create(automaticDepositDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AutomaticDepositDetailViewState automaticDepositDetailViewState = (AutomaticDepositDetailViewState) this.L$0;
        Result.Companion companion = Result.INSTANCE;
        return AutomaticDepositDetailViewState.copy$default(automaticDepositDetailViewState, null, null, false, null, null, false, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(this.f5023$t)))), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }
}
