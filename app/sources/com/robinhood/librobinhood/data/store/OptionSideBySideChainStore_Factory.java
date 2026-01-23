package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.OptionChainSettingsTableMetricsDao;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.ChainCustomization;
import p479j$.time.Clock;

/* compiled from: OptionSideBySideChainStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!Bç\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "Ljavax/inject/Provider;", "Loptions_product/service/ChainCustomization;", "chainCustomizationService", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;", "optionChainSettingsTableMetricsDao", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/prefs/StringPreference;", "optionChainDisplayModePref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownSideBySideChainSpreadTooltipPref", "hasShownSwitchBackToClassicChainTooltipPref", "optionSideBySideChainShownPref", "optionSideBySideChainBottomSheetShownPref", "optionChainSettingsShownPref", "optionSbsEduFooterDismissedPref", "optionSbsLottieNuxAnimationSeenPref", "optionChainSbsNuxRevampSettingsShownPref", "optionSbsBidAskPriceLabelShownPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionSideBySideChainStore_Factory implements Factory<OptionSideBySideChainStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ChainCustomization> chainCustomizationService;
    private final Provider<Clock> clock;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasShownSideBySideChainSpreadTooltipPref;
    private final Provider<BooleanPreference> hasShownSwitchBackToClassicChainTooltipPref;
    private final Provider<StringPreference> optionChainDisplayModePref;
    private final Provider<BooleanPreference> optionChainSbsNuxRevampSettingsShownPref;
    private final Provider<BooleanPreference> optionChainSettingsShownPref;
    private final Provider<OptionChainSettingsTableMetricsDao> optionChainSettingsTableMetricsDao;
    private final Provider<BooleanPreference> optionSbsBidAskPriceLabelShownPref;
    private final Provider<BooleanPreference> optionSbsEduFooterDismissedPref;
    private final Provider<BooleanPreference> optionSbsLottieNuxAnimationSeenPref;
    private final Provider<BooleanPreference> optionSideBySideChainBottomSheetShownPref;
    private final Provider<BooleanPreference> optionSideBySideChainShownPref;
    private final Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionSideBySideChainStore_Factory create(Provider<ChainCustomization> provider, Provider<Clock> provider2, Provider<ExperimentsStore> provider3, Provider<OptionChainSettingsTableMetricsDao> provider4, Provider<OptionUnderlyingQuoteStore> provider5, Provider<StringPreference> provider6, Provider<BooleanPreference> provider7, Provider<BooleanPreference> provider8, Provider<BooleanPreference> provider9, Provider<BooleanPreference> provider10, Provider<BooleanPreference> provider11, Provider<BooleanPreference> provider12, Provider<BooleanPreference> provider13, Provider<BooleanPreference> provider14, Provider<BooleanPreference> provider15, Provider<StoreBundle> provider16) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    @JvmStatic
    public static final OptionSideBySideChainStore newInstance(ChainCustomization chainCustomization, Clock clock, ExperimentsStore experimentsStore, OptionChainSettingsTableMetricsDao optionChainSettingsTableMetricsDao, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, StringPreference stringPreference, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, BooleanPreference booleanPreference4, BooleanPreference booleanPreference5, BooleanPreference booleanPreference6, BooleanPreference booleanPreference7, BooleanPreference booleanPreference8, BooleanPreference booleanPreference9, StoreBundle storeBundle) {
        return INSTANCE.newInstance(chainCustomization, clock, experimentsStore, optionChainSettingsTableMetricsDao, optionUnderlyingQuoteStore, stringPreference, booleanPreference, booleanPreference2, booleanPreference3, booleanPreference4, booleanPreference5, booleanPreference6, booleanPreference7, booleanPreference8, booleanPreference9, storeBundle);
    }

    public OptionSideBySideChainStore_Factory(Provider<ChainCustomization> chainCustomizationService, Provider<Clock> clock, Provider<ExperimentsStore> experimentsStore, Provider<OptionChainSettingsTableMetricsDao> optionChainSettingsTableMetricsDao, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<StringPreference> optionChainDisplayModePref, Provider<BooleanPreference> hasShownSideBySideChainSpreadTooltipPref, Provider<BooleanPreference> hasShownSwitchBackToClassicChainTooltipPref, Provider<BooleanPreference> optionSideBySideChainShownPref, Provider<BooleanPreference> optionSideBySideChainBottomSheetShownPref, Provider<BooleanPreference> optionChainSettingsShownPref, Provider<BooleanPreference> optionSbsEduFooterDismissedPref, Provider<BooleanPreference> optionSbsLottieNuxAnimationSeenPref, Provider<BooleanPreference> optionChainSbsNuxRevampSettingsShownPref, Provider<BooleanPreference> optionSbsBidAskPriceLabelShownPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(chainCustomizationService, "chainCustomizationService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionChainSettingsTableMetricsDao, "optionChainSettingsTableMetricsDao");
        Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
        Intrinsics.checkNotNullParameter(optionChainDisplayModePref, "optionChainDisplayModePref");
        Intrinsics.checkNotNullParameter(hasShownSideBySideChainSpreadTooltipPref, "hasShownSideBySideChainSpreadTooltipPref");
        Intrinsics.checkNotNullParameter(hasShownSwitchBackToClassicChainTooltipPref, "hasShownSwitchBackToClassicChainTooltipPref");
        Intrinsics.checkNotNullParameter(optionSideBySideChainShownPref, "optionSideBySideChainShownPref");
        Intrinsics.checkNotNullParameter(optionSideBySideChainBottomSheetShownPref, "optionSideBySideChainBottomSheetShownPref");
        Intrinsics.checkNotNullParameter(optionChainSettingsShownPref, "optionChainSettingsShownPref");
        Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
        Intrinsics.checkNotNullParameter(optionSbsLottieNuxAnimationSeenPref, "optionSbsLottieNuxAnimationSeenPref");
        Intrinsics.checkNotNullParameter(optionChainSbsNuxRevampSettingsShownPref, "optionChainSbsNuxRevampSettingsShownPref");
        Intrinsics.checkNotNullParameter(optionSbsBidAskPriceLabelShownPref, "optionSbsBidAskPriceLabelShownPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.chainCustomizationService = chainCustomizationService;
        this.clock = clock;
        this.experimentsStore = experimentsStore;
        this.optionChainSettingsTableMetricsDao = optionChainSettingsTableMetricsDao;
        this.optionUnderlyingQuoteStore = optionUnderlyingQuoteStore;
        this.optionChainDisplayModePref = optionChainDisplayModePref;
        this.hasShownSideBySideChainSpreadTooltipPref = hasShownSideBySideChainSpreadTooltipPref;
        this.hasShownSwitchBackToClassicChainTooltipPref = hasShownSwitchBackToClassicChainTooltipPref;
        this.optionSideBySideChainShownPref = optionSideBySideChainShownPref;
        this.optionSideBySideChainBottomSheetShownPref = optionSideBySideChainBottomSheetShownPref;
        this.optionChainSettingsShownPref = optionChainSettingsShownPref;
        this.optionSbsEduFooterDismissedPref = optionSbsEduFooterDismissedPref;
        this.optionSbsLottieNuxAnimationSeenPref = optionSbsLottieNuxAnimationSeenPref;
        this.optionChainSbsNuxRevampSettingsShownPref = optionChainSbsNuxRevampSettingsShownPref;
        this.optionSbsBidAskPriceLabelShownPref = optionSbsBidAskPriceLabelShownPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OptionSideBySideChainStore get() {
        Companion companion = INSTANCE;
        ChainCustomization chainCustomization = this.chainCustomizationService.get();
        Intrinsics.checkNotNullExpressionValue(chainCustomization, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        OptionChainSettingsTableMetricsDao optionChainSettingsTableMetricsDao = this.optionChainSettingsTableMetricsDao.get();
        Intrinsics.checkNotNullExpressionValue(optionChainSettingsTableMetricsDao, "get(...)");
        OptionUnderlyingQuoteStore optionUnderlyingQuoteStore = this.optionUnderlyingQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUnderlyingQuoteStore, "get(...)");
        StringPreference stringPreference = this.optionChainDisplayModePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        BooleanPreference booleanPreference = this.hasShownSideBySideChainSpreadTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.hasShownSwitchBackToClassicChainTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        BooleanPreference booleanPreference3 = this.optionSideBySideChainShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = this.optionSideBySideChainBottomSheetShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference4, "get(...)");
        BooleanPreference booleanPreference5 = this.optionChainSettingsShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference5, "get(...)");
        BooleanPreference booleanPreference6 = this.optionSbsEduFooterDismissedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference6, "get(...)");
        BooleanPreference booleanPreference7 = this.optionSbsLottieNuxAnimationSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference7, "get(...)");
        BooleanPreference booleanPreference8 = this.optionChainSbsNuxRevampSettingsShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference8, "get(...)");
        BooleanPreference booleanPreference9 = booleanPreference8;
        BooleanPreference booleanPreference10 = this.optionSbsBidAskPriceLabelShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference10, "get(...)");
        BooleanPreference booleanPreference11 = booleanPreference10;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(chainCustomization, clock, experimentsStore, optionChainSettingsTableMetricsDao, optionUnderlyingQuoteStore, stringPreference, booleanPreference, booleanPreference2, booleanPreference3, booleanPreference4, booleanPreference5, booleanPreference6, booleanPreference7, booleanPreference9, booleanPreference11, storeBundle);
    }

    /* compiled from: OptionSideBySideChainStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jï\u0001\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u008f\u0001\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Loptions_product/service/ChainCustomization;", "chainCustomizationService", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;", "optionChainSettingsTableMetricsDao", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/prefs/StringPreference;", "optionChainDisplayModePref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownSideBySideChainSpreadTooltipPref", "hasShownSwitchBackToClassicChainTooltipPref", "optionSideBySideChainShownPref", "optionSideBySideChainBottomSheetShownPref", "optionChainSettingsShownPref", "optionSbsEduFooterDismissedPref", "optionSbsLottieNuxAnimationSeenPref", "optionChainSbsNuxRevampSettingsShownPref", "optionSbsBidAskPriceLabelShownPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore_Factory;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "newInstance", "(Loptions_product/service/ChainCustomization;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionSideBySideChainStore_Factory create(Provider<ChainCustomization> chainCustomizationService, Provider<Clock> clock, Provider<ExperimentsStore> experimentsStore, Provider<OptionChainSettingsTableMetricsDao> optionChainSettingsTableMetricsDao, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<StringPreference> optionChainDisplayModePref, Provider<BooleanPreference> hasShownSideBySideChainSpreadTooltipPref, Provider<BooleanPreference> hasShownSwitchBackToClassicChainTooltipPref, Provider<BooleanPreference> optionSideBySideChainShownPref, Provider<BooleanPreference> optionSideBySideChainBottomSheetShownPref, Provider<BooleanPreference> optionChainSettingsShownPref, Provider<BooleanPreference> optionSbsEduFooterDismissedPref, Provider<BooleanPreference> optionSbsLottieNuxAnimationSeenPref, Provider<BooleanPreference> optionChainSbsNuxRevampSettingsShownPref, Provider<BooleanPreference> optionSbsBidAskPriceLabelShownPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(chainCustomizationService, "chainCustomizationService");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionChainSettingsTableMetricsDao, "optionChainSettingsTableMetricsDao");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(optionChainDisplayModePref, "optionChainDisplayModePref");
            Intrinsics.checkNotNullParameter(hasShownSideBySideChainSpreadTooltipPref, "hasShownSideBySideChainSpreadTooltipPref");
            Intrinsics.checkNotNullParameter(hasShownSwitchBackToClassicChainTooltipPref, "hasShownSwitchBackToClassicChainTooltipPref");
            Intrinsics.checkNotNullParameter(optionSideBySideChainShownPref, "optionSideBySideChainShownPref");
            Intrinsics.checkNotNullParameter(optionSideBySideChainBottomSheetShownPref, "optionSideBySideChainBottomSheetShownPref");
            Intrinsics.checkNotNullParameter(optionChainSettingsShownPref, "optionChainSettingsShownPref");
            Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
            Intrinsics.checkNotNullParameter(optionSbsLottieNuxAnimationSeenPref, "optionSbsLottieNuxAnimationSeenPref");
            Intrinsics.checkNotNullParameter(optionChainSbsNuxRevampSettingsShownPref, "optionChainSbsNuxRevampSettingsShownPref");
            Intrinsics.checkNotNullParameter(optionSbsBidAskPriceLabelShownPref, "optionSbsBidAskPriceLabelShownPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionSideBySideChainStore_Factory(chainCustomizationService, clock, experimentsStore, optionChainSettingsTableMetricsDao, optionUnderlyingQuoteStore, optionChainDisplayModePref, hasShownSideBySideChainSpreadTooltipPref, hasShownSwitchBackToClassicChainTooltipPref, optionSideBySideChainShownPref, optionSideBySideChainBottomSheetShownPref, optionChainSettingsShownPref, optionSbsEduFooterDismissedPref, optionSbsLottieNuxAnimationSeenPref, optionChainSbsNuxRevampSettingsShownPref, optionSbsBidAskPriceLabelShownPref, storeBundle);
        }

        @JvmStatic
        public final OptionSideBySideChainStore newInstance(ChainCustomization chainCustomizationService, Clock clock, ExperimentsStore experimentsStore, OptionChainSettingsTableMetricsDao optionChainSettingsTableMetricsDao, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, StringPreference optionChainDisplayModePref, BooleanPreference hasShownSideBySideChainSpreadTooltipPref, BooleanPreference hasShownSwitchBackToClassicChainTooltipPref, BooleanPreference optionSideBySideChainShownPref, BooleanPreference optionSideBySideChainBottomSheetShownPref, BooleanPreference optionChainSettingsShownPref, BooleanPreference optionSbsEduFooterDismissedPref, BooleanPreference optionSbsLottieNuxAnimationSeenPref, BooleanPreference optionChainSbsNuxRevampSettingsShownPref, BooleanPreference optionSbsBidAskPriceLabelShownPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(chainCustomizationService, "chainCustomizationService");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionChainSettingsTableMetricsDao, "optionChainSettingsTableMetricsDao");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(optionChainDisplayModePref, "optionChainDisplayModePref");
            Intrinsics.checkNotNullParameter(hasShownSideBySideChainSpreadTooltipPref, "hasShownSideBySideChainSpreadTooltipPref");
            Intrinsics.checkNotNullParameter(hasShownSwitchBackToClassicChainTooltipPref, "hasShownSwitchBackToClassicChainTooltipPref");
            Intrinsics.checkNotNullParameter(optionSideBySideChainShownPref, "optionSideBySideChainShownPref");
            Intrinsics.checkNotNullParameter(optionSideBySideChainBottomSheetShownPref, "optionSideBySideChainBottomSheetShownPref");
            Intrinsics.checkNotNullParameter(optionChainSettingsShownPref, "optionChainSettingsShownPref");
            Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
            Intrinsics.checkNotNullParameter(optionSbsLottieNuxAnimationSeenPref, "optionSbsLottieNuxAnimationSeenPref");
            Intrinsics.checkNotNullParameter(optionChainSbsNuxRevampSettingsShownPref, "optionChainSbsNuxRevampSettingsShownPref");
            Intrinsics.checkNotNullParameter(optionSbsBidAskPriceLabelShownPref, "optionSbsBidAskPriceLabelShownPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionSideBySideChainStore(chainCustomizationService, clock, experimentsStore, optionChainSettingsTableMetricsDao, optionUnderlyingQuoteStore, optionChainDisplayModePref, hasShownSideBySideChainSpreadTooltipPref, hasShownSwitchBackToClassicChainTooltipPref, optionSideBySideChainShownPref, optionSideBySideChainBottomSheetShownPref, optionChainSettingsShownPref, optionSbsEduFooterDismissedPref, optionSbsLottieNuxAnimationSeenPref, optionChainSbsNuxRevampSettingsShownPref, optionSbsBidAskPriceLabelShownPref, storeBundle);
        }
    }
}
