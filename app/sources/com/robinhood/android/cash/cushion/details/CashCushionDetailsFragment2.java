package com.robinhood.android.cash.cushion.details;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CashCushionDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.cushion.details.CashCushionDetailsFragment$CashCushionDetailsLoadedComposable$1$2$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class CashCushionDetailsFragment2 extends AdaptedFunctionReference implements Function0<Unit> {
    CashCushionDetailsFragment2(Object obj) {
        super(0, obj, CashCushionDetailsFragment.class, "dismiss", "dismiss(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CashCushionDetailsFragment.dismiss$default((CashCushionDetailsFragment) this.receiver, false, 1, null);
    }
}
