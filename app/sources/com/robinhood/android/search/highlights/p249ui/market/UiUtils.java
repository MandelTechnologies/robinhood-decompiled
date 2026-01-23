package com.robinhood.android.search.highlights.p249ui.market;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UiUtils.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"spaceAfterSubtitle", "Landroidx/compose/ui/unit/Dp;", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;", "getSpaceAfterSubtitle", "(Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;Landroidx/compose/runtime/Composer;I)F", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.market.UiUtilsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class UiUtils {
    @JvmName
    public static final float getSpaceAfterSubtitle(SearchHighlightChartData searchHighlightChartData, Composer composer, int i) {
        float fM21591getLargeD9Ej5fM;
        Intrinsics.checkNotNullParameter(searchHighlightChartData, "<this>");
        composer.startReplaceGroup(1745652603);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745652603, i, -1, "com.robinhood.android.search.highlights.ui.market.<get-spaceAfterSubtitle> (UiUtils.kt:9)");
        }
        if (searchHighlightChartData.getSubtitle() == null) {
            fM21591getLargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM();
        } else {
            fM21591getLargeD9Ej5fM = C2002Dp.m7995constructorimpl(12);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM21591getLargeD9Ej5fM;
    }
}
