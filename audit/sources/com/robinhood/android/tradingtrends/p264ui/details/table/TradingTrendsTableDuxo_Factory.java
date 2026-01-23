package com.robinhood.android.tradingtrends.p264ui.details.table;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsMicrogramSduiConverters;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsTableDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo;", "sduiConverters", "Ljavax/inject/Provider;", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsMicrogramSduiConverters;", "tradingTrendsService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "tradingTrendsTableStateProvider", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TradingTrendsTableDuxo_Factory implements Factory<TradingTrendsTableDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<TradingTrendsMicrogramSduiConverters> sduiConverters;
    private final Provider<TradingTrendsCachedService> tradingTrendsService;
    private final Provider<TradingTrendsTableStateProvider> tradingTrendsTableStateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TradingTrendsTableDuxo_Factory create(Provider<TradingTrendsMicrogramSduiConverters> provider, Provider<TradingTrendsCachedService> provider2, Provider<SavedStateHandle> provider3, Provider<TradingTrendsTableStateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final TradingTrendsTableDuxo newInstance(TradingTrendsMicrogramSduiConverters tradingTrendsMicrogramSduiConverters, TradingTrendsCachedService tradingTrendsCachedService, SavedStateHandle savedStateHandle, TradingTrendsTableStateProvider tradingTrendsTableStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(tradingTrendsMicrogramSduiConverters, tradingTrendsCachedService, savedStateHandle, tradingTrendsTableStateProvider, duxoBundle);
    }

    public TradingTrendsTableDuxo_Factory(Provider<TradingTrendsMicrogramSduiConverters> sduiConverters, Provider<TradingTrendsCachedService> tradingTrendsService, Provider<SavedStateHandle> savedStateHandle, Provider<TradingTrendsTableStateProvider> tradingTrendsTableStateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(sduiConverters, "sduiConverters");
        Intrinsics.checkNotNullParameter(tradingTrendsService, "tradingTrendsService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(tradingTrendsTableStateProvider, "tradingTrendsTableStateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.sduiConverters = sduiConverters;
        this.tradingTrendsService = tradingTrendsService;
        this.savedStateHandle = savedStateHandle;
        this.tradingTrendsTableStateProvider = tradingTrendsTableStateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public TradingTrendsTableDuxo get() {
        Companion companion = INSTANCE;
        TradingTrendsMicrogramSduiConverters tradingTrendsMicrogramSduiConverters = this.sduiConverters.get();
        Intrinsics.checkNotNullExpressionValue(tradingTrendsMicrogramSduiConverters, "get(...)");
        TradingTrendsCachedService tradingTrendsCachedService = this.tradingTrendsService.get();
        Intrinsics.checkNotNullExpressionValue(tradingTrendsCachedService, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        TradingTrendsTableStateProvider tradingTrendsTableStateProvider = this.tradingTrendsTableStateProvider.get();
        Intrinsics.checkNotNullExpressionValue(tradingTrendsTableStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(tradingTrendsMicrogramSduiConverters, tradingTrendsCachedService, savedStateHandle, tradingTrendsTableStateProvider, duxoBundle);
    }

    /* compiled from: TradingTrendsTableDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo_Factory;", "sduiConverters", "Ljavax/inject/Provider;", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsMicrogramSduiConverters;", "tradingTrendsService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "tradingTrendsTableStateProvider", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo;", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TradingTrendsTableDuxo_Factory create(Provider<TradingTrendsMicrogramSduiConverters> sduiConverters, Provider<TradingTrendsCachedService> tradingTrendsService, Provider<SavedStateHandle> savedStateHandle, Provider<TradingTrendsTableStateProvider> tradingTrendsTableStateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(sduiConverters, "sduiConverters");
            Intrinsics.checkNotNullParameter(tradingTrendsService, "tradingTrendsService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(tradingTrendsTableStateProvider, "tradingTrendsTableStateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new TradingTrendsTableDuxo_Factory(sduiConverters, tradingTrendsService, savedStateHandle, tradingTrendsTableStateProvider, duxoBundle);
        }

        @JvmStatic
        public final TradingTrendsTableDuxo newInstance(TradingTrendsMicrogramSduiConverters sduiConverters, TradingTrendsCachedService tradingTrendsService, SavedStateHandle savedStateHandle, TradingTrendsTableStateProvider tradingTrendsTableStateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(sduiConverters, "sduiConverters");
            Intrinsics.checkNotNullParameter(tradingTrendsService, "tradingTrendsService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(tradingTrendsTableStateProvider, "tradingTrendsTableStateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new TradingTrendsTableDuxo(sduiConverters, tradingTrendsService, savedStateHandle, tradingTrendsTableStateProvider, duxoBundle);
        }
    }
}
