package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation;

import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioRevealAllocationViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationViewState;", "", "portfolioReveal", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "<init>", "(Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;)V", "getPortfolioReveal", "()Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PortfolioRevealAllocationViewState {
    public static final int $stable = 8;
    private final GetPortfolioRevealResponseDto portfolioReveal;

    public static /* synthetic */ PortfolioRevealAllocationViewState copy$default(PortfolioRevealAllocationViewState portfolioRevealAllocationViewState, GetPortfolioRevealResponseDto getPortfolioRevealResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            getPortfolioRevealResponseDto = portfolioRevealAllocationViewState.portfolioReveal;
        }
        return portfolioRevealAllocationViewState.copy(getPortfolioRevealResponseDto);
    }

    /* renamed from: component1, reason: from getter */
    public final GetPortfolioRevealResponseDto getPortfolioReveal() {
        return this.portfolioReveal;
    }

    public final PortfolioRevealAllocationViewState copy(GetPortfolioRevealResponseDto portfolioReveal) {
        Intrinsics.checkNotNullParameter(portfolioReveal, "portfolioReveal");
        return new PortfolioRevealAllocationViewState(portfolioReveal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PortfolioRevealAllocationViewState) && Intrinsics.areEqual(this.portfolioReveal, ((PortfolioRevealAllocationViewState) other).portfolioReveal);
    }

    public int hashCode() {
        return this.portfolioReveal.hashCode();
    }

    public String toString() {
        return "PortfolioRevealAllocationViewState(portfolioReveal=" + this.portfolioReveal + ")";
    }

    public PortfolioRevealAllocationViewState(GetPortfolioRevealResponseDto portfolioReveal) {
        Intrinsics.checkNotNullParameter(portfolioReveal, "portfolioReveal");
        this.portfolioReveal = portfolioReveal;
    }

    public final GetPortfolioRevealResponseDto getPortfolioReveal() {
        return this.portfolioReveal;
    }
}
