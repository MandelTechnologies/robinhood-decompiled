package com.robinhood.android.indexes.detail.components.fundamentals;

import com.robinhood.android.common.detail.component.C11117R;
import com.robinhood.android.common.detail.component.fundamentals.DetailPageFundamentalsDataCell;
import com.robinhood.android.common.detail.component.fundamentals.DetailPageFundamentalsViewState;
import com.robinhood.android.indexes.detail.utils.FormatsUtils;
import com.robinhood.android.indexes.models.p159db.IndexFundamentals;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: IndexDetailPageFundamentalsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsDataState;", "Lcom/robinhood/android/common/detail/component/fundamentals/DetailPageFundamentalsViewState;", "<init>", "()V", "reduce", "dataState", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageFundamentalsStateProvider implements StateProvider<IndexDetailPageFundamentalsDataState, DetailPageFundamentalsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public DetailPageFundamentalsViewState reduce(IndexDetailPageFundamentalsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        int i = C11117R.string.f3978xccbda75c;
        IndexFundamentals fundamentals = dataState.getFundamentals();
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell = new DetailPageFundamentalsDataCell(i, FormatsUtils.formatDecimal$default(fundamentals != null ? fundamentals.getHigh52Weeks() : null, null, 2, null));
        int i2 = C11117R.string.gated_fundamentals_detail_page_fundamentals_section_low_52_weeks;
        IndexFundamentals fundamentals2 = dataState.getFundamentals();
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell2 = new DetailPageFundamentalsDataCell(i2, FormatsUtils.formatDecimal$default(fundamentals2 != null ? fundamentals2.getLow52Weeks() : null, null, 2, null));
        int i3 = C11117R.string.gated_fundamentals_detail_page_fundamentals_section_pe_ratio;
        IndexFundamentals fundamentals3 = dataState.getFundamentals();
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell3 = new DetailPageFundamentalsDataCell(i3, FormatsUtils.formatDecimal$default(fundamentals3 != null ? fundamentals3.getPeRatio() : null, null, 2, null));
        int i4 = C11117R.string.gated_fundamentals_detail_page_fundamentals_section_high;
        IndexFundamentals fundamentals4 = dataState.getFundamentals();
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell4 = new DetailPageFundamentalsDataCell(i4, FormatsUtils.formatDecimal$default(fundamentals4 != null ? fundamentals4.getHigh() : null, null, 2, null));
        int i5 = C11117R.string.gated_fundamentals_detail_page_fundamentals_section_low;
        IndexFundamentals fundamentals5 = dataState.getFundamentals();
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell5 = new DetailPageFundamentalsDataCell(i5, FormatsUtils.formatDecimal$default(fundamentals5 != null ? fundamentals5.getLow() : null, null, 2, null));
        int i6 = C11117R.string.gated_fundamentals_detail_page_fundamentals_section_open;
        IndexFundamentals fundamentals6 = dataState.getFundamentals();
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell6 = new DetailPageFundamentalsDataCell(i6, FormatsUtils.formatDecimal$default(fundamentals6 != null ? fundamentals6.getOpen() : null, null, 2, null));
        int i7 = C11117R.string.f3979x9cdcf86e;
        IndexFundamentals fundamentals7 = dataState.getFundamentals();
        return new DetailPageFundamentalsViewState(extensions2.persistentListOf(detailPageFundamentalsDataCell6, detailPageFundamentalsDataCell4, detailPageFundamentalsDataCell5, new DetailPageFundamentalsDataCell(i7, FormatsUtils.formatDecimal$default(fundamentals7 != null ? fundamentals7.getPreviousClose() : null, null, 2, null)), detailPageFundamentalsDataCell, detailPageFundamentalsDataCell2, detailPageFundamentalsDataCell3), dataState.getHasStatToShow());
    }
}
