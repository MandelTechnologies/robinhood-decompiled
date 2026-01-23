package com.robinhood.android.common.search;

import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsHeaderRowViewExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"bindHeader", "", "Lcom/robinhood/android/designsystem/row/RdsHeaderRowView;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/common/search/SearchItem$SearchHeader;", "lib-investment-search_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.search.RdsHeaderRowViewExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RdsHeaderRowViewExtensions {
    public static final void bindHeader(RdsHeaderRowView rdsHeaderRowView, SearchItem.SearchHeader item) {
        Intrinsics.checkNotNullParameter(rdsHeaderRowView, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        RdsHeaderRowView.bind$default(rdsHeaderRowView, item.getHeaderText(), false, false, null, null, 30, null);
    }
}
