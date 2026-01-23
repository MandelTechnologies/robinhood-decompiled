package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown;

import com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AdvisoryPortfolioRevealAssetBreakdownFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AdvisoryPortfolioRevealAssetBreakdownFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AdvisoryPortfolioRevealAssetBreakdownFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    AdvisoryPortfolioRevealAssetBreakdownFragment2(Object obj) {
        super(0, obj, AdvisoryPortfolioRevealAssetBreakdownFragment.Callbacks.class, "onShowInvestorProfileUpdate", "onShowInvestorProfileUpdate()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AdvisoryPortfolioRevealAssetBreakdownFragment.Callbacks) this.receiver).onShowInvestorProfileUpdate();
    }
}
