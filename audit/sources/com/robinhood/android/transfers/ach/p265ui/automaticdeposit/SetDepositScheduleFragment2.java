package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import com.robinhood.models.api.ApiDepositSchedule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SetDepositScheduleFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleFragment$adapter$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SetDepositScheduleFragment2 extends FunctionReferenceImpl implements Function1<ApiDepositSchedule.Frequency, Unit> {
    SetDepositScheduleFragment2(Object obj) {
        super(1, obj, SetDepositScheduleFragment.class, "onRowClicked", "onRowClicked(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApiDepositSchedule.Frequency frequency) {
        invoke2(frequency);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApiDepositSchedule.Frequency p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SetDepositScheduleFragment) this.receiver).onRowClicked(p0);
    }
}
