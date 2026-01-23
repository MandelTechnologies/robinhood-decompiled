package com.robinhood.android.indexes.detail.components.appbar;

import com.robinhood.android.common.detail.component.appbar.DetailPageTopAppBarViewState;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.StateProvider;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndexDetailPageTopAppBarStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/appbar/IndexDetailPageTopAppBarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/indexes/detail/components/appbar/IndexDetailPageTopAppBarDataState;", "Lcom/robinhood/android/common/detail/component/appbar/DetailPageTopAppBarViewState;", "<init>", "()V", "reduce", "dataState", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndexDetailPageTopAppBarStateProvider implements StateProvider<IndexDetailPageTopAppBarDataState, DetailPageTopAppBarViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public DetailPageTopAppBarViewState reduce(IndexDetailPageTopAppBarDataState dataState) {
        String symbol;
        BigDecimal value;
        String str;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        IndexValue indexValue = dataState.getIndexValue();
        String str2 = "";
        if (indexValue == null || (symbol = indexValue.getSymbol()) == null) {
            symbol = "";
        }
        IndexValue indexValue2 = dataState.getIndexValue();
        if (indexValue2 != null && (value = indexValue2.getValue()) != null && (str = Formats.getValueFormat().format(value)) != null) {
            str2 = str;
        }
        return new DetailPageTopAppBarViewState(symbol, str2);
    }
}
