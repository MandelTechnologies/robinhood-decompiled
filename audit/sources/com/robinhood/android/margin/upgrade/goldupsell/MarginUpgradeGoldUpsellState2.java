package com.robinhood.android.margin.upgrade.goldupsell;

import com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellState3;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeGoldUpsellState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellDataState;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;", "<init>", "()V", "reduce", "dataState", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellStateProvider, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeGoldUpsellState2 implements StateProvider<MarginUpgradeGoldUpsellDataState, MarginUpgradeGoldUpsellState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MarginUpgradeGoldUpsellState3 reduce(MarginUpgradeGoldUpsellDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return dataState.getStandardPageTemplate() != null ? new MarginUpgradeGoldUpsellState3.Loaded(dataState.getStandardPageTemplate()) : dataState.getThrowable() != null ? new MarginUpgradeGoldUpsellState3.Error(dataState.getThrowable()) : MarginUpgradeGoldUpsellState3.Loading.INSTANCE;
    }
}
