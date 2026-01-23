package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AccountSelectionComposableKt$AccountSelectionComposable$5$1 extends FunctionReferenceImpl implements Function1<AccountSelectionDuxo.AlertSheetAction, Unit> {
    AccountSelectionComposableKt$AccountSelectionComposable$5$1(Object obj) {
        super(1, obj, AccountSelectionDuxo.class, "handleAlertSheetAction", "handleAlertSheetAction(Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AccountSelectionDuxo.AlertSheetAction alertSheetAction) {
        invoke2(alertSheetAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AccountSelectionDuxo.AlertSheetAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AccountSelectionDuxo) this.receiver).handleAlertSheetAction(p0);
    }
}
