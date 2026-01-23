package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation;

import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassBreakdownDto;
import kotlin.Metadata;

/* compiled from: AdvsoryPortfolioRevealAllocationComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationCallbacks;", "", "onContinueClicked", "", "onAdjustPortfolioClicked", "onShowAssetClassBreakdown", "breakdown", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "onBackClicked", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.PortfolioRevealAllocationCallbacks, reason: use source file name */
/* loaded from: classes7.dex */
public interface AdvsoryPortfolioRevealAllocationComposable7 {
    void onAdjustPortfolioClicked();

    void onBackClicked();

    void onContinueClicked();

    void onShowAssetClassBreakdown(PortfolioRevealAssetClassBreakdownDto breakdown);
}
