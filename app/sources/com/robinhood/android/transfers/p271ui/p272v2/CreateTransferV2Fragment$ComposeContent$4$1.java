package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2DataRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CreateTransferV2Fragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CreateTransferV2Fragment$ComposeContent$4$1 extends FunctionReferenceImpl implements Function1<CreateTransferV2DataRowState.OnClickAction, Unit> {
    CreateTransferV2Fragment$ComposeContent$4$1(Object obj) {
        super(1, obj, CreateTransferV2Duxo.class, "onRowClick", "onRowClick(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CreateTransferV2DataRowState.OnClickAction onClickAction) {
        invoke2(onClickAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CreateTransferV2DataRowState.OnClickAction onClickAction) {
        ((CreateTransferV2Duxo) this.receiver).onRowClick(onClickAction);
    }
}
