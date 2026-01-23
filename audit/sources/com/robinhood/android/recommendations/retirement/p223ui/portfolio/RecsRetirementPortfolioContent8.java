package com.robinhood.android.recommendations.retirement.p223ui.portfolio;

import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsRetirementPortfolioContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioContentKt$Portfolio$1$2$1$3$1$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecsRetirementPortfolioContent8 extends FunctionReferenceImpl implements Function1<ApiRecsRetirementPortfolio.Prospectus, Unit> {
    RecsRetirementPortfolioContent8(Object obj) {
        super(1, obj, RecsRetirementPortfolioContent3.class, "onProspectusClicked", "onProspectusClicked(Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio$Prospectus;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApiRecsRetirementPortfolio.Prospectus prospectus) {
        invoke2(prospectus);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApiRecsRetirementPortfolio.Prospectus p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RecsRetirementPortfolioContent3) this.receiver).onProspectusClicked(p0);
    }
}
