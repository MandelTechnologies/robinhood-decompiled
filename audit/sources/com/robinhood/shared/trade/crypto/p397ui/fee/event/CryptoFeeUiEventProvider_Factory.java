package com.robinhood.shared.trade.crypto.p397ui.fee.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoFeeUiEventProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringToLongMapPreference;", "feeUnsupportedBannerDismissMillisPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenFeeUpsellBottomSheetPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "Ljavax/inject/Provider;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoFeeUiEventProvider_Factory implements Factory<CryptoFeeUiEventProvider> {
    private final Provider<AppType> appType;
    private final Provider<Clock> clock;
    private final Provider<StringToLongMapPreference> feeUnsupportedBannerDismissMillisPref;
    private final Provider<BooleanPreference> hasSeenFeeUpsellBottomSheetPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoFeeUiEventProvider_Factory create(Provider<AppType> provider, Provider<Clock> provider2, Provider<StringToLongMapPreference> provider3, Provider<BooleanPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoFeeUiEventProvider newInstance(AppType appType, Clock clock, StringToLongMapPreference stringToLongMapPreference, BooleanPreference booleanPreference) {
        return INSTANCE.newInstance(appType, clock, stringToLongMapPreference, booleanPreference);
    }

    public CryptoFeeUiEventProvider_Factory(Provider<AppType> appType, Provider<Clock> clock, Provider<StringToLongMapPreference> feeUnsupportedBannerDismissMillisPref, Provider<BooleanPreference> hasSeenFeeUpsellBottomSheetPref) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(feeUnsupportedBannerDismissMillisPref, "feeUnsupportedBannerDismissMillisPref");
        Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
        this.appType = appType;
        this.clock = clock;
        this.feeUnsupportedBannerDismissMillisPref = feeUnsupportedBannerDismissMillisPref;
        this.hasSeenFeeUpsellBottomSheetPref = hasSeenFeeUpsellBottomSheetPref;
    }

    @Override // javax.inject.Provider
    public CryptoFeeUiEventProvider get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StringToLongMapPreference stringToLongMapPreference = this.feeUnsupportedBannerDismissMillisPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        BooleanPreference booleanPreference = this.hasSeenFeeUpsellBottomSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.newInstance(appType, clock, stringToLongMapPreference, booleanPreference);
    }

    /* compiled from: CryptoFeeUiEventProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringToLongMapPreference;", "feeUnsupportedBannerDismissMillisPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenFeeUpsellBottomSheetPref", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider_Factory;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "newInstance", "(Lcom/robinhood/shared/app/type/AppType;Lj$/time/Clock;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/BooleanPreference;)Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoFeeUiEventProvider_Factory create(Provider<AppType> appType, Provider<Clock> clock, Provider<StringToLongMapPreference> feeUnsupportedBannerDismissMillisPref, Provider<BooleanPreference> hasSeenFeeUpsellBottomSheetPref) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(feeUnsupportedBannerDismissMillisPref, "feeUnsupportedBannerDismissMillisPref");
            Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
            return new CryptoFeeUiEventProvider_Factory(appType, clock, feeUnsupportedBannerDismissMillisPref, hasSeenFeeUpsellBottomSheetPref);
        }

        @JvmStatic
        public final CryptoFeeUiEventProvider newInstance(AppType appType, Clock clock, StringToLongMapPreference feeUnsupportedBannerDismissMillisPref, BooleanPreference hasSeenFeeUpsellBottomSheetPref) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(feeUnsupportedBannerDismissMillisPref, "feeUnsupportedBannerDismissMillisPref");
            Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
            return new CryptoFeeUiEventProvider(appType, clock, feeUnsupportedBannerDismissMillisPref, hasSeenFeeUpsellBottomSheetPref);
        }
    }
}
