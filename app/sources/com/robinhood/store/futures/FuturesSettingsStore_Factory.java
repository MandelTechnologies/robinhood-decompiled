package com.robinhood.store.futures;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesSettingsStore_Factory.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012Bc\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b\t0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesSettingsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/futures/FuturesSettingsStore;", "ladderAutoSendPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "timeInForcePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "Lkotlin/jvm/JvmSuppressWildcards;", "chartTypePref", "Lcom/robinhood/store/futures/ChartType;", "continuousChartPref", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FuturesSettingsStore_Factory implements Factory<FuturesSettingsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EnumPreference<ChartType>> chartTypePref;
    private final Provider<BooleanPreference> continuousChartPref;
    private final Provider<BooleanPreference> ladderAutoSendPref;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<EnumPreference<FuturesTimeInForce>> timeInForcePref;

    @JvmStatic
    public static final FuturesSettingsStore_Factory create(Provider<BooleanPreference> provider, Provider<EnumPreference<FuturesTimeInForce>> provider2, Provider<EnumPreference<ChartType>> provider3, Provider<BooleanPreference> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final FuturesSettingsStore newInstance(BooleanPreference booleanPreference, EnumPreference<FuturesTimeInForce> enumPreference, EnumPreference<ChartType> enumPreference2, BooleanPreference booleanPreference2, StoreBundle storeBundle) {
        return INSTANCE.newInstance(booleanPreference, enumPreference, enumPreference2, booleanPreference2, storeBundle);
    }

    public FuturesSettingsStore_Factory(Provider<BooleanPreference> ladderAutoSendPref, Provider<EnumPreference<FuturesTimeInForce>> timeInForcePref, Provider<EnumPreference<ChartType>> chartTypePref, Provider<BooleanPreference> continuousChartPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(ladderAutoSendPref, "ladderAutoSendPref");
        Intrinsics.checkNotNullParameter(timeInForcePref, "timeInForcePref");
        Intrinsics.checkNotNullParameter(chartTypePref, "chartTypePref");
        Intrinsics.checkNotNullParameter(continuousChartPref, "continuousChartPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ladderAutoSendPref = ladderAutoSendPref;
        this.timeInForcePref = timeInForcePref;
        this.chartTypePref = chartTypePref;
        this.continuousChartPref = continuousChartPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public FuturesSettingsStore get() {
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.ladderAutoSendPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        EnumPreference<FuturesTimeInForce> enumPreference = this.timeInForcePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        EnumPreference<ChartType> enumPreference2 = this.chartTypePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference2, "get(...)");
        BooleanPreference booleanPreference2 = this.continuousChartPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(booleanPreference, enumPreference, enumPreference2, booleanPreference2, storeBundle);
    }

    /* compiled from: FuturesSettingsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u00072\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0002\b\f0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0007JF\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0002\b\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesSettingsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/futures/FuturesSettingsStore_Factory;", "ladderAutoSendPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "timeInForcePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "Lkotlin/jvm/JvmSuppressWildcards;", "chartTypePref", "Lcom/robinhood/store/futures/ChartType;", "continuousChartPref", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/futures/FuturesSettingsStore;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesSettingsStore_Factory create(Provider<BooleanPreference> ladderAutoSendPref, Provider<EnumPreference<FuturesTimeInForce>> timeInForcePref, Provider<EnumPreference<ChartType>> chartTypePref, Provider<BooleanPreference> continuousChartPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(ladderAutoSendPref, "ladderAutoSendPref");
            Intrinsics.checkNotNullParameter(timeInForcePref, "timeInForcePref");
            Intrinsics.checkNotNullParameter(chartTypePref, "chartTypePref");
            Intrinsics.checkNotNullParameter(continuousChartPref, "continuousChartPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesSettingsStore_Factory(ladderAutoSendPref, timeInForcePref, chartTypePref, continuousChartPref, storeBundle);
        }

        @JvmStatic
        public final FuturesSettingsStore newInstance(BooleanPreference ladderAutoSendPref, EnumPreference<FuturesTimeInForce> timeInForcePref, EnumPreference<ChartType> chartTypePref, BooleanPreference continuousChartPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(ladderAutoSendPref, "ladderAutoSendPref");
            Intrinsics.checkNotNullParameter(timeInForcePref, "timeInForcePref");
            Intrinsics.checkNotNullParameter(chartTypePref, "chartTypePref");
            Intrinsics.checkNotNullParameter(continuousChartPref, "continuousChartPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesSettingsStore(ladderAutoSendPref, timeInForcePref, chartTypePref, continuousChartPref, storeBundle);
        }
    }
}
