package com.robinhood.android.transfers.p271ui.max.upsell;

import com.robinhood.librobinhood.data.store.SweepsStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: RecurringFrequencyUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellDuxo$onCreate$1$1", m3645f = "RecurringFrequencyUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringFrequencyUpsellDuxo2 extends ContinuationImpl7 implements Function2<RecurringFrequencyUpsellDataState, Continuation<? super RecurringFrequencyUpsellDataState>, Object> {
    final /* synthetic */ boolean $displayDepositBoostMessage;
    final /* synthetic */ SweepsStatus $sweepStatus;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringFrequencyUpsellDuxo2(SweepsStatus sweepsStatus, boolean z, Continuation<? super RecurringFrequencyUpsellDuxo2> continuation) {
        super(2, continuation);
        this.$sweepStatus = sweepsStatus;
        this.$displayDepositBoostMessage = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringFrequencyUpsellDuxo2 recurringFrequencyUpsellDuxo2 = new RecurringFrequencyUpsellDuxo2(this.$sweepStatus, this.$displayDepositBoostMessage, continuation);
        recurringFrequencyUpsellDuxo2.L$0 = obj;
        return recurringFrequencyUpsellDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecurringFrequencyUpsellDataState recurringFrequencyUpsellDataState, Continuation<? super RecurringFrequencyUpsellDataState> continuation) {
        return ((RecurringFrequencyUpsellDuxo2) create(recurringFrequencyUpsellDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((RecurringFrequencyUpsellDataState) this.L$0).copy(this.$sweepStatus, boxing.boxBoolean(this.$displayDepositBoostMessage));
    }
}
