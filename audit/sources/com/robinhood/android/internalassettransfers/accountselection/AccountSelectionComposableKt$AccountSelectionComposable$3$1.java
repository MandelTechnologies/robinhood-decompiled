package com.robinhood.android.internalassettransfers.accountselection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AccountSelectionComposableKt$AccountSelectionComposable$3$1 extends FunctionReferenceImpl implements Function2<UiIatAccount, UiIatAccount, Unit> {
    AccountSelectionComposableKt$AccountSelectionComposable$3$1(Object obj) {
        super(2, obj, AccountSelectionDuxo.class, "validateAccountPair", "validateAccountPair(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2) {
        invoke2(uiIatAccount, uiIatAccount2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UiIatAccount p0, UiIatAccount p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((AccountSelectionDuxo) this.receiver).validateAccountPair(p0, p1);
    }
}
