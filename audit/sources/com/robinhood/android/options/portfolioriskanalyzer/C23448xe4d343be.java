package com.robinhood.android.options.portfolioriskanalyzer;

import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$8$1$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C23448xe4d343be extends FunctionReferenceImpl implements Function2<String, Boolean, Unit> {
    C23448xe4d343be(Object obj) {
        super(2, obj, OptionsPortfolioRiskAnalyzerPositionDuxo.class, "onExpandOrCollapse", "onExpandOrCollapse(Ljava/lang/String;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
        invoke(str, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(String p0, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionsPortfolioRiskAnalyzerPositionDuxo) this.receiver).onExpandOrCollapse(p0, z);
    }
}
