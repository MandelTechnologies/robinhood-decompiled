package com.robinhood.android.search.highlights.p249ui.subpages;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchHighlightSubpageData.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"getDisplayTitle", "", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "(Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.highlights.ui.subpages.SearchHighlightSubpageDataKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightSubpageData2 {
    public static final String getDisplayTitle(SearchHighlightSubpageData searchHighlightSubpageData, Composer composer, int i) {
        String title;
        Intrinsics.checkNotNullParameter(searchHighlightSubpageData, "<this>");
        composer.startReplaceGroup(-295760340);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-295760340, i, -1, "com.robinhood.android.search.highlights.ui.subpages.getDisplayTitle (SearchHighlightSubpageData.kt:45)");
        }
        if (searchHighlightSubpageData instanceof SearchHighlightSubpageData.Now) {
            title = StringResources_androidKt.stringResource(((SearchHighlightSubpageData.Now) searchHighlightSubpageData).getTitleRes(), composer, 0);
        } else {
            if (!(searchHighlightSubpageData instanceof SearchHighlightSubpageData.Remote)) {
                throw new NoWhenBranchMatchedException();
            }
            title = ((SearchHighlightSubpageData.Remote) searchHighlightSubpageData).getDto().getTitle();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return title;
    }
}
