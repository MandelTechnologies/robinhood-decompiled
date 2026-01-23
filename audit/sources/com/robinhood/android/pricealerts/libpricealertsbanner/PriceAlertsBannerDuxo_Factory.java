package com.robinhood.android.pricealerts.libpricealertsbanner;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import com.robinhood.android.redesign.dao.HighlightImpressionDao;
import com.robinhood.android.redesigninvesting.experiments.RedesignInvestingExperimentStore;
import com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: PriceAlertsBannerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "advancedAlertStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "badgeExperimentStore", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "breakingNewsStore", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "highlightImpressionDao", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "fundamentalRiskStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo;", "Ljavax/inject/Provider;", "Companion", "lib-price-alerts-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PriceAlertsBannerDuxo_Factory implements Factory<PriceAlertsBannerDuxo> {
    private final Provider<AdvancedAlertStore> advancedAlertStore;
    private final Provider<RedesignInvestingExperimentStore> badgeExperimentStore;
    private final Provider<BreakingNewsStore> breakingNewsStore;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<QuoteStore> equityQuoteStore;
    private final Provider<FundamentalRiskStore> fundamentalRiskStore;
    private final Provider<HighlightImpressionDao> highlightImpressionDao;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PriceAlertsBannerDuxo_Factory create(Provider<AdvancedAlertStore> provider, Provider<QuoteStore> provider2, Provider<RedesignInvestingExperimentStore> provider3, Provider<BreakingNewsStore> provider4, Provider<HighlightImpressionDao> provider5, Provider<FundamentalRiskStore> provider6, Provider<Clock> provider7, Provider<DuxoBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final PriceAlertsBannerDuxo newInstance(AdvancedAlertStore advancedAlertStore, QuoteStore quoteStore, RedesignInvestingExperimentStore redesignInvestingExperimentStore, BreakingNewsStore breakingNewsStore, HighlightImpressionDao highlightImpressionDao, FundamentalRiskStore fundamentalRiskStore, Clock clock, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(advancedAlertStore, quoteStore, redesignInvestingExperimentStore, breakingNewsStore, highlightImpressionDao, fundamentalRiskStore, clock, duxoBundle);
    }

    public PriceAlertsBannerDuxo_Factory(Provider<AdvancedAlertStore> advancedAlertStore, Provider<QuoteStore> equityQuoteStore, Provider<RedesignInvestingExperimentStore> badgeExperimentStore, Provider<BreakingNewsStore> breakingNewsStore, Provider<HighlightImpressionDao> highlightImpressionDao, Provider<FundamentalRiskStore> fundamentalRiskStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(advancedAlertStore, "advancedAlertStore");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(badgeExperimentStore, "badgeExperimentStore");
        Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
        Intrinsics.checkNotNullParameter(highlightImpressionDao, "highlightImpressionDao");
        Intrinsics.checkNotNullParameter(fundamentalRiskStore, "fundamentalRiskStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.advancedAlertStore = advancedAlertStore;
        this.equityQuoteStore = equityQuoteStore;
        this.badgeExperimentStore = badgeExperimentStore;
        this.breakingNewsStore = breakingNewsStore;
        this.highlightImpressionDao = highlightImpressionDao;
        this.fundamentalRiskStore = fundamentalRiskStore;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PriceAlertsBannerDuxo get() {
        Companion companion = INSTANCE;
        AdvancedAlertStore advancedAlertStore = this.advancedAlertStore.get();
        Intrinsics.checkNotNullExpressionValue(advancedAlertStore, "get(...)");
        QuoteStore quoteStore = this.equityQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        RedesignInvestingExperimentStore redesignInvestingExperimentStore = this.badgeExperimentStore.get();
        Intrinsics.checkNotNullExpressionValue(redesignInvestingExperimentStore, "get(...)");
        BreakingNewsStore breakingNewsStore = this.breakingNewsStore.get();
        Intrinsics.checkNotNullExpressionValue(breakingNewsStore, "get(...)");
        HighlightImpressionDao highlightImpressionDao = this.highlightImpressionDao.get();
        Intrinsics.checkNotNullExpressionValue(highlightImpressionDao, "get(...)");
        FundamentalRiskStore fundamentalRiskStore = this.fundamentalRiskStore.get();
        Intrinsics.checkNotNullExpressionValue(fundamentalRiskStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(advancedAlertStore, quoteStore, redesignInvestingExperimentStore, breakingNewsStore, highlightImpressionDao, fundamentalRiskStore, clock, duxoBundle);
    }

    /* compiled from: PriceAlertsBannerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0016\u001a\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "advancedAlertStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "badgeExperimentStore", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "breakingNewsStore", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "highlightImpressionDao", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "fundamentalRiskStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo_Factory;", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo;", "lib-price-alerts-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PriceAlertsBannerDuxo_Factory create(Provider<AdvancedAlertStore> advancedAlertStore, Provider<QuoteStore> equityQuoteStore, Provider<RedesignInvestingExperimentStore> badgeExperimentStore, Provider<BreakingNewsStore> breakingNewsStore, Provider<HighlightImpressionDao> highlightImpressionDao, Provider<FundamentalRiskStore> fundamentalRiskStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(advancedAlertStore, "advancedAlertStore");
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(badgeExperimentStore, "badgeExperimentStore");
            Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
            Intrinsics.checkNotNullParameter(highlightImpressionDao, "highlightImpressionDao");
            Intrinsics.checkNotNullParameter(fundamentalRiskStore, "fundamentalRiskStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PriceAlertsBannerDuxo_Factory(advancedAlertStore, equityQuoteStore, badgeExperimentStore, breakingNewsStore, highlightImpressionDao, fundamentalRiskStore, clock, duxoBundle);
        }

        @JvmStatic
        public final PriceAlertsBannerDuxo newInstance(AdvancedAlertStore advancedAlertStore, QuoteStore equityQuoteStore, RedesignInvestingExperimentStore badgeExperimentStore, BreakingNewsStore breakingNewsStore, HighlightImpressionDao highlightImpressionDao, FundamentalRiskStore fundamentalRiskStore, Clock clock, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(advancedAlertStore, "advancedAlertStore");
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(badgeExperimentStore, "badgeExperimentStore");
            Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
            Intrinsics.checkNotNullParameter(highlightImpressionDao, "highlightImpressionDao");
            Intrinsics.checkNotNullParameter(fundamentalRiskStore, "fundamentalRiskStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PriceAlertsBannerDuxo(advancedAlertStore, equityQuoteStore, badgeExperimentStore, breakingNewsStore, highlightImpressionDao, fundamentalRiskStore, clock, duxoBundle);
        }
    }
}
