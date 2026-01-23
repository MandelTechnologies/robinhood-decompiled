package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionsMarketOrdersEntryNuxStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringPreference;", "optionsMarketOrdersEntryNuxLastShownPref", "Lcom/robinhood/prefs/IntPreference;", "optionsMarketOrdersEntryNuxTimesShownPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionsMarketOrdersEntryNuxStore_Factory implements Factory<OptionsMarketOrdersEntryNuxStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<StringPreference> optionsMarketOrdersEntryNuxLastShownPref;
    private final Provider<IntPreference> optionsMarketOrdersEntryNuxTimesShownPref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionsMarketOrdersEntryNuxStore_Factory create(Provider<Clock> provider, Provider<StringPreference> provider2, Provider<IntPreference> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OptionsMarketOrdersEntryNuxStore newInstance(Clock clock, StringPreference stringPreference, IntPreference intPreference, StoreBundle storeBundle) {
        return INSTANCE.newInstance(clock, stringPreference, intPreference, storeBundle);
    }

    public OptionsMarketOrdersEntryNuxStore_Factory(Provider<Clock> clock, Provider<StringPreference> optionsMarketOrdersEntryNuxLastShownPref, Provider<IntPreference> optionsMarketOrdersEntryNuxTimesShownPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(optionsMarketOrdersEntryNuxLastShownPref, "optionsMarketOrdersEntryNuxLastShownPref");
        Intrinsics.checkNotNullParameter(optionsMarketOrdersEntryNuxTimesShownPref, "optionsMarketOrdersEntryNuxTimesShownPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.clock = clock;
        this.optionsMarketOrdersEntryNuxLastShownPref = optionsMarketOrdersEntryNuxLastShownPref;
        this.optionsMarketOrdersEntryNuxTimesShownPref = optionsMarketOrdersEntryNuxTimesShownPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OptionsMarketOrdersEntryNuxStore get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StringPreference stringPreference = this.optionsMarketOrdersEntryNuxLastShownPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        IntPreference intPreference = this.optionsMarketOrdersEntryNuxTimesShownPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(clock, stringPreference, intPreference, storeBundle);
    }

    /* compiled from: OptionsMarketOrdersEntryNuxStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringPreference;", "optionsMarketOrdersEntryNuxLastShownPref", "Lcom/robinhood/prefs/IntPreference;", "optionsMarketOrdersEntryNuxTimesShownPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore_Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore;", "newInstance", "(Lj$/time/Clock;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/OptionsMarketOrdersEntryNuxStore;", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsMarketOrdersEntryNuxStore_Factory create(Provider<Clock> clock, Provider<StringPreference> optionsMarketOrdersEntryNuxLastShownPref, Provider<IntPreference> optionsMarketOrdersEntryNuxTimesShownPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(optionsMarketOrdersEntryNuxLastShownPref, "optionsMarketOrdersEntryNuxLastShownPref");
            Intrinsics.checkNotNullParameter(optionsMarketOrdersEntryNuxTimesShownPref, "optionsMarketOrdersEntryNuxTimesShownPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionsMarketOrdersEntryNuxStore_Factory(clock, optionsMarketOrdersEntryNuxLastShownPref, optionsMarketOrdersEntryNuxTimesShownPref, storeBundle);
        }

        @JvmStatic
        public final OptionsMarketOrdersEntryNuxStore newInstance(Clock clock, StringPreference optionsMarketOrdersEntryNuxLastShownPref, IntPreference optionsMarketOrdersEntryNuxTimesShownPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(optionsMarketOrdersEntryNuxLastShownPref, "optionsMarketOrdersEntryNuxLastShownPref");
            Intrinsics.checkNotNullParameter(optionsMarketOrdersEntryNuxTimesShownPref, "optionsMarketOrdersEntryNuxTimesShownPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionsMarketOrdersEntryNuxStore(clock, optionsMarketOrdersEntryNuxLastShownPref, optionsMarketOrdersEntryNuxTimesShownPref, storeBundle);
        }
    }
}
