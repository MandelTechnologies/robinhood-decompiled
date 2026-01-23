package com.robinhood.android.options.portfolioriskanalyzer;

import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$8$4$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C23451xe4d34f01 extends FunctionReferenceImpl implements Function4<UUID, UUID, List<? extends UUID>, Boolean, Unit> {
    C23451xe4d34f01(Object obj) {
        super(4, obj, OptionsPortfolioRiskAnalyzerPositionDuxo.class, "onLegOptionRowCheckedChanged", "onLegOptionRowCheckedChanged(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/List;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, UUID uuid2, List<? extends UUID> list, Boolean bool) {
        invoke(uuid, uuid2, (List<UUID>) list, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(UUID p0, UUID p1, List<UUID> p2, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((OptionsPortfolioRiskAnalyzerPositionDuxo) this.receiver).onLegOptionRowCheckedChanged(p0, p1, p2, z);
    }
}
