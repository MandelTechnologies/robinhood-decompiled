package com.robinhood.android.futures.assethome;

import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.futures.assethome.sections.FuturesBuyingPowerViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import com.robinhood.android.udf.StateProvider;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import microgram.android.Monitoring;

/* compiled from: FuturesAssetHomeStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/FuturesAssetHomeStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDataState;", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesAssetHomeStateProvider implements StateProvider<FuturesAssetHomeDataState, FuturesAssetHomeViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesAssetHomeViewState reduce(FuturesAssetHomeDataState dataState) {
        LoggableViewState2 loading;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getAssetHomeOrder().isEmpty()) {
            return new FuturesAssetHomeViewState(null, null, FuturesAssetHomeStateProvider2.assetHomeLoadingDefaultOrder, null, null, false, false, new LoggableViewState2.Loading(null, 1, null), false);
        }
        String accountNumber = dataState.getAccountNumber();
        UUID futuresSubAccountId = dataState.getFuturesSubAccountId();
        ImmutableList immutableList = extensions2.toImmutableList(dataState.getAssetHomeOrder());
        String disclosureMarkdown = dataState.getDisclosureMarkdown();
        ApiFuturesBuyingPower futuresBuyingPower = dataState.getFuturesBuyingPower();
        FuturesBuyingPowerViewState futuresBuyingPowerViewState = futuresBuyingPower != null ? new FuturesBuyingPowerViewState(Formats.getCurrencyFormat().format(futuresBuyingPower.getFutures_buying_power()), Formats.getCurrencyFormat().format(futuresBuyingPower.getFutures_margin_requirement())) : null;
        boolean zIsChartLoaded = dataState.isChartLoaded();
        Boolean hasPositions = dataState.getHasPositions();
        Boolean bool = Boolean.FALSE;
        boolean z = Intrinsics.areEqual(hasPositions, bool) && Intrinsics.areEqual(dataState.getHasPendingOrders(), bool);
        if (Intrinsics.areEqual(dataState.getMicrogramState(), Monitoring.Loading.INSTANCE) || dataState.getAccountNumber() == null || dataState.getDisclosureMarkdown() == null) {
            loading = new LoggableViewState2.Loading(null, 1, null);
        } else {
            loading = new LoggableViewState2.Completed(null, null, 3, null);
        }
        return new FuturesAssetHomeViewState(accountNumber, futuresSubAccountId, immutableList, disclosureMarkdown, futuresBuyingPowerViewState, z, zIsChartLoaded, loading, dataState.getShowToolbarSearchIcon());
    }
}
