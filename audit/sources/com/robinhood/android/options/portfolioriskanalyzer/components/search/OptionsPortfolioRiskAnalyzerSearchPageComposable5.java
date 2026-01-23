package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchPageComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$1$2$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionsPortfolioRiskAnalyzerSearchPageComposable5 extends FunctionReferenceImpl implements Function0<Unit> {
    OptionsPortfolioRiskAnalyzerSearchPageComposable5(Object obj) {
        super(0, obj, OptionsPortfolioRiskAnalyzerSearchDuxo.class, "clearQuery", "clearQuery()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OptionsPortfolioRiskAnalyzerSearchDuxo) this.receiver).clearQuery();
    }
}
