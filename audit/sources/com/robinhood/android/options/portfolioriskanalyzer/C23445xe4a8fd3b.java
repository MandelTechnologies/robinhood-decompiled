package com.robinhood.android.options.portfolioriskanalyzer;

import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$5$1$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C23445xe4a8fd3b extends FunctionReferenceImpl implements Function0<Unit> {
    C23445xe4a8fd3b(Object obj) {
        super(0, obj, OptionsPortfolioRiskAnalyzerPositionDuxo.class, "onSelectOrDeselectAllClicked", "onSelectOrDeselectAllClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OptionsPortfolioRiskAnalyzerPositionDuxo) this.receiver).onSelectOrDeselectAllClicked();
    }
}
