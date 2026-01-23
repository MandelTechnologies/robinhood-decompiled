package com.robinhood.android.retirement.gold;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RetirementGoldPromo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.gold.RetirementGoldPromoKt$RetirementGoldPromo$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RetirementGoldPromo6 extends FunctionReferenceImpl implements Function0<Unit> {
    RetirementGoldPromo6(Object obj) {
        super(0, obj, RetirementGoldPromo4.class, "onCloseClicked", "onCloseClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RetirementGoldPromo4) this.receiver).onCloseClicked();
    }
}
