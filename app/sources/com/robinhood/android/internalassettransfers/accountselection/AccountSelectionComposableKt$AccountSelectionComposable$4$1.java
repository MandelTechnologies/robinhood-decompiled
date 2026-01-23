package com.robinhood.android.internalassettransfers.accountselection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AccountSelectionComposableKt$AccountSelectionComposable$4$1 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountSelectionComposableKt$AccountSelectionComposable$4$1(Object obj) {
        super(0, obj, AccountSelectionDuxo.class, "dismissErrorDialog", "dismissErrorDialog()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountSelectionDuxo) this.receiver).dismissErrorDialog();
    }
}
