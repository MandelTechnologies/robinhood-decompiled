package com.robinhood.android.transfers.p271ui.updaterecurring;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UpdateRecurringDepositFrequencyComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$RecurringFrequencyUpsellContent$1$1$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class UpdateRecurringDepositFrequencyComposable5 extends FunctionReferenceImpl implements Function0<Unit> {
    UpdateRecurringDepositFrequencyComposable5(Object obj) {
        super(0, obj, AppCompatActivity.class, "finish", "finish()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AppCompatActivity) this.receiver).finish();
    }
}
