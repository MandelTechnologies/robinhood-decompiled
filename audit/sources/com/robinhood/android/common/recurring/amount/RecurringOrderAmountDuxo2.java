package com.robinhood.android.common.recurring.amount;

import com.robinhood.android.common.recurring.amount.RecurringOrderAmountViewState;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderAmountDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$submitInvestmentScheduleAmountUpdate$1$2, reason: use source file name */
/* loaded from: classes2.dex */
final class RecurringOrderAmountDuxo2<T> implements Consumer {
    final /* synthetic */ RecurringOrderAmountDuxo this$0;

    RecurringOrderAmountDuxo2(RecurringOrderAmountDuxo recurringOrderAmountDuxo) {
        this.this$0 = recurringOrderAmountDuxo;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Disposable disposable) {
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.RecurringOrderAmountDuxo$submitInvestmentScheduleAmountUpdate$1$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountDuxo2.accept$lambda$0((RecurringOrderAmountViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountViewState accept$lambda$0(RecurringOrderAmountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountViewState.copy$default(applyMutation, null, null, null, null, null, RecurringOrderAmountViewState.UpdateAmountState.Updating.INSTANCE, null, 95, null);
    }
}
