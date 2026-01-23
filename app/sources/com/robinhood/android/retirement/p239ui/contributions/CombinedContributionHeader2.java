package com.robinhood.android.retirement.p239ui.contributions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CombinedContributionHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.contributions.CombinedContributionHeaderKt$ContributionRing$2$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class CombinedContributionHeader2 extends FunctionReferenceImpl implements Function0<Unit> {
    CombinedContributionHeader2(Object obj) {
        super(0, obj, CombinedContributionHeader5.class, "onRingAnimationSet", "onRingAnimationSet()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CombinedContributionHeader5) this.receiver).onRingAnimationSet();
    }
}
