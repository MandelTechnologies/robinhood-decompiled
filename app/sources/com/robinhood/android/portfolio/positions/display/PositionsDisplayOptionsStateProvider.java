package com.robinhood.android.portfolio.positions.display;

import com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PositionsDisplayOptionsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDataState;", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState;", "<init>", "()V", "reduce", "dataState", "lib-positions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PositionsDisplayOptionsStateProvider implements StateProvider<PositionsDisplayOptionsDataState, PositionsDisplayOptionsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public PositionsDisplayOptionsViewState reduce(PositionsDisplayOptionsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getDisplayOptions() == null || dataState.isMcwCurrencySwitcherEnabled() == null) {
            return PositionsDisplayOptionsViewState.Loading.INSTANCE;
        }
        String title = dataState.getDisplayOptions().getTitle();
        String selectedDisplayType = dataState.getSelectedDisplayType();
        if (selectedDisplayType == null) {
            selectedDisplayType = dataState.getDisplayOptions().getDefaultOption().getQueryValue();
        }
        return new PositionsDisplayOptionsViewState.Ready(title, selectedDisplayType, extensions2.toImmutableList(dataState.getDisplayOptions().getOptions()), dataState.isMcwCurrencySwitcherEnabled().booleanValue());
    }
}
