package com.robinhood.store.futures;

import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.trading.autosend.AutoSendModule2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.p404di.FuturesChartTypePref;
import com.robinhood.store.futures.p404di.FuturesContinuousChartPref;
import com.robinhood.store.futures.p404di.FuturesTimeInForcePref;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0006J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\bJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesSettingsStore;", "Lcom/robinhood/store/Store;", "ladderAutoSendPref", "Lcom/robinhood/prefs/BooleanPreference;", "timeInForcePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "chartTypePref", "Lcom/robinhood/store/futures/ChartType;", "continuousChartPref", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)V", "streamAutoSendPref", "Lio/reactivex/Observable;", "", "setAutoSendPref", "", "autoSend", "streamTimeInForcePref", "setTimeInForce", "timeInForce", "streamChartType", "setChartType", "chartType", "streamContinuousChartSetting", "setIsContinuousChart", "isContinuous", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FuturesSettingsStore extends Store {
    private final EnumPreference<ChartType> chartTypePref;
    private final BooleanPreference continuousChartPref;
    private final BooleanPreference ladderAutoSendPref;
    private final EnumPreference<FuturesTimeInForce> timeInForcePref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesSettingsStore(@AutoSendModule2 BooleanPreference ladderAutoSendPref, @FuturesTimeInForcePref EnumPreference<FuturesTimeInForce> timeInForcePref, @FuturesChartTypePref EnumPreference<ChartType> chartTypePref, @FuturesContinuousChartPref BooleanPreference continuousChartPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ladderAutoSendPref, "ladderAutoSendPref");
        Intrinsics.checkNotNullParameter(timeInForcePref, "timeInForcePref");
        Intrinsics.checkNotNullParameter(chartTypePref, "chartTypePref");
        Intrinsics.checkNotNullParameter(continuousChartPref, "continuousChartPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ladderAutoSendPref = ladderAutoSendPref;
        this.timeInForcePref = timeInForcePref;
        this.chartTypePref = chartTypePref;
        this.continuousChartPref = continuousChartPref;
    }

    public final Observable<Boolean> streamAutoSendPref() {
        return this.ladderAutoSendPref.getChanges();
    }

    public final void setAutoSendPref(boolean autoSend) {
        this.ladderAutoSendPref.set(autoSend);
    }

    public final Observable<FuturesTimeInForce> streamTimeInForcePref() {
        return this.timeInForcePref.getChanges();
    }

    public final void setTimeInForce(FuturesTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        this.timeInForcePref.set(timeInForce);
    }

    public final Observable<ChartType> streamChartType() {
        return this.chartTypePref.getChanges();
    }

    public final void setChartType(ChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        this.chartTypePref.set(chartType);
    }

    public final Observable<Boolean> streamContinuousChartSetting() {
        return this.continuousChartPref.getChanges();
    }

    public final void setIsContinuousChart(boolean isContinuous) {
        this.continuousChartPref.set(isContinuous);
    }
}
