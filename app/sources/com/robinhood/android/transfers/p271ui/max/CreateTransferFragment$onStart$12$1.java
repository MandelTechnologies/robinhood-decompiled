package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.advisory.contracts.AdvisoryFullWithdrawalKey;
import com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CreateTransferFragment$onStart$12$1 extends FunctionReferenceImpl implements Function1<AdvisoryFullWithdrawalKey, Unit> {
    CreateTransferFragment$onStart$12$1(Object obj) {
        super(1, obj, BaseCreateTransferFragment.Callbacks.class, "onLaunchAdvisoryFullWithdrawal", "onLaunchAdvisoryFullWithdrawal(Lcom/robinhood/android/advisory/contracts/AdvisoryFullWithdrawalKey;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdvisoryFullWithdrawalKey advisoryFullWithdrawalKey) {
        invoke2(advisoryFullWithdrawalKey);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdvisoryFullWithdrawalKey p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BaseCreateTransferFragment.Callbacks) this.receiver).onLaunchAdvisoryFullWithdrawal(p0);
    }
}
