package com.robinhood.android.advisory.insights.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AdvisoryInsightDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AdvisoryInsightDetailFragment2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    AdvisoryInsightDetailFragment2(Object obj) {
        super(1, obj, AdvisoryInsightDetailDuxo.class, "onNavInsight", "onNavInsight(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((AdvisoryInsightDetailDuxo) this.receiver).onNavInsight(z);
    }
}
