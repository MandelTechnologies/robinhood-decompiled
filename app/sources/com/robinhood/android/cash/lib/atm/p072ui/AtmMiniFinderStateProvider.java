package com.robinhood.android.cash.lib.atm.p072ui;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AtmMiniFinderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderDataState;", "Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderV2ViewState;", "<init>", "()V", "reduce", "dataState", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AtmMiniFinderStateProvider implements StateProvider<AtmMiniFinderDataState, AtmMiniFinderV2ViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AtmMiniFinderV2ViewState reduce(AtmMiniFinderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new AtmMiniFinderV2ViewState(dataState.getLatLngZoom(), dataState.getAtmPositions());
    }
}
