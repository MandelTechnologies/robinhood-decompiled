package com.robinhood.android.cash.rhy.tab.p077v2.settings.limits;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MatchaLimitsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class MatchaLimitsFragment4 extends FunctionReferenceImpl implements Function2<Integer, Integer, Unit> {
    MatchaLimitsFragment4(Object obj) {
        super(2, obj, MatchaLimitsFragment.class, "showInfoSheet", "showInfoSheet(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        ((MatchaLimitsFragment) this.receiver).showInfoSheet(i, i2);
    }
}
