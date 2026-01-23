package com.robinhood.android.cash.rhy.tab.p077v2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RhyOverviewFragmentV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class RhyOverviewFragmentV2$AccountSection$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    RhyOverviewFragmentV2$AccountSection$1$1(Object obj) {
        super(0, obj, RhyOverviewFragmentV2.class, "onClickSettings", "onClickSettings()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RhyOverviewFragmentV2) this.receiver).onClickSettings();
    }
}
