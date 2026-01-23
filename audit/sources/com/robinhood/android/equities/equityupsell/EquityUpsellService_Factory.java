package com.robinhood.android.equities.equityupsell;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: EquityUpsellService_Factory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equities/equityupsell/EquityUpsellService_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "equityUpsellViewCountPref", "equityUpsellLastSeenPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "equityUpsellCompletePref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "Ljavax/inject/Provider;", "Companion", "lib-equity-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityUpsellService_Factory implements Factory<EquityUpsellService> {
    private final Provider<Clock> clock;
    private final Provider<StringToBooleanMapPreference> equityUpsellCompletePref;
    private final Provider<StringToLongMapPreference> equityUpsellLastSeenPref;
    private final Provider<StringToLongMapPreference> equityUpsellViewCountPref;
    private final Provider<StoreBundle> storeBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityUpsellService_Factory create(Provider<StringToLongMapPreference> provider, Provider<StringToLongMapPreference> provider2, Provider<StringToBooleanMapPreference> provider3, Provider<Clock> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final EquityUpsellService newInstance(StringToLongMapPreference stringToLongMapPreference, StringToLongMapPreference stringToLongMapPreference2, StringToBooleanMapPreference stringToBooleanMapPreference, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(stringToLongMapPreference, stringToLongMapPreference2, stringToBooleanMapPreference, clock, storeBundle);
    }

    public EquityUpsellService_Factory(Provider<StringToLongMapPreference> equityUpsellViewCountPref, Provider<StringToLongMapPreference> equityUpsellLastSeenPref, Provider<StringToBooleanMapPreference> equityUpsellCompletePref, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(equityUpsellViewCountPref, "equityUpsellViewCountPref");
        Intrinsics.checkNotNullParameter(equityUpsellLastSeenPref, "equityUpsellLastSeenPref");
        Intrinsics.checkNotNullParameter(equityUpsellCompletePref, "equityUpsellCompletePref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.equityUpsellViewCountPref = equityUpsellViewCountPref;
        this.equityUpsellLastSeenPref = equityUpsellLastSeenPref;
        this.equityUpsellCompletePref = equityUpsellCompletePref;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EquityUpsellService get() {
        Companion companion = INSTANCE;
        StringToLongMapPreference stringToLongMapPreference = this.equityUpsellViewCountPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        StringToLongMapPreference stringToLongMapPreference2 = this.equityUpsellLastSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference2, "get(...)");
        StringToBooleanMapPreference stringToBooleanMapPreference = this.equityUpsellCompletePref.get();
        Intrinsics.checkNotNullExpressionValue(stringToBooleanMapPreference, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(stringToLongMapPreference, stringToLongMapPreference2, stringToBooleanMapPreference, clock, storeBundle);
    }

    /* compiled from: EquityUpsellService_Factory.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equities/equityupsell/EquityUpsellService_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "equityUpsellViewCountPref", "equityUpsellLastSeenPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "equityUpsellCompletePref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/equities/equityupsell/EquityUpsellService_Factory;", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "newInstance", "(Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/StringToBooleanMapPreference;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "lib-equity-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityUpsellService_Factory create(Provider<StringToLongMapPreference> equityUpsellViewCountPref, Provider<StringToLongMapPreference> equityUpsellLastSeenPref, Provider<StringToBooleanMapPreference> equityUpsellCompletePref, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(equityUpsellViewCountPref, "equityUpsellViewCountPref");
            Intrinsics.checkNotNullParameter(equityUpsellLastSeenPref, "equityUpsellLastSeenPref");
            Intrinsics.checkNotNullParameter(equityUpsellCompletePref, "equityUpsellCompletePref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityUpsellService_Factory(equityUpsellViewCountPref, equityUpsellLastSeenPref, equityUpsellCompletePref, clock, storeBundle);
        }

        @JvmStatic
        public final EquityUpsellService newInstance(StringToLongMapPreference equityUpsellViewCountPref, StringToLongMapPreference equityUpsellLastSeenPref, StringToBooleanMapPreference equityUpsellCompletePref, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(equityUpsellViewCountPref, "equityUpsellViewCountPref");
            Intrinsics.checkNotNullParameter(equityUpsellLastSeenPref, "equityUpsellLastSeenPref");
            Intrinsics.checkNotNullParameter(equityUpsellCompletePref, "equityUpsellCompletePref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityUpsellService(equityUpsellViewCountPref, equityUpsellLastSeenPref, equityUpsellCompletePref, clock, storeBundle);
        }
    }
}
