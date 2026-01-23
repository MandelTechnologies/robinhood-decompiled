package com.robinhood.android.options.portfolioriskanalyzer;

import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$8$3$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C23450xe4d34b40 extends FunctionReferenceImpl implements Function3<UUID, List<? extends UUID>, Boolean, Unit> {
    C23450xe4d34b40(Object obj) {
        super(3, obj, OptionsPortfolioRiskAnalyzerPositionDuxo.class, "onAggregateOptionRowCheckedChanged", "onAggregateOptionRowCheckedChanged(Ljava/util/UUID;Ljava/util/List;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, List<? extends UUID> list, Boolean bool) {
        invoke(uuid, (List<UUID>) list, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(UUID p0, List<UUID> p1, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((OptionsPortfolioRiskAnalyzerPositionDuxo) this.receiver).onAggregateOptionRowCheckedChanged(p0, p1, z);
    }
}
