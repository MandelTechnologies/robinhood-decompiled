package com.robinhood.librobinhood.data.store;

import com.robinhood.android.regiongate.experiment.CryptoEuRecurringExperiment;
import com.robinhood.crypto.perpetuals.experiment.PerpetualsExperiment2;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AcqCryptoOnboardingM1Exp;
import com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment;
import com.robinhood.librobinhood.data.store.CryptoUsQuickTradeExperiment;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CryptoExperimentsStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000bJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u000bJ\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u000bJ\f\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/store/Store;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "streamRewardsExperimentState", "Lkotlinx/coroutines/flow/Flow;", "", "streamCryptoTradeBonusUsExperimentState", "streamCryptoEuLearnAndEarnDepositRequirement", "streamCryptoSduiChartsExperiment", "streamSduiChartsExperimentState", "streamDepositMatchEuExperiment", "streamCryptoAdvancedChartsExperiment", "streamCandleStickChartExperiment", "streamCryptoDetailPageV2", "streamCryptoTransfersTravelRule", "streamCryptoUsIacHeroCardCdpKillSwitch", "streamCryptoUsVolumeTierEngagementExperiment", "streamCryptoOrderChecksToGuidedTransfers", "streamCryptoEuRecurringExperiment", "streamCryptoEnteredAmountAllOrderTypesExperiment", "streamAcqCryptoOnboardingM1Exp", "Lcom/robinhood/librobinhood/data/store/AcqCryptoOnboardingM1Exp$Variant;", "streamCryptoPnlHubExperiment", "streamCryptoTransfersSavedAddressesExperiment", "streamCryptoVolumeTiersDiscoveryExperiment", "streamCryptoTradeFlowMicrogramDisclosureExperiment", "streamCryptoRecurringOrdersVTExperiment", "streamCryptoTradeQuotePollingIntervalExperiment", "Lcom/robinhood/librobinhood/data/store/PollingIntervalVariant;", "streamCryptoHomeTabExploreSectionExperiment", "streamCryptoTransfersAddressAllowlistingExperiment", "streamCryptoPulseExperiment", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;", "streamCryptoExploreCategoriesExperiment", "streamCryptoMibExperiment", "streamCryptoTokenLimitOrderExperiment", "streamCryptoMarketOrderPillsMicrogramMigration", "streamCryptoEuRecurringTokenizedStocksExperiment", "streamCroissantMmfExperiment", "streamPerpetualsMarginTierExperiment", "streamCryptoUsCostBasisExperiment", "streamCryptoUsOnboardingExperiment", "streamCryptoUsQuickTradeExperiment", "Lcom/robinhood/librobinhood/data/store/CryptoUsQuickTradeExperiment$Variant;", "streamCryptoStableCoinOrdersExperiment", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoExperimentsStore extends Store {
    private final AppType appType;
    private final ExperimentsStore experimentsStore;

    /* compiled from: CryptoExperimentsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoExperimentsStore(AppType appType, ExperimentsStore experimentsStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.appType = appType;
        this.experimentsStore = experimentsStore;
    }

    public final Flow<Boolean> streamRewardsExperimentState() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoAndroidUsdcRewardsEuExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoTradeBonusUsExperimentState() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? StateFlow4.MutableStateFlow(Boolean.FALSE) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoTradeBonusUs.INSTANCE}, false, null, 6, null);
    }

    public final Flow<Boolean> streamCryptoEuLearnAndEarnDepositRequirement() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoEuLearnAndEarnDepositRequirement.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoSduiChartsExperiment() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i != 1) {
            return i != 2 ? StateFlow4.MutableStateFlow(Boolean.FALSE) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoSduiChartsExperimentUS.INSTANCE}, false, null, 6, null);
        }
        return StateFlow4.MutableStateFlow(Boolean.TRUE);
    }

    public final Flow<Boolean> streamSduiChartsExperimentState() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i != 1) {
            return i != 2 ? StateFlow4.MutableStateFlow(Boolean.FALSE) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoSduiChartsExperimentUS.INSTANCE}, false, null, 6, null);
        }
        return StateFlow4.MutableStateFlow(Boolean.TRUE);
    }

    public final Flow<Boolean> streamDepositMatchEuExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoDepositMatchEuExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoAdvancedChartsExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoAdvancedChartsExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCandleStickChartExperiment() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        return i != 1 ? i != 2 ? StateFlow4.MutableStateFlow(Boolean.FALSE) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoCandlestickChartsExperimentUs.INSTANCE}, false, null, 6, null) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoCandlestickChartsExperimentEu.INSTANCE}, false, null, 6, null);
    }

    public final Flow<Boolean> streamCryptoDetailPageV2() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        return i != 1 ? i != 2 ? StateFlow4.MutableStateFlow(Boolean.FALSE) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoDetailPageV2ExperimentUs.INSTANCE}, false, null, 6, null) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoDetailPageV2ExperimentEu.INSTANCE}, false, null, 6, null);
    }

    public final Flow<Boolean> streamCryptoTransfersTravelRule() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoTransfersTravelRuleEu.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoUsIacHeroCardCdpKillSwitch() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoUsIacHeroCardCdpKillSwitch.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.TRUE);
    }

    public final Flow<Boolean> streamCryptoUsVolumeTierEngagementExperiment() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2) {
            return ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoUsVolumeTierEngagementExperiment.INSTANCE}, false, null, 4, null);
        }
        return StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoOrderChecksToGuidedTransfers() {
        return ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoOrderChecksToGuided.INSTANCE}, false, null, 6, null);
    }

    public final Flow<Boolean> streamCryptoEuRecurringExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoEuRecurringExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoEnteredAmountAllOrderTypesExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? StateFlow4.MutableStateFlow(Boolean.FALSE) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoEnteredAmountAllOrderTypesExperiment.INSTANCE}, false, null, 6, null);
    }

    public final Flow<AcqCryptoOnboardingM1Exp.Variant> streamAcqCryptoOnboardingM1Exp() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1) {
            return StateFlow4.MutableStateFlow(AcqCryptoOnboardingM1Exp.Variant.CONTROL);
        }
        return this.experimentsStore.coStreamVariant(AcqCryptoOnboardingM1Exp.INSTANCE, AcqCryptoOnboardingM1Exp.Variant.CONTROL, false);
    }

    public final Flow<Boolean> streamCryptoPnlHubExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? StateFlow4.MutableStateFlow(Boolean.FALSE) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoPnlHub.INSTANCE}, false, null, 6, null);
    }

    public final Flow<Boolean> streamCryptoTransfersSavedAddressesExperiment() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        return (i == 1 || i == 2) ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoTransfersSavedAddressesExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoVolumeTiersDiscoveryExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoVolumeTiersDiscoveryExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoTradeFlowMicrogramDisclosureExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoUsTradeFlowMicrogramDisclosuresExperiment.INSTANCE}, false, null, 6, null) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoEuTradeFlowMicrogramDisclosuresExperiment.INSTANCE}, false, null, 6, null);
    }

    public final Flow<Boolean> streamCryptoRecurringOrdersVTExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoUsRecurringOrdersVT.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<PollingIntervalVariant> streamCryptoTradeQuotePollingIntervalExperiment() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            return this.experimentsStore.coStreamVariant(CryptoEuTradeQuotePollingInterval.INSTANCE, PollingIntervalVariant.CONTROL, true);
        }
        if (i == 2) {
            return this.experimentsStore.coStreamVariant(CryptoUsTradeQuotePollingInterval.INSTANCE, PollingIntervalVariant.CONTROL, true);
        }
        return StateFlow4.MutableStateFlow(PollingIntervalVariant.CONTROL);
    }

    public final Flow<Boolean> streamCryptoHomeTabExploreSectionExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoHomeTabExploreSection.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoTransfersAddressAllowlistingExperiment() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        return (i == 1 || i == 2) ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoTransfersAddressAllowlistingExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<CryptoUsPulseExperiment.Variant> streamCryptoPulseExperiment() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2) {
            return ExperimentsProvider.DefaultImpls.coStreamVariant$default(this.experimentsStore, CryptoUsPulseExperiment.INSTANCE, CryptoUsPulseExperiment.Variant.CONTROL, false, 4, null);
        }
        return StateFlow4.MutableStateFlow(CryptoUsPulseExperiment.Variant.CONTROL);
    }

    public final Flow<Boolean> streamCryptoExploreCategoriesExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoExploreCategoriesExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoMibExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoUsMibExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoTokenLimitOrderExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoTokenLimitOrderExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoMarketOrderPillsMicrogramMigration() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoMarketOrderPillsMicrogramMigration.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoEuRecurringTokenizedStocksExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoEuRecurringTokenizedStocksExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCroissantMmfExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CroissantMmfExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamPerpetualsMarginTierExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{PerpetualsExperiment2.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoUsCostBasisExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoUsCostBasisExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<Boolean> streamCryptoUsOnboardingExperiment() {
        return WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2 ? ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoUsOnboardingExperiment.INSTANCE}, false, null, 6, null) : StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    public final Flow<CryptoUsQuickTradeExperiment.Variant> streamCryptoUsQuickTradeExperiment() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 2) {
            return ExperimentsProvider.DefaultImpls.coStreamVariant$default(this.experimentsStore, CryptoUsQuickTradeExperiment.INSTANCE, CryptoUsQuickTradeExperiment.Variant.CONTROL, false, 4, null);
        }
        return StateFlow4.MutableStateFlow(CryptoUsQuickTradeExperiment.Variant.CONTROL);
    }

    public final Flow<Boolean> streamCryptoStableCoinOrdersExperiment() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        return i != 1 ? i != 2 ? StateFlow4.MutableStateFlow(Boolean.FALSE) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoUsStableCoinOrders.INSTANCE}, false, null, 6, null) : ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CryptoEuStableCoinOrders.INSTANCE}, false, null, 6, null);
    }
}
