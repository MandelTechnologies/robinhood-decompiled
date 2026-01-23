package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, m3636d2 = {"getRowIdForLegPosition", "", "aggregatePositionId", "Ljava/util/UUID;", "instrumentPositionId", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerOptionPositionRowViewState2 {
    public static final String getRowIdForLegPosition(UUID aggregatePositionId, UUID instrumentPositionId) {
        Intrinsics.checkNotNullParameter(aggregatePositionId, "aggregatePositionId");
        Intrinsics.checkNotNullParameter(instrumentPositionId, "instrumentPositionId");
        return aggregatePositionId + "-" + instrumentPositionId;
    }
}
