package com.robinhood.android.transfers.ach.p265ui;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CreateQueuedAchDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$updateGoldCalculationWhenDepositAmountChange$1$1", m3645f = "CreateQueuedAchDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$updateGoldCalculationWhenDepositAmountChange$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateQueuedAchDepositDuxo3 extends ContinuationImpl7 implements Function2<CreateQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState>, Object> {
    final /* synthetic */ BigDecimal $amount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateQueuedAchDepositDuxo3(BigDecimal bigDecimal, Continuation<? super CreateQueuedAchDepositDuxo3> continuation) {
        super(2, continuation);
        this.$amount = bigDecimal;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateQueuedAchDepositDuxo3 createQueuedAchDepositDuxo3 = new CreateQueuedAchDepositDuxo3(this.$amount, continuation);
        createQueuedAchDepositDuxo3.L$0 = obj;
        return createQueuedAchDepositDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState> continuation) {
        return ((CreateQueuedAchDepositDuxo3) create(createQueuedAchDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CreateQueuedAchDepositViewState.copy$default((CreateQueuedAchDepositViewState) this.L$0, false, this.$amount, null, null, null, false, 61, null);
    }
}
