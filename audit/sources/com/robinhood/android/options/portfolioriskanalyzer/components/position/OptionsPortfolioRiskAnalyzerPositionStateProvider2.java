package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¨\u0006\b"}, m3636d2 = {"allPositionRowsChecked", "", "equityRowId", "", "instrumentOptionPositionRowIds", "", "rowIdToChecked", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionStateProviderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerPositionStateProvider2 {
    public static final boolean allPositionRowsChecked(String str, List<String> instrumentOptionPositionRowIds, Map<String, Boolean> rowIdToChecked) {
        Intrinsics.checkNotNullParameter(instrumentOptionPositionRowIds, "instrumentOptionPositionRowIds");
        Intrinsics.checkNotNullParameter(rowIdToChecked, "rowIdToChecked");
        if (str != null && Intrinsics.areEqual(rowIdToChecked.get(str), Boolean.FALSE)) {
            return false;
        }
        List<String> list = instrumentOptionPositionRowIds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(rowIdToChecked.get((String) it.next()), Boolean.FALSE)) {
                return false;
            }
        }
        return true;
    }
}
