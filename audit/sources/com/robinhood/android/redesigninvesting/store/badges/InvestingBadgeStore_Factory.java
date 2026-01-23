package com.robinhood.android.redesigninvesting.store.badges;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import com.robinhood.android.redesign.dao.HighlightImpressionDao;
import com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.equities.models.instrumentdetails.store.FundamentalStore;
import com.robinhood.shared.equities.models.store.TraderEarningStore;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: InvestingBadgeStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¡\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "breakingNewsStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "earningsStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "fundamentalRiskStore", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "advancedAlertStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "fundamentalStore", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "highlightImpressionDao", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-badges_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingBadgeStore_Factory implements Factory<InvestingBadgeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvancedAlertStore> advancedAlertStore;
    private final Provider<BreakingNewsStore> breakingNewsStore;
    private final Provider<Clock> clock;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<TraderEarningStore> earningsStore;
    private final Provider<QuoteStore> equityQuoteStore;
    private final Provider<FundamentalRiskStore> fundamentalRiskStore;
    private final Provider<FundamentalStore> fundamentalStore;
    private final Provider<HighlightImpressionDao> highlightImpressionDao;
    private final Provider<HistoryStore> historyStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final InvestingBadgeStore_Factory create(Provider<StoreBundle> provider, Provider<BreakingNewsStore> provider2, Provider<QuoteStore> provider3, Provider<TraderEarningStore> provider4, Provider<CryptoQuoteStore> provider5, Provider<FundamentalRiskStore> provider6, Provider<AdvancedAlertStore> provider7, Provider<FundamentalStore> provider8, Provider<HighlightImpressionDao> provider9, Provider<HistoryStore> provider10, Provider<Clock> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final InvestingBadgeStore newInstance(StoreBundle storeBundle, BreakingNewsStore breakingNewsStore, QuoteStore quoteStore, TraderEarningStore traderEarningStore, CryptoQuoteStore cryptoQuoteStore, FundamentalRiskStore fundamentalRiskStore, AdvancedAlertStore advancedAlertStore, FundamentalStore fundamentalStore, HighlightImpressionDao highlightImpressionDao, HistoryStore historyStore, Clock clock) {
        return INSTANCE.newInstance(storeBundle, breakingNewsStore, quoteStore, traderEarningStore, cryptoQuoteStore, fundamentalRiskStore, advancedAlertStore, fundamentalStore, highlightImpressionDao, historyStore, clock);
    }

    public InvestingBadgeStore_Factory(Provider<StoreBundle> storeBundle, Provider<BreakingNewsStore> breakingNewsStore, Provider<QuoteStore> equityQuoteStore, Provider<TraderEarningStore> earningsStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<FundamentalRiskStore> fundamentalRiskStore, Provider<AdvancedAlertStore> advancedAlertStore, Provider<FundamentalStore> fundamentalStore, Provider<HighlightImpressionDao> highlightImpressionDao, Provider<HistoryStore> historyStore, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(earningsStore, "earningsStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(fundamentalRiskStore, "fundamentalRiskStore");
        Intrinsics.checkNotNullParameter(advancedAlertStore, "advancedAlertStore");
        Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
        Intrinsics.checkNotNullParameter(highlightImpressionDao, "highlightImpressionDao");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.storeBundle = storeBundle;
        this.breakingNewsStore = breakingNewsStore;
        this.equityQuoteStore = equityQuoteStore;
        this.earningsStore = earningsStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.fundamentalRiskStore = fundamentalRiskStore;
        this.advancedAlertStore = advancedAlertStore;
        this.fundamentalStore = fundamentalStore;
        this.highlightImpressionDao = highlightImpressionDao;
        this.historyStore = historyStore;
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public InvestingBadgeStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        BreakingNewsStore breakingNewsStore = this.breakingNewsStore.get();
        Intrinsics.checkNotNullExpressionValue(breakingNewsStore, "get(...)");
        QuoteStore quoteStore = this.equityQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        TraderEarningStore traderEarningStore = this.earningsStore.get();
        Intrinsics.checkNotNullExpressionValue(traderEarningStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        FundamentalRiskStore fundamentalRiskStore = this.fundamentalRiskStore.get();
        Intrinsics.checkNotNullExpressionValue(fundamentalRiskStore, "get(...)");
        AdvancedAlertStore advancedAlertStore = this.advancedAlertStore.get();
        Intrinsics.checkNotNullExpressionValue(advancedAlertStore, "get(...)");
        FundamentalStore fundamentalStore = this.fundamentalStore.get();
        Intrinsics.checkNotNullExpressionValue(fundamentalStore, "get(...)");
        HighlightImpressionDao highlightImpressionDao = this.highlightImpressionDao.get();
        Intrinsics.checkNotNullExpressionValue(highlightImpressionDao, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(storeBundle, breakingNewsStore, quoteStore, traderEarningStore, cryptoQuoteStore, fundamentalRiskStore, advancedAlertStore, fundamentalStore, highlightImpressionDao, historyStore, clock);
    }

    /* compiled from: InvestingBadgeStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J©\u0001\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJg\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "breakingNewsStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "earningsStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "fundamentalRiskStore", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "advancedAlertStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "fundamentalStore", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "highlightImpressionDao", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore_Factory;", "Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore;", "newInstance", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/shared/equities/models/store/TraderEarningStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;Lcom/robinhood/shared/store/history/HistoryStore;Lj$/time/Clock;)Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore;", "lib-store-badges_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestingBadgeStore_Factory create(Provider<StoreBundle> storeBundle, Provider<BreakingNewsStore> breakingNewsStore, Provider<QuoteStore> equityQuoteStore, Provider<TraderEarningStore> earningsStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<FundamentalRiskStore> fundamentalRiskStore, Provider<AdvancedAlertStore> advancedAlertStore, Provider<FundamentalStore> fundamentalStore, Provider<HighlightImpressionDao> highlightImpressionDao, Provider<HistoryStore> historyStore, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(earningsStore, "earningsStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(fundamentalRiskStore, "fundamentalRiskStore");
            Intrinsics.checkNotNullParameter(advancedAlertStore, "advancedAlertStore");
            Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
            Intrinsics.checkNotNullParameter(highlightImpressionDao, "highlightImpressionDao");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new InvestingBadgeStore_Factory(storeBundle, breakingNewsStore, equityQuoteStore, earningsStore, cryptoQuoteStore, fundamentalRiskStore, advancedAlertStore, fundamentalStore, highlightImpressionDao, historyStore, clock);
        }

        @JvmStatic
        public final InvestingBadgeStore newInstance(StoreBundle storeBundle, BreakingNewsStore breakingNewsStore, QuoteStore equityQuoteStore, TraderEarningStore earningsStore, CryptoQuoteStore cryptoQuoteStore, FundamentalRiskStore fundamentalRiskStore, AdvancedAlertStore advancedAlertStore, FundamentalStore fundamentalStore, HighlightImpressionDao highlightImpressionDao, HistoryStore historyStore, Clock clock) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(earningsStore, "earningsStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(fundamentalRiskStore, "fundamentalRiskStore");
            Intrinsics.checkNotNullParameter(advancedAlertStore, "advancedAlertStore");
            Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
            Intrinsics.checkNotNullParameter(highlightImpressionDao, "highlightImpressionDao");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new InvestingBadgeStore(storeBundle, breakingNewsStore, equityQuoteStore, earningsStore, cryptoQuoteStore, fundamentalRiskStore, advancedAlertStore, fundamentalStore, highlightImpressionDao, historyStore, clock);
        }
    }
}
