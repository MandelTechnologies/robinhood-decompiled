package com.robinhood.android.advisory.onboarding.portfolioreveal.intro;

import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryPortfolioRevealIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AdvisoryPortfolioRevealIntroFragment2 extends FunctionReferenceImpl implements Function1<GetPortfolioRevealResponseDto, Unit> {
    AdvisoryPortfolioRevealIntroFragment2(Object obj) {
        super(1, obj, AdvisoryPortfolioRevealIntroFragment.Callbacks.class, "onContinueIntro", "onContinueIntro(Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetPortfolioRevealResponseDto getPortfolioRevealResponseDto) {
        invoke2(getPortfolioRevealResponseDto);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GetPortfolioRevealResponseDto p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AdvisoryPortfolioRevealIntroFragment.Callbacks) this.receiver).onContinueIntro(p0);
    }
}
