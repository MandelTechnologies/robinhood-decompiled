package com.robinhood.android.options.portfolioriskanalyzer;

import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$6$1$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C23447xe4b714bc extends FunctionReferenceImpl implements Function2<UUID, Boolean, Unit> {
    C23447xe4b714bc(Object obj) {
        super(2, obj, OptionsPortfolioRiskAnalyzerPositionDuxo.class, "onEquityRowCheckedChanged", "onEquityRowCheckedChanged(Ljava/util/UUID;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, Boolean bool) {
        invoke(uuid, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(UUID p0, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionsPortfolioRiskAnalyzerPositionDuxo) this.receiver).onEquityRowCheckedChanged(p0, z);
    }
}
