package com.robinhood.android.equitydetail.p123ui.tradebar;

import com.robinhood.android.common.data.prefs.HasVisitedEquityTradeFlowPref;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.tradingtrends.p264ui.details.TradingTrendsDetailsLogging;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailTradeBarDuxo_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo;", "hasVisitedEquityTradeFlowPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "tradingTrendsDetailsLogging", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class InstrumentDetailTradeBarDuxo_MembersInjector implements MembersInjector<InstrumentDetailTradeBarDuxo> {
    private final Provider<BooleanPreference> hasVisitedEquityTradeFlowPref;
    private final Provider<TradingTrendsDetailsLogging> tradingTrendsDetailsLogging;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<InstrumentDetailTradeBarDuxo> create(Provider<BooleanPreference> provider, Provider<TradingTrendsDetailsLogging> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    @HasVisitedEquityTradeFlowPref
    public static final void injectHasVisitedEquityTradeFlowPref(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, BooleanPreference booleanPreference) {
        INSTANCE.injectHasVisitedEquityTradeFlowPref(instrumentDetailTradeBarDuxo, booleanPreference);
    }

    @JvmStatic
    public static final void injectTradingTrendsDetailsLogging(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, TradingTrendsDetailsLogging tradingTrendsDetailsLogging) {
        INSTANCE.injectTradingTrendsDetailsLogging(instrumentDetailTradeBarDuxo, tradingTrendsDetailsLogging);
    }

    public InstrumentDetailTradeBarDuxo_MembersInjector(Provider<BooleanPreference> hasVisitedEquityTradeFlowPref, Provider<TradingTrendsDetailsLogging> tradingTrendsDetailsLogging) {
        Intrinsics.checkNotNullParameter(hasVisitedEquityTradeFlowPref, "hasVisitedEquityTradeFlowPref");
        Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "tradingTrendsDetailsLogging");
        this.hasVisitedEquityTradeFlowPref = hasVisitedEquityTradeFlowPref;
        this.tradingTrendsDetailsLogging = tradingTrendsDetailsLogging;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstrumentDetailTradeBarDuxo instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.hasVisitedEquityTradeFlowPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion.injectHasVisitedEquityTradeFlowPref(instance, booleanPreference);
        TradingTrendsDetailsLogging tradingTrendsDetailsLogging = this.tradingTrendsDetailsLogging.get();
        Intrinsics.checkNotNullExpressionValue(tradingTrendsDetailsLogging, "get(...)");
        companion.injectTradingTrendsDetailsLogging(instance, tradingTrendsDetailsLogging);
    }

    /* compiled from: InstrumentDetailTradeBarDuxo_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo;", "hasVisitedEquityTradeFlowPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "tradingTrendsDetailsLogging", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "injectHasVisitedEquityTradeFlowPref", "", "instance", "injectTradingTrendsDetailsLogging", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<InstrumentDetailTradeBarDuxo> create(Provider<BooleanPreference> hasVisitedEquityTradeFlowPref, Provider<TradingTrendsDetailsLogging> tradingTrendsDetailsLogging) {
            Intrinsics.checkNotNullParameter(hasVisitedEquityTradeFlowPref, "hasVisitedEquityTradeFlowPref");
            Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "tradingTrendsDetailsLogging");
            return new InstrumentDetailTradeBarDuxo_MembersInjector(hasVisitedEquityTradeFlowPref, tradingTrendsDetailsLogging);
        }

        @JvmStatic
        @HasVisitedEquityTradeFlowPref
        public final void injectHasVisitedEquityTradeFlowPref(InstrumentDetailTradeBarDuxo instance, BooleanPreference hasVisitedEquityTradeFlowPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasVisitedEquityTradeFlowPref, "hasVisitedEquityTradeFlowPref");
            instance.setHasVisitedEquityTradeFlowPref(hasVisitedEquityTradeFlowPref);
        }

        @JvmStatic
        public final void injectTradingTrendsDetailsLogging(InstrumentDetailTradeBarDuxo instance, TradingTrendsDetailsLogging tradingTrendsDetailsLogging) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "tradingTrendsDetailsLogging");
            instance.setTradingTrendsDetailsLogging(tradingTrendsDetailsLogging);
        }
    }
}
