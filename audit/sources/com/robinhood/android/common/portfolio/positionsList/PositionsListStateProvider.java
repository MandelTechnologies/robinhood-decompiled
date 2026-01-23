package com.robinhood.android.common.portfolio.positionsList;

import com.robinhood.android.common.portfolio.positionsList.PositionsListViewState;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState;", "<init>", "()V", "reduce", "dataState", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PositionsListStateProvider implements StateProvider<PositionsListDataState, PositionsListViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public PositionsListViewState reduce(PositionsListDataState dataState) {
        PositionsDisplayOptions.PositionsDisplayOption defaultOption;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getItems() == null) {
            return PositionsListViewState.Loading.INSTANCE;
        }
        String selectedDisplayType = dataState.getSelectedDisplayType();
        if (selectedDisplayType == null) {
            PositionsDisplayOptions displayOptions = dataState.getDisplayOptions();
            selectedDisplayType = (displayOptions == null || (defaultOption = displayOptions.getDefaultOption()) == null) ? null : defaultOption.getQueryValue();
            if (selectedDisplayType == null) {
                selectedDisplayType = "last-price";
            }
        }
        return new PositionsListViewState.Ready(selectedDisplayType, dataState.getHeader(), dataState.getFooter(), dataState.getItems(), dataState.getReorderPending(), dataState.getAnimateItemPlacement(), dataState.getShouldHeaderShimmer());
    }
}
