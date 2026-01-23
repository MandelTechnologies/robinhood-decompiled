package com.robinhood.android.transfers.i18n;

import com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransfersHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class InternationalTransfersHubFragment$onViewCreated$2$1$1$2$3$1 extends FunctionReferenceImpl implements Function1<InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow, Unit> {
    InternationalTransfersHubFragment$onViewCreated$2$1$1$2$3$1(Object obj) {
        super(1, obj, InternationalTransfersHubDuxo.class, "onActionRowClick", "onActionRowClick(Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$ActionBarWithRows$ActionRow;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow actionRow) {
        invoke2(actionRow);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InternationalTransfersHubDuxo) this.receiver).onActionRowClick(p0);
    }
}
