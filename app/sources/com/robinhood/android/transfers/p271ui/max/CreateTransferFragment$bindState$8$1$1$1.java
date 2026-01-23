package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.lib.transfers.AchTransferOption;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CreateTransferFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CreateTransferFragment$bindState$8$1$1$1 extends FunctionReferenceImpl implements Function1<AchTransferOption, Unit> {
    CreateTransferFragment$bindState$8$1$1$1(Object obj) {
        super(1, obj, CreateTransferDuxo.class, "selectAchTransferOption", "selectAchTransferOption(Lcom/robinhood/android/lib/transfers/AchTransferOption;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AchTransferOption achTransferOption) {
        invoke2(achTransferOption);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AchTransferOption achTransferOption) {
        ((CreateTransferDuxo) this.receiver).selectAchTransferOption(achTransferOption);
    }
}
