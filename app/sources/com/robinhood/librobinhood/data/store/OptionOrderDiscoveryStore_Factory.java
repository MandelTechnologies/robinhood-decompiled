package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionOrderDiscoveryStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringPreference;", "optionOrderMarketGreenDotPref", "optionOrderMarketNewTagPref", "Lcom/robinhood/prefs/BooleanPreference;", "showOptionMarketEducationPref", "showStopMarketEducationPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionOrderDiscoveryStore_Factory implements Factory<OptionOrderDiscoveryStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<StringPreference> optionOrderMarketGreenDotPref;
    private final Provider<StringPreference> optionOrderMarketNewTagPref;
    private final Provider<BooleanPreference> showOptionMarketEducationPref;
    private final Provider<BooleanPreference> showStopMarketEducationPref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionOrderDiscoveryStore_Factory create(Provider<StoreBundle> provider, Provider<Clock> provider2, Provider<StringPreference> provider3, Provider<StringPreference> provider4, Provider<BooleanPreference> provider5, Provider<BooleanPreference> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final OptionOrderDiscoveryStore newInstance(StoreBundle storeBundle, Clock clock, StringPreference stringPreference, StringPreference stringPreference2, BooleanPreference booleanPreference, BooleanPreference booleanPreference2) {
        return INSTANCE.newInstance(storeBundle, clock, stringPreference, stringPreference2, booleanPreference, booleanPreference2);
    }

    public OptionOrderDiscoveryStore_Factory(Provider<StoreBundle> storeBundle, Provider<Clock> clock, Provider<StringPreference> optionOrderMarketGreenDotPref, Provider<StringPreference> optionOrderMarketNewTagPref, Provider<BooleanPreference> showOptionMarketEducationPref, Provider<BooleanPreference> showStopMarketEducationPref) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(optionOrderMarketGreenDotPref, "optionOrderMarketGreenDotPref");
        Intrinsics.checkNotNullParameter(optionOrderMarketNewTagPref, "optionOrderMarketNewTagPref");
        Intrinsics.checkNotNullParameter(showOptionMarketEducationPref, "showOptionMarketEducationPref");
        Intrinsics.checkNotNullParameter(showStopMarketEducationPref, "showStopMarketEducationPref");
        this.storeBundle = storeBundle;
        this.clock = clock;
        this.optionOrderMarketGreenDotPref = optionOrderMarketGreenDotPref;
        this.optionOrderMarketNewTagPref = optionOrderMarketNewTagPref;
        this.showOptionMarketEducationPref = showOptionMarketEducationPref;
        this.showStopMarketEducationPref = showStopMarketEducationPref;
    }

    @Override // javax.inject.Provider
    public OptionOrderDiscoveryStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StringPreference stringPreference = this.optionOrderMarketGreenDotPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.optionOrderMarketNewTagPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        BooleanPreference booleanPreference = this.showOptionMarketEducationPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.showStopMarketEducationPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        return companion.newInstance(storeBundle, clock, stringPreference, stringPreference2, booleanPreference, booleanPreference2);
    }

    /* compiled from: OptionOrderDiscoveryStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringPreference;", "optionOrderMarketGreenDotPref", "optionOrderMarketNewTagPref", "Lcom/robinhood/prefs/BooleanPreference;", "showOptionMarketEducationPref", "showStopMarketEducationPref", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore_Factory;", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "newInstance", "(Lcom/robinhood/store/StoreBundle;Lj$/time/Clock;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;)Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionOrderDiscoveryStore_Factory create(Provider<StoreBundle> storeBundle, Provider<Clock> clock, Provider<StringPreference> optionOrderMarketGreenDotPref, Provider<StringPreference> optionOrderMarketNewTagPref, Provider<BooleanPreference> showOptionMarketEducationPref, Provider<BooleanPreference> showStopMarketEducationPref) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(optionOrderMarketGreenDotPref, "optionOrderMarketGreenDotPref");
            Intrinsics.checkNotNullParameter(optionOrderMarketNewTagPref, "optionOrderMarketNewTagPref");
            Intrinsics.checkNotNullParameter(showOptionMarketEducationPref, "showOptionMarketEducationPref");
            Intrinsics.checkNotNullParameter(showStopMarketEducationPref, "showStopMarketEducationPref");
            return new OptionOrderDiscoveryStore_Factory(storeBundle, clock, optionOrderMarketGreenDotPref, optionOrderMarketNewTagPref, showOptionMarketEducationPref, showStopMarketEducationPref);
        }

        @JvmStatic
        public final OptionOrderDiscoveryStore newInstance(StoreBundle storeBundle, Clock clock, StringPreference optionOrderMarketGreenDotPref, StringPreference optionOrderMarketNewTagPref, BooleanPreference showOptionMarketEducationPref, BooleanPreference showStopMarketEducationPref) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(optionOrderMarketGreenDotPref, "optionOrderMarketGreenDotPref");
            Intrinsics.checkNotNullParameter(optionOrderMarketNewTagPref, "optionOrderMarketNewTagPref");
            Intrinsics.checkNotNullParameter(showOptionMarketEducationPref, "showOptionMarketEducationPref");
            Intrinsics.checkNotNullParameter(showStopMarketEducationPref, "showStopMarketEducationPref");
            return new OptionOrderDiscoveryStore(storeBundle, clock, optionOrderMarketGreenDotPref, optionOrderMarketNewTagPref, showOptionMarketEducationPref, showStopMarketEducationPref);
        }
    }
}
