package com.robinhood.android.equities.tradesettings.store;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringToStringMapPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: TradeSettingsStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0093\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "macAutoSendPref", "ladderAutoSendPref", "tradeFlowAutoSendPref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "timeInForcePref", "tradingSessionPref", "autoSendAgreementDatePref", "Lcom/robinhood/android/agreements/AgreementsStore;", "agreementsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "Ljavax/inject/Provider;", "Companion", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TradeSettingsStore_Factory implements Factory<TradeSettingsStore> {
    private final Provider<AgreementsStore> agreementsStore;
    private final Provider<StringToStringMapPreference> autoSendAgreementDatePref;
    private final Provider<Clock> clock;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<BooleanPreference> ladderAutoSendPref;
    private final Provider<BooleanPreference> macAutoSendPref;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<StringToStringMapPreference> timeInForcePref;
    private final Provider<BooleanPreference> tradeFlowAutoSendPref;
    private final Provider<StringToStringMapPreference> tradingSessionPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TradeSettingsStore_Factory create(Provider<BooleanPreference> provider, Provider<BooleanPreference> provider2, Provider<BooleanPreference> provider3, Provider<StringToStringMapPreference> provider4, Provider<StringToStringMapPreference> provider5, Provider<StringToStringMapPreference> provider6, Provider<AgreementsStore> provider7, Provider<InstrumentStore> provider8, Provider<Clock> provider9, Provider<StoreBundle> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final TradeSettingsStore newInstance(BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, StringToStringMapPreference stringToStringMapPreference, StringToStringMapPreference stringToStringMapPreference2, StringToStringMapPreference stringToStringMapPreference3, AgreementsStore agreementsStore, InstrumentStore instrumentStore, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(booleanPreference, booleanPreference2, booleanPreference3, stringToStringMapPreference, stringToStringMapPreference2, stringToStringMapPreference3, agreementsStore, instrumentStore, clock, storeBundle);
    }

    public TradeSettingsStore_Factory(Provider<BooleanPreference> macAutoSendPref, Provider<BooleanPreference> ladderAutoSendPref, Provider<BooleanPreference> tradeFlowAutoSendPref, Provider<StringToStringMapPreference> timeInForcePref, Provider<StringToStringMapPreference> tradingSessionPref, Provider<StringToStringMapPreference> autoSendAgreementDatePref, Provider<AgreementsStore> agreementsStore, Provider<InstrumentStore> instrumentStore, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(macAutoSendPref, "macAutoSendPref");
        Intrinsics.checkNotNullParameter(ladderAutoSendPref, "ladderAutoSendPref");
        Intrinsics.checkNotNullParameter(tradeFlowAutoSendPref, "tradeFlowAutoSendPref");
        Intrinsics.checkNotNullParameter(timeInForcePref, "timeInForcePref");
        Intrinsics.checkNotNullParameter(tradingSessionPref, "tradingSessionPref");
        Intrinsics.checkNotNullParameter(autoSendAgreementDatePref, "autoSendAgreementDatePref");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.macAutoSendPref = macAutoSendPref;
        this.ladderAutoSendPref = ladderAutoSendPref;
        this.tradeFlowAutoSendPref = tradeFlowAutoSendPref;
        this.timeInForcePref = timeInForcePref;
        this.tradingSessionPref = tradingSessionPref;
        this.autoSendAgreementDatePref = autoSendAgreementDatePref;
        this.agreementsStore = agreementsStore;
        this.instrumentStore = instrumentStore;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public TradeSettingsStore get() {
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.macAutoSendPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.ladderAutoSendPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        BooleanPreference booleanPreference3 = this.tradeFlowAutoSendPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        StringToStringMapPreference stringToStringMapPreference = this.timeInForcePref.get();
        Intrinsics.checkNotNullExpressionValue(stringToStringMapPreference, "get(...)");
        StringToStringMapPreference stringToStringMapPreference2 = this.tradingSessionPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToStringMapPreference2, "get(...)");
        StringToStringMapPreference stringToStringMapPreference3 = this.autoSendAgreementDatePref.get();
        Intrinsics.checkNotNullExpressionValue(stringToStringMapPreference3, "get(...)");
        AgreementsStore agreementsStore = this.agreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(agreementsStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(booleanPreference, booleanPreference2, booleanPreference3, stringToStringMapPreference, stringToStringMapPreference2, stringToStringMapPreference3, agreementsStore, instrumentStore, clock, storeBundle);
    }

    /* compiled from: TradeSettingsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009b\u0001\u0010\u0016\u001a\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J_\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "macAutoSendPref", "ladderAutoSendPref", "tradeFlowAutoSendPref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "timeInForcePref", "tradingSessionPref", "autoSendAgreementDatePref", "Lcom/robinhood/android/agreements/AgreementsStore;", "agreementsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore_Factory;", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "newInstance", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/StringToStringMapPreference;Lcom/robinhood/prefs/StringToStringMapPreference;Lcom/robinhood/prefs/StringToStringMapPreference;Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TradeSettingsStore_Factory create(Provider<BooleanPreference> macAutoSendPref, Provider<BooleanPreference> ladderAutoSendPref, Provider<BooleanPreference> tradeFlowAutoSendPref, Provider<StringToStringMapPreference> timeInForcePref, Provider<StringToStringMapPreference> tradingSessionPref, Provider<StringToStringMapPreference> autoSendAgreementDatePref, Provider<AgreementsStore> agreementsStore, Provider<InstrumentStore> instrumentStore, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(macAutoSendPref, "macAutoSendPref");
            Intrinsics.checkNotNullParameter(ladderAutoSendPref, "ladderAutoSendPref");
            Intrinsics.checkNotNullParameter(tradeFlowAutoSendPref, "tradeFlowAutoSendPref");
            Intrinsics.checkNotNullParameter(timeInForcePref, "timeInForcePref");
            Intrinsics.checkNotNullParameter(tradingSessionPref, "tradingSessionPref");
            Intrinsics.checkNotNullParameter(autoSendAgreementDatePref, "autoSendAgreementDatePref");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TradeSettingsStore_Factory(macAutoSendPref, ladderAutoSendPref, tradeFlowAutoSendPref, timeInForcePref, tradingSessionPref, autoSendAgreementDatePref, agreementsStore, instrumentStore, clock, storeBundle);
        }

        @JvmStatic
        public final TradeSettingsStore newInstance(BooleanPreference macAutoSendPref, BooleanPreference ladderAutoSendPref, BooleanPreference tradeFlowAutoSendPref, StringToStringMapPreference timeInForcePref, StringToStringMapPreference tradingSessionPref, StringToStringMapPreference autoSendAgreementDatePref, AgreementsStore agreementsStore, InstrumentStore instrumentStore, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(macAutoSendPref, "macAutoSendPref");
            Intrinsics.checkNotNullParameter(ladderAutoSendPref, "ladderAutoSendPref");
            Intrinsics.checkNotNullParameter(tradeFlowAutoSendPref, "tradeFlowAutoSendPref");
            Intrinsics.checkNotNullParameter(timeInForcePref, "timeInForcePref");
            Intrinsics.checkNotNullParameter(tradingSessionPref, "tradingSessionPref");
            Intrinsics.checkNotNullParameter(autoSendAgreementDatePref, "autoSendAgreementDatePref");
            Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TradeSettingsStore(macAutoSendPref, ladderAutoSendPref, tradeFlowAutoSendPref, timeInForcePref, tradingSessionPref, autoSendAgreementDatePref, agreementsStore, instrumentStore, clock, storeBundle);
        }
    }
}
