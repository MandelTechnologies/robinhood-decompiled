package com.robinhood.android.equitytradeladder.provider;

import com.robinhood.android.equities.ladderftux.prefs.EquityTradeLadderFtuxPref;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import com.robinhood.android.equitytradeladder.prefs.EquityTradeLadderNuxPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.trading.tradecomponentscompose.C41061R;
import com.robinhood.store.futures.p404di.FuturesFtuxPref3;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderNuxScreenProvider.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider;", "", "equityTradeLadderNuxSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "futuresTradeLadderFtuxShouldShowPref", "shouldShowEquityLadderFtuxPref", "tradeSettingsStore", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;)V", "determineFirstScreen", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "skipNux", "", "setLadderNuxSeen", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class LadderNuxScreenProvider {
    public static final int $stable = 8;
    private final BooleanPreference equityTradeLadderNuxSeenPref;
    private final BooleanPreference futuresTradeLadderFtuxShouldShowPref;
    private final BooleanPreference shouldShowEquityLadderFtuxPref;
    private final TradeSettingsStore tradeSettingsStore;

    public LadderNuxScreenProvider(@EquityTradeLadderNuxPref BooleanPreference equityTradeLadderNuxSeenPref, @FuturesFtuxPref3 BooleanPreference futuresTradeLadderFtuxShouldShowPref, @EquityTradeLadderFtuxPref BooleanPreference shouldShowEquityLadderFtuxPref, TradeSettingsStore tradeSettingsStore) {
        Intrinsics.checkNotNullParameter(equityTradeLadderNuxSeenPref, "equityTradeLadderNuxSeenPref");
        Intrinsics.checkNotNullParameter(futuresTradeLadderFtuxShouldShowPref, "futuresTradeLadderFtuxShouldShowPref");
        Intrinsics.checkNotNullParameter(shouldShowEquityLadderFtuxPref, "shouldShowEquityLadderFtuxPref");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        this.equityTradeLadderNuxSeenPref = equityTradeLadderNuxSeenPref;
        this.futuresTradeLadderFtuxShouldShowPref = futuresTradeLadderFtuxShouldShowPref;
        this.shouldShowEquityLadderFtuxPref = shouldShowEquityLadderFtuxPref;
        this.tradeSettingsStore = tradeSettingsStore;
    }

    public final LadderScreenState determineFirstScreen(boolean skipNux) {
        if (skipNux) {
            this.equityTradeLadderNuxSeenPref.set(true);
            this.shouldShowEquityLadderFtuxPref.set(false);
            return LadderScreenState.Ladder.INSTANCE;
        }
        if (!this.futuresTradeLadderFtuxShouldShowPref.get()) {
            if (!this.equityTradeLadderNuxSeenPref.get() && !this.tradeSettingsStore.getAutoSendPref(TradeSettingsStore4.LADDER)) {
                return new LadderScreenState.ExistingNux(StringResource.INSTANCE.invoke(C41061R.string.equities_trade_data_disclosure, new Object[0]));
            }
            return LadderScreenState.Ladder.INSTANCE;
        }
        if (!this.equityTradeLadderNuxSeenPref.get()) {
            return new LadderScreenState.NewNux(StringResource.INSTANCE.invoke(C41061R.string.equities_trade_data_disclosure, new Object[0]));
        }
        return LadderScreenState.Ladder.INSTANCE;
    }

    public final void setLadderNuxSeen() {
        this.equityTradeLadderNuxSeenPref.set(true);
    }
}
