package com.robinhood.android.settings.p254ui.recurring.insights;

import com.robinhood.android.settings.p254ui.recurring.insights.InvestmentInsightsFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InvestmentInsightsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.recurring.insights.InvestmentInsightsFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class InvestmentInsightsFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    InvestmentInsightsFragment2(Object obj) {
        super(0, obj, InvestmentInsightsFragment.Callbacks.class, "onEditButtonClicked", "onEditButtonClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InvestmentInsightsFragment.Callbacks) this.receiver).onEditButtonClicked();
    }
}
